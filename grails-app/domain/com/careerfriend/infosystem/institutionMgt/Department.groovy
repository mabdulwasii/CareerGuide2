package com.careerfriend.infosystem.institutionMgt

import com.careerfriend.utilities.*

class Department {

    String name
    Contact contact
    Integer maxNumberOfStudent
    Integer noOfApplication
    Integer jambScore
    String characteristics
    Finance schoolFee
    Faculty faculty

    static belongsTo = [faculty: Faculty ]

    static searchable = {
        except: ['contact', 'jambScore', 'schoolFee', 'noOfApplication', 'maxNumberOfStudent']

    }


    static hasMany = [jambSubject: Subject, olevelSubject: Subject,
                      interest   : Interest, careerJob: CareerJob, industry: Industry]

    static constraints = {
        name blank: false, nullable: false
        contact blank: false, nullable: false
        maxNumberOfStudent blank: false, nullable: false, min: 1
        noOfApplication blank: false, nullable: false, min: 1
        jambScore blank: false, nullable: false, min: 120
        schoolFee blank: false, nullable: false
        characteristics blank: false, nullable: false, minSize: 100, maxSize: 5000
        courses blank: false, nullable: false
        jambSubject blank: false, nullable: false, inList: ["Mathematics", "Chemistry", "Physics", "Biology", "Agriculture"], maxSize: 4
        olevel blank: false, nullable: false, inList: ["Mathematics", "Chemistry", "Physics", "Biology", "Agriculture"], minSize: 5
        interest blank: false, nullable: false, inList: ["Dancing", "Reading", "Leisure", "Research", "Partying", "logical Reasoning", "Group work", "Innovation"]
        careerJob blank: false, nullable: false, inList: ["Lawyer", "Doctor", "Developer", "Nurse", "Anatomist", "Engineers", "Group work", "Innovation"]
        industry blank: false, nullable: false, inList: ["Information Technology", "Petrochemicals", "Banking", "Health", "Agriculture"]

    }
}