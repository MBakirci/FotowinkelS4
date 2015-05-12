package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Test.NewClass;
import Test.AccountInfo;
import Test.KlantInfo;
import java.util.*;

public final class KlantInformation_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <meta name=\"description\" content=\"\">\n");
      out.write("        <meta name=\"author\" content=\"\">\n");
      out.write("        <link rel=\"icon\" href=\"favicon.ico\">\n");
      out.write("\n");
      out.write("        <title>Justified Nav Template for Bootstrap</title>\n");
      out.write("\n");
      out.write("        <!-- Bootstrap core CSS -->\n");
      out.write("        <link href=\"CSS/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("\n");
      out.write("        <!-- Custom styles for this template -->\n");
      out.write("        <link href=\"CSS/justified-nav.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!-- Just for debugging purposes. Don't actually copy these 2 lines! -->\n");
      out.write("        <!--[if lt IE 9]><script src=\"../../assets/js/ie8-responsive-file-warning.js\"></script><![endif]-->\n");
      out.write("        <script src=\"js/ie-emulation-modes-warning.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->\n");
      out.write("        <!--[if lt IE 9]>\n");
      out.write("          <script src=\"https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js\"></script>\n");
      out.write("          <script src=\"https://oss.maxcdn.com/respond/1.4.2/respond.min.js\"></script>\n");
      out.write("        <![endif]-->\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <!--NAVIGATION-->\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"masthead\">\n");
      out.write("                <h3 class=\"text-muted\">Fotowinkel</h3>\n");
      out.write("                <nav>\n");
      out.write("                    <ul class=\"nav nav-justified\">\n");
      out.write("                        <li><a href=\"index.jsp\">Home</a></li>\n");
      out.write("                        <li><a href=\"#\">Projects</a></li>\n");
      out.write("                        <li><a href=\"#\">About</a></li>\n");
      out.write("                        <li><a href=\"AccountInfotmation.jsp\">Verander</a></li>\n");
      out.write("                        <li><a href=\"AccountDeactiveren.jsp\">Accountinformatie</a></li>\n");
      out.write("                        <li><a href=\"Registreren.jsp\">Registreren</a></li>\n");
      out.write("                        <li class=\"active\"><a href=\"Inlogscherm.jsp\">Login</a></li>\n");
      out.write("                        <li><a href=\"logout.jsp\">Logout</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </nav>\n");
      out.write("            </div>\n");
      out.write("                  <div class=\"masthead\">\n");
      out.write("        <nav>\n");
      out.write("          <ul class=\"nav nav-justified\">\n");
      out.write("            <li><a href=\"KlantFotos.jsp\">fotos</a></li>\n");
      out.write("            <li class=\"active\"><a href=\"KlantInformation.jsp\">gegevens</a></li>\n");
      out.write("            <li><a href=\"#\">one more thing</a></li>\n");
      out.write("          </ul>\n");
      out.write("        </nav>\n");
      out.write("            <!-- Jumbotron -->\n");
      out.write("            <div class=\"jumbotron\">\n");
      out.write("                <h2>Change profile\n");
      out.write("                </h2>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("            ");

                //if no button was pressed, this is the first time loading this page
                Test.KlantInfo accountInfo = new Test.KlantInfo();
                String sessionName = (String) session.getAttribute("Name");
                sessionName = "p.de.beer@fontys.nlrejkw"; //For test purposes
                List userinfo1 = accountInfo.getDBInfo(sessionName);
                String emailDB = userinfo1.get(0).toString();
                //String telnrDB = userinfo1.get(1).toString();
                String fnameDB = userinfo1.get(1).toString();
                String lnameDB = userinfo1.get(3).toString();
                //String streetDB = userinfo1.get(4).toString();
                //String housenumDB = userinfo1.get(5).toString();
                //String zipcodeDB = userinfo1.get(6).toString();
                //String cityDB = userinfo1.get(7).toString();

                //if button was pressed, save changes
                if (request.getParameter("btnSave") != null) {
                    //Get Textbox values
                    String email = request.getParameter("email");
                    String telnr = request.getParameter("telnr");
                    String pass = request.getParameter("pass");
                    String passver = request.getParameter("passv");
                    String fname = request.getParameter("fname");
                    String lname = request.getParameter("lname");
                    String street = request.getParameter("street");
                    String housenumber = request.getParameter("housenumber");
                    String zipcode = request.getParameter("zipcode");
                    String city = request.getParameter("city");

                    ///todo
                    ///Change account info
                    accountInfo.changeAccountInfo(sessionName, email, telnr, pass, passver, fname, lname, street, housenumber, zipcode, city);

                    //debug
                    //response.sendRedirect("index.jsp");
                }
            
      out.write("\n");
      out.write("            <!--Inputform-->\n");
      out.write("            <form>\n");
      out.write("                <div class=\"col-lg-6 col-md-offset-3\">\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"exampleInputEmail1\">Email address</label>\n");
      out.write("                        <input type=\"email\" name=\"email\" class=\"form-control\" id=\"exampleInputEmail1\" placeholder=\"");
      out.print(emailDB);
      out.write("\" required=\"\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"exampleInputPassword1\">Telefoonnummer</label>\n");
      out.write("                        <input type=\"telnr\" name=\"telnr\" class=\"form-control bfh-phone\" id=\"exampleInputPassword1\" placeholder=\"");
//=telnrDB
      out.write("\" required=\"\" data-format=\"+31 (ddd) dddddd\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"exampleInputPassword1\">Password</label>\n");
      out.write("                        <input type=\"password\" name=\"pass\" class=\"form-control\" id=\"exampleInputPassword1\" placeholder=\"password \" required=\"\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"exampleInputPassword1\">Verify Password</label>\n");
      out.write("                        <input type=\"password\" name=\"passv\" class=\"form-control\" id=\"exampleInputPassword1\" placeholder=\"password \" required=\"\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"exampleInputPassword1\">Firstname</label>\n");
      out.write("                        <input type=\"firstname\" name=\"fname\" class=\"form-control\" id=\"exampleInputPassword1\" placeholder=\"");
      out.print(fnameDB);
      out.write("\" required=\"\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"exampleInputPassword1\">Lastname</label>\n");
      out.write("                        <input type=\"lastname\" name=\"lname\" class=\"form-control\" id=\"exampleInputPassword1\" placeholder=\"");
      out.print(lnameDB);
      out.write(" \" required=\"\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"exampleInputPassword1\">Street</label>\n");
      out.write("                        <input type=\"address\" name=\"street\" class=\"form-control\" id=\"exampleInputPassword1\" placeholder=\"");
//=streetDB
      out.write(" \" required=\"\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"exampleInputPassword1\">Housenumber</label>\n");
      out.write("                        <input type=\"housenumber\" name=\"housenumber\" class=\"form-control\" id=\"exampleInputPassword1\" placeholder=\"");
//=housenumDB
      out.write(" \" required=\"\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"exampleInputPassword1\">Zipcode</label>\n");
      out.write("                        <input type=\"zipcode\" name=\"zipcode\" class=\"form-control\" id=\"exampleInputPassword1\" placeholder=\"");
//=zipcodeDB
      out.write(" \" required=\"\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"exampleInputPassword1\">City</label>\n");
      out.write("                        <input type=\"city\" name=\"city\" class=\"form-control\" id=\"exampleInputPassword1\" placeholder=\"");
//=cityDB
      out.write(" \" required=\"\">\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <button type=\"submit\" name=\"btnSave\" class=\"btn btn-default\">Save changes</button>\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("\n");
      out.write("            <!-- Site footer -->\n");
      out.write("        </div>\n");
      out.write("        <footer class=\"footer\" align=\"center\">\n");
      out.write("            <p>&copy; Company 2015</p>\n");
      out.write("        </footer>\n");
      out.write("\n");
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
