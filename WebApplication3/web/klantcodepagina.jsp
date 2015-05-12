<%-- 
    Document   : klantcodepagina
    Created on : 8-apr-2015, 11:11:12
    Author     : hsm
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Klant Pagina</title>
    </head>
    <body>
        
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
        
        
        <h1>Vult hier uw persoonlijke code voor de foto's in die u wilt bekijken</h1>
        <form
         <label for="inputvoornaam" class="sr-only">Code</label>
        <input type="text" id="inputCode" name="Code" class="form-control" placeholder="Code"required>
        
        <button class="btn btn-lg btn-primary btn-block" type="submit" name="btnCode">Bekijk de foto's</button>
        </form>
        <% 
            String code = request.getParameter("Code");
            String error = "";
            if(request.getParameter("btnCode") != null)
                     {
                        Test.Controleercode reg = new Test.Controleercode(code);
                     
                     if(!reg.Verbind()){
                         error = "De code bestaat niet controleer deze en probeer het opnieuw";
                        
                          
                         
                         //response.addHeader("labelmislukt", "inloggen is mislukt");
                     }
                         //response.sendRedirect("Inlogscherm.jsp");}
                         
                     
                         else {
                                
                                out.print("het is gelukt");
                                response.sendRedirect("index.jsp");                     }
                                
                     }
                 
            
       // if(request.getParameter("Code") != null)   
       // {
       //      response.sendRedirect("Inlogscherm.jsp");
       // }
        %>
        <font color="red"><%=error%></font>
    </body>
</html>
