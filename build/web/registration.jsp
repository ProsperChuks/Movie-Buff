
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Register</title>
        <link rel="stylesheet" href="css/bootstrap.min.css" />
    </head>
    <body style="background-image: url('css/images/shazam.jpg');">
        <div class="jumbotron" class="jumb" style="float: right; height: 69.5rem; padding-left: 70px; padding-right: 75px;">
            <html:form method="post" action="/register">
                <b><h1>Sign Up</h1></b>
                <br>
                <br>
            <div id="fullname">
                <label for="fullname">Fullname: </label>
                <br>
                <html:text property="fullname" styleClass="box"></html:text>
                </div>
                <br>
                <div id="Surname">
                    <label for="username">Username:</label>
                    <br>
                <html:text property="username" styleClass="box"></html:text>
                </div>
                <br>
                <div id="email">
                    <label for="email">Email Address: </label>
                    <br>
                <html:text property="email" styleClass="box"></html:text>
                </div>
                <br>
                <div id="phone">
                    <label for="phone">Phone Number:</label>
                    <br>
                <html:text property="phone" styleClass="box"></html:text>
                </div>
                <br>
                <div id="pass">
                    <label for="password">Password:</label>
                    <br>
                <html:password property="password" styleClass="box"></html:password>
                </div>
                <br>
                <br>
                <div class="col-lg-12">
                    <html:submit styleId="but">Sign Up</html:submit>
                    <a id="but2" href="index.jsp">Sign In -></a>
                </div>
        </html:form>
        </div>
    </body>
    <script src="js/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <style type="text/css">
        body{
            font-family: fantasy;
        }
        
        .jumbotron{
            background-color: #ffffff;
            margin-bottom: 0px !important;
        }
        
        p{
            font-size: 10px !important;
        }
        
        label{
            font-size: 16px;
        }
        
        .box{
            border-right: none !important;
            border-left: none !important;
            border-top: none !important;
            border-bottom: 1px solid #000000 !important;
            border-radius: 8px;
            background-color: transparent;
            width: 250px !important;
        }
        
        .box:focus{
            border-bottom: 2px solid #cea06c !important;
        }
        
        a{
            text-decoration: none !important;
            color: #000000;
        }
        
        #but{
            padding: 11px 33px;
            border-radius: 20px;
            border: hidden !important;
            background: aquamarine;
            font-size: 16px !important;
        }
        
        a#but2{
            padding: 11px 33px;
            border-radius: 20px;
            border: hidden !important;
            background: transparent;
            font-size: 16px !important;
        }
        
        a#but2:hover{
            transition: ease-in-out 0.5s;
            background: aquamarine;
        }
    </style>
</html>
