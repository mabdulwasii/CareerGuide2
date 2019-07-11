<!doctype html>
<html lang="en" class="no-js">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <meta http-equiv="X-UA-Compatible" content="IE=edge"/>
    <title>
        <g:layoutTitle default="Grails"/>
    </title>
    <meta name="viewport" content="width=device-width, initial-scale=1"/>

    <asset:stylesheet src="application.css"/>
    <asset:stylesheet src="frontend.css"/>

    <g:layoutHead/>
</head>
<body>

<nav>
    <div class="nav-wrapper teal">
        <a href="#!" class="brand-logo">Mento</a>
        <a href="#" data-activates="mobile-demo" class="button-collapse"><i class="mdi mdi-menu"></i></a>
        <ul class="right hide-on-med-and-down">
            <g:pageProperty name="nav"/>
            <li><a href="javascript:void(0);" class="tooltipped" data-position="bottom" data-delay="50" data-tooltip="Chat"><i class="mdi mdi-cloud-upload"></i></a>
            <li><a href="javascript:void(0);" class="tooltipped" data-position="bottom" data-delay="50" data-tooltip="Upcoming Seminar"><i class="mdi mdi-calendar"></i></a>
            <sec:ifAllGranted roles="ROLE_USER">
                <li><a href="javascript:void(0);" class="tooltipped" data-position="bottom" data-delay="50" data-tooltip="Seminar request"><i class="mdi mdi-calendar-clock"></i></a>
            </sec:ifAllGranted>
            <li><a href="javascript:void(0);" class="tooltipped" data-position="bottom" data-delay="50" data-tooltip="Notification"><i class="mdi mdi-alarm"></i></a>
            <li><a href="javascript:void(0);" class="tooltipped" data-position="bottom" data-delay="50" data-tooltip="Profile"><i class="fa fa-user small"></i></a>
            <li><a href="javascript:void(0);" class="tooltipped" data-position="bottom" data-delay="50" data-tooltip="Logout"><i class="mdi mdi-logout"></i></a>
            </li>
        </ul>
    </div>
</nav>

<main>

    <g:layoutBody/>
</main>

<footer class="page-footer white">
    <div class="footer-copyright teal">
        <div class="container white-text ">
            © 2014 Copyright Text
            <a class="white-text right" href="/">Mento</a>
        </div>
    </div>
</footer>

<div id="spinner" class="spinner" style="display:none;">
    <g:message code="spinner.alt" default="Loading&hellip;"/>
</div>

<asset:javascript src="application.js"/>

</body>
</html>
