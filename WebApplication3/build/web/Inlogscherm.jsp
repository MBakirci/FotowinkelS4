

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
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
     <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="favicon.ico">

    <c:if test="${!empty language}">
    <fmt:setLocale value="${language}" scope="session" />
    </c:if>
    
    <title><fmt:message key='inloggen'/></title>
    
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
        <h3 class="text-muted"><fmt:message key='inloggen'/></h3>
        <nav>
          <ul class="nav nav-justified">
           <ul class="nav nav-justified">
               <li><a href="index.jsp"><fmt:message key='home'/></a></li>
            <li><a href="#"><fmt:message key='Projects'/></a></li>
            <li><a href="#"><fmt:message key='about'/></a></li>
            <li><a href="#"><fmt:message key='contact'/></a></li>
            <li><a href="AccountDeactiveren.jsp"><fmt:message key='accountInformatie'/></a></li>
            <li><a href="Registreren.jsp"><fmt:message key='registeren'/></a></li>
            <li class="active"><a href="Inlogscherm.jsp"><fmt:message key='login'/></a></li>
            <li><a href="logout.jsp"><fmt:message key='logout'/></a></li>
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
        <h2 class="form-signin-heading"><fmt:message key='login'/></h2>
      <label for="inputName" class="sr-only"><fmt:message key='email'/></label>
        <input type="text" id="Name" name="username" class="form-control" placeholder="Username" required autofocus>
        <label for="inputPassword" class="sr-only"><fmt:message key='password'/></label>
   <input type="password" id="inputPassword" name="password" class="form-control" placeholder="Password" required>
          
        <div class="checkbox">
          <label>
            <input type="checkbox" value="remember-me"> <fmt:message key='remberme'/>
          </label>
        </div>

        <button class="btn btn-lg btn-primary btn-block" type="submit" name="btnLogin"><fmt:message key='singIn'/></button>
      </form>

    </div>

                     
             <%
                
               //  int id = 7;
                  String naam = request.getParameter("username");
                String pass = request.getParameter("password");
                //int id = request.getParameter("inputid".);
                
                if(request.getParameter("btnLogin")!= null){ 
                    Test.Login login = new Test.Login(naam, pass);                     
                    if(login.Verbind()){
                    %><fmt:message key='loginSucces'/><%
                        //out.print("Login Gelukt);
                        session.setAttribute("Name", naam);
                        response.sendRedirect("index.jsp");
                    }
                    else{
                        %><fmt:message key='loginFail'/><%
                        //out.print("Login mislukt, controleer of u uw gegeven goed hebt ingevult");
                    }
                }
               // if(request.getParameter("btnregistreer") != null)
               // {
                     
                //     Test.registreer reg = new Test.registreer(naam, pass, id);
                    
                //     if(reg.Verbind()){
                //         out.print("registreer gelukt");
                         
                //         response.sendRedirect("index.jsp");
                //     }
                //         else {
                //                 out.print("registeren mislukt");
                //                 }
                // }
                 %>
    </body>
</html>

