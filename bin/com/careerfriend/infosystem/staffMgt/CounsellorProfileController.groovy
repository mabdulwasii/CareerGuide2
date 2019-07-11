package com.careerfriend.infosystem.staffMgt

import grails.plugin.springsecurity.annotation.Secured

import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Secured(['ROLE_ADMIN', 'ROLE_COUNSELLOR'])
@Transactional(readOnly = true)
class CounsellorProfileController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    @Secured(['ROLE_ADMIN', 'ROLE_STUDENT'])
    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond CounsellorProfile.list(params), model:[counsellorProfileCount: CounsellorProfile.count()]
    }

    @Secured(['ROLE_ADMIN', 'ROLE_STUDENT'])
    def show(CounsellorProfile counsellorProfile) {
        respond counsellorProfile
    }

    def create() {
        respond new CounsellorProfile(params)
    }

    @Transactional
    def save(CounsellorProfile counsellorProfile) {
        if (counsellorProfile == null) {
            transactionStatus.setRollbackOnly()
            notFound()
            return
        }

        if (counsellorProfile.hasErrors()) {
            transactionStatus.setRollbackOnly()
            respond counsellorProfile.errors, view:'create'
            return
        }

        counsellorProfile.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'counsellorProfile.label', default: 'CounsellorProfile'), counsellorProfile.id])
                redirect counsellorProfile
            }
            '*' { respond counsellorProfile, [status: CREATED] }
        }
    }

    def edit(CounsellorProfile counsellorProfile) {
        respond counsellorProfile
    }

    @Transactional
    def update(CounsellorProfile counsellorProfile) {
        if (counsellorProfile == null) {
            transactionStatus.setRollbackOnly()
            notFound()
            return
        }

        if (counsellorProfile.hasErrors()) {
            transactionStatus.setRollbackOnly()
            respond counsellorProfile.errors, view:'edit'
            return
        }

        counsellorProfile.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'counsellorProfile.label', default: 'CounsellorProfile'), counsellorProfile.id])
                redirect counsellorProfile
            }
            '*'{ respond counsellorProfile, [status: OK] }
        }
    }

    @Transactional
    def delete(CounsellorProfile counsellorProfile) {

        if (counsellorProfile == null) {
            transactionStatus.setRollbackOnly()
            notFound()
            return
        }

        counsellorProfile.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'counsellorProfile.label', default: 'CounsellorProfile'), counsellorProfile.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'counsellorProfile.label', default: 'CounsellorProfile'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
