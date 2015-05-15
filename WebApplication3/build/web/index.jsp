<%-- 
    Document   : index
    Created on : 9-mrt-2015, 11:03:40
    Author     : Gebruiker
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Test.NewClass" %>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="description" content="">
        <meta name="author" content="">
        <link rel="icon" href="favicon.ico">

        <title>Fotowinkel</title>

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
                <h3 class="text-muted">Project name</h3>
                <nav>
                    <ul class="nav nav-justified">
                        <li class="active"><a href="#">Home</a></li>
                        <li><a href="Adminpage.jsp">Accountinformatie</a></li>
                        <li><a href="fotograafProfiel.jsp">Profiel</a></li>
                        <li><a href="Registreren.jsp">Registreren</a></li>
                        <li><a href="Inlogscherm.jsp">login</a></li>
                        <li><a href="logout.jsp">Logout</a></li>
                        <% 
                            if (session.getAttribute( "Name" ) != null ) 
                            {
                                
                            Test.Photo Photo = new Test.Photo();
                            if(Photo.isPhotographer(session.getAttribute("Name").toString()))
                                    {
                                        request.setAttribute("Accountinfo","fotograafProfiel.jsp");
                        %>
                        <li><a href="Upload.jsp">Upload</a></li>
                        
                        <% 
                                    }
                            else
                            {
                                request.setAttribute("Accountinfo","KlantPagina.jsp");
                 
                                        %>
                        <li><a href=\"klantcodepagina.jsp\">Klantcode Invoeren</a></li>);
                        <% 
                            }}
                                %>
                    </ul>
                </nav>
            </div>

            <!-- Jumbotron -->
            <div class="jumbotron">
                <h1>Marketing stuff!</h1>
                <h2>

                    <%
                        
                        if (session.getAttribute("Name") != null) {
                            out.print(session.getAttribute("Name"));
                            
                            
                        }
                    %>
                </h2>
                <p class="lead">Cras justo odio, dapibus ac facilisis in, egestas eget quam. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet.</p>
                <p><a class="btn btn-lg btn-success" a href="Registreren.jsp" role="button">Get started today</a></p>
            </div>

            <!-- Example row of columns -->
            <div class="row">
                <div class="col-lg-4">
                    <p>
                        Today's date: <%=(new java.util.Date()).toLocaleString()%>
                    </p>          
                    <h2>Safari bug warning!</h2>
                    <p class="text-danger">As of v8.0, Safari exhibits a bug in which resizing your browser horizontally causes rendering errors in the justified nav that are cleared upon refreshing.</p>
                    <p>Donec id elit non mi porta gravida at eget metus. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus. Etiam porta sem malesuada magna mollis euismod. Donec sed odio dui. </p>
                    <p><a class="btn btn-primary" href="#" role="button">View details &raquo;</a></p>
                </div>
                <div class="col-lg-4">
                    <h2>Heading</h2>
                    <p>Donec id elit non mi porta gravida at eget metus. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus. Etiam porta sem malesuada magna mollis euismod. Donec sed odio dui. </p>
                    <p><a class="btn btn-primary" href="#" role="button">View details &raquo;</a></p>
                </div>
                <div class="col-lg-4">
                    <h2>Heading</h2>
                    <p>Donec sed odio dui. Cras justo odio, dapibus ac facilisis in, egestas eget quam. Vestibulum id ligula porta felis euismod semper. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa.</p>
                    <p><a class="btn btn-primary" href="#" role="button">View details &raquo;</a></p>
                </div>
            </div>

            <!-- Site footer -->
            <footer class="footer">
                <p>&copy; Company 2014</p>
            </footer>

        </div> <!-- /container -->


        <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
        <script src="js/ie10-viewport-bug-workaround.js"></script>
    </body>
</html>

