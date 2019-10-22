
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="j" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.sql.*;" import="struts.logAction.*;" %>
<!DOCTYPE html>
<j:set var="user" value="${sessionScope.usr}"></j:set>
    <html>
        <head>
            <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
            <meta name="author" content="prosper">
            <title>Welcome <j:out value="${user}"/></title>
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
                                <li><a href="bookTick.jsp">Book Ticket</a></li>
                                <li><a href="contact.jsp">Contact</a></li>
                                <li><a class="active" href="profile.jsp"><i class="fa fa-user-circle fa-2x"></i></a></li>
                            </ul>
                        </div>
                    </div>
                </nav>
            </header>
            <!-- End Header Area -->

            <!-- start banner Area -->
            <section class="home-banner-area relative" id="home" data-parallax="scroll" style="margin-top: -120px !important;">
                <div class="overlay-bg overlay"></div>
                <div class="container">
                    <div class="row fullscreen">
                        <div class="jos banner-content col-lg-12">
                            <center>
                                <i style="color: #ffffff !important; font-size: 190px;" class="fa fa-user-circle-o"></i>
                                <br><br><br>
                                <h3>User Profile: <span style="color: whitesmoke;"><j:out value="${user}"></j:out></span></h3>
                                    <br>
                                    <div class="container" style="color: whitesmoke;">
                                        <br>

                                    <!-- Java Database Output Variables //-->
                                    <%@page import="struts.logAction;"%>
                                    <%
                                        try {
                                            logAction la = new logAction();
                                            Connection con = null;
                                            PreparedStatement ps = null;
                                            Class.forName(driverName);
                                            con = DriverManager.getConnection(url);
                                            con.setAutoCommit(false);
                                            String sql = "SELECT fullname,email,phone FROM UserR WHERE Username='" + la.loggedUser + "';";
                                            ps = con.prepareStatement(sql);
                                            ResultSet rs = ps.executeQuery();
                                    %>
                                    <%
                                        String fullname = rs.getString("fullname").toLowerCase();
                                    %>
                                    <label style="margin-left: -190px; color: #263a4e;" for="fullname">Fullname: </label>
                                    <p><j:out value="<%=fullname%>"></j:out> </p>
                                    <%
                                        String email = rs.getString("Email");
                                    %>
                                    <label style="margin-left: -215px; color: #263a4e;" for="email">E-mail: </label>
                                    <p><j:out value="<%=email%>"></j:out></p>
                                    <%
                                        String phone = rs.getString("Phone");
                                    %>
                                    <label style="margin-left: -150px; color: #263a4e;" for="phone">Mobile Number: </label>
                                    <p><j:out value="<%=phone%>"></j:out></p>
                                    <%
                                        } catch (SQLException es) {
                                            System.err.println(es.getMessage());
                                        }
                                    %>
                                </div>
                                <a href="index.jsp" class="btn btn-danger">Sign Out</a>
                            </center>
                        </div>
                    </div>
                </div>
            </section>
            <!-- End banner Area -->

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
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.11.0/umd/popper.min.js" integrity="sha384-b/U6ypiBEHpOf/4+1nzFpr53nxSS+GLCkfwBdFNTxtclqqenISfwAzpKaMNFNmj4"
    crossorigin="anonymous"></script>
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
