package com.careerfriend.infosystem.staffMgt

import com.careerfriend.auth.User
import com.careerfriend.infosystem.institutionMgt.CareerJob
import com.careerfriend.infosystem.institutionMgt.Institution
import com.careerfriend.infosystem.institutionMgt.Interest
import com.careerfriend.utilities.Address
import com.careerfriend.utilities.Contact
import com.careerfriend.utilities.NextOfKin
import grails.rest.Resource

@Resource(uri='/student')
class StudentProfile {

    User user

    String firstname
    String lastname
    String middlename
    Date dateOfBirth
    Address address
    Contact contact
    String bio
    String primary
    String secondary
    Institution prospectInstitution
    CareerJob ambition
    NextOfKin nextOfKin


    static hasMany = [hobbies: Interest]

    Byte image


    static constraints = {
        firstname blank: false, nullable: false
        lastname blank: false, nullable: false
        middlename blank: true, nullable: true
        address blank: false, nullable: false
        contact blank: false, nullable: false
        bio blank: false, nullable: false, minSize: 200
        nextOfKin blank: false, nullable: false
        image blank: true, nullable: true, maxSize: 1024 * 1024 * 20
    }
}
