package com.careerfriend.eventplanner

import com.careerfriend.auth.User
import com.careerfriend.utilities.Address
import grails.rest.Resource

@Resource(uri='/event/eventRequest')
class EventRequest {

    String title
    Address location
    Date from
    Date to
    User creator
    String description
    Boolean isApproved = false
    Boolean isCancelled = false
    User eventCounsellor
    Integer price
    Date eventDate

    static hasMany = [goers: User, interestedCounsellors: User]


    static constraints = {
        title blank: false, nullable: false
        location blank: false, nullable: false
        eventCounsellor blank: false, nullable: false
        price blank: false, nullable: false, min: 1
        eventDate blank: false, nullable: false
        goers blank: true, nullable: true
        interestedCounsellors blank: true, nullable: true
        creator blank: false, nullable: false
        description blank: false, nullable: false, minSize: 200
        from blank: false, nullable: false
        to blank: false, nullable: false
    }
}
