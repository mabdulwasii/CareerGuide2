package com.careerfriend.testplatform

import grails.rest.Resource

@Resource(uri='/exams')
class Exam {

    static hasMany = [questions: Question, answer: String]

    static constraints = {
        questions blank: false, nullable: false, size: 1..30
        answer blank: false, nullable: false, size: 1..30
    }
}
