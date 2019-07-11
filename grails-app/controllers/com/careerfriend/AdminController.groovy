package com.careerfriend

import grails.plugin.springsecurity.annotation.Secured

@Secured(["ROLE_ADMIN"])
class AdminController {
    def springSecurityService

    def index() {
        def user = springSecurityService.currentUser

        render view: 'index', model: [user: user]
    }

    def school() {
        def user = springSecurityService.currentUser

        render view: 'school', model: [user: user]
    }

    def event() {
        def user = springSecurityService.currentUser

        render view: 'event', model: [user: user]
    }

    def personnel() {
        def user = springSecurityService.currentUser

        render view: 'personnel', model: [user: user]
    }

}
