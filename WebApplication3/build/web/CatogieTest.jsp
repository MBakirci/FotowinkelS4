<%-- 
    Document   : newjsp
    Created on : 25-Mar-2015, 13:58:47
    Author     : Coen
--%>

<%@page import="Test.Categorieën"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Test.Categorie"%>
<%@page import="Test.Databaseconnector"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <form>
        <%
            String s = "";
            Categorieën cats = new Categorieën();
            List<Categorie> rs = cats.GetAllCategories();
            for(Categorie c: rs){
                s = s + c.GetId() + c.GetNaam() + "\n";
            }
        int hhhhh = 9;
        
            if(request.getParameter("btnTest") != null)
            {
                cats.CreateCategory(request.getParameter("fname"));
            }
        %>
        <div><p><%=s%></p></div>
        <input type="firstname" name="fname" class="form-control" value="<%=hhhhh%>" rows="25" id="exampleInputPassword1" placeholder=" " required="">
        <button name='btnTest'>create</button>
        </form>
    </body>
</html>
