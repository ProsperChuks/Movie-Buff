
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<%@taglib prefix="j" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.sql.*;" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Movie Buff Administrator</title>
        <link rel="stylesheet" href="css/bootstrap.min.css" />
        <link rel="stylesheet" href="fonts/font-awesome.min.css" />
        
    </head>
    <body style="background-color: #CCC;">
        <%! String driverName = "org.sqlite.JDBC";%>
        <%!String url = "jdbc:sqlite:C:/Users/FOCUS/Documents/NetBeansProjects/MBE2/MBF.db";%>
        <section class="jumbotron jumb" style="float: left; height: 66.3rem; padding-left: 35px; padding-right: 35px;">
            <center>
                <br><br>
                <i style="color: #ffffff !important; font-size: 190px;" class="fa fa-user-circle-o"></i>
                <h3 style="color: whitesmoke;">ADMINISTRATOR</h3>
                <br><br><br><br><br><br><br><br><br><br><br><br><br><br>
                <a href="index.jsp" class="lin btn btn-danger">log out</a>
            </center>
        </section>

        <nav class="navbar navbar-fixed-top" style="border-radius: 0px; background-color: #263a4e !important;">
            <div class="container" style="margin-right: -380px;">
                <b class="navbar-header">
                    <a class="navbar-brand" href="admin.jsp" style="color: whitesmoke;">MOVIE BUFF ADMIN</a>
                </b>
            </div>
        </nav>

        <div class="container" style="margin-left: 300px; padding-top: 90px; width: 30vw;">
            <div class="panel panel-primary">
                <div class="panel-heading">
                    <h4>ADD MOVIES</h4>
                </div>
                <center class="panel-body" style="height: 30vh;">
                    <i class="fa fa-film fa-3x" style="color: #337ab7;"></i><br><br>
                    <button class="btn btn-primary" data-toggle="collapse" data-target="#mov">Add Movie</button>
                    <br><br>
                    <html:form styleClass="collapse" styleId="mov" action="/addmovie" method="post">
                        <label for="moviename">Movie Name:</label><br>
                        <html:text property="mn"></html:text>
                        <html:submit property="but1" styleClass="btn btn-primary">Add</html:submit>
                    </html:form>
                </center>
            </div>
        </div>

        <!-- Total Number of Users //-->
        <%
            try {
                Connection con = null;
                PreparedStatement ps = null;
                Class.forName(driverName);
                con = DriverManager.getConnection(url);
                con.setAutoCommit(false);
                String sql = "SELECT COUNT(*) FROM UserR;";
                ps = con.prepareStatement(sql);
                ResultSet rs = ps.executeQuery();
        %>
        <%
            int tnu = rs.getInt("COUNT(*)");
            ps.close();
            rs.close();
            con.close();
        %>
        <div class="container" style="margin-left: 800px; width: 30vw; margin-top: -573px;">
            <div class="panel panel-success" style="border: 1px solid #5cb85c;">
                <div class="panel-heading">
                    <h4>TOTAL NO. USERS SIGNED UP</h4>
                </div>
                <center class="panel-body" style="height: 30vh;">
                    <i class="fa fa-users fa-3x" style="color: #5cb85c;"></i><br>
                    <h2><j:out value="<%=tnu%>"></j:out></h2>
                    <p>NEW USERS</p>
                    </center>
                </div>
            </div>
        <%
            } catch (SQLException es) {
                System.err.println(es.getMessage());
            }
        %>
        
        <div class="container" style="margin-left: 300px; width: 30vw; margin-top: -285px;">
            <div class="panel panel-success" style="border: 1px solid #5cb85c;">
                <div class="panel-heading">
                    <h4>DELETE MOVIES</h4>
                </div>
                <center class="panel-body" style="height: 30vh;">
                    <i class="fa fa-film fa-3x" style="color: #5cb85c;"></i><br><br>
                    <html:form action="/delMovie" method="post">
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
                            <html:select styleClass="btn btn-default" property="movie">
                                <html:option value="Select Movie"> Select Movie</html:option>
                                <%
                                    while (rs.next()) {
                                        String fmovie = rs.getString("moviename");
                                %>
                                <html:option value="<%=fmovie%>"><%=fmovie%></html:option>
                                <%
                                    }
                                    ps.close();
                                    rs.close();
                                    con.close();
                                %>
                            </html:select>
                            <%
                                } catch (SQLException sqe) {
                                    out.println(sqe);
                                }
                            %>
                            <html:submit property="but2" styleClass="btn btn-success">Delete</html:submit>
                    </html:form>
                </center>
            </div>
        </div>
        
        <div class="container" style="margin-left: 800px; width: 30vw; margin-top: -285px;">
            <div class="panel panel-danger" style="border: 1px solid #c12e2a;">
                <div class="panel-heading">
                    <h4>DELETE USERS</h4>
                </div>
                <center class="panel-body" style="height: 30vh;">
                    <i class="fa fa-users fa-3x" style="color: #c12e2a;"></i><br><br>
                    <html:form action="/delUser" method="post">
                        <%
                                try {
                                    Connection con = null;
                                    PreparedStatement ps = null;
                                    Class.forName(driverName);
                                    con = DriverManager.getConnection(url);
                                    String sql = "SELECT Username FROM UserR";
                                    ps = con.prepareStatement(sql);
                                    ResultSet rs = ps.executeQuery();
                            %>
                            <html:select styleClass="btn btn-default" property="user">
                                <html:option value="Select User"> Select User</html:option>
                                <%
                                    while (rs.next()) {
                                        String fuser = rs.getString("username");
                                %>
                                <html:option value="<%=fuser%>"><%=fuser%></html:option>
                                <%
                                    }
                                    ps.close();
                                    rs.close();
                                    con.close();
                                %>
                            </html:select>
                            <%
                                } catch (SQLException sqe) {
                                    out.println(sqe);
                                }
                            %>
                            <html:submit property="but3" styleClass="btn btn-danger">Delete</html:submit>
                    </html:form>
                    </center>
                </div>
            </div>

    </body>
    <script src="js/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <style type="text/css">

        .jumb{
            background-color: #263a4e;
            margin-bottom: 0px !important;
        }        

        .jumbotron{
            margin-bottom: 0px !important;
        }

        .navbar-nav{
            background-color: #263a4e !important;
        }

        .lin{
            text-decoration: none !important;
            text-transform: uppercase;
        }

        .active{
            padding: 13px 75px;
            color: whitesmoke;
            background-color: #cea06c !important;
        }
        
    </style>
</html>
