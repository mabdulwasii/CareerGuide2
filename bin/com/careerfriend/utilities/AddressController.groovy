package com.careerfriend.utilities

import grails.plugin.springsecurity.annotation.Secured

import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Secured(['ROLE_ADMIN'])
@Transactional(readOnly = true)
class AddressController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond Address.list(params), model:[addressCount: Address.count()]
    }

    def show(Address address) {
        respond address
    }
    @Secured(['ROLE_ADMIN', 'ROLE_STUDENT', 'ROLE_ADMIN_OFFICER', 'ROLE_COUNSELLOR'])
    def create() {
        respond new Address(params)
    }

    @Secured(['ROLE_ADMIN', 'ROLE_STUDENT', 'ROLE_ADMIN_OFFICER', 'ROLE_COUNSELLOR'])
    @Transactional
    def save(Address address) {
        if (address == null) {
            transactionStatus.setRollbackOnly()
            notFound()
            return
        }

        if (address.hasErrors()) {
            transactionStatus.setRollbackOnly()
            respond address.errors, view:'create'
            return
        }

        address.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'address.label', default: 'Address'), address.id])
                redirect address
            }
            '*' { respond address, [status: CREATED] }
        }
    }

    @Secured(['ROLE_ADMIN', 'ROLE_STUDENT', 'ROLE_ADMIN_OFFICER', 'ROLE_COUNSELLOR'])
    def edit(Address address) {
        respond address
    }

    @Transactional
    def update(Address address) {
        if (address == null) {
            transactionStatus.setRollbackOnly()
            notFound()
            return
        }

        if (address.hasErrors()) {
            transactionStatus.setRollbackOnly()
            respond address.errors, view:'edit'
            return
        }

        address.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'address.label', default: 'Address'), address.id])
                redirect address
            }
            '*'{ respond address, [status: OK] }
        }
    }

    @Transactional
    def delete(Address address) {

        if (address == null) {
            transactionStatus.setRollbackOnly()
            notFound()
            return
        }

        address.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'address.label', default: 'Address'), address.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'address.label', default: 'Address'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
