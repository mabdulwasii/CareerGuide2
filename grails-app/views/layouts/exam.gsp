<!doctype html>
<html lang="en" class="no-js">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <meta http-equiv="X-UA-Compatible" content="IE=edge"/>
    <title>
        <g:layoutTitle default="Exam Time Table"/>
    </title>
    <meta name="viewport" content="width=device-width, initial-scale=1"/>

    <asset:stylesheet src="application.css"/>
    <asset:stylesheet src="custom.css"/>

    <style>
        header, main, footer {
            padding-left: 220px;
        }
    </style>
    <g:layoutHead/>
</head>

<body>
<main>
    <nav class="white z-depth-2">
        <a href="/" class="hide-on-med-and-down indigo-text brand-logo admin tooltipped" data-position="bottom" data-delay="50" data-tooltip="Home"><i class="fa fa-home"></i></a>
        <a href="#" class="brand-logo center indigo-text" style="padding-left: 105px"><g:pageProperty name="page.header"/></a>


        <ul id="nav-mobile" class="right hide-on-med-and-down">
            <g:pageProperty name="page.nav"/>
            <li><a href="/logout.html" class="tooltipped right indigo-text nav-icon" data-position="bottom" data-delay="50" data-tooltip="Logout"><i class="mdi mdi-logout indigo-text"></i></a></li>
        </ul>


        <ul id="slide-out" class="side-nav fixed indigo lighten-0 z-depth-5 waves-indigo waves-effect waves-ripple" style="width:220px;">
            <li>
                <div class="userView">
                <div class="background">
                    <asset:image src="004.jpg"/>
                </div>
                <a href="#!user"><asset:image class="circle" src="cap.jpg"/></a>
                    <a href="#!name"><span class="white-text">Welcome Admin</span></a>
                    <a href="#!email"><span class="white-text email">princehardetuneji@gmail.com</span></a>

            </div>
            </li>
            </li><li><a href="/dashboard" class="waves-effect white-text"><i class="white-text mdi mdi-view-dashboard"></i>DashBoard</a></li>
            <li><div class="divider"></div></li>
            <li><a href="/courses" class="waves-effect white-text"><i class="white-text mdi mdi-plus-box"></i>Course</a></li>
        </li><li><a href="/lecturer" class="waves-effect white-text"><i class="white-text mdi mdi-snowman"></i>Lecturer</a></li>
            <li><a href="/lectureRoom" class="waves-effect white-text"><i class="white-text mdi mdi-assistant"></i>Lecture Room</a></li>
            <li><div class="divider"></div></li>
            <li><a href="/time" class="waves-effect white-text"><i class="white-text mdi mdi-assistant"></i>Time Slot</a></li>
            <li><div class="divider"></div></li>
            <li><a href="/department" class="waves-effect white-text"><i class="white-text mdi mdi-pharmacy"></i>Department</a></li>
            <li><a href="/level" class="waves-effect white-text"><i class="white-text mdi mdi-pharmacy"></i>Level</a></li>
            <li><div class="divider"></div></li>
            <li><a href="/generate" class="waves-effect white-text"><i class="white-text mdi mdi-view-module"></i>Generate Timetable</a></li>
            <li><a href="/exam" class="waves-effect white-text"><i class="white-text mdi mdi-pharmacy"></i>Exam</a></li>
            <li><div class="divider"></div></li>
            <li><a href="/logout" class="waves-effect white-text"><i class="white-text mdi mdi-logout"></i>Logout</a></li>
        </ul>
        <a href="#"  data-activates="slide-out" class="button-collapse indigo-text" ><i class="mdi mdi-menu"></i></a>

    </nav>

    <div class="main">
        <g:layoutBody/>
    </div>
</main>

<footer class="page-footer footer-copyright indigo">
    <div class="">
        <div class="white-text text-lighten-0 center-align" style="padding-left: 10px">
            © 2017 Copyright EXAM TIMETABLE
        </div>
    </div>
</footer>

<div id="spinner" class="spinner" style="display:none;">
    <g:message code="spinner.alt" default="Loading&hellip;"/>
</div>

<asset:javascript src="application.js"/>

</body>
</html>
