<!doctype html>
<html lang="en" class="no-js">
<head>
    <meta name="layout" content="admin"/>
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
        <p class="white-text">Please wait...</p>
    </div>
</div>
<!-- #END# Page Loader -->
<main>
<!-- //////////////////////////////////////////////////////////////////////////// -->
   <div class="row">
        <div class="col s3">
            <div class="card horizontal row">
                <div class="card-stacked col s7">
                    <div class="card-content yellow-text text-darken-3">
                        <span class="card-title"><h5>20</h5></span>
                        <p>Institutions</p>
                    </div>
                </div>
                <div class="card-image col s5">
                    <i class="blue-text text-accent-5 waves-effect fa fa-building large"></i>
                </div>
            </div>
        </div>
        <div class="col s3">
            <div class="card horizontal row">
                <div class="card-stacked col s7">
                    <div class="card-content blue-text text-accent-3">
                        <span class="card-title"><h5>40</h5></span>
                        <p>Careers</p>
                    </div>
                </div>
                <div class="card-image col s5">
                    <i class="yellow-text text-darken-4 waves-effect mdi mdi-stairs large"></i>
                </div>
            </div>
        </div>
        <div class="col s3">
            <div class="card horizontal row">
                <div class="card-stacked col s7">
                    <div class="card-content pink-text text-darken-2 bold">
                        <span class="card-title "><h5>12</h5></span>
                        <p>Counsellors</p>
                    </div>
                </div>
                <div class="card-image col s5">
                    <i class="purple-text waves-effect mdi mdi-worker large"></i>
                </div>
            </div>
        </div>
        <div class="col s3">
            <div class="card horizontal row">
                <div class="card-stacked col s7">
                    <div class="card-content red-text text-accent-3">
                        <span class="card-title "><h5>12</h5></span>
                        <p>Students</p>
                    </div>
                </div>
                <div class="card-image col s5">
                    <i class="red-text waves-effect fa fa-user large"></i>
                </div>
            </div>
        </div>
    </div>
    %{--<div class="row"><div class="divider"></div></div>--}%

    <!--chart dashboard start-->
    <div id="chart-dashboard">
        <div class="row">
            <div class="col s12 m8 l8">
                <div class="card">
                    <div class="card-move-up waves-effect waves-block waves-light">
                        <div class="move-up cyan darken-1">
                            <div>
                                <span class="chart-title white-text">Revenue</span>
                                <div class="chart-revenue cyan darken-2 white-text">
                                    <p class="chart-revenue-total">$4,500.85</p>
                                    <p class="chart-revenue-per"><i class="mdi-navigation-arrow-drop-up"></i> 21.80 %</p>
                                </div>
                                <div class="switch chart-revenue-switch right">
                                    <label class="cyan-text text-lighten-5">
                                        Month
                                        <input type="checkbox">
                                        <span class="lever"></span> Year
                                    </label>
                                </div>
                            </div>
                            <div class="trending-line-chart-wrapper">
                                <canvas id="trending-line-chart" height="70"></canvas>
                            </div>
                        </div>
                    </div>
                    <div class="card-content">
                        <a class="btn-floating btn-move-up waves-effect waves-light darken-2 right"><i class="mdi-content-add activator"></i></a>
                        <div class="col s12 m3 l3">
                            <div id="doughnut-chart-wrapper">
                                <canvas id="doughnut-chart" height="200"></canvas>
                                <div class="doughnut-chart-status">4500
                                    <p class="ultra-small center-align">Sold</p>
                                </div>
                            </div>
                        </div>
                        <div class="col s12 m2 l2">
                            <ul class="doughnut-chart-legend">
                                <li class="mobile ultra-small"><span class="legend-color"></span>Mobile</li>
                                <li class="kitchen ultra-small"><span class="legend-color"></span> Kitchen</li>
                                <li class="home ultra-small"><span class="legend-color"></span> Home</li>
                            </ul>
                        </div>
                        <div class="col s12 m5 l6">
                            <div class="trending-bar-chart-wrapper">
                                <canvas id="trending-bar-chart" height="90"></canvas>
                            </div>
                        </div>
                    </div>

                    <div class="card-reveal">
                        <span class="card-title grey-text text-darken-4">Revenue by Month <i class="mdi-navigation-close right"></i></span>
                        <table class="responsive-table">
                            <thead>
                            <tr>
                                <th data-field="id">ID</th>
                                <th data-field="month">Month</th>
                                <th data-field="item-sold">Item Sold</th>
                                <th data-field="item-price">Item Price</th>
                                <th data-field="total-profit">Total Profit</th>
                            </tr>
                            </thead>
                            <tbody>
                            <tr>
                                <td>1</td>
                                <td>January</td>
                                <td>122</td>
                                <td>100</td>
                                <td>$122,00.00</td>
                            </tr>
                            <tr>
                                <td>2</td>
                                <td>February</td>
                                <td>122</td>
                                <td>100</td>
                                <td>$122,00.00</td>
                            </tr>
                            <tr>
                                <td>3</td>
                                <td>March</td>
                                <td>122</td>
                                <td>100</td>
                                <td>$122,00.00</td>
                            </tr>
                            <tr>
                                <td>4</td>
                                <td>April</td>
                                <td>122</td>
                                <td>100</td>
                                <td>$122,00.00</td>
                            </tr>
                            <tr>
                                <td>5</td>
                                <td>May</td>
                                <td>122</td>
                                <td>100</td>
                                <td>$122,00.00</td>
                            </tr>
                            <tr>
                                <td>6</td>
                                <td>June</td>
                                <td>122</td>
                                <td>100</td>
                                <td>$122,00.00</td>
                            </tr>
                            <tr>
                                <td>7</td>
                                <td>July</td>
                                <td>122</td>
                                <td>100</td>
                                <td>$122,00.00</td>
                            </tr>
                            <tr>
                                <td>8</td>
                                <td>August</td>
                                <td>122</td>
                                <td>100</td>
                                <td>$122,00.00</td>
                            </tr>
                            <tr>
                                <td>9</td>
                                <td>Septmber</td>
                                <td>122</td>
                                <td>100</td>
                                <td>$122,00.00</td>
                            </tr>
                            <tr>
                                <td>10</td>
                                <td>Octomber</td>
                                <td>122</td>
                                <td>100</td>
                                <td>$122,00.00</td>
                            </tr>
                            <tr>
                                <td>11</td>
                                <td>November</td>
                                <td>122</td>
                                <td>100</td>
                                <td>$122,00.00</td>
                            </tr>
                            <tr>
                                <td>12</td>
                                <td>December</td>
                                <td>122</td>
                                <td>100</td>
                                <td>$122,00.00</td>
                            </tr>
                            </tbody>
                        </table>
                    </div>


                </div>
            </div>

            <div class="col s12 m4 l4">
                <div class="card">
                    <div class="card-move-up teal waves-effect waves-block waves-light">
                        <div class="move-up">
                            <p class="margin white-text">Browser Stats</p>
                            <canvas id="trending-radar-chart" height="114"></canvas>
                        </div>
                    </div>
                    <div class="card-content  teal darken-2" style="height: 179px !important;">
                        <a class="btn-floating btn-move-up waves-effect waves-light darken-2 right"><i class="mdi-content-add activator"></i></a>
                        <div class="line-chart-wrapper">
                            <p class="margin white-text">Revenue by country</p>
                            <canvas id="line-chart" height="114"></canvas>
                        </div>
                    </div>
                    <div class="card-reveal">
                        <span class="card-title grey-text text-darken-4">Revenue by country <i class="mdi-navigation-close right"></i></span>
                        <table class="responsive-table">
                            <thead>
                            <tr>
                                <th data-field="country-name">Country Name</th>
                                <th data-field="item-sold">Item Sold</th>
                                <th data-field="total-profit">Total Profit</th>
                            </tr>
                            </thead>
                            <tbody>
                            <tr>
                                <td>USA</td>
                                <td>65</td>
                                <td>$452.55</td>
                            </tr>
                            <tr>
                                <td>UK</td>
                                <td>76</td>
                                <td>$452.55</td>
                            </tr>
                            <tr>
                                <td>Canada</td>
                                <td>65</td>
                                <td>$452.55</td>
                            </tr>
                            <tr>
                                <td>Brazil</td>
                                <td>76</td>
                                <td>$452.55</td>
                            </tr>
                            <tr>

                                <td>India</td>
                                <td>65</td>
                                <td>$452.55</td>
                            </tr>
                            <tr>
                                <td>France</td>
                                <td>76</td>
                                <td>$452.55</td>
                            </tr>
                            <tr>
                                <td>Austrelia</td>
                                <td>65</td>
                                <td>$452.55</td>
                            </tr>
                            <tr>
                                <td>Russia</td>
                                <td>76</td>
                                <td>$452.55</td>
                            </tr>
                            </tbody>
                        </table>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!--chart dashboard end-->
<!-- //////////////////////////////////////////////////////////////////////////// -->

</main>

</body>
</html>

