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
      out.write("      <div class=\"masthead\">\r\n");
      out.write("        <nav>\r\n");
      out.write("          <ul class=\"nav nav-justified\">\r\n");
      out.write("            <li><a href=\"index.jsp\">Home</a></li>\r\n");
      out.write("            <li><a href=\"#\">Projects</a></li>\r\n");
      out.write("            <li><a href=\"#\">About</a></li>\r\n");
      out.write("            <li><a href=\"#\">Contact</a></li>\r\n");
      out.write("            <li><a href=\"AccountDeactiveren.jsp\">Accountinformatie</a></li>\r\n");
      out.write("            <li class=\"active\"><a href=\"fotograafFotos.jsp\">Profiel</a></li>\r\n");
      out.write("            <li><a href=\"logout.jsp\">Logout</a></li>\r\n");
      out.write("          </ul>\r\n");
      out.write("        </nav>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"masthead\">\r\n");
      out.write("        <nav>\r\n");
      out.write("          <ul class=\"nav nav-justified\">\r\n");
      out.write("            <li><a href=\"fotograafFotos.jsp\">fotos</a></li>\r\n");
      out.write("            <li class=\"active\"><a href=\"fotograafProfiel.jsp\">gegevens</a></li>\r\n");
      out.write("            <li><a href=\"#\">one more thing</a></li>\r\n");
      out.write("          </ul>\r\n");
      out.write("        </nav>\r\n");
      out.write("          \r\n");
      out.write("          ");
Test.Categorieën cat = new Test.Categorieën();
                List<Test.Categorie> test = cat.GetAllCategories(); 
      out.write("\r\n");
      out.write("      </div><select class=\"btn btn-default dropdown-toggle\" name=\"Dropdown\">\r\n");
      out.write("          ");
for(Categorie c : test){
      out.write("\r\n");
      out.write("          <option>");
      out.print(c.GetNaam());
      out.write("</option>\r\n");
      out.write("          ");
}
      out.write("\r\n");
      out.write("      </select>\r\n");
      out.write("             \r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("            ");
for(Categorie c : test){
      out.write("\r\n");
      out.write("            <div class=\"well\">");
      out.print(c.GetNaam());
      out.write("</div>\r\n");
      out.write("            ");
}
      out.write("\r\n");
      out.write("     \r\n");
      out.write("    <!-- Single button -->\r\n");
      out.write("        \r\n");
      out.write("                \r\n");
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
