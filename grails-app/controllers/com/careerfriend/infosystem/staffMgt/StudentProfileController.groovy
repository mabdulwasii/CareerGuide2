package com.careerfriend.infosystem.staffMgt

import grails.plugin.springsecurity.annotation.Secured

import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Secured(['ROLE_USER'])
@Transactional(readOnly = true)
class StudentProfileController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond StudentProfile.list(params), model:[studentProfileCount: StudentProfile.count()]
    }

    def show(StudentProfile studentProfile) {
        respond studentProfile
    }

    def create() {
        respond new StudentProfile(params)
    }

    @Transactional
    def save(StudentProfile studentProfile) {
        if (studentProfile == null) {
            transactionStatus.setRollbackOnly()
            notFound()
            return
        }

        if (studentProfile.hasErrors()) {
            transactionStatus.setRollbackOnly()
            respond studentProfile.errors, view:'create'
            return
        }

        studentProfile.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'studentProfile.label', default: 'StudentProfile'), studentProfile.id])
                redirect studentProfile
            }
            '*' { respond studentProfile, [status: CREATED] }
        }
    }

    def edit(StudentProfile studentProfile) {
        respond studentProfile
    }

    @Transactional
    def update(StudentProfile studentProfile) {
        if (studentProfile == null) {
            transactionStatus.setRollbackOnly()
            notFound()
            return
        }

        if (studentProfile.hasErrors()) {
            transactionStatus.setRollbackOnly()
            respond studentProfile.errors, view:'edit'
            return
        }

        studentProfile.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'studentProfile.label', default: 'StudentProfile'), studentProfile.id])
                redirect studentProfile
            }
            '*'{ respond studentProfile, [status: OK] }
        }
    }

    @Transactional
    def delete(StudentProfile studentProfile) {

        if (studentProfile == null) {
            transactionStatus.setRollbackOnly()
            notFound()
            return
        }

        studentProfile.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'studentProfile.label', default: 'StudentProfile'), studentProfile.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'studentProfile.label', default: 'StudentProfile'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
