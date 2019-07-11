package com.careerfriend.testplatform

import grails.rest.Resource

@Resource(uri = '/result')
class Result {

    String question
    String answer
    String yourOption

    static constraints = {

        question blank: false, nullable: false
        answer blank: false, nullable: false
        yourOption blank: false, nullable: false
    }
}
