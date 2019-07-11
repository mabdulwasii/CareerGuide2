<!doctype html>
<html lang="en" class="no-js" xmlns="http://www.w3.org/1999/html">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <meta http-equiv="X-UA-Compatible" content="IE=edge"/>
    <title>
        <g:layoutTitle default="Welcome to Mento"/>
    </title>
    <meta name="viewport" content="width=device-width, initial-scale=1"/>
    <asset:stylesheet src="application.css"/>
    <asset:stylesheet src="preloader.css"/>
    <asset:stylesheet src="custom.css"/>
    <g:layoutHead/>
</head>

<body class="grey lighten-3">
    <nav class="grey lighten-2 header">
        <a href="/" class="hide-on-med-and-down teal-text brand-logo tooltipped admin" data-position="bottom" data-delay="50" data-tooltip="Home""><i class="fa fa-user" ></i></a>
        <a href="#" class="brand-logo center teal-text" style="padding-left: 105px">
            <g:pageProperty name="page.header"/>
        </a>
        <ul id="nav-mobile" class="right hide-on-med-and-down">
            <g:pageProperty name="page.nav"/>
            <li><a href="javascript:void(0);" class="tooltipped" data-position="bottom" data-delay="50" data-tooltip="Chat"><i class="mdi mdi-camera-front teal-text"></i></a>
            </li>
            <li><a href="javascript:void(0);" class="tooltipped" data-position="bottom" data-delay="50" data-tooltip="Event Request"><i class="mdi mdi-message-processing teal-text"></i></a>
            </li>
            <li><a href="javascript:void(0);" class="tooltipped" data-position="bottom" data-delay="50" data-tooltip="Notifications"><i class="mdi mdi-bell-ring teal-text"></i></a>
            </li>
            <li><a href="javascript:void(0);" class="tooltipped" data-position="bottom" data-delay="50" data-tooltip="Logout"><i class="mdi mdi-logout teal-text"></i></a>
            </li>
            <li><a href="#" data-activates="chat-out" class="chat-collapse tooltipped" data-position="bottom" data-delay="50" data-tooltip="Right Menu"><i class="mdi mdi-menu teal-text"></i></a>
            </li>
        </ul>

        <ul id="slide-out" class="side-nav fixed lighten-0 z-depth-2">
            <li>
                <div class="userView" style="padding-bottom: .3em;">

                        <asset:image src="apple-touch-icon-retina.png" style="height: 20px; margin-bottom: 1em"/>
                    <div class="background">
                        <asset:image src="004.jpg"/>
                    </div>
                    <ul id="profile-dropdown" class="dropdown-content center">
                        <li><a href="index.htm#" class="teal-text"><i class="mdi mdi-face teal-text"></i> Profile</a>
                        </li>
                        <li><a href="index.htm#" class="teal-text"><i class="mdi mdi-settings teal-text"></i> Settings</a>
                        </li>
                        <li><a href="index.htm#" class="teal-text"><i class="mdi mdi-help teal-text"></i> Help</a>
                        </li>
                        <li class="divider"></li>
                        <li><a href="/admin/lock.gsp" class="teal-text"><i class="mdi mdi-lock teal-text"></i> Lock</a>
                        </li>
                        <li><a href="/logout" class="teal-text"><i class="mdi mdi-logout teal-text"></i> Logout</a>
                        </li>
                    </ul>
                    <div class="row center center-align">
                        <div>
                            <div>
                                <a class="btn-flat dropdown-button waves-effect waves-light white-text profile-btn" href="index.htm#" style="height: 60px;" data-activates="profile-dropdown">
                                    <asset:image class="circle responsive-img" src="cap.jpg"/><i class="mdi mdi-menu-down right"></i>
                                </a>
                            </div>
                            <span class="white-text profile-text ">Abdulwasii Moronkola</span>
                        </div>

                    </div>
                </div>
            </li>
            <li class="active"><g:link controller="dashboard" class="teal-text"><i class="teal-text mdi mdi-view-dashboard"></i>Dashoard</g:link></li>
            <li><div class="divider teal lighten-3"></div></li>
            <li class="bold"><g:link controller="institution" class="waves-effect waves-tel  teal-text"><i class="mdi mdi-hospital-building teal-text"></i> Institution</g:link>
            </li>
            <li class="bold"><g:link controller="faculty" class="waves-effect waves-tel  teal-text"><i class="mdi mdi-home-modern small teal-text"></i> Faculty</g:link>
            </li>
            <li class="bold"><g:link controller="department" class="waves-effect waves-tel  teal-text"><i class="fa fa-building small teal-text"></i> Departments</g:link>
            </li>
            <li><div class="divider teal lighten-3"></div></li>
            <li class="bold"><g:link controller="user" class="waves-effect waves-cyan  teal-text"><i class="mdi mdi-worker teal-text"></i> Counsellors</g:link>
            </li>
            <li class="bold"><g:link controller="user" class="waves-effect waves-cyan  teal-text"><i class="fa fa-user small teal-text"></i> Admin Officers</g:link>
            </li>
            <li class="bold"><g:link controller="user" class="waves-effect waves-cyan  teal-text"><i class="mdi mdi-face-profile teal-text"></i> Students</g:link>
            </li>
            <li><div class="divider teal lighten-3"></div></li>
            <li class="bold"><g:link controller="eventRequest" class="waves-effect waves-cyan  teal-text"><i class="fa fa-calendar small teal-text"></i> Event Request</g:link>
            </li>
            <li class="bold"><g:link controller="event" class="waves-effect waves-teal  teal-text"><i class=" mdi mdi-calendar-clock teal-text"></i> Upcomming Event</g:link>
            </li>
            <li><div class="divider teal lighten-3"></div></li>
            <li class="bold"><g:link controller="logout" class="waves-effect waves-teal  teal-text"><i class="mdi mdi-logout teal-text"></i> Logout</g:link>
            </li>
        </ul>
        <a href="#" data-activates="slide-out" class="button-collapse "><i class="mdi mdi-menu teal-text"></i></a>
    </nav>
    <div class="divider"></div>
<g:layoutBody/>

<div id="spinner" class="spinner" style="display:none;">
    <g:message code="spinner.alt" default="Loading&hellip;"/>
</div>

<asset:javascript src="application.js"/>
<asset:javascript src="preloader.js"/>

</body>
</html>
