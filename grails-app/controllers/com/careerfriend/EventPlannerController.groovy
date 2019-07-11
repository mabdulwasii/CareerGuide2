package com.careerfriend

import grails.plugin.springsecurity.annotation.Secured

@Secured(['ROLE_ADMIN'] )
class EventPlannerController {

    def index() {
        render(view: '/admin/eventPlanner/index')
    }
}
