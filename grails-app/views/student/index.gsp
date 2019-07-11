<%@ page import="com.careerfriend.infosystem.institutionMgt.Institution; com.careerfriend.utilities.CareerJob; com.careerfriend.utilities.Subject; com.careerfriend.utilities.Interest" %>
<!doctype html>
<html lang="en" class="no-js">
<head>
    <meta name="layout" content="main"/>
    <title>Admin DashBoard</title>

    <asset:link rel="icon" href="favicon.ico" type="image/x-ico" />
</head>
<body>

<content tag="nav">
    <li><a href="#survey" class="tooltipped" data-position="bottom" data-delay="50" data-tooltip="Survey"><i class="mdi mdi-comment-question-outline fa fa-question"></i></a>
</content>

<!-- Page Loader -->
<div class="page-loader-wrapper">
    <div class="loader">
        <div class="preloader">
            <div class="spinner-layer pl-red">
                <div class="circle-clipper left">
                    <div class="circle"></div>
                </div>
                <div class="circle-clipper right">
                    <div class="circle"></div>
                </div>
            </div>
        </div>
        <p>Please wait...</p>
    </div>
</div>
<!-- #END# Page Loader -->
<main style="padding-left: 240px">
<!-- //////////////////////////////////////////////////////////////////////////// -->
    <div class="row">

    <div class="col m8 z-depth-1-half hide-on-small-and-down">
        <div class="slider">
            <ul class="slides">
                <li>
                    <asset:image src="2330_max.jpg"/> <!-- random image -->
                    <div class="caption center-align">
                        <h3 class="teal-text darken-2">This is our big Tagline!</h3>
                        <h5 class="light grey-text text-lighten-3">Here's our small slogan.</h5>
                    </div>
                </li>
                <li>
                    <asset:image src="3d_930.jpg"/><!-- random image -->
                    <div class="caption left-align">
                        <h3 class="teal-text darken-2">Left Aligned Caption</h3>
                        <h5 class="light grey-text text-lighten-3">Here's our small slogan.</h5>
                    </div>
                </li>
                <li>
                    <asset:image src="001.jpg"/> <!-- random image -->
                    <div class="caption right-align">
                        <h3 class="teal-text darken-2">Right Aligned Caption</h3>
                        <h5 class="light grey-text text-lighten-3">Here's our small slogan.</h5>
                    </div>
                </li>
                <li>
                    <asset:image src="stethoscope.jpg"/> <!-- random image -->
                    <div class="caption center-align">
                        <h3 class="teal-text darken-2">This is our big Tagline!</h3>
                        <h5 class="light grey-text text-lighten-3">Here's our small slogan.</h5>
                    </div>
                </li>
            </ul>
        </div>
    </div>

    <div class="col m3 s12 push-s1 card grey lighten-5">
        %{--<div class="row center-align">--}%
            %{--<asset:image src="apple-touch-icon-retina.png" class="responsive-img circle"/>--}%
        %{--</div>--}%

        <div class="row">
            <ul class="collection">
                <div class="center" style="margin-bottom: 2em; margin-top: 2em">
                    <asset:image src="apple-touch-icon-retina.png" />
                </div>
                <div class="divider"></div>
                <h5 class="center collection-header teal-text">Recent Chat</h5>
                <div class="divider"></div>

                    <li class="collection-item"><a href="#">Dr Adewale Smith</a></li>
                    <li class="collection-item"><a href="#">Prof. Shola Adeshina</a></li>
                    <li class="collection-item"><a href="#">Mrs. Adeyeye Adamu</a></li>
                    <li class="collection-item"><a href="#">Mr Audu Musa</a></li>
            </ul>
        </div>

    </div>
</div>
<!-- //////////////////////////////////////////////////////////////////////////// -->

<!-- Modal Structure -->
    <div id="survey" class="modal">
    <div class="row">
        <g:form class="col s12">
        <div class="modal-content">
            <h4 class="text-center">Quick Survey</h4>
            <div class="row">
                    <div class="row">
                        <div class="input-field col s6">
                            <i class="fa fa-user"></i>
                            <input id="fullname" name="fuulname" class="validate">
                            <label for="fullname">Full Name</label>
                        </div>
                        <div class="input-field col s6">
                            <i class="mdi mdi-numeric"></i>
                            <input id="age" name="age" type="tel" class="validate">
                            <label for="age">Age</label>
                        </div>
                    </div>

                    <div class="row">
                        <div class="input-field col s12">
                            <textarea id="bio" name="bio" class="materialize-textarea"></textarea>
                            <label for="bio">Password</label>
                        </div>
                    </div>
                    <div class="row">
                        <div class="input-field col s6">
                            <i class="mdi mdi-light"></i>
                            <g:select name="hobbies" id="hobbies"
                                      from="${Interest.list()}"
                                      optionValue="name"
                                      multiple="true"
                                      optionKey="id" />
                            <label for="hobbies">Select Hobbies</label>
                        </div>
                        <div class="input-field col s6">
                            <i class="mdi mdi-book-multiple"></i>
                            <g:select name="bestSubjects" id="bestSubjects"
                                      from="${Subject.list()}"
                                      multiple="true"
                                      optionValue="name"
                                      optionKey="id" />
                            <label for="bestSubjects">Select Best Subjects</label>
                        </div>
                    </div>
                    <div class="row">
                        <div class="input-field col s6">
                            <i class="mdi mdi-book-multiple"></i>
                            <g:select name="olevels" id="olevels"
                                      from="${Subject.list()}"
                                      multiple="true"
                                      optionValue="name"
                                      optionKey="id" />
                            <label for="olevels">Select Olevel Subjects</label>
                        </div>
                        <div class="input-field col s6">
                            <i class="mdi mdi-worker"></i>
                            <g:select name="careerJob" id="careerJob"
                                      from="${CareerJob.list()}"
                                      multiple="true"
                                      optionValue="name"
                                      optionKey="id" />
                            <label for="careerJob">Select Future Career</label>
                        </div>
                    </div>
                    <div class="row">
                        <div class="input-field col s6">
                            <i class="mdi mdi-hospital-building"></i>
                            <g:select name="choiceInstitution" id="choiceInstitution"
                                      from="${Institution.list()}"
                                      multiple="true"
                                      optionValue="name"
                                      optionKey="id" />
                            <label for="choiceInstitution">Select Institution of Choice</label>
                        </div>
                        <div class="input-field col s6">
                            <i class="fa fa-building"></i>
                            <g:select name="choiceCourse" id="choiceCourse"
                                      from="${Institution.list()}"
                                      optionValue="name"
                                      optionKey="id" />
                            <label for="choiceCourse">Select Institution of Choice</label>
                        </div>
                    </div>
            </div>
        </div>
        <div class="modal-footer">
            <a href="#!" class="left modal-action modal-close waves-effect waves-green btn-flat">Agree</a>
            <g:submitButton name="submit" class=" right btn btn-flat teal text-white modal-action waves-effect waves-green"
                            value="Submit"/>
        </div>
        </g:form>
    </div>
    </div>
</main>

</body>
</html>

