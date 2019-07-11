package com.careerfriend.infosystem.staffMgt

import grails.plugin.springsecurity.annotation.Secured

import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Secured(['ROLE_ADMIN'])
@Transactional(readOnly = true)
class AdminProfileController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond AdminProfile.list(params), model:[adminProfileCount: AdminProfile.count()]
    }

    def show(AdminProfile adminProfile) {
        respond adminProfile
    }

    def create() {
        respond new AdminProfile(params)
    }

    @Transactional
    def save(AdminProfile adminProfile) {
        if (adminProfile == null) {
            transactionStatus.setRollbackOnly()
            notFound()
            return
        }

        if (adminProfile.hasErrors()) {
            transactionStatus.setRollbackOnly()
            respond adminProfile.errors, view:'create'
            return
        }

        adminProfile.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'adminProfile.label', default: 'AdminProfile'), adminProfile.id])
                redirect adminProfile
            }
            '*' { respond adminProfile, [status: CREATED] }
        }
    }

    def edit(AdminProfile adminProfile) {
        respond adminProfile
    }

    @Transactional
    def update(AdminProfile adminProfile) {
        if (adminProfile == null) {
            transactionStatus.setRollbackOnly()
            notFound()
            return
        }

        if (adminProfile.hasErrors()) {
            transactionStatus.setRollbackOnly()
            respond adminProfile.errors, view:'edit'
            return
        }

        adminProfile.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'adminProfile.label', default: 'AdminProfile'), adminProfile.id])
                redirect adminProfile
            }
            '*'{ respond adminProfile, [status: OK] }
        }
    }

    @Transactional
    def delete(AdminProfile adminProfile) {

        if (adminProfile == null) {
            transactionStatus.setRollbackOnly()
            notFound()
            return
        }

        adminProfile.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'adminProfile.label', default: 'AdminProfile'), adminProfile.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'adminProfile.label', default: 'AdminProfile'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
