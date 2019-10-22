
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<%@ page import="java.sql.*;" import="struts.ticketBean;" import="org.apache.struts.action.ActionForm;" %>
<%@taglib prefix="j" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<j:set var="user" value="${sessionScope.usr}"></j:set>
<html>
    <head>
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta name="author" content="prosper">
        <title>Book Ticket - Movie Buff</title>
        <link rel="stylesheet" href="fonts/font-awesome.min.css" />
        <link rel="stylesheet" href="css/tar.css"/>
        <link rel="stylesheet" href="css/linearicons.css"/>
        <link rel="stylesheet" href="css/bootstrap.css"/>
        <link rel="stylesheet" href="css/bootstrap.min.css"/>
        <link rel="stylesheet" href="css/owl.carousel.css"/>
        <link rel="stylesheet" href="css/magnific-popup.css"/>
        <link rel="stylesheet" href="css/nice-select.css"/>
        <link rel="stylesheet" href="css/main.css"/>
    </head>
    <body>

        <%! String driverName = "org.sqlite.JDBC";%>
        <%!String url = "jdbc:sqlite:C:/Users/FOCUS/Documents/NetBeansProjects/MBE2/MBF.db";%>

        <!-- Start Header Area -->
        <header class="default-header">
            <nav class="navbar navbar-expand-lg navbar-light">
                <div class="container">
                    <a class="navbar-brand" href="home.jsp">
                        <h3 style="color: white;">Movie Buff Entertainment</h3>
                    </a>
                    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent"
                            aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                        <span class="fa fa-bars"></span>
                    </button>

                    <div class="collapse navbar-collapse justify-content-end align-items-center" id="navbarSupportedContent">
                        <ul class="navbar-nav navbar-right">
                            <li><a href="home.jsp">Home</a></li>
                            <li><a href="nowShowing.jsp">In Theaters</a></li>
                            <li><a href="comingSoon.jsp">Coming Soon</a></li>
                            <li><a class="active" href="bookTick.jsp">Book Ticket</a></li>
                            <li><a href="contact.jsp">Contact</a></li>
                            <li><a href="profile.jsp"><i class="fa fa-user-circle fa-2x"></i></a></li>
                        </ul>
                    </div>
                </div>
            </nav>
        </header>
        <!-- End Header Area -->

        <!-- start banner Area -->
        <section class="home-banner-area relative" id="home" data-parallax="scroll" data-image-src="img/shazam.jpg">
            <div class="overlay-bg overlay"></div>
            <h1 class="template-name">Movie Buff</h1>
            <div class="container">
                <div class="row fullscreen">
                    <div class="jos banner-content col-lg-12">
                        <p>Book Your</p>
                        <h1>
                            Tickets <br>
                            Here!
                        </h1>
                        <a href="#fro"><i class="fa fa-angle-double-down fa-3x" style="color: #fff;"></i></a>
                    </div>
                </div>
            </div>
        </section>
        <!-- End banner Area -->

        <!-- Start Booking Form Area -->
    <center>
        <section class="about-area section-gap" id="fro">
            <div class="container">
                <center><h1>Book Tickets Now!</h1></center>
                <br><br>
                <div class="container">
                    <html:form method="post" action="/book">
                        <div>
                            <label for="username">Username: </label><br>
                            <html:text property="username" disabled="true" value="${user}"></html:text>
                        </div>
                            <br>
                        <div>
                            <label for="movie">Movie: </label><br>
                            <%
                                try {
                                    Connection con = null;
                                    PreparedStatement ps = null;
                                    Class.forName(driverName);
                                    con = DriverManager.getConnection(url);
                                    String sql = "SELECT MovieName FROM Movie";
                                    ps = con.prepareStatement(sql);
                                    ResultSet rs = ps.executeQuery();
                            %>
                            <html:select property="movie" styleClass="pad">
                                <html:option value="Select Movie"> Select Movie</html:option>
                                <%
                                    while (rs.next()) {
                                        String fmovie = rs.getString("moviename");
                                %>
                                <html:option value="<%=fmovie%>"><%=fmovie%></html:option>
                                <%
                                    }
                                %>
                            </html:select>
                            <%
                                } catch (SQLException sqe) {
                                    out.println(sqe);
                                }
                            %>
                        </div>
                        <br><br><br>
                        <div>
                            <label for="date">Date: </label>
                            <br>
                            <html:text property="date"></html:text>
                        </div>
                            <br>
                        <div>
                            <label for="time">Time:</label>
                                <br>
                            <html:text property="time"></html:text>
                        </div>
                            <br>
                        <div>
                            <label for="class">Class:</label><br>
                        <html:select property="clas" styleClass="pad" styleId="sel" onchange="change()">
                                <html:option value="Select Ticket Class">Select Ticket Class</html:option>
                                <html:option value="Platinum">Platinum</html:option>
                                <html:option value="Gold">Gold</html:option>
                                <html:option value="Silver">Silver</html:option>
                            </html:select>
                                <style type="text/css">
                                    .pad{
                                        margin-left: 33.5vw !important;
                                    }
                                </style>
                        </div>
                            <br><br><br>
                        <div>
                            <label for="cost">Cost: </label>
                            <br>
                        <html:text styleId="set" property="cost" value="$" disabled="true"></html:text>
                        </div>
                        <script type="text/javascript">
                            function change(){
                                var se = document.getElementById("sel").value;
                                var se2 = "Platinum";
                                var se3 = "Gold";
                                var se4 = "Silver";

                                if(se === se2){
                                    document.getElementById("set").value = "$100";
                                }else if(se === se3){
                                    document.getElementById("set").value = "$80";
                                }else if(se === se4){
                                    document.getElementById("set").value = "$40";
                                }else{
                                    document.getElementById("set").value = "$";
                                }
                            }
                        </script>
                            <br>
                            <br>
                        <div class="col-lg-12">
                            <html:submit styleClass="btn btn-success">Book Ticket</html:submit>
                              
                        </div>
                    </html:form>
                </div>
            </div>
        </section>
    </center>
    <!-- End Booking Form Area -->

    <!-- start footer Area -->
    <footer class="footer-area section-gap">
        <div class="container">
            <div class="row footer-bottom d-flex justify-content-between">
                <h4 class="lf">Copyright &copy; 2019 <a href="home.jsp">Movie Buff</a> - All Rights Reserved</h4>
                <div style="clear:both;"></div>
                <div class="col-lg-4 col-sm-12 footer-social">
                    <a href="#"><i class="fa fa-car"></i></a>
                    <a href="#"><i class="fa fa-twitter"></i></a>
                    <a href="#"><i class="fa fa-dribbble"></i></a>
                    <a href="#"><i class="fa fa-linkedin"></i></a>
                </div>
            </div>
        </div>
    </footer>
    <!-- End footer Area -->

</body>
<script src="js/jquery.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<script src="js/vendor/jquery-2.2.4.min.js"></script>
<script src="js/vendor/bootstrap.min.js"></script>
<script src="js/jquery.ajaxchimp.min.js"></script>
<script src="js/parallax.min.js"></script>
<script src="js/owl.carousel.min.js"></script>
<script src="js/isotope.pkgd.min.js"></script>
<script src="js/jquery.nice-select.min.js"></script>
<script src="js/jquery.magnific-popup.min.js"></script>
<script src="js/jquery.sticky.js"></script>
<script src="js/main.js"></script>

</html>
