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
<nav class="smallNav">
    <div class="nav-wrapper teal">
        <ul class="left hide-on-med-and-down">
            <li><a mailto="princehardetuneji@gmail.com" class="white-text">email: info@mento.com</a></li>
            <li><a href="" class="white-text">phone: +234 706 490 76</a></li>
        </ul>
        <ul id="" class="right hide-on-med-and-down">
            <sec:ifLoggedIn>
                <li><a href="#" class="white-text disabled">Welcome <sec:username/></a></li>
                <li class="disabled"><a href="/profile" class="white-text disabled">  |</a></li>
            </sec:ifLoggedIn>
            <li><a href="/parent" class="white-text">Parents</a></li>
            <li><a href="" class="white-text disabled">  |</a></li>
            <li><a href="/counsellor" class="white-text">Counsellors & professionals</a></li>
            <li><a href="" class="white-text disabled">  |</a></li>
            <li><a href="/institutions" class="white-text">Member Institutions</a></li>
            <li><a href="" class="white-text disabled">  |</a></li>
            <li><a href="#" class="white-text disabled"><span class="fa fa-facebook"></span></a></li>
            <li><a href="#" class="white-text disabled"><span class="fa fa-twitter"></span></a></li>
            <li><a href="#" class="white-text disabled"><span class="fa fa-google-plus"></span></a></li>
            <li><a href="#" class="white-text disabled"><span class="fa fa-linkedin"></span></a></li>

        </ul>
    </div>
</nav>
<nav class="nav">
    <div class="nav-wrapper white">
        <a href="#" class="brand-logo black-text">
            %{--<asset:image src="logo.jpg" style="width: 40px; height: 40px;"/></a>--}%
        <span><a href="#" class="brand-logo teal-text">Mento</a></span>
        <ul id="nav-mobile" class="right hide-on-med-and-down">
            <li><a href="/admin/" class="teal-text">DashBoard</a></li>
            <li><a href="" class="teal-text">Plan Ahead</a></li>
            <li><a href="/search" class="teal-text">Explore Institutions</a></li>
            <li><a href="/counselor" class="teal-text">Virtual Counselor</a></li>
            <li><a href="" class="teal-text">How To Apply</a></li>
            <li><a href="/register" class="yellow-text teal lighten-2 btn hoverable">Apply Now</a></li>
            <sec:ifLoggedIn >
                <li><a href="/logout" class="teal-text">Logout</a></li>
            </sec:ifLoggedIn>
            <sec:ifNotLoggedIn>
                <li><a href="/login" class="teal-text">Login</a></li>
            </sec:ifNotLoggedIn>

        </ul>
    </div>
</nav>
<g:layoutBody/>

<!-- START FOOTER -->
<footer class="teal">
    <div class="footer-copyright teal">
        <div class="container white-text ">
            © 2014 Copyright Text
            <a class="white-text right" href="/">Career Guide</a>
        </div>
    </div>
</footer>
<!-- END FOOTER -->


<asset:javascript src="application.js"/>

</body>
</html>

