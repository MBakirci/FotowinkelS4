

<%-- 
    Document   : Inlogscherm
    Created on : 11-mrt-2015, 10:56:11
    Author     : hsm
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import= "java.util.*"%>
<%@page import= "Test.Databaseconnecter"%>
<%@page import= "Test.Inlog"%>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="description" content="">
        <meta name="author" content="">
        <link rel="icon" href="favicon.ico">

        <title>Justified Nav Template for Bootstrap</title>

        <!-- Bootstrap core CSS -->
        <link href="CSS/bootstrap.min.css" rel="stylesheet" type="text/css"/>

        <!-- Custom styles for this template -->
        <link href="CSS/justified-nav.css" rel="stylesheet">

        <!-- Just for debugging purposes. Don't actually copy these 2 lines! -->
        <!--[if lt IE 9]><script src="../../assets/js/ie8-responsive-file-warning.js"></script><![endif]-->
        <script src="js/ie-emulation-modes-warning.js"></script>

        <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
        <!--[if lt IE 9]>
          <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
          <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
        <![endif]-->
    </head>
    <body>


        <div class="container">

            <div class="masthead">
                <h3 class="text-muted">Inloggen</h3>
                <nav>
                    <ul class="nav nav-justified">
                        <li><a href="index.jsp">Home</a></li>
                        <li><a href="#">Projects</a></li>
                        <li><a href="#">Services</a></li>
                        <li><a href="#">Downloads</a></li>
                        <li><a href="#">About</a></li>
                        <li><a href="#">Contact</a></li>
                        <li class="active"><a href="Inlogscherm.jsp">login</a></li>
                    </ul>
                </nav>
            </div>
            <form>
            <div class="input-group">
                <span class="input-group-addon" id="username">username</span>
                <input type="text" class="form-control" name="usernameinlog" placeholder="Username" aria-describedby="basic-addon1">


            </div>    
            <div class="input-group">
                <span class="input-group-addon" id="basic-addon1">password</span>
                <input type="password" class="form-control" name="passwordinlog" placeholder="Wachtwoord" aria-describedby="basic-addon1">
            </div>   
                
            <button type="submit" name="btninlog" id="testen1" class="btn btn-default navbar-btn" >Sign in</button>

            <%
                
                String naam = request.getParameter("username");
                String pass = request.getParameter("password");
                 if(request.getParameter("btninlog")!= null){
                     Inlog login = new Inlog(naam, pass);                     
                     if(login.Verbind()){
                         out.print("Login Gelukt");
                         session.setAttribute("Name", naam);
                         response.sendRedirect("index.jsp");
                     }
                     else{
                         out.print("Login mislukt");
                     }
                 }
                 %>

            

            </form>



    </body>
</html>

