

<%@page import="javax.persistence.Convert"%>
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
<%@page import = "Test.Verwijderaccount"%>
<jsp:include page="Masterpage_final.jsp"></jsp:include>
<%if (session.getAttribute("Role") == null || !session.getAttribute("Role").equals("admin")) {
        response.sendRedirect("index.jsp");
    }
%>

<!DOCTYPE html>
<html>
    <head>
        <title>Account gegevens verwerken</title>
    </head>
    <body>
        <div class="container">

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
                <h2 class="form-signin-heading">Account (de)Activeren</h2>
                <hr>

                <form class="col-md-6" method="post">

                    <div class="form-group col-md-12">
                        <label for="inputName" class="sr-only">Email address</label>
                        <%
                            Verwijderaccount vw = new Verwijderaccount();
                            ResultSet rs = vw.getallUsers();
                        %>
                        <select id="Email" name="Email" class="btn btn-default">
                            <%
                                while (rs.next()) {
                            %>
                            <option value="<%=rs.getString("EMAIL")%>">
                                <%=rs.getString("EMAIL")%> | <%=rs.getString("ENABLED")%>
                            </option>
                            <%
                                }
                            %>
                        </select>
                    </div>



                    <div class="form-group col-md-6">
                        <button class="btn btn-lg btn-primary btn-block" type="submit" name="btnNonactief">Account op non actief </button>
                    </div>
                    <div class="form-group col-md-6">
                        <button class="btn btn-lg btn-primary btn-block" type="submit" name="btnActief">Account naar actief </button>
                    </div>
                </form>

            </div>

            <%                 // de email
                String naam = request.getParameter("Email");

                //als iemand op de btn non actief drukt van roep je de methode
                //uit verwijder acccount aan die de status op non actief zet\
                //als het goed is dan ga je weer naar de start pagina
                //als het niet goed dan krijg en een waarschuwing
                if (request.getParameter("btnNonactief") != null) {
                    Test.Verwijderaccount nonactief = new Test.Verwijderaccount(naam);
                    if (nonactief.Zetstatusnonactief()) {
                        out.print("<div class=\"alert alert-success col-md-8 col-md-offset-2\">Account succesvol gedeactiveerd!</div>");
                        response.sendRedirect("Adminpage.jsp");
                    } else {
                        out.print("<div class=\"alert alert-danger col-md-8 col-md-offset-2\">Er is een fout opgetreden!</div>");
                    }

                }
                //als iemand op de btn actief drukt van roep je de methode
                //uit verwijderacccount aan die de status op actief zet\
                //als het goed is dan ga je weer naar de start pagina
                //als het niet goed dan krijg en een waarschuwing
                if (request.getParameter("btnActief") != null) {
                    Test.Verwijderaccount actief = new Test.Verwijderaccount(naam);
                    if (actief.Zetstatusactief()) {
                        out.print("<div class=\"alert alert-success col-md-8 col-md-offset-2\">Account succesvol geactiveerd!</div>");
                        response.sendRedirect("Adminpage.jsp");

                    } else {
                        out.print("<div class=\"alert alert-danger col-md-8 col-md-offset-2\">Er is een fout opgetreden!</div>");
                    }
                }


            %>
    </body>
</html>

