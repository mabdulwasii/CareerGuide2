<!doctype html>
<html>
<head>
    <meta name="layout" content="template"/>
    <title>Welcome to CareerGuide</title>

    <asset:link rel="icon" href="favicon.ico" type="image/x-ico" />

    <asset:stylesheet src="animate.css"/>

    <asset:javascript src="application.js"/>

    <asset:javascript src="wow.min.js"/>
    <asset:javascript src="typed.min.js"/>
    <asset:javascript src="common.js"/>

    <script>
        var wow = new WOW(
            {
                boxClass: 'wow',      // animated element css class (default is wow)
                animateClass: 'animated', // animation css class (default is animated)
                offset: 0,          // distance to the element when triggering the animation (default is 0)
                mobile: true,       // trigger animations on mobile devices (default is true)
                live: true,       // act on asynchronously loaded content (default is true)
                callback: function (box) {
                    // the callback is fired every time an animation is started
                    // the argument that is passed in is the DOM node being animated
                },
                scrollContainer: null // optional scroll container selector, otherwise use window
            }
        );
        wow.init();
    </script>
</head>
<body class="">
    <main class="valign-wrapper">
        <section class="row">
            <div class="center col s10 offset-s1 banner">
                <div class="type-wrap row teal-text">
                    <div id="typed-strings">
                        <p>academics,</p>
                        <p>finance,</p>
                        <p>career advancement.</p>
                    </div>
                    <h2><span class="glyphicons glyphicons-education"></span>Unparallel Counselling on <strong><span
                            id="typed" style="white-space: pre;"></span></strong></h2>
                </div>

                %{--<h5>...helping you in your career advancement</h5>--}%
            </div>
            <div class="col s8 offset-s2">
                <g:form controller="search" action="search" class="col s12">
                    <div class="row">
                        <div class="input-field col s8 offset-s2 search ">
                            <span class="mdi mdi-magnify large teal-text"></span>
                            <input name="query" id="query" class="validate browser-default white teal-text hoverable" minlength="1" placeholder="Search for Institutions, Courses, ..." >
                        </div>
                    </div>
                    <div class="row">
                        <div class="col s12 center">
                            <button class="btn waves-effect waves-light hoverable teal white-text" name="action">Search
                                <i class="mdi mdi-magnify"></i>
                            </button>
                        </div>
                    </div>

                </g:form>

            </div>

            %{--Fab to toolbar--}%
            <div class="fixed-action-btn toolbar">
                <a class="btn-floating btn teal">
                    <i class="large mdi mdi-tooltip-edit"></i>
                </a>
                <ul class="">
                    <li class="waves-effect waves-light"><a href="/suggestion">Get Suggestion</a></li>
                    <li class="waves-effect waves-light"><a href="#!">How to Apply</a></li>
                    <li class="waves-effect waves-light"><a href="#!">Contact</a></li>
                    <li class="waves-effect waves-light"><a href="#!">Terms</a></li>
                    <li class="waves-effect waves-light"><a href="#!">Live Chat</a></li>
                    <li class="waves-effect waves-light"><a href="#!">About</a></li>
                </ul>
            </div>
        </section>



    </main>
<script>
    $(function () {

        $("#typed").typed({
            stringsElement: $('#typed-strings'),
            typeSpeed: 100,
            backDelay: 2000,
            loop: true,
            contentType: 'html', // or text
            // defaults to false for infinite loop
            loopCount: false,
            callback: function () {
                foo();
            },
            resetCallback: function () {
                newTyped();
            }
        });

        $(".reset").click(function () {
            $("#typed").typed('reset');
        });

    });

    function newTyped() { /* A new typed object */
    }

    function foo() {
        console.log("Callback");
    }

</script>

<style>
/* code for animated blinking cursor */
.typed-cursor {
    opacity: 1;
    font-weight: 100;
    -webkit-animation: blink 0.7s infinite;
    -moz-animation: blink 0.7s infinite;
    -ms-animation: blink 0.7s infinite;
    -o-animation: blink 0.7s infinite;
    animation: blink 0.7s infinite;
}

@
@-keyframes blink {
0% {
    opacity: 1;
}
50% {
    opacity: 0;
}
100% {
    opacity: 1;
}
}
@
@-webkit-keyframes blink {
    0% {
        opacity: 1;
    }
    50% {
        opacity: 0;
    }
    100% {
        opacity: 1;
        \
    }
}

@
@-moz-keyframes blink {
    0% {
        opacity: 1;
    }
    50% {
        opacity: 0;
    }
    100% {
        opacity: 1;
    }
}

@
@-ms-keyframes blink {
    0% {
        opacity: 1;
    }
    50% {
        opacity: 0;
    }
    100% {
        opacity: 1;
    }
}

@
@-o-keyframes blink {
    0% {
        opacity: 1;
    }
    50% {
        opacity: 0;
    }
    100% {
        opacity: 1;
    }
}
</style>

</body>
</html>
