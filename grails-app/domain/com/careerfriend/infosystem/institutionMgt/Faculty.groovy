package com.careerfriend.infosystem.institutionMgt

import grails.rest.Resource

@Resource(uri='/institution/faculty')
class Faculty {

    String name
    Date dateCreated
    String description
    Integer numberOfStudent
    String noOfApplication

    static belongsTo = Institution

    static hasMany = [departments: Department]

    static searchable = {
        except = ['dateCreated', 'numberOfStudent', 'noOfApplication']
    }


    static constraints = {
        name blank:  false, nullable: false
        dateCreated blank: false, nullable: false
        description blank: false, nullable: false
        numberOfStudent blank: false, nullable: false, minSize: 1
        noOfApplication blank: false, nullable: false, minSize: 1
        departments blank: false, nullable: false
    }
}
