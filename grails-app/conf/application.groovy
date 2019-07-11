wschat.enableSecurity='true'

grails.plugin.springsecurity.userLookup.userDomainClassName = 'grails.plugin.wschat.ChatAuth'
grails.plugin.springsecurity.userLookup.authorityJoinClassName = 'grails.plugin.wschat.ChatAuthChatRole'
grails.plugin.springsecurity.authority.className = 'grails.plugin.wschat.ChatRole'
grails.plugin.springsecurity.securityConfigType = "Annotation"
//grails.plugin.springsecurity.successHandler.alwaysUseDefault = true

grails.plugin.springsecurity.controllerAnnotations.staticRules = [
	[pattern: '/',               access: ['permitAll']],
	[pattern: '/**',             access: ['permitAll']],
	[pattern: '/error',          access: ['permitAll']],
	[pattern: '/index',          access: ['permitAll']],
	[pattern: '/index.gsp',      access: ['permitAll']],
	[pattern: '/shutdown',       access: ['permitAll']],
	[pattern: '/assets/**',      access: ['permitAll']],
	[pattern: '/**/js/**',       access: ['permitAll']],
	[pattern: '/**/css/**',      access: ['permitAll']],
	[pattern: '/**/images/**',   access: ['permitAll']],
	[pattern: '/**/favicon.ico', access: ['permitAll']],
	[pattern: '/search/**', 		 access: ['permitAll']],
	[pattern: '/suggestion', 		 access: ['permitAll']],
	[pattern: '/result', 		 access: ['permitAll']],


	[pattern: '/student/**',		 	access: 'ROLE_USER'],
	[pattern: '/admin/**',		 	access: ['ROLE_ADMIN',	'isFullyAuthenticated()']],
	[pattern: '/admin/staffMgt/**',	access: ['ROLE_ADMIN',	'isFullyAuthenticated()']],
	[pattern: '/admin/institutionMgt/**',	access: ['ROLE_ADMIN',	'isFullyAuthenticated()']],
	[pattern: '/admin/eventPlanner/**',	access: ['ROLE_ADMIN',	'isFullyAuthenticated()']],
	[pattern: '/dbconsole/**',	access: ['ROLE_ADMIN',	'isFullyAuthenticated()']],
	[pattern: '/admin/testPlatform/**',	access: ['ROLE_ADMIN',	'isFullyAuthenticated()']],
	[pattern: '/register', 		 access: ['permitAll']],
	[pattern: '/user/accountLocked', 		 access: ['ROLE_ADMIN','isFullyAuthenticated()']],
	[pattern: '/user/accountDisabled', 		 access: ['ROLE_ADMIN','isFullyAuthenticated()']],
	[pattern: '/user/accountExpired', 		 access: ['ROLE_ADMIN','isFullyAuthenticated()']],
	[pattern: '/user/passwordExpired', 		 access: ['ROLE_ADMIN','isFullyAuthenticated()']],

	[pattern: '/login/**',		 access: ['permitAll']],
	[pattern: '/logout/**',		 access: ['permitAll']],

	[pattern: '/wsChat/**', access: ['permitAll']],
	[pattern: '/wsChatAdmin/**', access: ['ROLE_ADMIN', 'ROLE_COUNSELLOR']],
	[pattern: '/wsCamEndpoint/**', access: ['permitAll']],
	[pattern: '/wsChatEndpoint/**', access: ['permitAll']],
	[pattern: '/wsChatFileEndpoint/**', access: ['permitAll']],
	[pattern: '/TicTacToeServer/**', access: ['permitAll']],
	[pattern: '/wsCamEndpoint', access: ['permitAll']],
	[pattern: '/wsChatEndpoint', access: ['permitAll']],
	[pattern: '/wsChatFileEndpoint', access: ['permitAll']],
	[pattern: '/TicTacToeServer', access: ['permitAll']],
	[pattern: '/dbconsole/**', access: ['permitAll']],
	[pattern: '/ChatClientEndpoint/**', access: ['permitAll']],
	[pattern: '/WsChatClientEndpoint/**', access:['permitAll']],
	[pattern: '/ChatClientEndpoint', access: ['permitAll']],
	[pattern: '/test/**', access: ['permitAll']],
	[pattern: '/WsChatClientEndpoint', access: ['permitAll']]

]

grails.plugin.springsecurity.filterChain.chainMap = [
	[pattern: '/assets/**',      filters: 'none'],
	[pattern: '/**/js/**',       filters: 'none'],
	[pattern: '/**/css/**',      filters: 'none'],
	[pattern: '/**/images/**',   filters: 'none'],
	[pattern: '/**/favicon.ico', filters: 'none'],
	[pattern: '/**',             filters: 'JOINED_FILTERS']
]

grails.plugin.springsecurity.logout.postOnly = false
//grails.plugin.springsecurity.successHandler.defaultTargetUrl = '/dashboard'

//grails.plugin.springsecurity.userLookup.usernamePropertyName = 'email'

def elasticsearchVersion = '2.3.3'
ext['elasticsearch.version'] = elasticsearchVersion

elasticSearch {
	datastoreImpl = 'hibernateDatastore'
}


wschat.defaultperm='admin'
wschat.rooms = ['fred','smith','room3']
wschat.showtitle="yes"
//wschat.appName = 'no'
wschat.addAppName= 'yno'
//wschat.hostname='localhost:9400'
stunServers { iceServers=[ [url: 'stun:stun.l.google.com:19302'] ] }
wschat.send.leftroom='yes'
wschat.send.joinroom='yes'
wschat.frontenduser='_frontend'
wschat.storeForFrontEnd=true
wschat.dbstore=true
wschat.dbsupport='yes'
wschat.dbstore_pm_messages=true
wschat.dbstore_room_messages=true
wschat.debug='true'

wschat.dbstore_user_messages=true


wschat.liveChatAssistant='assistant' // the chat client assistant name.. so if userx requests chat .. userx_assistant = this what this is .
wschat.liveChatPerm='admin'  // this is the group of users that livechat belongs to and if those uses have an email address in profile they will also be emailed
wschat.liveContactEmail='youremail@gmail.com' // this is the hard coded live chat email
wschat.liveChatUsername='masterv'  // this is the nickname upon them joining a live request
wschat.liveContactName='Mr V'  // this is the person that email title is set to
wschat.emailFrom="me@domain.com"  //this is for sending emails
wschat.store_live_messages=true  // store records of offline messaging
wschat.enable_AI=true  // enable Aritificial Intelligence ? refer to ChatAI.groovy for example and understanding
wschat.liveChatTitle="My Live chat"


//wschat.dbstore_user_messages=true
wschat.addFile='true'
wschat.addGame='true'

wschat.liveChatAskName='true'
wschat.liveChatAskEmail='true'
wschat.enable_Chat_AI=true
wschat.enable_Chat_BadWords=true

wschat.enable_Chat_Bot='true'

wschat.wsProtocol='wss'
wschat.siteProtocol='https'
wschat.hostname='localhost:8443'


