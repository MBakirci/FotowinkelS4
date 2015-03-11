<%-- 
    Document   : Database test
    Created on : 11-mrt-2015, 13:58:40
    Author     : hsm
--%>
<%@page import = "java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>DB test</title>
    </head>
    <body>
        <%
       Class.forName("com.mysql.jdbc.Driver");
       Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@fhictora01.fhict.local:1521/fhictora","dbi296880","U4XAsfWbUp");
       Statement stmt = conn.createStatement();
       String sql="select * from gebruiker";
       ResultSet rs = stmt.executeQuery(sql);
       try
       {
       
       if(rs!=null)
       {
        %>    
       <table border=1 cellpadding=5><tr><td>Username</td><td>wachtwoord</td></tr>
           <%
           while(!rs.next())
           {
           %>
           <tr>
               <td><%=rs.getString("user_name")%></td>    
               <td><%=rs.getString("pass_word")%></td>
           </tr>
           <%
           }
      }
}       
       catch(SQLException e)
       {
           e.printStackTrace();
       }
       stmt.close();
       rs.close();
       conn.close();
       stmt=null;
       rs=null;
       conn=null;
       
       %>
       </table>
    </body>
</html>
