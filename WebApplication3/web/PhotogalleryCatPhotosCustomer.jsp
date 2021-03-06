<%-- 
    Document   : Photogallery
    Created on : 8-apr-2015, 11:33:20
    Author     : Dennis
--%>

<%@page import="java.net.URL"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Test.Photo"%>
<jsp:include page="Masterpage_final.jsp"></jsp:include>
<!DOCTYPE html>
<html>
    <head>
        <title>Foto's</title>
    </head>
    <body>
        <!-- <h1>Hello World!</h1>
         <img src="ftp://asror:asror@212.64.126.219:9942/Henk@yolo.nl/Portret/Exercise1.png"/> -->

        <!--NAVIGATION-->
        <div class="container">

            <!-- Page Content -->
            <form action="loadPhotos">
                <div class="container">

                    <div class="row">
                        <% String cat = request.getParameter("cat").toString();%>
                        <div class="col-lg-12">
                            <h1 class="page-header"><a href="PhotogalleryCategoryCustomer.jsp" style="color: #000">Gallery</a> / <%=cat%></h1>
                        </div>

                        <%
                            String category = request.getParameter("cat").toString();
                            String username = session.getAttribute("Name").toString();
                            
                            if (category.equals("All")) {
                                
                                ArrayList<String> photoList = new ArrayList<String>();
                                Test.Photo tp = new Test.Photo();
                                if (session.getAttribute("Name") != null) 
                                {
                                    photoList = tp.getPhotos(session.getAttribute("Name").toString()); //FOR DEBUG
                                    
                                }

                                for (String es : photoList) {

                        %>
                        <div class="col-lg-3 col-md-4 col-xs-6 thumb" style="position: relative">
                            <a class="thumbnail" href=<%=es%>>
                                <img class="img-responsive" style="position: relative; top: 0; left: 0;" alt="test" width="100" height="100" style="z-index: -1" src=<%=es%> > 

                            </a>
                        </div>

                        <%

                            }
                        } else if (category != null) {
                            
                            
                            
                            //Query for getting photos in a specific category
                            ArrayList<String> photoList = new ArrayList<String>();
                            Test.PhotoCustomer tp = new Test.PhotoCustomer();
                            photoList = tp.getCatPhotosCustomer(username, category);

                            for (String es : photoList) {%>
                        <div class="col-lg-3 col-md-4 col-xs-6 thumb" style="position: relative">
                            <a class="thumbnail" href=<%=es%>>
                                <img class="img-responsive" style="position: relative; top: 0; left: 0;" alt="test" width="100" height="100" style="z-index: -1" src=<%=es%> > 

                            </a>
                        </div>
                        <%
                                }
                            }
                        %>
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

