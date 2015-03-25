

<%-- 
    Document   : Inlogscherm
    Created on : 11-mrt-2015, 10:56:11
    Author     : hsm
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import= "java.util.*"%>

<%--<%@page import= "Test.Databaseconnector"%>--%>
<%@page import="Test.Login" %>
<%@page import="java.sql.*"%>
<%@page import= "Test.Databaseconnector"%>
<%@page import = "Test.registreer"%>
<%@page import = "Test.Verwijderaccount"%>

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
            <li><a href="logout.jsp">Logout</a></li>
            <li><a href="Registreren.jsp">Registreer</a></li>
            <li class="active"><a href="Registreren.jsp">Registreer</a></li>
          </ul>
        </nav>
      </div>
             
<!--             <form id="loginform" autocomplete="on" method="POST">
         <div class="input-group">
  <span class="input-group-addon">username</span>
  <input type="text" class="form-control" id="username" required="required" name="username" placeholder="Username" aria-describedby="basic-addon1">
</div>    

                    <div class="input-group">
  <span class="input-group-addon" id="basic-addon1">password</span>
  <input type="password"  name="password" class="form-control" required="required" placeholder="Wachtwoord" aria-describedby="basic-addon1">
</div>   
<<<<<<< HEAD
                 
                 <input  type="submit" value="Sign in" name="btnLogin" id="testen1" class="btn btn-default navbar-btn" >                
             </form>  -->

   <div class="container">

       <form class="form-signin" method="post">
        <h2 class="form-signin-heading">Registeren</h2>
        <label for="inputName" class="sr-only">Email address</label>
        <input type="text" id="Name" name="username" class="form-control" placeholder="Username" required autofocus>
        <label for="inputPassword" class="sr-only">Wachtwoord</label>
        <input type="password" id="inputPassword" name="password" class="form-control" placeholder="Password"required>
      <label for="inputvoornaam" class="sr-only">Voornaam</label>
        <input type="text" id="inputVoornaam" name="voornaam" class="form-control" placeholder="Voornaam"required>
        <label for="inputtussenvoegsel" class="sr-only">Tussenvoegsel</label>
        <input type="text" id="inputTussenvoegsel" name="tussenvoegsel" class="form-control" placeholder="Tussenvoegsel">
        <label for="inputachternaam" class="sr-only">Achternaam</label>
        <input type="text" id="inputAchternaam" name="achternaam" class="form-control" placeholder="Achternaam" required>
        <div class="checkbox">
         
        </div>
         <button class="btn btn-lg btn-primary btn-block" type="submit" name="btnregistreer">registreer</button>
    

    

                     
             <%
               //  int id = 1;
                  String naam = request.getParameter("username");
                String pass = request.getParameter("password");
                 String voornaam = request.getParameter("voornaam");
                  String tussenvoegsel = request.getParameter("tussenvoegsel");
                   String achternaam = request.getParameter("achternaam");
                   int actief = 1;
                //int id = request.getParameter("inputid".);
                
                 
                // if(request.getParameter("btnregistreer") != null)
                // {
                //    int actief;
                //    Test.Verwijderaccount verw = new Test.Verwijderaccount(naam);
                //    if(verw.Verbind()){
                //        out.print("shit werkt");
                //        response.sendRedirect("index.jsp");
                 //   }
                // }
                     
                    
                     if(request.getParameter("btnregistreer") != null)
                     {
                     Test.registreer reg = new Test.registreer(naam, pass, voornaam, tussenvoegsel, achternaam, actief);
                     
                     
                     if(reg.Verbind()){
                         out.print("registreer gelukt");
                         
                         response.sendRedirect("index.jsp");
                     }
                         else {
                                out.print("registeren mislukt");
                                 }
                     }
                     
                     
                 %>
                 </div>
        </form>
    </body>
</html>

