package careerguide

import com.careerfriend.auth.Role
import com.careerfriend.auth.User
import com.careerfriend.auth.UserRole

class BootStrap {

    def init = { servletContext ->

        def adminRole = new Role(authority: 'ROLE_ADMIN').save()
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

        assert UserRole.count() == 4

    }
    def destroy = {
    }
}
