<%-- 
    Document   : Photogallery
    Created on : 8-apr-2015, 11:33:20
    Author     : Dennis
--%>

<%@page import="java.net.URL"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Test.Photo"%>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="description" content="">
        <meta name="author" content="">

        <!-- Bootstrap Core CSS -->
        <link href="CSS/bootstrap.min.css" rel="stylesheet">

        <!-- Custom CSS -->
        <link href="CSS/thumbnail-gallery.css" rel="stylesheet">

        <link href="CSS/justified-nav.css" rel="stylesheet">

        <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
        <!--[if lt IE 9]>
            <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
            <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
        <![endif]-->

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <!-- <h1>Hello World!</h1>
         <img src="ftp://asror:asror@212.64.126.219:9942/Henk@yolo.nl/Portret/Exercise1.png"/> -->

        <!--NAVIGATION-->
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
                        <li><a href="Upload.jsp">Upload</a></li>
                    </ul>
                </nav>
            </div>

            <!-- Page Content -->
            <form>
                <div class="container">

                    <div class="row">

                        <div class="col-lg-12">
                            <h1 class="page-header">Gallery</h1>
                        </div>

                        <%
                            session.setAttribute("Name", "Henk@yolo.nl");
                            ArrayList<String> photoList = new ArrayList<String>();
                            Test.Photo tp = new Test.Photo();
                            if (session.getAttribute("Name") != null) {
                                photoList = tp.getCategoriesPhotographer("Henk@yolo.nl"); //FOR DEBUG
                            }
        //photoList = tp.getPhotos(session.getAttribute("Name").toString());     // FINAL get session name

                            for (String es : photoList) {

                        %>
                        <div class="col-lg-3 col-md-4 col-xs-6 thumb" style="position: relative">
                            <a class="thumbnail" href="PhotogalleryCatPhotos.jsp?cat=<%=es%>">
                                <img class="img-responsive" style="position: relative; top: 0; left: 0;" alt="test" width="100" height="100" style="z-index: -1" src="http://png-3.findicons.com/files/icons/2770/ios_7_icons/100/folder.png" > 

                            </a>
                            <!--top:120px;left: 230px;-->
                            <a id="<%=es%>" type="submit" href="PhotogalleryCatPhotos.jsp?cat=<%=es%>" style="position: absolute; text-align:center; top:115px;">
                                <%
                                if (es.equals(session.getAttribute("Name").toString())) {%>
                                <b>All</b>
                                <% } %>
                                <% if(es.equals(session.getAttribute("Name").toString()) == false) {%>
                                <b><%=es%></b>
                                <% }%>
                            </a>

                        </div>

                        <%
                            }

                        %>
                        <!-- <div class="col-lg-3 col-md-4 col-xs-6 thumb">
                             <a class="thumbnail" href="#">
                                 <img class="img-responsive" src="ftp://asror:asror@212.64.126.219:9942/Henk@yolo.nl/Portret/Exercise2.png" alt="" height="300" width="400">
                             </a>
                         </div>
                         <div class="col-lg-3 col-md-4 col-xs-6 thumb">
                             <a class="thumbnail" href="#">
                                 <img class="img-responsive" src="ftp://asror:asror@212.64.126.219:9942/Henk@yolo.nl/Portret/Exercise1.png" alt="">
                             </a>
                         </div>
                         <div class="col-lg-3 col-md-4 col-xs-6 thumb">
                             <a class="thumbnail" href="#">
                                 <img class="img-responsive" src="ftp://asror:asror@212.64.126.219:9942/Henk@yolo.nl/Portret/Exercise2.png" alt="">
                             </a>
                         </div>
                         <div class="col-lg-3 col-md-4 col-xs-6 thumb">
                             <a class="thumbnail" href="#">
                                 <img class="img-responsive" src="ftp://asror:asror@212.64.126.219:9942/Henk@yolo.nl/Portret/Exercise1.png" alt="">
                             </a>
                         </div>
                         <div class="col-lg-3 col-md-4 col-xs-6 thumb">
                             <a class="thumbnail" href="#">
                                 <img class="img-responsive" src="ftp://asror:asror@212.64.126.219:9942/Henk@yolo.nl/Portret/Exercise2.png" alt="">
                             </a>
                         </div>
                         <div class="col-lg-3 col-md-4 col-xs-6 thumb">
                             <a class="thumbnail" href="#">
                                 <img class="img-responsive" src="ftp://asror:asror@212.64.126.219:9942/Henk@yolo.nl/Portret/Exercise1.png" alt="">
                             </a>
                         </div>
                         <div class="col-lg-3 col-md-4 col-xs-6 thumb">
                             <a class="thumbnail" href="#">
                                 <img class="img-responsive" src="ftp://asror:asror@212.64.126.219:9942/Henk@yolo.nl/Portret/Exercise2.png" alt="">
                             </a>
                         </div>
                         <div class="col-lg-3 col-md-4 col-xs-6 thumb">
                             <a class="thumbnail" href="#">
                                 <img class="img-responsive" src="ftp://asror:asror@212.64.126.219:9942/Henk@yolo.nl/Portret/Exercise1.png" alt="">
                             </a>
                         </div>
                         <div class="col-lg-3 col-md-4 col-xs-6 thumb">
                             <a class="thumbnail" href="#">
                                 <img class="img-responsive" src="ftp://asror:asror@212.64.126.219:9942/Henk@yolo.nl/Portret/Exercise2.png" alt="">
                             </a>
                         </div>
                         <div class="col-lg-3 col-md-4 col-xs-6 thumb">
                             <a class="thumbnail" href="#">
                                 <img class="img-responsive" src="ftp://asror:asror@212.64.126.219:9942/Henk@yolo.nl/Portret/Exercise1.png" alt="">
                             </a>
                         </div>
                         <div class="col-lg-3 col-md-4 col-xs-6 thumb">
                             <a class="thumbnail" href="#">
                                 <img class="img-responsive" src="ftp://asror:asror@212.64.126.219:9942/Henk@yolo.nl/Portret/Exercise2.png" alt="">
                             </a>
                         </div> -->
                    </div>
                </div>
            </form>
            <hr>

            <!-- Footer -->
            <footer>
                <div class="row">
                    <div class="col-lg-12">
                        <p>Copyright &copy; Your Website 2014</p>
                    </div>
                </div>
            </footer>

        </div>
        <!-- /.container -->

        <!-- jQuery -->
        <script src="JS/jquery.js"></script>

        <!-- Bootstrap Core JavaScript -->
        <script src="JS/bootstrap.min.js"></script>
    </div>
</body>
</html>

