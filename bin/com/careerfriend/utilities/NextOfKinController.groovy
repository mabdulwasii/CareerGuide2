package com.careerfriend.utilities

import grails.plugin.springsecurity.annotation.Secured

import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Secured(['ROLE_ADMIN'])
@Transactional(readOnly = true)
class NextOfKinController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond NextOfKin.list(params), model:[nextOfKinCount: NextOfKin.count()]
    }

    def show(NextOfKin nextOfKin) {
        respond nextOfKin
    }

    @Secured(['ROLE_ADMIN', 'ROLE_STUDENT', 'ROLE_ADMIN_OFFICER', 'ROLE_COUNSELLOR'])
    def create() {
        respond new NextOfKin(params)
    }

    @Secured(['ROLE_ADMIN', 'ROLE_STUDENT', 'ROLE_ADMIN_OFFICER', 'ROLE_COUNSELLOR'])
    @Transactional
    def save(NextOfKin nextOfKin) {
        if (nextOfKin == null) {
            transactionStatus.setRollbackOnly()
            notFound()
            return
        }

        if (nextOfKin.hasErrors()) {
            transactionStatus.setRollbackOnly()
            respond nextOfKin.errors, view:'create'
            return
        }

        nextOfKin.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'nextOfKin.label', default: 'NextOfKin'), nextOfKin.id])
                redirect nextOfKin
            }
            '*' { respond nextOfKin, [status: CREATED] }
        }
    }

    @Secured(['ROLE_ADMIN', 'ROLE_STUDENT', 'ROLE_ADMIN_OFFICER', 'ROLE_COUNSELLOR'])
    def edit(NextOfKin nextOfKin) {
        respond nextOfKin
    }

    @Secured(['ROLE_ADMIN', 'ROLE_STUDENT', 'ROLE_ADMIN_OFFICER', 'ROLE_COUNSELLOR'])
    @Transactional
    def update(NextOfKin nextOfKin) {
        if (nextOfKin == null) {
            transactionStatus.setRollbackOnly()
            notFound()
            return
        }

        if (nextOfKin.hasErrors()) {
            transactionStatus.setRollbackOnly()
            respond nextOfKin.errors, view:'edit'
            return
        }

        nextOfKin.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'nextOfKin.label', default: 'NextOfKin'), nextOfKin.id])
                redirect nextOfKin
            }
            '*'{ respond nextOfKin, [status: OK] }
        }
    }

    @Secured(['ROLE_ADMIN', 'ROLE_STUDENT', 'ROLE_ADMIN_OFFICER', 'ROLE_COUNSELLOR'])
    @Transactional
    def delete(NextOfKin nextOfKin) {

        if (nextOfKin == null) {
            transactionStatus.setRollbackOnly()
            notFound()
            return
        }

        nextOfKin.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'nextOfKin.label', default: 'NextOfKin'), nextOfKin.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'nextOfKin.label', default: 'NextOfKin'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
