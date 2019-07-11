package com.careerfriend.eventplanner

import grails.plugin.springsecurity.annotation.Secured

import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Secured(['ROLE_STUDENT'])
@Transactional(readOnly = true)
class EventRequestController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond EventRequest.list(params), model:[eventRequestCount: EventRequest.count()]
    }

    def show(EventRequest eventRequest) {
        respond eventRequest
    }

    def create() {
        respond new EventRequest(params)
    }

    @Transactional
    def save(EventRequest eventRequest) {
        if (eventRequest == null) {
            transactionStatus.setRollbackOnly()
            notFound()
            return
        }

        if (eventRequest.hasErrors()) {
            transactionStatus.setRollbackOnly()
            respond eventRequest.errors, view:'create'
            return
        }

        eventRequest.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'eventRequest.label', default: 'EventRequest'), eventRequest.id])
                redirect eventRequest
            }
            '*' { respond eventRequest, [status: CREATED] }
        }
    }

    def edit(EventRequest eventRequest) {
        respond eventRequest
    }

    @Transactional
    def update(EventRequest eventRequest) {
        if (eventRequest == null) {
            transactionStatus.setRollbackOnly()
            notFound()
            return
        }

        if (eventRequest.hasErrors()) {
            transactionStatus.setRollbackOnly()
            respond eventRequest.errors, view:'edit'
            return
        }

        eventRequest.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'eventRequest.label', default: 'EventRequest'), eventRequest.id])
                redirect eventRequest
            }
            '*'{ respond eventRequest, [status: OK] }
        }
    }

    @Transactional
    def delete(EventRequest eventRequest) {

        if (eventRequest == null) {
            transactionStatus.setRollbackOnly()
            notFound()
            return
        }

        eventRequest.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'eventRequest.label', default: 'EventRequest'), eventRequest.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'eventRequest.label', default: 'EventRequest'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
