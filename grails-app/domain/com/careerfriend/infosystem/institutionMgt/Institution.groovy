package com.careerfriend.infosystem.institutionMgt

import com.careerfriend.utilities.Address
import com.careerfriend.utilities.Contact
import grails.rest.Resource

@Resource(uri='/institution')
class Institution {
    String name
    String type
    String yearFounded
    String description
    Contact contact
    Address address
    Integer noOfStudent
    Integer noOfApplication

    static hasMany = [faculties: Faculty]

    static searchable = {
        except = ['yearFounded', 'contact', 'address', 'noOfApplication', 'noOfStudent']
    }


    static constraints = {
        name blank: false, nullable: false
        type blank: false, nullable: false, inList: ["University", "Polythechnic", "Monothechnic", "College", "School"]
        yearFounded blank: false, nullable: false
        description blank: false, nullable: false, minSize: 200
        contact blank: false, nullable: false
        address blank: false, nullable: false
        noOfStudent blank: false, nullable: false, minSize: 1
        noOfApplication blank: false, nullable: false, minSize: 1
    }
}
