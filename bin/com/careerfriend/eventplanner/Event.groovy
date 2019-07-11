package com.careerfriend.eventplanner

import com.careerfriend.auth.User
import com.careerfriend.utilities.Address
import grails.rest.Resource

@Resource(uri='/events')
class Event {

    String title
    Address location
    User eventCounsellor
    Integer price
    Date eventDate
    Date lastUpdated

    static hasMany = [goers: User]



    static constraints = {
        title blank: false, nullable: false
        location blank: false, nullable: false
        eventCounsellor blank: false, nullable: false
        price blank: false, nullable: false, min: 1
        eventDate blank: false, nullable: false
        subscribers blank: false, nullable: false
    }
}
