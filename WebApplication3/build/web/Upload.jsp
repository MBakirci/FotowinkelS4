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
<%@page import="Test.Categorieën" %>
<%@page import="Test.Databaseconnecter" %>
<%@page import="Test.Categorie" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <% Test.FTPUpload ftpload = new Test.FTPUpload(); %>
        <% Test.Categorie categorie = new Test.Categorie(); %>
        <% Test.Categorieën categorieën = new Test.Categorieën(); %>
        <% Test.Databaseconnecter dbconnect = new Test.Databaseconnecter(); %>
        
    <title>Justified Nav Template for Bootstrap</title>

    <!-- Bootstrap core CSS -->
    <link href="CSS/bootstrap.min.css" rel="stylesheet" type="text/css"/>

    <!-- Custom styles for this template -->
    <link href="CSS/justified-nav.css" rel="stylesheet">

    <!-- Just for debugging purposes. Don't actually copy these 2 lines! -->
    <!--[if lt IE 9]><script src="../../assets/js/ie8-responsive-file-warning.js"></script><![endif]-->
    <script src="js/ie-emulation-modes-warning.js"></script>
       
    		<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
		<style>
			.frame {
				position: absolute;
				top: -9999px;
				left: -9999px;
			}
			.progress-bar {
				height: 20px;
				width: 100px;
				display: none;
				border: 2px solid green;
			}
			.progress {
				background-color: blue;
				height: 100%;
				width: 0px;
			}
		</style>

                
    </head>
    <body onload="Checkfile()">

        <div class="container">
            <div class="masthead">
                <h3 class="text-muted">Project name</h3>
                <nav>
                    <ul class="nav nav-justified">
                        <li><a href="index.jsp">Home</a></li>
                        <li><a href="Adminpage.jsp">Accountinformatie</a></li>
                        <li><a href="fotograafProfiel.jsp">Profiel</a></li>
                        <li><a href="Registreren.jsp">Registreren</a></li>
                        <li><a href="Inlogscherm.jsp">login</a></li>
                        <li><a href="logout.jsp">Logout</a></li>
                        <li class="active"><a href="Upload.jsp">Upload</a></li>
                    </ul>
                </nav>
            </div>
            
            <div class= "row upload-block">
        <form name="form1" id="form1" action="test" method="post" enctype="multipart/form-data">
        <input type="hidden" name="hiddenfield1" value="ok">
	Files to upload:
	<br/>
	<input id="myFile" type="file" name="myFile" multiple accept="image/*" onchange="Checkfile()">
        <script type="text/javascript">
                 function Checkfile(){
                     var x = document.getElementById("myFile");
                        var txt = "";
                        if ('files' in x) {
                            if (x.files.length == 0) {
                                txt = "";
                            } else {
                                document.getElementById("btnUploads").removeAttribute("disabled"); 
                                for (var i = 0; i < x.files.length; i++) {
                                    txt += "<br><strong>" + (i+1) + ". file</strong><br>";
                                    var file = x.files[i];
                                    if ('name' in file) {
                                        txt += "name: " + file.name + "<br>";
                                    }
                                    if ('size' in file) {
                                        txt += "size: " + file.size + " bytes <br>";
                                    }
                                }
                            }
                        } 
                        else {
                            if (x.value == "") {
                                txt += "";
                            } else {
                                txt += "The files property is not supported by your browser!";
                                txt  += "<br>The path of the selected file: " + x.value; // If the browser does not support the files property, it will return the path of the selected file instead. 
                            }
                        }
                    document.getElementById("txtprogress").innerHTML = txt;
                }
        </script>
	<br/>
            <div id="formsubmitbutton">
                <input type="submit" id="btnUploads" name="btnUpload" value="Upload" disabled="" onclick="ButtonClicked()">
            </div>
            <div id="buttonreplacement" style="margin-left:30px; display:none;">
                <p>
                <img src="ajax-loader.gif" alt=""/>
                Uploading....
                </p>
            </div>
        
        

            <script type="text/javascript">
            function ButtonClicked()
            {
               document.getElementById("formsubmitbutton").style.display = "none"; // to undisplay
               document.getElementById("buttonreplacement").style.display = ""; // to display
               return true;
            }
            var FirstLoading = true;
            function RestoreSubmitButton()
            {
               if( FirstLoading )
               {
                  FirstLoading = false;
                  return;
               }
               document.getElementById("formsubmitbutton").style.display = ""; // to display
               document.getElementById("buttonreplacement").style.display = "none"; // to undisplay
            }
            // To disable restoring submit button, disable or delete next line.
            document.onfocus = RestoreSubmitButton;
            </script>


        

                
        
        </form>
            
                <%
        String progress = "";
        if(request.getAttribute("bla") != null){            
        progress = (String) request.getAttribute("bla"); 
        }
        %>
            <p><%= progress %></p>
            <p id="txtprogress"></p>
            <br/>
            <br/>
        
        <% String Category = ""; %>
        <%
                String user = "";
        if (session.getAttribute("Name") != null) {
        user =  session.getAttribute("Name").toString();
        }
        
        List<Categorie> categories = categorieën.GetAllCategories(user); %>
            <form method="get" name="productForm">
    <select name="category"> 
        <%   for(Categorie es: categories) { %>
        <option><%= es.GetNaam() %></option>
        <% } %>
    </select>
    <input type="submit" value="Kies!" name="dropdown" id="dropdown">
    <%
        Category = request.getParameter("category");
               if (session.getAttribute("Name") != null) {
        user =  session.getAttribute("Name").toString();
        }
        Test.StaticValues.setMyStaticMember(Category, user);
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
                      if (session.getAttribute("Name") != null) {
        user =  session.getAttribute("Name").toString();
        }
        Test.StaticValues.setMyStaticMember(Category, user);
                 ftpload.uploadDiretory(request.getParameter("FolderCategory").toString(), user);
                }
                %>
        </form>
            </div>

    </body>
</html>
