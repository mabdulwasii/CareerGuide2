package com.careerfriend.auth

import groovy.transform.EqualsAndHashCode
import groovy.transform.ToString

@EqualsAndHashCode(includes='username')
@ToString(includes='username', includeNames=true, includePackage=false)
class User implements Serializable {

	private static final long serialVersionUID = 1

	transient springSecurityService

	String username
	String password
//	transient passwordConfirm
	String email
	boolean enabled = true
	boolean accountExpired
	boolean accountLocked
	boolean passwordExpired

	Set<Role> getAuthorities() {
		UserRole.findAllByUser(this)*.role
	}

	def beforeInsert() {
		encodePassword()
	}

	def beforeUpdate() {
		if (isDirty('password')) {
			encodePassword()
		}
	}

	protected void encodePassword() {
		password = springSecurityService?.passwordEncoder ? springSecurityService.encodePassword(password) : password
	}

	static transients = ['springSecurityService']

	static constraints = {
		password blank: false, password: true
//				validator: {password, obj ->
//			def password2 = obj.passwordConfirm
//			password2 == password ? true : ['invalid.matchingpasswords']
//		}
//		matches: /^(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,15}$/
		username blank: false, unique: true, matches: /^([1-zA-Z0-1@.\s]{1,255})$/
		email email: true, blank: false, unique: true
//		passwordConfirm blank: false, nullable: false
	}

	static mapping = {
		password column: '`password`'
		table '`user`'
	}
}
