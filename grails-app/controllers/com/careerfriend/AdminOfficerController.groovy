package com.careerfriend

import grails.plugin.springsecurity.annotation.Secured

@Secured(["ROLE_ADMIN_OFFICER"])
class AdminOfficerController {
    def springSecurityService

    def index() {
        def user = springSecurityService.currentUser

        render view: 'index', model: [user: user]
    }
}
