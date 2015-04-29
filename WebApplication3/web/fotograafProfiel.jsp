<%-- 
    Document   : fotograafProfiel
    Created on : 08-Apr-2015, 09:24:39
    Author     : Coen
--%>

<%@page import="Test.Categorie"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
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
        <nav>
          <ul class="nav nav-justified">
            <li><a href="index.jsp">Home</a></li>
            <li><a href="#">Projects</a></li>
            <li><a href="#">About</a></li>
            <li><a href="#">Contact</a></li>
            <li><a href="AccountDeactiveren.jsp">Accountinformatie</a></li>
            <li class="active"><a href="fotograafFotos.jsp">Profiel</a></li>
            <li><a href="logout.jsp">Logout</a></li>
          </ul>
        </nav>
      </div>
      <div class="masthead">
        <nav>
          <ul class="nav nav-justified">
            <li><a href="fotograafFotos.jsp">fotos</a></li>
            <li class="active"><a href="fotograafProfiel.jsp">gegevens</a></li>
            <li><a href="#">one more thing</a></li>
          </ul>
        </nav>
          
          <%Test.Categorieën cat = new Test.Categorieën();
                List<Test.Categorie> test = cat.GetAllCategories(); %>
      </div><select class="btn btn-default dropdown-toggle" name="Dropdown">
          <%for(Categorie c : test){%>
          <option><%=c.GetNaam()%></option>
          <%}%>
      </select>
             
    

            <%for(Categorie c : test){%>
            <div class="well"><%=c.GetNaam()%></div>
            <%}%>
     
    <!-- Single button -->
        
                

    </body>
</html>

