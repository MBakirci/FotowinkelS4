

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
<%if(session.getAttribute("Role") == null || !session.getAttribute("Role").equals("admin")){
             response.sendRedirect("index.jsp");}
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

       <form class="form-signin" method="post">
        <h2 class="form-signin-heading">Please sign in</h2>
        <label for="inputName" class="sr-only">Email address</label>
        <input type="email" id="Name" name="Email" class="form-control" placeholder="Email" autofocus>
        
       
        <button class="btn btn-lg btn-primary btn-block" type="submit" name="btnNonactief">Account op non actief </button>
         <button class="btn btn-lg btn-primary btn-block" type="submit" name="btnActief">Account naar actief </button>
                 <input type="number" id="Prijs" name="DDprijs" class="form-control" placeholder="Prijs" required autofocus>

                 <button class="btn btn-lg btn-primary btn-block" type="submit" name="btnPrijs">Stel de basis prijs in </button>
                 <select name="DDprijs">
                     <option></option>
                     <option>Foto</option>
                     <option>Muismat</option>
                 </select>
      </form>

    </div>
   <% 
       
        
       
        
        try{
            
         
            if(request.getParameter("btnPrijs") != null){
            String prijs = request.getParameter("DDprijs");
            Test.Adminbasisprijs prijsinstellen = new Test.Adminbasisprijs(Double.parseDouble(prijs));
            if(prijsinstellen.Checkprijs(session.getAttribute("Name").toString()))
            {
                out.print("Account op non-actief zetten gelukt");
                response.sendRedirect("index.jsp");
                
            }
            else{response.sendRedirect("Registreren.jsp");}
                    
                    
                    
             }
            
        }
        catch(NullPointerException ex){            
        out.print("iets mis gegaan probeer het opnieuw");
        }
       
    
   
       
   %>

                     
             <%
               // de email
                String naam = request.getParameter("Email");
                
              
                //als iemand op de btn non actief drukt van roep je de methode
                //uit verwijder acccount aan die de status op non actief zet\
                //als het goed is dan ga je weer naar de start pagina
                //als het niet goed dan krijg en een waarschuwing
                 if(request.getParameter("btnNonactief")!= null){
                     Test.Verwijderaccount nonactief = new Test.Verwijderaccount(naam);
                     if(nonactief.Zetstatusnonactief()){
                         out.print("Account op non-actief zetten gelukt");
                         
                         response.sendRedirect("index.jsp");
                     }
                     else{
                         out.print("niet op non-actief , controleer of u een goede email heeft ingevult");
                     }
                 
                 }
                //als iemand op de btn actief drukt van roep je de methode
                //uit verwijderacccount aan die de status op actief zet\
                //als het goed is dan ga je weer naar de start pagina
                //als het niet goed dan krijg en een waarschuwing
                     if(request.getParameter("btnActief")!= null){
                     Test.Verwijderaccount actief = new Test.Verwijderaccount(naam);
                     if(actief.Zetstatusactief()){
                         out.print("Account is nu weer actief");
                        
                         response.sendRedirect("index.jsp");
                     }
                     else{
                         out.print("account is niet actief, controleer of u het goede email adres heeft ingevult");
                     }
                 }
                     
           
                 %>
    </body>
</html>

