package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Test.Categorie;
import java.util.List;

public final class fotograafProfiel_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
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
      out.write("    <title>Justified Nav Template for Bootstrap</title>\r\n");
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
      out.write("\r\n");
      out.write("      <div class=\"masthead\">\r\n");
      out.write("        <nav>\r\n");
      out.write("          <ul class=\"nav nav-justified\">\r\n");
      out.write("            <li><a href=\"fotograafFotos.jsp\">fotos</a></li>\r\n");
      out.write("            <li class=\"active\"><a href=\"AccountInformation.jsp\">gegevens</a></li>\r\n");
      out.write("            <li><a href=\"index.jsp\">Back to Home</a></li>\r\n");
      out.write("          </ul>\r\n");
      out.write("        </nav>\r\n");
      out.write("      \r\n");
      out.write("                      <!-- Jumbotron -->\r\n");
      out.write("            <div class=\"jumbotron\">\r\n");
      out.write("                <h2>Change profile\r\n");
      out.write("                </h2>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
            
      out.write("\r\n");
      out.write("            <!--Inputform-->\r\n");
      out.write("            <form>\r\n");
      out.write("                <div class=\"col-lg-6 col-md-offset-3\">\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <label for=\"exampleInputEmail1\">Email address</label>\r\n");
      out.write("                        <input type=\"email\" name=\"email\" class=\"form-control\" id=\"exampleInputEmail1\" placeholder=\"");
      out.print(emailDB);
      out.write("\" required=\"\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <label for=\"exampleInputPassword1\">Telefoonnummer</label>\r\n");
      out.write("                        <input type=\"telnr\" name=\"telnr\" class=\"form-control bfh-phone\" id=\"exampleInputPassword1\" placeholder=\"");
//=telnrDB
      out.write("\" required=\"\" data-format=\"+31 (ddd) dddddd\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <label for=\"exampleInputPassword1\">Password</label>\r\n");
      out.write("                        <input type=\"password\" name=\"pass\" class=\"form-control\" id=\"exampleInputPassword1\" placeholder=\"password \" required=\"\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <label for=\"exampleInputPassword1\">Verify Password</label>\r\n");
      out.write("                        <input type=\"password\" name=\"passv\" class=\"form-control\" id=\"exampleInputPassword1\" placeholder=\"password \" required=\"\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <label for=\"exampleInputPassword1\">Firstname</label>\r\n");
      out.write("                        <input type=\"firstname\" name=\"fname\" class=\"form-control\" id=\"exampleInputPassword1\" placeholder=\"");
      out.print(fnameDB);
      out.write("\" required=\"\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <label for=\"exampleInputPassword1\">Lastname</label>\r\n");
      out.write("                        <input type=\"lastname\" name=\"lname\" class=\"form-control\" id=\"exampleInputPassword1\" placeholder=\"");
      out.print(lnameDB);
      out.write(" \" required=\"\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <label for=\"exampleInputPassword1\">Street</label>\r\n");
      out.write("                        <input type=\"address\" name=\"street\" class=\"form-control\" id=\"exampleInputPassword1\" placeholder=\"");
//=streetDB
      out.write(" \" required=\"\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <label for=\"exampleInputPassword1\">Housenumber</label>\r\n");
      out.write("                        <input type=\"housenumber\" name=\"housenumber\" class=\"form-control\" id=\"exampleInputPassword1\" placeholder=\"");
//=housenumDB
      out.write(" \" required=\"\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <label for=\"exampleInputPassword1\">Zipcode</label>\r\n");
      out.write("                        <input type=\"zipcode\" name=\"zipcode\" class=\"form-control\" id=\"exampleInputPassword1\" placeholder=\"");
//=zipcodeDB
      out.write(" \" required=\"\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <label for=\"exampleInputPassword1\">City</label>\r\n");
      out.write("                        <input type=\"city\" name=\"city\" class=\"form-control\" id=\"exampleInputPassword1\" placeholder=\"");
//=cityDB
      out.write(" \" required=\"\">\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <button type=\"submit\" name=\"btnSave\" class=\"btn btn-default\">Save changes</button>\r\n");
      out.write("                </div>\r\n");
      out.write("            </form>\r\n");
      out.write("\r\n");
      out.write("            <!-- Site footer -->\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("          <!-- Single button -->\r\n");
      out.write("         </div>\r\n");
      out.write("                  <footer class=\"footer\" align=\"center\">\r\n");
      out.write("            <p>&copy; Company 2015</p>\r\n");
      out.write("        </footer>      \r\n");
      out.write("\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
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
