package com.careerfriend.infosystem.staffMgt

import com.careerfriend.auth.User
import com.careerfriend.infosystem.institutionMgt.Institution
import com.careerfriend.utilities.Address
import com.careerfriend.utilities.Contact
import grails.rest.Resource

@Resource(uri='/personnel/academyOfficer')
class AcademyOfficerProfile {

    User user

    String firstname
    String lastname
    String middlename
    Date dateOfBirth
    Address address
    Contact contact

   Institution institution

   String position

    Byte image

    static constraints = {
        firstname blank: false, nullable: false
        lastname blank: false, nullable: false
        middlename blank: true, nullable: true
        address blank: false, nullable: false
        contact blank: false, nullable: false
        position blank: false, nullable: false
        institution blank: false, nullable: false
        dateOfBirth blank: true, nullable: true
        image blank: true, nullable: true, maxSize: 1024 * 1024 * 20
    }
}
