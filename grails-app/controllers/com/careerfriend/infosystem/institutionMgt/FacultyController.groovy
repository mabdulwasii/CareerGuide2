package com.careerfriend.infosystem.institutionMgt

import grails.plugin.springsecurity.annotation.Secured

import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Secured(['ROLE_ADMIN'])
@Transactional(readOnly = true)
class FacultyController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond Faculty.list(params), model:[facultyCount: Faculty.count()]
    }

    def show(Faculty faculty) {
        respond faculty
    }

    def create() {
        respond new Faculty(params)
    }

    @Transactional
    def save(Faculty faculty) {
        if (faculty == null) {
            transactionStatus.setRollbackOnly()
            notFound()
            return
        }

        if (faculty.hasErrors()) {
            transactionStatus.setRollbackOnly()
            respond faculty.errors, view:'create'
            return
        }

        faculty.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'faculty.label', default: 'Faculty'), faculty.id])
                redirect faculty
            }
            '*' { respond faculty, [status: CREATED] }
        }
    }

    def edit(Faculty faculty) {
        respond faculty
    }

    @Transactional
    def update(Faculty faculty) {
        if (faculty == null) {
            transactionStatus.setRollbackOnly()
            notFound()
            return
        }

        if (faculty.hasErrors()) {
            transactionStatus.setRollbackOnly()
            respond faculty.errors, view:'edit'
            return
        }

        faculty.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'faculty.label', default: 'Faculty'), faculty.id])
                redirect faculty
            }
            '*'{ respond faculty, [status: OK] }
        }
    }

    @Transactional
    def delete(Faculty faculty) {

        if (faculty == null) {
            transactionStatus.setRollbackOnly()
            notFound()
            return
        }

        faculty.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'faculty.label', default: 'Faculty'), faculty.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'faculty.label', default: 'Faculty'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
