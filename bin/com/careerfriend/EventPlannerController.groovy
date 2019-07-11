package com.careerfriend

import grails.plugin.springsecurity.annotation.Secured

@Secured(['ROLE_ADMIN', 'ROLE_STUDENT', 'ROLE_COUNSELLOR', 'ROLE_ADMIN_OFFICER'] )
class EventPlannerController {

    def index() { }
}
