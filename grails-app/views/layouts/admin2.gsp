<!doctype html>
<html lang="en" class="no-js">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <meta http-equiv="X-UA-Compatible" content="IE=edge"/>
    <title>
        <g:layoutTitle default="DashBoard"/>
    </title>
    <meta name="viewport" content="width=device-width, initial-scale=1"/>

    <asset:stylesheet src="application.css"/>
    <asset:stylesheet src="backend.css"/>
    <asset:stylesheet src="perfect-scrollbar.css"/>
    %{--<asset:stylesheet src="chartist.min.css"/>--}%

    <g:layoutHead/>
</head>
<body>

<header id="header" class="page-topbar">
    <!-- start header nav-->
    <div class="navbar-fixed" >
        <nav class="teal mainHeader">
            <div class="nav-wrapper">
                <div class="header-search-wrapper hide-on-med-and-down">
                    <i class="mdi mdi-magnify"></i>
                    <input name="Search" class="header-search-input z-depth-2 browser-default" placeholder="Explore Career Guide" style="height: 90% !imortant  "/>
                </div>
                <ul class="right hide-on-med-and-down">
                    <li><a href="javascript:void(0);" class="tooltipped" data-position="bottom" data-delay="50" data-tooltip="Chat"><i class="mdi mdi-camera-front"></i></a>
                    </li>
                    <li><a href="javascript:void(0);" class="tooltipped" data-position="bottom" data-delay="50" data-tooltip="Event Request"><i class="mdi mdi-message-processing"></i></a>
                    </li>
                    <li><a href="javascript:void(0);" class="tooltipped" data-position="bottom" data-delay="50" data-tooltip="Notifications"><i class="mdi mdi-bell-ring"></i></a>
                    </li>
                    <li><a href="javascript:void(0);" class="tooltipped" data-position="bottom" data-delay="50" data-tooltip="Logout"><i class="mdi mdi-logout"></i></a>
                    </li>
                    <li><a href="#" data-activates="chat-out" class="chat-collapse tooltipped" data-position="bottom" data-delay="50" data-tooltip="Right Menu"><i class="mdi mdi-menu"></i></a>
                    </li>
                </ul>
            </div>
        </nav>
    </div>
    <!-- end header nav-->
</header>
<!-- END HEADER -->

<ul id="dropdown2" class="dropdown-content">
    <li><a href="#!">one<span class="badge">1</span></a></li>
    <li><a href="#!">two<span class="new badge">1</span></a></li>
    <li><a href="#!">three</a></li>
</ul>

<aside id="left-sidebar-nav" >
    <ul id="slide-out" class="side-nav fixed leftside-navigation z-depth-3">
        <li class="user-details cyan darken-2">
            <div class="row">
                <div class="col col s4 m4 l4">
                        <asset:image src="cap.jpg" alt="" class="circle responsive-img "/>
                </div>
                <div class="col col s8 m8 l8">
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
                    <a class="btn-flat dropdown-button waves-effect waves-light white-text profile-btn" href="index.htm#" data-activates="profile-dropdown"><sec:username/><i class="mdi mdi-menu-down right"></i></a>
                        <p class="user-role white-text">Welcome Admin</p>
                </div>
            </div>
        </li>
        <sec:ifAllGranted roles="ROLE_ADMIN">
        <li class="bold active"><a href="/dashboard"  class="waves-effect waves-teal  teal-text"><i class="mdi mdi-view-dashboard teal-text"></i> Dashboard</a>
        </li>
        <li class="bold"><g:link controller="admin" action="school" class="waves-effect waves-tel  teal-text"><i class="mdi mdi-hospital-building teal-text"></i> School Management <span class="new badge">4</span></g:link>
        </li>
        <li class="bold"><g:link controller="admin" action="personnel" class="waves-effect waves-cyan  teal-text"><i class="mdi mdi-face-profile teal-text"></i> Personel Management <span class="new badge">4</span></g:link>
        </li>
        %{--<li class="bold"><g:link controller="testPlatform" class="waves-effect waves-teal  teal-text"><i class="mdi mdi-view-module teal-text"></i> Test Platform <span class="new badge">4</span></g:link>
        </li>--}%
        <li class="bold"><g:link controller="admin" action="event" class="waves-effect waves-teal  teal-text"><i class="mdi mdi-calendar teal-text"></i> Event Managements<span class="new badge">4</span></g:link>
        </li>
        <li class="li-hover"><div class="divider"></div></li>
        </sec:ifAllGranted>
        <sec:ifAllGranted roles="ROLE_ADMIN_OFFICER">
            <li class="bold active"><a href="/dashboard"  class="waves-effect waves-teal  teal-text"><i class="mdi mdi-view-dashboard teal-text"></i> Dashboard</a>
            </li>
            <li class="bold"><g:link controller="institution" class="waves-effect waves-tel  teal-text"><i class="mdi mdi-hospital-building teal-text"></i> Institution <span class="new badge">4</span></g:link>
            </li>
            <li class="bold"><g:link controller="faculty" class="waves-effect waves-tel  teal-text"><i class="mdi mdi-hospital-building teal-text"></i> Faculty <span class="new badge">4</span></g:link>
            </li>
            <li class="bold"><g:link controller="department" class="waves-effect waves-cyan  teal-text"><i class="mdi mdi-face-profile teal-text"></i> Department <span class="new badge">4</span></g:link>
            </li>
            <li class="bold"><g:link controller="finance" class="waves-effect waves-teal  teal-text"><i class="mdi mdi-view-module teal-text"></i> Finance <span class="new badge">4</span></g:link>
            </li>
            <li class="bold"><g:link controller="adminOfficerProfile" class="waves-effect waves-teal  teal-text"><i class="mdi mdi-calendar teal-text"></i> Profile <span class="new badge">4</span></g:link>
            </li>
            <li class="li-hover"><div class="divider"></div></li>
        </sec:ifAllGranted>
        <li class="li-hover"><p class="ultra-small margin more-text  teal-text">OTHERS</p></li>
        <li><a href="/address" class=" teal-text"><i class="mdi mdi-slack teal-text  teal-text"></i>Address</a>
        <li><a href="/contact" class=" teal-text"><i class="mdi mdi-contact-mail teal-text  teal-text"></i>Contact</a>
        <li><a href="/logout" class=" teal-text"><i class="mdi mdi-logout teal-text  teal-text"></i>Logout</a>
        </li>
    </ul>
    <a href="index.htm#" data-activates="slide-out" class="sidebar-collapse btn-floating btn-medium waves-effect waves-light hide-on-large-only cyan"><i class="mdi-navigation-menu"></i></a>
</aside>
<!-- END LEFT SIDEBAR NAV-->

<!-- START RIGHT SIDEBAR NAV-->
<aside id="right-sidebar-nav">
    <ul id="chat-out" class="side-nav rightside-navigation">
        <li class="li-hover">
            <a href="#" data-activates="chat-out" class="chat-close-collapse right"><i class="mdi-navigation-close"></i></a>
            <div id="right-search" class="row">
                <form class="col s12">
                    <div class="input-field">
                        <i class="mdi-action-search prefix"></i>
                        <input id="icon_prefix" type="text" class="validate">
                        <label for="icon_prefix">Search</label>
                    </div>
                </form>
            </div>
        </li>
        <li class="li-hover">
            <ul class="chat-collapsible" data-collapsible="expandable">
                <li>
                    <div class="collapsible-header teal white-text active"><i class="mdi-social-whatshot"></i>Recent Activity</div>
                    <div class="collapsible-body recent-activity">
                        <div class="recent-activity-list chat-out-list row">
                            <div class="col s3 recent-activity-list-icon"><i class="mdi-action-add-shopping-cart"></i>
                            </div>
                            <div class="col s9 recent-activity-list-text">
                                <a href="index.htm#">just now</a>
                                <p>Jim Doe Purchased new equipments for zonal office.</p>
                            </div>
                        </div>
                        <div class="recent-activity-list chat-out-list row">
                            <div class="col s3 recent-activity-list-icon"><i class="mdi-device-airplanemode-on"></i>
                            </div>
                            <div class="col s9 recent-activity-list-text">
                                <a href="index.htm#">Yesterday</a>
                                <p>Your Next flight for USA will be on 15th August 2015.</p>
                            </div>
                        </div>
                        <div class="recent-activity-list chat-out-list row">
                            <div class="col s3 recent-activity-list-icon"><i class="mdi-action-settings-voice"></i>
                            </div>
                            <div class="col s9 recent-activity-list-text">
                                <a href="index.htm#">5 Days Ago</a>
                                <p>Natalya Parker Send you a voice mail for next conference.</p>
                            </div>
                        </div>
                        <div class="recent-activity-list chat-out-list row">
                            <div class="col s3 recent-activity-list-icon"><i class="mdi-action-store"></i>
                            </div>
                            <div class="col s9 recent-activity-list-text">
                                <a href="index.htm#">Last Week</a>
                                <p>Jessy Jay open a new store at S.G Road.</p>
                            </div>
                        </div>
                        <div class="recent-activity-list chat-out-list row">
                            <div class="col s3 recent-activity-list-icon"><i class="mdi-action-settings-voice"></i>
                            </div>
                            <div class="col s9 recent-activity-list-text">
                                <a href="index.htm#">5 Days Ago</a>
                                <p>Natalya Parker Send you a voice mail for next conference.</p>
                            </div>
                        </div>
                    </div>
                </li>
                <li>
                    <div class="collapsible-header light-blue white-text active"><i class="mdi-editor-attach-money"></i>Sales Repoart</div>
                    <div class="collapsible-body sales-repoart">
                        <div class="sales-repoart-list  chat-out-list row">
                            <div class="col s8">Target Salse</div>
                            <div class="col s4"><span id="sales-line-1"></span>
                            </div>
                        </div>
                        <div class="sales-repoart-list chat-out-list row">
                            <div class="col s8">Payment Due</div>
                            <div class="col s4"><span id="sales-bar-1"></span>
                            </div>
                        </div>
                        <div class="sales-repoart-list chat-out-list row">
                            <div class="col s8">Total Delivery</div>
                            <div class="col s4"><span id="sales-line-2"></span>
                            </div>
                        </div>
                        <div class="sales-repoart-list chat-out-list row">
                            <div class="col s8">Total Progress</div>
                            <div class="col s4"><span id="sales-bar-2"></span>
                            </div>
                        </div>
                    </div>
                </li>
                <li>
                    <div class="collapsible-header red white-text"><i class="mdi-action-stars"></i>Favorite Associates</div>
                    <div class="collapsible-body favorite-associates">
                        <div class="favorite-associate-list chat-out-list row">
                            <div class="col s4"><img src="images/avatar.jpg" alt="" class="circle responsive-img online-user valign profile-image">
                            </div>
                            <div class="col s8">
                                <p>Eileen Sideways</p>
                                <p class="place">Los Angeles, CA</p>
                            </div>
                        </div>
                        <div class="favorite-associate-list chat-out-list row">
                            <div class="col s4"><img src="images/avatar.jpg" alt="" class="circle responsive-img online-user valign profile-image">
                            </div>
                            <div class="col s8">
                                <p>Zaham Sindil</p>
                                <p class="place">San Francisco, CA</p>
                            </div>
                        </div>
                        <div class="favorite-associate-list chat-out-list row">
                            <div class="col s4"><img src="images/avatar.jpg" alt="" class="circle responsive-img offline-user valign profile-image">
                            </div>
                            <div class="col s8">
                                <p>Renov Leongal</p>
                                <p class="place">Cebu City, Philippines</p>
                            </div>
                        </div>
                        <div class="favorite-associate-list chat-out-list row">
                            <div class="col s4"><img src="images/avatar.jpg" alt="" class="circle responsive-img online-user valign profile-image">
                            </div>
                            <div class="col s8">
                                <p>Weno Carasbong</p>
                                <p>Tokyo, Japan</p>
                            </div>
                        </div>
                        <div class="favorite-associate-list chat-out-list row">
                            <div class="col s4"><img src="images/avatar.jpg" alt="" class="circle responsive-img offline-user valign profile-image">
                            </div>
                            <div class="col s8">
                                <p>Nusja Nawancali</p>
                                <p class="place">Bangkok, Thailand</p>
                            </div>
                        </div>
                    </div>
                </li>
            </ul>
        </li>
    </ul>
</aside>
<main style="padding-left: 240px" class="main">
    <g:layoutBody/>
</main>

<!-- START FOOTER -->
<footer class="page-footer teal">
    <div class="footer-copyright">
        <div class="container">
            © 2014 Copyright Text
            <a class="grey-text text-lighten-4 right" href="/">Career Guide</a>
        </div>
    </div>
</footer>
<!-- END FOOTER -->

    <asset:javascript src="application.js"/>
    <asset:javascript src="perfect-scrollbar.min.js"/>
   %{-- <asset:javascript src="chartist.min.js"/>
    <asset:javascript src="chart.min.js"/>
    <asset:javascript src="chart-script.js"/>
    <asset:javascript src="jquery.sparkline.min.js"/>
    <asset:javascript src="sparkline-script.js"/>--}%

</body>
</html>
