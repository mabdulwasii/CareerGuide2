package com.careerfriend.infosystem.staffMgt

import com.careerfriend.auth.User
import com.careerfriend.utilities.Address
import com.careerfriend.utilities.Contact
import com.careerfriend.utilities.NextOfKin
import grails.rest.Resource

@Resource(uri='/personnel/counsellor')
class CounsellorProfile {

    User user

    String firstname
    String lastname
    String middlename
    Date dateOfBirth
    Address address
    Contact contact
    String schoolAttended
    String profession
    String bio
    String yearOfExperience
    NextOfKin nextOfKin
    String degrees
    Boolean isVerified


    Byte image
    Byte cv



    static constraints = {
        firstname blank: false, nullable: false
        lastname blank: false, nullable: false
        middlename blank: true, nullable: true
        address blank: false, nullable: false
        contact blank: false, nullable: false
        schoolAttended blank: false, nullable: false
        profession blank: false, nullable: false
        bio blank: false, nullable: false, minSize: 200
        yearOfExperience blank: false, nullable: false
        nextOfKin blank: false, nullable: false
        image blank: true, nullable: true, maxSize: 1024 * 1024 * 20
    }
}
