package com.careerfriend.infosystem.staffMgt

import grails.plugin.springsecurity.annotation.Secured

import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Secured(['ROLE_ADMIN'])
@Transactional(readOnly = true)
class AcademyOfficerProfileController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond AcademyOfficerProfile.list(params), model:[academyOfficerProfileCount: AcademyOfficerProfile.count()]
    }

    def show(AcademyOfficerProfile academyOfficerProfile) {
        respond academyOfficerProfile
    }

    def create() {
        respond new AcademyOfficerProfile(params)
    }

    @Transactional
    def save(AcademyOfficerProfile academyOfficerProfile) {
        if (academyOfficerProfile == null) {
            transactionStatus.setRollbackOnly()
            notFound()
            return
        }

        if (academyOfficerProfile.hasErrors()) {
            transactionStatus.setRollbackOnly()
            respond academyOfficerProfile.errors, view:'create'
            return
        }

        academyOfficerProfile.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'academyOfficerProfile.label', default: 'AcademyOfficerProfile'), academyOfficerProfile.id])
                redirect academyOfficerProfile
            }
            '*' { respond academyOfficerProfile, [status: CREATED] }
        }
    }

    def edit(AcademyOfficerProfile academyOfficerProfile) {
        respond academyOfficerProfile
    }

    @Transactional
    def update(AcademyOfficerProfile academyOfficerProfile) {
        if (academyOfficerProfile == null) {
            transactionStatus.setRollbackOnly()
            notFound()
            return
        }

        if (academyOfficerProfile.hasErrors()) {
            transactionStatus.setRollbackOnly()
            respond academyOfficerProfile.errors, view:'edit'
            return
        }

        academyOfficerProfile.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'academyOfficerProfile.label', default: 'AcademyOfficerProfile'), academyOfficerProfile.id])
                redirect academyOfficerProfile
            }
            '*'{ respond academyOfficerProfile, [status: OK] }
        }
    }

    @Transactional
    def delete(AcademyOfficerProfile academyOfficerProfile) {

        if (academyOfficerProfile == null) {
            transactionStatus.setRollbackOnly()
            notFound()
            return
        }

        academyOfficerProfile.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'academyOfficerProfile.label', default: 'AcademyOfficerProfile'), academyOfficerProfile.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'academyOfficerProfile.label', default: 'AcademyOfficerProfile'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
