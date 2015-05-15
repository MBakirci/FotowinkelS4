
<%@page import="oracle.net.aso.a"%>
<!-- 
    Document   : klantcodepagina
    Created on : 8-apr-2015, 11:11:12
    Author     : hsm
-->

<%@page import = "Test.Foto_klant" %>
<%@page import = "Test.Photo" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Klant Pagina</title>
                <!-- Bootstrap core CSS -->
        <link href="CSS/bootstrap.min.css" rel="stylesheet" type="text/css"/>

        <!-- Custom styles for this template -->
        <link href="CSS/justified-nav.css" rel="stylesheet">

        <!-- Just for debugging purposes. Don't actually copy these 2 lines! -->
        <!--[if lt IE 9]><script src="../../assets/js/ie8-responsive-file-warning.js"></script><![endif]-->
        <script src="js/ie-emulation-modes-warning.js"></script>
    </head>
    <body>
        <form>

            <div class="masthead">
                <h3 class="text-muted">Project name</h3>
                <nav>
                    <ul class="nav nav-justified">
                        <li class="active"><a href="#">Home</a></li>
                        <li><a href="Adminpage.jsp">Accountinformatie</a></li>
                        <li><a href="fotograafProfiel.jsp">Profiel</a></li>
                        <li><a href="Registreren.jsp">Registreren</a></li>
                        <li><a href="Inlogscherm.jsp">login</a></li>
                        <!--<li><a href="logout.jsp">Logout</a></li>-->
                        <!--<li><a href="Upload.jsp">Upload</a></li>-->
                    </ul>
                </nav>
            </div>

            <h1>Vult hier uw persoonlijke code voor de foto's in die u wilt bekijken</h1>

            <label for="inputvoornaam" class="sr-only">Code</label>
            <% if(session.getAttribute("Name")!=null)
            {
            %>
           
            <input type="text" id="inputCode" name="Code" placeholder="Code" required>

            <button type="submit" name="btnCode">Bekijk de foto's</button>
           <%
            }
            %>
                <%
                    String error = "";
                    if (request.getParameter("btnCode") != null) {
                    String code = request.getParameter("Code");
  
                    Test.Foto_klant FotoCode = new Test.Foto_klant();
                    String src = FotoCode.VraagFoto(code);
                    request.setAttribute("image", src);
                               // Test.Controleercode reg = new Test.Controleercode(code);
                        if (src == null) {
                            error = "De code bestaat niet controleer deze en probeer het opnieuw";

                            //response.addHeader("labelmislukt", "inloggen is mislukt");
                        } //response.sendRedirect("Inlogscherm.jsp");}
                        else {

                            request.setAttribute("image", src);
                            out.print("het is gelukt");
                            Test.Photo idcode =  new Test.Photo();
                            String a = idcode.getID(session.getAttribute("Name").toString());
                            int b = Integer.parseInt(a);
                            Test.SQL sql = new Test.SQL();
                            sql.koppeling(b, code);
                            
                             
                            
                            
                            //   response.sendRedirect("index.jsp");                     }

                        }
                    }
               // if(request.getParameter("Code") != null)   
                        // {
                        //      response.sendRedirect("Inlogscherm.jsp");
                // }
%>
                <img src="<%=request.getAttribute("image")%>">
                
                </form>

                <font color="red"><%=error%></font>

                </body>
                </html>
