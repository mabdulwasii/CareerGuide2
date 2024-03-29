<!doctype html>
<html>
    <head>
        <title>Page Not Found</title>
        %{--<meta name="layout" content="main">--}%
        <g:if env="development"><asset:stylesheet src="errors.css"/></g:if>
    </head>
    <body>

    <!-- Start Page Loading -->
    <div id="loader-wrapper">
        <div id="loader"></div>
        <div class="loader-section section-left"></div>
        <div class="loader-section section-right"></div>
    </div>
    <!-- End Page Loading -->



    <div id="error-page">

        <div class="row">
            <div class="col s12">
                <div class="browser-window">
                    <div class="top-bar">
                        <div class="circles">
                            <div id="close-circle" class="circle"></div>
                            <div id="minimize-circle" class="circle"></div>
                            <div id="maximize-circle" class="circle"></div>
                        </div>
                    </div>
                    <div class="content">
                        <div class="row">
                            <div id="site-layout-example-top" class="col s12">
                                <p class="flat-text-logo center white-text caption-uppercase">Sorry but we couldn’t find this page :(</p>
                            </div>
                            <div id="site-layout-example-right" class="col s12 m12 l12">
                                <div class="row center">
                                    <h1 class="text-long-shadow col s12">404</h1>
                                </div>
                                <div class="row center">
                                    <p class="center white-text col s12">It seems that this page doesn’t exist.</p>
                                    <p class="center s12"><button onclick="goBack()" class="btn waves-effect waves-light">Back</button> <a href="index.htm" class="btn waves-effect waves-light">Homepage</a>
                                    <p>
                                    </p>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>


        <ul class="errors">
            <li>Error: Page Not Found (404)</li>
            <li>Path: ${request.forwardURI}</li>
        </ul>

    <script type="text/javascript">
        function goBack() {
            window.history.back();
        }
    </script>

    </body>
</html>
