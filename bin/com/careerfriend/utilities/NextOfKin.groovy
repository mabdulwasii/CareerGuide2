
package com.careerfriend.utilities

import grails.rest.Resource

@Resource(uri = '/utilities/address')
class NextOfKin {

    String firstname
    String lastname
    Address address
    Contact contact
    String relationship

    static constraints = {
        firstname blank: false, nullable: false
        lastname blank: false, nullable: false
        address blank: false, nullable: false
        contact blank: false, nullable: false
        relationship blank: false, nullable: false, inList: ["Sister", "Brother", "Father", "Mother", "Uncle", "Aunt", "Others"]
    }
}
