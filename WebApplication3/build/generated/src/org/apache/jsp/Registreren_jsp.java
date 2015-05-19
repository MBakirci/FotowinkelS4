package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import Test.Login;
import java.sql.*;
import Test.Databaseconnector;
import Test.registreer;
import Test.Verwijderaccount;

public final class Registreren_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Masterpage_final.jsp", out, false);
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
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("    <title>Registreren</title>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("        <h1>Registeer </h1>\r\n");
      out.write("        <hr>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("            <form class=\"form-signin\" method=\"post\">\r\n");
      out.write("\r\n");
      out.write("                <div class=\"col-md-6 col-md-offset-3 col-sm-6 col-xs-12\">\r\n");
      out.write("                    <div class=\"well well-sm\"><strong><span class=\"glyphicon glyphicon-asterisk\"></span>Required Field</strong>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"form-group col-md-12\">\r\n");
      out.write("                        <label for=\"username\">Email address</label>\r\n");
      out.write("                        <div class=\"input-group col-md-12\">\r\n");
      out.write("                            <input type=\"email\" id=\"Name\" name=\"username\" class=\"form-control\" placeholder=\"Email\" required autofocus>\r\n");
      out.write("                            <span class=\"input-group-addon\"><span class=\"glyphicon glyphicon-asterisk\"></span></span>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"form-group col-md-12\">\r\n");
      out.write("                        <label for=\"password\">Wachtwoord</label>\r\n");
      out.write("                        <div class=\"input-group col-md-12\">\r\n");
      out.write("                            <input type=\"password\" id=\"inputPassword\" name=\"password\" class=\"form-control\" placeholder=\"Password\" required>\r\n");
      out.write("                            <span class=\"input-group-addon\"><span class=\"glyphicon glyphicon-asterisk\"></span></span>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"form-group col-md-12\">\r\n");
      out.write("                        <label for=\"voornaam\">Voornaam</label>\r\n");
      out.write("                        <div class=\"input-group col-md-12\">\r\n");
      out.write("                            <input type=\"text\" id=\"inputVoornaam\" name=\"voornaam\" class=\"form-control\" placeholder=\"Voornaam\" required>\r\n");
      out.write("                            <span class=\"input-group-addon\"><span class=\"glyphicon glyphicon-asterisk\"></span></span>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"form-group col-md-4\">\r\n");
      out.write("                        <label for=\"tussenvoegsel\">Tussenvoegsel</label>\r\n");
      out.write("                        <div class=\"input-group col-md-12\">\r\n");
      out.write("                            <input type=\"text\" id=\"inputTussenvoegsel\" name=\"tussenvoegsel\" class=\"form-control\" placeholder=\"Tussenvoegsel\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"form-group col-md-8\">\r\n");
      out.write("                        <label for=\"achternaam\">Achternaam</label>\r\n");
      out.write("                        <div class=\"input-group col-md-12\">\r\n");
      out.write("                            <input type=\"text\" id=\"inputAchternaam\" name=\"achternaam\" class=\"form-control\" placeholder=\"Achternaam\" required>\r\n");
      out.write("                            <span class=\"input-group-addon\"><span class=\"glyphicon glyphicon-asterisk\"></span></span>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"col-md-12\">\r\n");
      out.write("                        <br/>\r\n");
      out.write("                        <button class=\"btn btn-lg btn-primary \" type=\"submit\" name=\"btnregistreer\">registreer</button>\r\n");
      out.write("                    </div>\r\n");
      out.write("            </form>\r\n");
      out.write("                        ");

                            //  int id = 1;
                            String naam = request.getParameter("username");
                            String pass = request.getParameter("password");
                            String voornaam = request.getParameter("voornaam");
                            String tussenvoegsel = request.getParameter("tussenvoegsel");
                            String achternaam = request.getParameter("achternaam");
                            int actief = 1;
                            String error = "";
                            if (request.getParameter("btnregistreer") != null) {
                                Test.registreer reg = new Test.registreer(naam, pass, voornaam, tussenvoegsel, achternaam, actief);

                                if (!reg.Verbind()) {
                                    error = "registeren is mislukt uw email adres is al bekend bij ons";
                                    //response.addHeader("labelmislukt", "inloggen is mislukt");
                                } //response.sendRedirect("Inlogscherm.jsp");}
                                else {
                                    Test.Login login = new Test.Login(naam, pass);
                                    if (login.Verbind()) {
                                     session.setAttribute("Name", naam);
                                     session.setAttribute("Role", login.getRole());
                                     response.sendRedirect("klantcodepagina_1.jsp");
                            }
                                }

                            }

                        
      out.write("\r\n");
      out.write("                        <font color=\"red\">");
      out.print(error);
      out.write("</font>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
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
