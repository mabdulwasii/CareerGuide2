<!doctype html>
<html lang="en" class="no-js">
<head>
    <meta name="layout" content="main"/>
    <title>Admin DashBoard</title>

    <asset:link rel="icon" href="favicon.ico" type="image/x-ico" />
</head>
<body>

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
</main>

</body>
</html>

