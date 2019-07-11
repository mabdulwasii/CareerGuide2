package com.careerfriend

import grails.plugin.springsecurity.annotation.Secured

@Secured(["ROLE_PARENT"])
class ParentController {

    def springSecurityService

    def index() {
        def user = springSecurityService.currentUser

        render view: 'index', model: [user: user]
    }
}
