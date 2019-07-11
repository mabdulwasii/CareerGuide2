package com.careerfriend.infosystem.staffMgt

import com.careerfriend.auth.User
import grails.rest.Resource

@Resource(uri='/personnel/admin')
class AdminProfile {

    User user

    String firstname
    String lastname
    String middlename
    Date dateOfBirth

    Byte image


    static constraints = {
        firstname blank: false, nullable: false
        lastname blank: false, nullable: false
        middlename blank: true, nullable: true
        image blank: true, nullable: true, maxSize: 1024 * 1024 * 20
        dateOfBirth blank: true, nullable: true

    }
}
