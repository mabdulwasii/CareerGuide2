package com.careerfriend.utilities

import grails.plugin.springsecurity.annotation.Secured

import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional
@Secured(['ROLE_ADMIN'])
@Transactional(readOnly = true)
class ContactController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond Contact.list(params), model:[contactCount: Contact.count()]
    }

    def show(Contact contact) {
        respond contact
    }

    @Secured(['ROLE_ADMIN', 'ROLE_STUDENT', 'ROLE_ADMIN_OFFICER', 'ROLE_COUNSELLOR'])
    def create() {
        respond new Contact(params)
    }

    @Secured(['ROLE_ADMIN', 'ROLE_STUDENT', 'ROLE_ADMIN_OFFICER', 'ROLE_COUNSELLOR'])
    @Transactional
    def save(Contact contact) {
        if (contact == null) {
            transactionStatus.setRollbackOnly()
            notFound()
            return
        }

        if (contact.hasErrors()) {
            transactionStatus.setRollbackOnly()
            respond contact.errors, view:'create'
            return
        }

        contact.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'contact.label', default: 'Contact'), contact.id])
                redirect contact
            }
            '*' { respond contact, [status: CREATED] }
        }
    }

    @Secured(['ROLE_ADMIN', 'ROLE_STUDENT', 'ROLE_ADMIN_OFFICER', 'ROLE_COUNSELLOR'])
    def edit(Contact contact) {
        respond contact
    }

    @Transactional
    def update(Contact contact) {
        if (contact == null) {
            transactionStatus.setRollbackOnly()
            notFound()
            return
        }

        if (contact.hasErrors()) {
            transactionStatus.setRollbackOnly()
            respond contact.errors, view:'edit'
            return
        }

        contact.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'contact.label', default: 'Contact'), contact.id])
                redirect contact
            }
            '*'{ respond contact, [status: OK] }
        }
    }

    @Transactional
    def delete(Contact contact) {

        if (contact == null) {
            transactionStatus.setRollbackOnly()
            notFound()
            return
        }

        contact.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'contact.label', default: 'Contact'), contact.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'contact.label', default: 'Contact'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
