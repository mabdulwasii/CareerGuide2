package com.careerfriend.infosystem.institutionMgt

import grails.rest.Resource

@Resource(uri='/institution/finance')
class Finance {
    String acceptanceFee
    String minSchoolFee
    String maxSchoolFee
    Boolean isAccomodable
    String accomodationFee


    static constraints = {
        minSchoolFee blank: true, nullable: true
        maxSchoolFee blank: true, nullable: true
        isAccomodable blank: true, nullable: true
        accomodationFee blank: true, nullable: true
        acceptanceFee blank: true, nullable: true
    }
}
