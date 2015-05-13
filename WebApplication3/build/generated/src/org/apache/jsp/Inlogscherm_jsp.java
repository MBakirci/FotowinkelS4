package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import Test.Login;
import java.sql.*;
import Test.Databaseconnector;
import Test.registreer;

public final class Inlogscherm_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("     <head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("    <meta name=\"description\" content=\"\">\r\n");
      out.write("    <meta name=\"author\" content=\"\">\r\n");
      out.write("    <link rel=\"icon\" href=\"favicon.ico\">\r\n");
      out.write("\r\n");
      out.write("    <title>Inloggen</title>\r\n");
      out.write("\r\n");
      out.write("    <!-- Bootstrap core CSS -->\r\n");
      out.write("    <link href=\"CSS/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("\r\n");
      out.write("    <!-- Custom styles for this template -->\r\n");
      out.write("    <link href=\"CSS/justified-nav.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Just for debugging purposes. Don't actually copy these 2 lines! -->\r\n");
      out.write("    <!--[if lt IE 9]><script src=\"../../assets/js/ie8-responsive-file-warning.js\"></script><![endif]-->\r\n");
      out.write("    <script src=\"js/ie-emulation-modes-warning.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->\r\n");
      out.write("    <!--[if lt IE 9]>\r\n");
      out.write("      <script src=\"https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js\"></script>\r\n");
      out.write("      <script src=\"https://oss.maxcdn.com/respond/1.4.2/respond.min.js\"></script>\r\n");
      out.write("    <![endif]-->\r\n");
      out.write("  </head>\r\n");
      out.write("    <body>\r\n");
      out.write("     \r\n");
      out.write("        \r\n");
      out.write("         <div class=\"container\">\r\n");
      out.write("\r\n");
      out.write("            <div class=\"masthead\">\r\n");
      out.write("                <h3 class=\"text-muted\">Project name</h3>\r\n");
      out.write("                <nav>\r\n");
      out.write("                    <ul class=\"nav nav-justified\">\r\n");
      out.write("                        <li><a href=\"#\">Home</a></li>\r\n");
      out.write("                        <li><a href=\"Adminpage.jsp\">Accountinformatie</a></li>\r\n");
      out.write("                        <li><a href=\"fotograafProfiel.jsp\">Profiel</a></li>\r\n");
      out.write("                        <li><a href=\"Registreren.jsp\">Registreren</a></li>\r\n");
      out.write("                        <li class=\"active\"><a href=\"Inlogscherm.jsp\">login</a></li>\r\n");
      out.write("                        <li><a href=\"logout.jsp\">Logout</a></li>\r\n");
      out.write("                        <li><a href=\"Upload.jsp\">Upload</a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </nav>\r\n");
      out.write("            </div>\r\n");
      out.write("             \r\n");
      out.write("<!--             <form id=\"loginform\" autocomplete=\"on\" method=\"POST\">\r\n");
      out.write("         <div class=\"input-group\">\r\n");
      out.write("  <span class=\"input-group-addon\">username</span>\r\n");
      out.write("  <input type=\"text\" class=\"form-control\" id=\"username\" required=\"required\" name=\"username\" placeholder=\"Username\" aria-describedby=\"basic-addon1\">\r\n");
      out.write("</div>    \r\n");
      out.write("\r\n");
      out.write("                    <div class=\"input-group\">\r\n");
      out.write("  <span class=\"input-group-addon\" id=\"basic-addon1\">password</span>\r\n");
      out.write("  <input type=\"password\"  name=\"password\" class=\"form-control\" required=\"required\" placeholder=\"Wachtwoord\" aria-describedby=\"basic-addon1\">\r\n");
      out.write("</div>   \r\n");
      out.write("<<<<<<< HEAD\r\n");
      out.write("                 \r\n");
      out.write("                 <input  type=\"submit\" value=\"Sign in\" name=\"btnLogin\" id=\"testen1\" class=\"btn btn-default navbar-btn\" >                \r\n");
      out.write("             </form>  -->\r\n");
      out.write("\r\n");
      out.write("   <div class=\"container\">\r\n");
      out.write("\r\n");
      out.write("       <form class=\"form-signin\" method=\"post\">\r\n");
      out.write("        <h2 class=\"form-signin-heading\">Please sign in</h2>\r\n");
      out.write("      <label for=\"inputName\" class=\"sr-only\">Email address</label>\r\n");
      out.write("        <input type=\"text\" id=\"Name\" name=\"username\" class=\"form-control\" placeholder=\"Username\" required autofocus>\r\n");
      out.write("        <label for=\"inputPassword\" class=\"sr-only\">Password</label>\r\n");
      out.write("   <input type=\"password\" id=\"inputPassword\" name=\"password\" class=\"form-control\" placeholder=\"Password\" required>\r\n");
      out.write("          \r\n");
      out.write("        <div class=\"checkbox\">\r\n");
      out.write("          <label>\r\n");
      out.write("            <input type=\"checkbox\" value=\"remember-me\"> Remember me\r\n");
      out.write("          </label>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <button class=\"btn btn-lg btn-primary btn-block\" type=\"submit\" name=\"btnLogin\">Sign in</button>\r\n");
      out.write("      </form>\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("                     \r\n");
      out.write("             ");

                
               //  int id = 7;
                  String naam = request.getParameter("username");
                String pass = request.getParameter("password");
                //int id = request.getParameter("inputid".);
                
                if(request.getParameter("btnLogin")!= null){ 
                    Test.Login login = new Test.Login(naam, pass);                     
                     if(login.Verbind()){
                         out.print("Login Gelukt");
                         session.setAttribute("Name", naam);
                        response.sendRedirect("index.jsp");
                     }
                     else{
                         out.print("Login mislukt, controleer of u uw gegeven goed hebt ingevult");
                     }
                 }
               // if(request.getParameter("btnregistreer") != null)
               // {
                     
                //     Test.registreer reg = new Test.registreer(naam, pass, id);
                    
                //     if(reg.Verbind()){
                //         out.print("registreer gelukt");
                         
                //         response.sendRedirect("index.jsp");
                //     }
                //         else {
                //                 out.print("registeren mislukt");
                //                 }
                // }
                 
      out.write("\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
