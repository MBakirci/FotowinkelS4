<%-- 
    Document   : Upload
    Created on : 18-mrt-2015, 14:15:34
    Author     : asror
--%>

<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="org.apache.commons.net.ftp.FTPClient"%>
<%@page import="java.io.IOException"%>
<%@page import="java.io.FileInputStream"%>
<%@page import="java.io.OutputStream"%>
<%@page import="java.net.URLConnection"%>
<%@page import="java.net.URL"%>
<%@page import ="java.util.Map"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Test.FTPUpload" %>
<%@page import="Test.Databaseconnecter" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <% Test.FTPUpload ftpload = new Test.FTPUpload(); %>
        <% Test.Databaseconnecter dbconnect = new Test.Databaseconnecter(); %>
        
    <title>Justified Nav Template for Bootstrap</title>

    <!-- Bootstrap core CSS -->
    <link href="CSS/bootstrap.min.css" rel="stylesheet" type="text/css"/>

    <!-- Custom styles for this template -->
    <link href="CSS/justified-nav.css" rel="stylesheet">

    <!-- Just for debugging purposes. Don't actually copy these 2 lines! -->
    <!--[if lt IE 9]><script src="../../assets/js/ie8-responsive-file-warning.js"></script><![endif]-->
    <script src="js/ie-emulation-modes-warning.js"></script>
       
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
                        <li><a href="logout.jsp">Logout</a></li>
          </ul>
        </nav>
      </div>
            
        
        <form name="form1" id="form1" action="test" method="post" enctype="multipart/form-data">
        <input type="hidden" name="hiddenfield1" value="ok">
	Files to upload:
	<br/>
	<input type="file" size="50" name="file1" multiple >
	<br/>
        <input type="submit" value="Upload" name="btnUpload">
        </form>
            <br/>
            <br/>
        
        <% String Category = ""; %>
            <form method="get" name="productForm">
    <select name="category">    
        <option>Portret</option>
        <option>Groep</option>
    </select>
    <input type="submit" value="Kies!" name="dropdown" id="dropdown">
    <%
         
        Category = request.getParameter("category");
        Test.StaticValues.setMyStaticMember(Category, "Henk@yolo.nl");
        out.println(Category);
    %>  
        </form>

        <br/>
 
        <form>
        <input type="text" name="FolderCategory" value=""/>    
        <input type="submit" value="Category!" name="btnCategory" />
        <%
                if (request.getParameter("btnCategory") != null)
                {    
                ftpload.uploadDiretory(request.getParameter("FolderCategory").toString(), "Henk@yolo.nl/");
                }     
                %>
        </form>
            
        
    </body>
</html>
