package com.careerfriend

import grails.plugin.springsecurity.SpringSecurityUtils
import grails.plugin.springsecurity.annotation.Secured

@Secured(["ROLE_USER", "ROLE_ADMIN", "ROLE_ADMIN_OFFICER", "ROLE_COUNSELLOR", "ROLE_PARENT"])
class DashboardController {

    def springSecurityService

    def index() {
        def user = springSecurityService.currentUser//
        //    render view: 'index', model: [firstname: user.firstname, lastname: user.lastname, email: user.email]
//            render view: 'index', model: [user: user]

        if (SpringSecurityUtils.ifAllGranted('ROLE_ADMIN')) {
            redirect controller: 'admin', action: 'index', model: [user: user]
        } else if (SpringSecurityUtils.ifAllGranted('ROLE_ADMIN_OFFICER')) {
            redirect controller: 'adminOfficer', action: 'index', model: [user: user]
        } else if (SpringSecurityUtils.ifAllGranted('ROLE_COUNSELLOR')) {
            redirect controller: 'counsellor', action: 'index', model: [user: user]
        } else if (SpringSecurityUtils.ifAllGranted('ROLE_USER')) {
            redirect controller: 'student', action: 'index', model: [user: user]
        } else if (SpringSecurityUtils.ifAllGranted('ROLE_PARENT')) {
            redirect controller: 'parent', action: 'index', model: [user: user]
        }
    }
}
