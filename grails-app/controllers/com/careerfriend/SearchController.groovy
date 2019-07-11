package com.careerfriend

import grails.plugin.springsecurity.annotation.Secured

@Secured(['ROLE_ADMIN', 'ROLE_USER', 'ROLE_COUNSELLOR', 'ROLE_ADMIN_OFFICER', 'ROLE_ANONYMOUS'])
class SearchController {

    def elasticSearchService

    def index() {

    }
    /*
    def search(def query){
        def res = elasticSearchService.search("${params.query}")
        elasticSearchService.search('xyz', [ indices: Post, types: Post, from: 0, size: 10 ])

    }*/
    def search (def query) {
        def res = elasticSearchService.search("${params.query}").searchResults

        def resMsg = '<strong>Global search result(s):</strong><br />'

        res.each {
            resMsg += "<strong>Result</strong> \"${it.name}\" <br />"
        }
        flash.notice = resMsg
        respond view: '/result', model: [resMsg : resMsg, res: res]
    }
    /* def searchForUserTweets = {

        def tweets = Tweet.search("${params.message.search}").searchResults

        def tweetsMsg = 'Messages : '

        tweets.each {

            tweetsMsg += "<br />Tweet from ${it.user?.firstname} ${it.user?.lastname} :
            ${it.message} "

            tweetsMsg += "(tags : ${it.tags?.collect{t -> t.name}})"

        }

        flash.notice = tweetsMsg

        redirect(action: 'index')
    }*/

    /*def searchAll = {

        def res = elasticSearchService.search("${params.query}").searchResults

        def resMsg = '<strong>Global search result(s):</strong><br />'

        res.each {

            switch(it){

                case Tag:

                    resMsg += "<strong>Tag</strong> ${it.name}<br />"

                    break

                case Tweet:

                    resMsg += "<strong>Tweet</strong> \"${it.message}\" from
                    ${it.user.firstname} ${it.user.lastname}<br />"

                    break

                case User:

                    resMsg += "<strong>User</strong> ${it.firstname} ${it.lastname}<br />"

                    break

                default:

                    resMsg += "<strong>Other</strong> ${it}<br />"

                    break

            }

        }

        flash.notice = resMsg

        redirect(action:'index')


    }*/
}
