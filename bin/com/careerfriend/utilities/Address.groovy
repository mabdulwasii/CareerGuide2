package com.careerfriend.utilities

import grails.rest.Resource

@Resource(uri = '/utilities/address')
class Address {

    String location
    String city
    String lga
    String state

    static constraints = {
        location blank:  false, nullable: false
        city blank:  false, nullable: false
        lga blank:  false, nullable: false
        state blank:  false, nullable: false
    }
}
