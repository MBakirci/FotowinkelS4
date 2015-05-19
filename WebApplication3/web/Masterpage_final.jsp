<%-- 
    Document   : Masterpage
    Created on : 16-mei-2015, 10:56:24
    Author     : Dennis
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
        <div class="container">

            <div class="masthead">
                <h3 class="text-muted">Project name</h3>
                <%if (session.getAttribute("Name") != null && session.getAttribute("Role").equals("admin")) {%>
                <nav>
                    <ul class="nav nav-justified">
                        <li class="active"><a href="#">Home</a></li>
                        <li><a href="Adminpage.jsp">Admininstrator</a></li>
                        <li><a href="logout.jsp">Logout</a></li>
                    </ul>
                </nav>
                <%
                    }
                    if (session.getAttribute("Name") != null && session.getAttribute("Role").equals("fotograaf")) {%>
                <nav>
                    <ul class="nav nav-justified">
                        <li class="active"><a href="#">Home</a></li>
                        <li><a href="AccountInformation.jsp">Profiel</a></li>
                        <li><a href="PhotogalleryCategory">Foto's</a></li>
                        <li><a href="logout.jsp">Logout</a></li>
                        <li><a href="Upload.jsp">Upload</a></li>
                    </ul>
                </nav>
                <%
                    }
                    if (session.getAttribute("Name") != null && session.getAttribute("Role").equals("klant"))
                    {
                %>
                <nav>
                    <ul class="nav nav-justified">
                        <li class="active"><a href="#">Home</a></li>
                        <li><a href="AccountInformation.jsp">Accountinformatie</a></li>
                        <li><a href="klantcodepagina.jsp">Klantcode invoeren</a></li>
                        <li><a href="PhotogalleryCategoryCustomer.jsp">Foto's</a></li>
                        <li><a href="logout.jsp">Logout</a></li>
                    </ul>
                </nav>
                <%
                    }
                    if (session.getAttribute("Name") == null)
                    {
                %>
                 <nav>
                    <ul class="nav nav-justified">
                        <li class="active"><a href="#">Home</a></li>
                        <li><a href="Registreren.jsp">Registreren</a></li>
                        <li><a href="Inlogscherm.jsp">login</a></li>
                    </ul>
                </nav>
                 <%
                    }%>
            </div>
        </div>
    </body>
</html>
