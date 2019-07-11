<!DOCTYPE html>
<html lang="en">

<!--================================================================================
	Item Name: Materialize - Material Design Admin Template
	Version: 2.1
	Author: GeeksLabs
	Author URL: http://www.themeforest.net/user/geekslabs
================================================================================ -->

<head>
		<title>Lock Screen Page</title>

	<asset:stylesheet src="application.css"/>
</head>

<body class="cyan">
<!-- Start Page Loading -->
<div id="loader-wrapper">
	<div id="loader"></div>
	<div class="loader-section section-left"></div>
	<div class="loader-section section-right"></div>
</div>
<!-- End Page Loading -->



<div id="login-page" class="row" style="margin-top: 4em">
	<div class="col s12 z-depth-4 card-panel">
		<form method="POST" action="${resource(file: 'login/authenticate')}">
			<div class="row">
				<div class="input-field col s12 center">
					<img src="images/avatar.jpg" alt="" class="circle responsive-img valign profile-image-login">
					<h4 class="header">${user?.firstname}  ${user?.lastname}</h4>
				</div>
			</div>
			<div class="row">
				<div class="input-field col s12">
					<input id="username" type="text" class="validate" name="username" value="${user?.username}">
					<label for="username" data-error="Invalid username"
						   data-success="Valid username">Username</label>
				</div>
			</div>

			<div class="row">
				<div class="input-field col s12">
					<input id="password" type="password" class="validate" name="password">
					<label for="password" data-error="Invalid password"
						   data-success="Valid Password">Password</label>
				</div>
			</div>

			<div class="row">
				<div class="col s12">
					<p>
						<input type="checkbox" id="remember_me" name="remember-me"/>
						<label for="remember_me">Remember me</label>
					</p></div>
			</div>
			<br/>

			<div class="row center-align">
				<div class="col s12">
					<g:submitButton id="loginBtn" name="login" class="waves-effect waves-light btn center-align"
									value="Login"/>
				</div>
			</div>
			<br/>
			<br/>

		</form>
	</div>
</div>



<!-- ================================================
    Scripts
    ================================================ -->

<asset:javascript src="application.js"/>
</body>

</html>