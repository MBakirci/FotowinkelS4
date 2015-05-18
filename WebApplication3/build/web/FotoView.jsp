<%-- 
    Document   : FotoView
    Created on : 15-apr-2015, 11:48:08
    Author     : jeffrey
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import= "java.util.*"%>
<%@page import="java.io.OutputStream"%>
<%@page import="java.sql.*"%>
<%@page import= "Test.Databaseconnector"%>
<%@page import="Test.Foto_klant"%>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
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
        <div>
                        <%
            if (request.getParameter("btnGetfoto") != null)
    {
    Test.Foto_klant FotoCode = new Test.Foto_klant();
    
    String src = FotoCode.VraagFoto(request.getParameter("FotoCode").toString());
    request.setAttribute("image", src);
    //request.setAttribute("image", src);
    }
            %>
            <img src="<%=request.getAttribute("image") %>">

        <input type="FotoCode" id="FotoCode" name="FotoCode" class="form-control" placeholder="FotoCode">
         <button class="" type="submit" name="btnGetfoto">Get Image</button>
        </div>
            
         <input type="Email" id="Email" name="Email" class="form-control" placeholder="Email">
         <button class="" type="submit" name="btnGetCode">Get Codes</button>

         <%
               
if (request.getParameter("btnGetCode") != null)
{   ArrayList<String> Codelist = new ArrayList<String>();
    Test.Foto_klant FotoCode = new Test.Foto_klant();
    
    Codelist = FotoCode.Vraagcode(request.getParameter("Email").toString());
    out.print("<br>");
    for(String code: Codelist)
    {
        out.println(code + "<br>");
    } 
}
         %>
             
             </form>
    </body>
</html>
