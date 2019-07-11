<html>
<head>
	<meta name="layout" content="login"/>
	<title><g:message code='springSecurity.login.title'/></title>
	<asset:stylesheet src="style.css"/>
	<asset:stylesheet src="page-center.css"/>
	<asset:stylesheet src="prism.css"/>

	<style>
    body {
        background-color: #009688 !important;
    }
	</style>
</head>

<body class="teal">
<!-- Start Page Loading -->
<div id="loader-wrapper">
	<div id="loader"></div>
	<div class="loader-section section-left"></div>
	<div class="loader-section section-right"></div>
</div>
<!-- End Page Loading -->



<div id="login-page" class="row">
	<div class="col s12 z-depth-4 card-panel">

		<g:if test='${flash.message}'>
			<div class="login_message">${flash.message}</div>
		</g:if>

		<form class="login-form" id="loginForm" action="${postUrl ?: '/login/authenticate'}" method="POST" autocomplete="off">
			<div class="row">
				<div class="input-field col s12 center">
					<asset:image src="apple-touch-icon-retina.png"  alt="" class="circle responsive-img valign profile-image-login" />
					<p class="center login-form-text teal-text"><g:message code='springSecurity.login.header'/></p>
				</div>
			</div>
			<div class="row margin">
				<div class="input-field col s12">
					<i class="mdi-social-person-outline prefix"></i>
					<input id="username" type="text" name="${usernameParameter ?: 'username'}">
					<label for="username" class="center-align">Username</label>
				</div>
			</div>
			<div class="row margin">
				<div class="input-field col s12">
					<i class="mdi-action-lock-outline prefix"></i>
					<input id="password" type="password"  name="${passwordParameter ?: 'password'}">
					<label for="password">Password</label>
				</div>
			</div>
			<div class="row">
				<div class="input-field col s12 m12 l12  login-text">
					<input type="checkbox" id="remember_me" name="${rememberMeParameter ?: 'remember-me'}" <g:if test='${hasCookie}'>checked="checked"</g:if>/>
					<label for="remember_me">Remember me</label>
				</div>
			</div>
			<div class="row">
				<div class="input-field col s12">
					<input type="submit" id="submit" class="btn waves-effect waves-light col s12" value="${message(code: 'springSecurity.login.button')}" />
				</div>
			</div>
			<div class="row">
				<div class="input-field col s6 m6 l6">
					<p class="margin medium-small"><a href="/register">Register Now!</a></p>
				</div>
				<div class="input-field col s6 m6 l6">
					<p class="margin right-align medium-small"><a href="/forgetPassword">Forgot password ?</a></p>
				</div>
			</div>

		</form>
	</div>
</div
	<asset:javascript src="prism.js"/>
	<asset:javascript src="plugins.js"/>
<script>
(function() {
	document.forms['loginForm'].elements['${usernameParameter ?: 'username'}'].focus();
})();
</script>
</body>
</html>
