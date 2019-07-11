package com.careerfriend.infosystem.institutionMgt

import grails.plugin.springsecurity.annotation.Secured

import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Secured(['ROLE_ADMIN'])
@Transactional(readOnly = true)
class FinanceController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond Finance.list(params), model:[financeCount: Finance.count()]
    }

    def show(Finance finance) {
        respond finance
    }

    def create() {
        respond new Finance(params)
    }

    @Transactional
    def save(Finance finance) {
        if (finance == null) {
            transactionStatus.setRollbackOnly()
            notFound()
            return
        }

        if (finance.hasErrors()) {
            transactionStatus.setRollbackOnly()
            respond finance.errors, view:'create'
            return
        }

        finance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'finance.label', default: 'Finance'), finance.id])
                redirect finance
            }
            '*' { respond finance, [status: CREATED] }
        }
    }

    def edit(Finance finance) {
        respond finance
    }

    @Transactional
    def update(Finance finance) {
        if (finance == null) {
            transactionStatus.setRollbackOnly()
            notFound()
            return
        }

        if (finance.hasErrors()) {
            transactionStatus.setRollbackOnly()
            respond finance.errors, view:'edit'
            return
        }

        finance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'finance.label', default: 'Finance'), finance.id])
                redirect finance
            }
            '*'{ respond finance, [status: OK] }
        }
    }

    @Transactional
    def delete(Finance finance) {

        if (finance == null) {
            transactionStatus.setRollbackOnly()
            notFound()
            return
        }

        finance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'finance.label', default: 'Finance'), finance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'finance.label', default: 'Finance'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
