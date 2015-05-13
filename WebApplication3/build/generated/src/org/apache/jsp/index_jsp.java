package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import jdk.nashorn.internal.ir.RuntimeNode.Request;
import Test.NewClass;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"utf-8\">\r\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("        <meta name=\"description\" content=\"\">\r\n");
      out.write("        <meta name=\"author\" content=\"\">\r\n");
      out.write("        <link rel=\"icon\" href=\"favicon.ico\">\r\n");
      out.write("\r\n");
      out.write("        <title>Fotowinkel</title>\r\n");
      out.write("\r\n");
      out.write("        <!-- Bootstrap core CSS -->\r\n");
      out.write("        <link href=\"CSS/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("\r\n");
      out.write("        <!-- Custom styles for this template -->\r\n");
      out.write("        <link href=\"CSS/justified-nav.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("        <!-- Just for debugging purposes. Don't actually copy these 2 lines! -->\r\n");
      out.write("        <!--[if lt IE 9]><script src=\"../../assets/js/ie8-responsive-file-warning.js\"></script><![endif]-->\r\n");
      out.write("        <script src=\"js/ie-emulation-modes-warning.js\"></script>\r\n");
      out.write("\r\n");
      out.write("        <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->\r\n");
      out.write("        <!--[if lt IE 9]>\r\n");
      out.write("          <script src=\"https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js\"></script>\r\n");
      out.write("          <script src=\"https://oss.maxcdn.com/respond/1.4.2/respond.min.js\"></script>\r\n");
      out.write("        <![endif]-->\r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("    <body>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("             \r\n");
      out.write("            <div class=\"masthead\">\r\n");
      out.write("                <h3 class=\"text-muted\">Project name</h3>\r\n");
      out.write("                <nav>\r\n");
      out.write("                    <ul class=\"nav nav-justified\">\r\n");
      out.write("                        <li class=\"active\"><a href=\"#\">Home</a></li>\r\n");
      out.write("                        <li><a href=\"fotograafProfiel.jsp\">Profiel</a></li>\r\n");
      out.write("                        <li><a href=\"Registreren.jsp\">Registreren</a></li>\r\n");
      out.write("                        <li><a href=\"Inlogscherm.jsp\">login</a></li>\r\n");
      out.write("                        <li><a href=\"logout.jsp\">Logout</a></li>\r\n");
      out.write("                                                ");
 
                            if (session.getAttribute( "Name" ) != null ) 
                            {
                                
                            Test.Photo Photo = new Test.Photo();
                            if(Photo.isPhotographer(session.getAttribute("Name").toString()))
                                    {
                                        request.setAttribute("Accountinfo","fotograafProfiel.jsp");
                            
      out.write("\r\n");
      out.write("                        <li><a href=\"Upload.jsp\">Upload</a></li>\r\n");
      out.write("                        ");

                                    }
                            else
                            {
                                request.setAttribute("Accountinfo","KlantPagina.jsp");
                                        
      out.write("\r\n");
      out.write("                        <li><a href=\"klantcodepagina.jsp\">Klantcode Invoeren</a></li>\r\n");
      out.write("                        \r\n");
      out.write("                        ");
 
                            }}
                                
      out.write("\r\n");
      out.write("                  <li><a href=\"");
      out.print(request.getAttribute("Accountinfo"));
      out.write("\">Accountinformatie</a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </nav>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <!-- Jumbotron -->\r\n");
      out.write("            <div class=\"jumbotron\">\r\n");
      out.write("                <h1>Marketing stuff!</h1>\r\n");
      out.write("                <h2>\r\n");
      out.write("\r\n");
      out.write("                    ");

                        
                        if (session.getAttribute("Name") != null) {
                            out.print(session.getAttribute("Name"));
                            
                            
                        }
                    
      out.write("\r\n");
      out.write("                </h2>\r\n");
      out.write("                <p class=\"lead\">Cras justo odio, dapibus ac facilisis in, egestas eget quam. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet.</p>\r\n");
      out.write("                <p><a class=\"btn btn-lg btn-success\" a href=\"Registreren.jsp\" role=\"button\">Get started today</a></p>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <!-- Example row of columns -->\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-lg-4\">\r\n");
      out.write("                    <p>\r\n");
      out.write("                        Today's date: ");
      out.print((new java.util.Date()).toLocaleString());
      out.write("\r\n");
      out.write("                    </p>          \r\n");
      out.write("                    <h2>Safari bug warning!</h2>\r\n");
      out.write("                    <p class=\"text-danger\">As of v8.0, Safari exhibits a bug in which resizing your browser horizontally causes rendering errors in the justified nav that are cleared upon refreshing.</p>\r\n");
      out.write("                    <p>Donec id elit non mi porta gravida at eget metus. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus. Etiam porta sem malesuada magna mollis euismod. Donec sed odio dui. </p>\r\n");
      out.write("                    <p><a class=\"btn btn-primary\" href=\"#\" role=\"button\">View details &raquo;</a></p>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-lg-4\">\r\n");
      out.write("                    <h2>Heading</h2>\r\n");
      out.write("                    <p>Donec id elit non mi porta gravida at eget metus. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus. Etiam porta sem malesuada magna mollis euismod. Donec sed odio dui. </p>\r\n");
      out.write("                    <p><a class=\"btn btn-primary\" href=\"#\" role=\"button\">View details &raquo;</a></p>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-lg-4\">\r\n");
      out.write("                    <h2>Heading</h2>\r\n");
      out.write("                    <p>Donec sed odio dui. Cras justo odio, dapibus ac facilisis in, egestas eget quam. Vestibulum id ligula porta felis euismod semper. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa.</p>\r\n");
      out.write("                    <p><a class=\"btn btn-primary\" href=\"#\" role=\"button\">View details &raquo;</a></p>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <!-- Site footer -->\r\n");
      out.write("            <footer class=\"footer\">\r\n");
      out.write("                <p>&copy; Company 2014</p>\r\n");
      out.write("            </footer>\r\n");
      out.write("\r\n");
      out.write("        </div> <!-- /container -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->\r\n");
      out.write("        <script src=\"js/ie10-viewport-bug-workaround.js\"></script>\r\n");
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
