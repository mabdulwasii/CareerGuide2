// Added by the Spring Security Core plugin:
grails.plugin.springsecurity.userLookup.userDomainClassName = 'com.careerfriend.auth.User'
grails.plugin.springsecurity.userLookup.authorityJoinClassName = 'com.careerfriend.auth.UserRole'
grails.plugin.springsecurity.authority.className = 'com.princely.examtimetable.authcom.careerfriend.auth.Role'

grails.plugin.springsecurity.interceptUrlMap = [
		[pattern: '/',				 	access: ['permitAll']],
		[pattern: '/error',			 	access: ['permitAll']],
		[pattern: '/index',			 	access: ['permitAll']],
		[pattern: '/index.gsp',		 	access: ['permitAll']],
		[pattern: '/shutdown',		 	access: ['permitAll']],
		[pattern: '/assets/**',		 	access: ['permitAll']],
		[pattern: '/**/js/**',		 	access: ['permitAll']],
		[pattern: '/**/css/**',		 	access: ['permitAll']],
		[pattern: '/**/images/**',	 	access: ['permitAll']],
		[pattern: '/**/favicon.ico', 	access: ['permitAll']],
		[pattern: '/login/**',				access: ['permitAll']],
		[pattern: '/logout/**', 			access: ['permitAll']],


		[pattern: '/user/**',		 	access: 'ROLE_USER'],
		[pattern: '/admin/**',		 	access: ['ROLE_ADMIN_OFFICER',	'isFullyAuthenticated()']],
		[pattern: '/admin/staffMgt/**',	access: ['ROLE_ADMIN',	'isFullyAuthenticated()']],
		[pattern: '/admin/institutionMgt/**',	access: ['ROLE_ADMIN',	'isFullyAuthenticated()']],
		[pattern: '/admin/eventPlanner/**',	access: ['ROLE_ADMIN',	'isFullyAuthenticated()']],
		[pattern: '/dbconsole/**',	access: ['ROLE_ADMIN',	'isFullyAuthenticated()']],
		[pattern: '/admin/testPlatform/**',	access: ['ROLE_ADMIN',	'isFullyAuthenticated()']],
		[pattern: '/register', 		 access: ['ROLE_USER','isFullyAuthenticated()']]
]


grails.plugin.springsecurity.controllerAnnotations.staticRules = [
	[pattern: '/',               access: ['permitAll']],
	[pattern: '/error',          access: ['permitAll']],
	[pattern: '/index',          access: ['permitAll']],
	[pattern: '/index.gsp',      access: ['permitAll']],
	[pattern: '/shutdown',       access: ['permitAll']],
	[pattern: '/assets/**',      access: ['permitAll']],
	[pattern: '/**/js/**',       access: ['permitAll']],
	[pattern: '/**/css/**',      access: ['permitAll']],
	[pattern: '/**/images/**',   access: ['permitAll']],
	[pattern: '/**/favicon.ico', access: ['permitAll']],

	[pattern: '/login/**',		 access: ['permitAll']],
	[pattern: '/logout/**',		 access: ['permitAll']],
	[pattern: '/dbconsole/**',		 access: ['ROLE_USER']]


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
grails.plugin.springsecurity.successHandler.defaultTargetUrl = '/'

//grails.plugin.springsecurity.userLookup.usernamePropertyName = 'email'

/*
grails.plugin.springsecurity.failureHandler.exceptionMappings = [
		[exception: LockedException.name,
		 url: '/user/accountLocked'],
		[exception: DisabledException.name,
		 url: '/user/accountDisabled'],
		[exception: AccountExpiredException.name,
		 url: '/user/accountExpired'],
		[exception: CredentialsExpiredException.name, url: '/user/passwordExpired']
]
*/

def elasticsearchVersion = '2.3.3'
ext['elasticsearch.version'] = elasticsearchVersion

elasticSearch {
	datastoreImpl = 'hibernateDatastore'
}