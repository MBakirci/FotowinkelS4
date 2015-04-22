package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.net.URL;
import java.util.ArrayList;
import Test.Photo;

public final class Photogallery_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <meta name=\"description\" content=\"\">\n");
      out.write("        <meta name=\"author\" content=\"\">\n");
      out.write("\n");
      out.write("        <!-- Bootstrap Core CSS -->\n");
      out.write("        <link href=\"CSS/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!-- Custom CSS -->\n");
      out.write("        <link href=\"CSS/thumbnail-gallery.css\" rel=\"stylesheet\">\n");
      out.write("        \n");
      out.write("        <link href=\"CSS/justified-nav.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->\n");
      out.write("        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\n");
      out.write("        <!--[if lt IE 9]>\n");
      out.write("            <script src=\"https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js\"></script>\n");
      out.write("            <script src=\"https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js\"></script>\n");
      out.write("        <![endif]-->\n");
      out.write("\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       <!-- <h1>Hello World!</h1>\n");
      out.write("        <img src=\"ftp://asror:asror@212.64.126.219:9942/Henk@yolo.nl/Portret/Exercise1.png\"/> -->\n");
      out.write("        \n");
      out.write("       <!--NAVIGATION-->\n");
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
      out.write("            \n");
      out.write("                <!-- Page Content -->\n");
      out.write("      <form action=\"loadPhotos\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("\n");
      out.write("            <div class=\"row\">\n");
      out.write("\n");
      out.write("                <div class=\"col-lg-12\">\n");
      out.write("                    <h1 class=\"page-header\">Thumbnail Gallery</h1>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                ");

                    
                    ArrayList<String> numbers = new ArrayList<String>();
                    Test.Photo tp = new Test.Photo();
                    numbers = tp.myNumbers();
                    
                   for(String es: numbers)
                    {
                       
                     
      out.write("\n");
      out.write("                <div class=\"col-lg-3 col-md-4 col-xs-6 thumb\" style=\"position: relative\">\n");
      out.write("                    <a class=\"thumbnail\" href=");
      out.print(es );
      out.write(">\n");
      out.write("                        <img class=\"img-responsive\" style=\"position: relative; top: 0; left: 0;\" alt=\"test\" width=\"100\" height=\"100\" style=\"z-index: -1\" src=");
      out.print(es );
      out.write(" > \n");
      out.write("                        \n");
      out.write("                    </a>\n");
      out.write("                        <button style=\"position: absolute;top:120px;left: 230px;\">\n");
      out.write("                            <b>+</b>\n");
      out.write("                        </button>\n");
      out.write("                        \n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                ");

                      
                    }
      out.write("\n");
      out.write("               <!-- <div class=\"col-lg-3 col-md-4 col-xs-6 thumb\">\n");
      out.write("                    <a class=\"thumbnail\" href=\"#\">\n");
      out.write("                        <img class=\"img-responsive\" src=\"ftp://asror:asror@212.64.126.219:9942/Henk@yolo.nl/Portret/Exercise2.png\" alt=\"\" height=\"300\" width=\"400\">\n");
      out.write("                    </a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-lg-3 col-md-4 col-xs-6 thumb\">\n");
      out.write("                    <a class=\"thumbnail\" href=\"#\">\n");
      out.write("                        <img class=\"img-responsive\" src=\"ftp://asror:asror@212.64.126.219:9942/Henk@yolo.nl/Portret/Exercise1.png\" alt=\"\">\n");
      out.write("                    </a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-lg-3 col-md-4 col-xs-6 thumb\">\n");
      out.write("                    <a class=\"thumbnail\" href=\"#\">\n");
      out.write("                        <img class=\"img-responsive\" src=\"ftp://asror:asror@212.64.126.219:9942/Henk@yolo.nl/Portret/Exercise2.png\" alt=\"\">\n");
      out.write("                    </a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-lg-3 col-md-4 col-xs-6 thumb\">\n");
      out.write("                    <a class=\"thumbnail\" href=\"#\">\n");
      out.write("                        <img class=\"img-responsive\" src=\"ftp://asror:asror@212.64.126.219:9942/Henk@yolo.nl/Portret/Exercise1.png\" alt=\"\">\n");
      out.write("                    </a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-lg-3 col-md-4 col-xs-6 thumb\">\n");
      out.write("                    <a class=\"thumbnail\" href=\"#\">\n");
      out.write("                        <img class=\"img-responsive\" src=\"ftp://asror:asror@212.64.126.219:9942/Henk@yolo.nl/Portret/Exercise2.png\" alt=\"\">\n");
      out.write("                    </a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-lg-3 col-md-4 col-xs-6 thumb\">\n");
      out.write("                    <a class=\"thumbnail\" href=\"#\">\n");
      out.write("                        <img class=\"img-responsive\" src=\"ftp://asror:asror@212.64.126.219:9942/Henk@yolo.nl/Portret/Exercise1.png\" alt=\"\">\n");
      out.write("                    </a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-lg-3 col-md-4 col-xs-6 thumb\">\n");
      out.write("                    <a class=\"thumbnail\" href=\"#\">\n");
      out.write("                        <img class=\"img-responsive\" src=\"ftp://asror:asror@212.64.126.219:9942/Henk@yolo.nl/Portret/Exercise2.png\" alt=\"\">\n");
      out.write("                    </a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-lg-3 col-md-4 col-xs-6 thumb\">\n");
      out.write("                    <a class=\"thumbnail\" href=\"#\">\n");
      out.write("                        <img class=\"img-responsive\" src=\"ftp://asror:asror@212.64.126.219:9942/Henk@yolo.nl/Portret/Exercise1.png\" alt=\"\">\n");
      out.write("                    </a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-lg-3 col-md-4 col-xs-6 thumb\">\n");
      out.write("                    <a class=\"thumbnail\" href=\"#\">\n");
      out.write("                        <img class=\"img-responsive\" src=\"ftp://asror:asror@212.64.126.219:9942/Henk@yolo.nl/Portret/Exercise2.png\" alt=\"\">\n");
      out.write("                    </a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-lg-3 col-md-4 col-xs-6 thumb\">\n");
      out.write("                    <a class=\"thumbnail\" href=\"#\">\n");
      out.write("                        <img class=\"img-responsive\" src=\"ftp://asror:asror@212.64.126.219:9942/Henk@yolo.nl/Portret/Exercise1.png\" alt=\"\">\n");
      out.write("                    </a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-lg-3 col-md-4 col-xs-6 thumb\">\n");
      out.write("                    <a class=\"thumbnail\" href=\"#\">\n");
      out.write("                        <img class=\"img-responsive\" src=\"ftp://asror:asror@212.64.126.219:9942/Henk@yolo.nl/Portret/Exercise2.png\" alt=\"\">\n");
      out.write("                    </a>\n");
      out.write("                </div> -->\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("      </form>\n");
      out.write("            <hr>\n");
      out.write("\n");
      out.write("            <!-- Footer -->\n");
      out.write("            <footer>\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-lg-12\">\n");
      out.write("                        <p>Copyright &copy; Your Website 2014</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </footer>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <!-- /.container -->\n");
      out.write("\n");
      out.write("        <!-- jQuery -->\n");
      out.write("        <script src=\"JS/jquery.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- Bootstrap Core JavaScript -->\n");
      out.write("        <script src=\"JS/bootstrap.min.js\"></script>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
