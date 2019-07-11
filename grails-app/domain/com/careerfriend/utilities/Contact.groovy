package com.careerfriend.utilities

import grails.rest.Resource

@Resource(uri = '/utilities/contact')
class Contact {

    String email
    String phoneNumber
    String website

    static constraints = {
        email blank: false, nullable: false, email: true
        phoneNumber blank: false, nullable: false
        website blank: false, nullable: false
    }
}
