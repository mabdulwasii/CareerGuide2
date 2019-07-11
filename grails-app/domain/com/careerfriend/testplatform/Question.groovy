package com.careerfriend.testplatform

import grails.rest.Resource

@Resource(uri = '/questions')
class Question {

    String question
    String answer
    String optionB
    String optionC
    String optionD

    static constraints = {
        question blank: false, nullable: false
        answer blank: false, nullable: false
        optionB blank: false, nullable: false
        optionC blank: false, nullable: false
        optionD blank: false, nullable: false
    }
}
