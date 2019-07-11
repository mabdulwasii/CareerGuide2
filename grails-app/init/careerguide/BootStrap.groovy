package careerguide

import grails.plugin.wschat.*

class BootStrap {

    def init = { servletContext ->

       /* def adminRole = new Role(authority: 'ROLE_ADMIN').save()
        def adminOfficerRole = new Role(authority: 'ROLE_ADMIN_OFFICER').save()
        def counsellorRole = new Role(authority: 'ROLE_COUNSELLOR').save()
        def studentRole = new Role(authority: 'ROLE_USER').save()

        def admin = new User(username: 'me', password: 'password', email: 'princehardetuneji@gmail.com').save()
        def adminOfficer = new User(username: 'adminOfficer', password: 'password', email: 'adminofficer@gmail.com').save()
        def counsellor = new User(username: 'counsellor', password: 'password', email: 'counsellor@gmail.com').save()
        def student = new User(username: 'student', password: 'password', email: 'student@gmail.com').save()

        UserRole.create admin, adminRole
        UserRole.create adminOfficer, adminOfficerRole
        UserRole.create counsellor, counsellorRole
        UserRole.create student, studentRole

        UserRole.withSession {

            it.flush()

            it.clear()

        }

        assert User.count() == 4

        assert Role.count() == 4

        assert UserRole.count() == 4*/


//        Ws chat Settings

        //testing variation for most relevance picking
        ChatAI.findOrSaveWhere(input:'contact number', output: '0800 123456' )
        ChatAI.findOrSaveWhere(input:'opening hours', output: 'Opening hours are 9 - 5' )
        ChatAI.findOrSaveWhere(input:'opening days', output: 'Opening days are Mon-Fri' )
        ChatAI.findOrSaveWhere(input:'opening person', output: 'Opening person is Sam' )
        ChatAI.findOrSaveWhere(input:'opening person drives', output: 'Some car' )
        ChatAI.findOrSaveWhere(input:'opening hours on a sunday', output: 'Not open on sunday' )
        ChatAI.findOrSaveWhere(input:'weekdays', output: 'Do you mean which days are week days? This would be Monday')

        ChatAI.findOrSaveWhere(input:'kickbot', output: 'close_connection' )

        ChatBadWords.findOrSaveWhere(input:'poo', output: '/kickuser' )

        //minutes months hours years days
        ChatBadWords.findOrSaveWhere(input:'pants', output: '/banuser', duration: 1 ,period: 'minutes')
        ChatBadWords.findOrSaveWhere(input:'bastard', output: '/banuser', duration: 1 ,period: 'months')

        //Spring security configuration to add me as a user and admin role
        def adminRole1 = new ChatRole('ROLE_ADMIN').save()
        def anonymouse = new ChatRole('ROLE_ANONYMOUS').save()
        def adminOfficerRole = new ChatRole('ROLE_ADMIN_OFFICER').save()
        def counsellorRole = new ChatRole('ROLE_COUNSELLOR').save()
        def studentRole = new ChatRole('ROLE_USER').save()
        def parentRole = new ChatRole('ROLE_PARENT').save()

        def testUser = new ChatAuth('me', 'password').save()
        def adminOfficer = new ChatAuth(username: 'adminOfficer', password: 'password').save()
        def counsellor = new ChatAuth(username: 'counsellor', password: 'password').save()
        def student = new ChatAuth(username: 'student', password: 'password').save()


        ChatAuthChatRole.create testUser, adminRole1, true
        ChatAuthChatRole.create testUser, studentRole, true
        ChatAuthChatRole.create testUser, anonymouse, true

        def adminUser = new ChatAuth(username: 'admin', password: 'admin').save()
        ChatAuthChatRole.create adminUser, adminRole1, true

        ChatAuthChatRole.create adminOfficer, adminOfficerRole, true
        ChatAuthChatRole.create counsellor, counsellorRole, true
        ChatAuthChatRole.create student, studentRole, true

        addUser('me','test@test.com')
        addUser('admin','test1@test.com')
        addUser('adminOfficer','test2@test.com')
        addUser('counsellor','counsellor@test.com')
        addUser('student','student@test.com')

    }
    def destroy = {
    }


    void addUser(String username,String email) {
        ChatUser user
        ChatPermissions perm
        String defaultPermission = 'admin'
        if (defaultPermission) {
            perm = ChatPermissions.findByName(defaultPermission)
            perm = perm ? perm : new ChatPermissions(name: defaultPermission).save(flush: true)
            user = ChatUser.findByUsername(username)
            if (!user) {
                def addlog = addLog()
                user = new ChatUser(username: username, permissions: perm, log: addlog, offlog: addlog).save(flush:true)
            }
            ChatUserProfile.findOrSaveWhere(chatuser:user, email:"${email}").save(flush:true)
        }
    }
    private ChatLog addLog() {
        ChatLog logInstance = new ChatLog(messages: [])
        if (!logInstance.save()) {
            log.debug "${logInstance.errors}"
        }
        return logInstance
    }
}
