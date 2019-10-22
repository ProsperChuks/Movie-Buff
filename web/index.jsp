
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <title>Sign In</title>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <link rel="stylesheet" href="css/bootstrap.min.css" type="text/css" media="all"/>
        <link rel="stylesheet" href="signReg.css" type="text/css"/>
    </head>
    <body style="background-image: url('css/images/shazam.jpg');">

        <div class="jumbotron" class="jumb" style="float: right; height: 69.5rem; padding-left: 70px; padding-right: 75px;">
            <html:form method="post" action="/login">
                <b><h1>Sign In</h1></b>
                <br>
                <br>
                <br>
                <br>
                <div id="logName">
                    <label for="username">Username: </label>
                    <br>
                        <html:text property="username" styleClass="box"></html:text>
                    </div>
                    <br>
                    <div id="passw">
                    <label for="password">Password: </label>
                    <br>
                    <html:password property="passs" styleClass="box"></html:password>
                    </div>
                    <br>
                        <br>
                        <html:submit styleId="but">Sign In</html:submit>
            </html:form>
            <br>
            <p>Don't Have an Account Yet? <a href="registration.jsp">Click Here</a></p>
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
            font-size: 15px !important;
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
            border-bottom: 2px solid aquamarine !important;
        }
        
        a{
            text-decoration: none !important;
            color: aquamarine;
        }
        
        #but{
            padding: 11px 33px;
            border-radius: 20px;
            border: hidden !important;
            background: transparent;
        }
        
        #but:hover{
            transition: ease-in-out 0.5s;
            background: aquamarine;
        }
    </style>
</html>

