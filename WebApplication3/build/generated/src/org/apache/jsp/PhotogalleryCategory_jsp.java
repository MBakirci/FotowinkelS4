package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.net.URL;
import java.util.ArrayList;
import Test.Photo;

public final class PhotogalleryCategory_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"utf-8\">\r\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("        <meta name=\"description\" content=\"\">\r\n");
      out.write("        <meta name=\"author\" content=\"\">\r\n");
      out.write("\r\n");
      out.write("        <!-- Bootstrap Core CSS -->\r\n");
      out.write("        <link href=\"CSS/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("        <!-- Custom CSS -->\r\n");
      out.write("        <link href=\"CSS/thumbnail-gallery.css\" rel=\"stylesheet\">\r\n");
      out.write("        \r\n");
      out.write("        <link href=\"CSS/justified-nav.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("        <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->\r\n");
      out.write("        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\r\n");
      out.write("        <!--[if lt IE 9]>\r\n");
      out.write("            <script src=\"https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js\"></script>\r\n");
      out.write("            <script src=\"https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js\"></script>\r\n");
      out.write("        <![endif]-->\r\n");
      out.write("\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>JSP Page</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("       <!-- <h1>Hello World!</h1>\r\n");
      out.write("        <img src=\"ftp://asror:asror@212.64.126.219:9942/Henk@yolo.nl/Portret/Exercise1.png\"/> -->\r\n");
      out.write("        \r\n");
      out.write("       <!--NAVIGATION-->\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"masthead\">\r\n");
      out.write("                <h3 class=\"text-muted\">Project name</h3>\r\n");
      out.write("                <nav>\r\n");
      out.write("                    <ul class=\"nav nav-justified\">\r\n");
      out.write("                        <li class=\"active\"><a href=\"#\">Home</a></li>\r\n");
      out.write("                        <li><a href=\"Adminpage.jsp\">Accountinformatie</a></li>\r\n");
      out.write("                        <li><a href=\"fotograafProfiel.jsp\">Profiel</a></li>\r\n");
      out.write("                        <li><a href=\"Registreren.jsp\">Registreren</a></li>\r\n");
      out.write("                        <li><a href=\"Inlogscherm.jsp\">login</a></li>\r\n");
      out.write("                        <li><a href=\"logout.jsp\">Logout</a></li>\r\n");
      out.write("                        <li><a href=\"Upload.jsp\">Upload</a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </nav>\r\n");
      out.write("            </div>\r\n");
      out.write("            \r\n");
      out.write("                <!-- Page Content -->\r\n");
      out.write("      <form>\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("\r\n");
      out.write("                <div class=\"col-lg-12\">\r\n");
      out.write("                    <h1 class=\"page-header\">Gallery</h1>\r\n");
      out.write("                </div>\r\n");
      out.write("                \r\n");
      out.write("                ");

                    session.setAttribute( "Name", "Henk@yolo.nl" );  
                    ArrayList<String> photoList = new ArrayList<String>();
                    Test.Photo tp = new Test.Photo();
                    if (session.getAttribute( "Name" ) != null ) 
                    {
                    photoList = tp.getCategoriesPhotographer("Henk@yolo.nl"); //FOR DEBUG
                    }
//photoList = tp.getPhotos(session.getAttribute("Name").toString());     // FINAL get session name
                    
                   for(String es: photoList)
                    {
                       
                     
      out.write("\r\n");
      out.write("                <div class=\"col-lg-3 col-md-4 col-xs-6 thumb\" style=\"position: relative\">\r\n");
      out.write("                    <a class=\"thumbnail\" href=\"Photogallery.jsp?cat=");
      out.print(es);
      out.write("\">\r\n");
      out.write("                        <img class=\"img-responsive\" style=\"position: relative; top: 0; left: 0;\" alt=\"test\" width=\"100\" height=\"100\" style=\"z-index: -1\" src=\"http://png-3.findicons.com/files/icons/2770/ios_7_icons/100/folder.png\" > \r\n");
      out.write("                        \r\n");
      out.write("                    </a>\r\n");
      out.write("                        <!--top:120px;left: 230px;-->\r\n");
      out.write("                        <a id=\"");
      out.print(es);
      out.write("\" type=\"submit\" href=\"Photogallery.jsp?cat=");
      out.print(es);
      out.write("\" style=\"position: absolute; text-align:center; top:115px;\">\r\n");
      out.write("                            <b>");
      out.print(es);
      out.write("</b>\r\n");
      out.write("                        </a>\r\n");
      out.write("                        \r\n");
      out.write("                </div>\r\n");
      out.write("                \r\n");
      out.write("                ");

                    }
                   
                
      out.write("\r\n");
      out.write("               <!-- <div class=\"col-lg-3 col-md-4 col-xs-6 thumb\">\r\n");
      out.write("                    <a class=\"thumbnail\" href=\"#\">\r\n");
      out.write("                        <img class=\"img-responsive\" src=\"ftp://asror:asror@212.64.126.219:9942/Henk@yolo.nl/Portret/Exercise2.png\" alt=\"\" height=\"300\" width=\"400\">\r\n");
      out.write("                    </a>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-lg-3 col-md-4 col-xs-6 thumb\">\r\n");
      out.write("                    <a class=\"thumbnail\" href=\"#\">\r\n");
      out.write("                        <img class=\"img-responsive\" src=\"ftp://asror:asror@212.64.126.219:9942/Henk@yolo.nl/Portret/Exercise1.png\" alt=\"\">\r\n");
      out.write("                    </a>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-lg-3 col-md-4 col-xs-6 thumb\">\r\n");
      out.write("                    <a class=\"thumbnail\" href=\"#\">\r\n");
      out.write("                        <img class=\"img-responsive\" src=\"ftp://asror:asror@212.64.126.219:9942/Henk@yolo.nl/Portret/Exercise2.png\" alt=\"\">\r\n");
      out.write("                    </a>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-lg-3 col-md-4 col-xs-6 thumb\">\r\n");
      out.write("                    <a class=\"thumbnail\" href=\"#\">\r\n");
      out.write("                        <img class=\"img-responsive\" src=\"ftp://asror:asror@212.64.126.219:9942/Henk@yolo.nl/Portret/Exercise1.png\" alt=\"\">\r\n");
      out.write("                    </a>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-lg-3 col-md-4 col-xs-6 thumb\">\r\n");
      out.write("                    <a class=\"thumbnail\" href=\"#\">\r\n");
      out.write("                        <img class=\"img-responsive\" src=\"ftp://asror:asror@212.64.126.219:9942/Henk@yolo.nl/Portret/Exercise2.png\" alt=\"\">\r\n");
      out.write("                    </a>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-lg-3 col-md-4 col-xs-6 thumb\">\r\n");
      out.write("                    <a class=\"thumbnail\" href=\"#\">\r\n");
      out.write("                        <img class=\"img-responsive\" src=\"ftp://asror:asror@212.64.126.219:9942/Henk@yolo.nl/Portret/Exercise1.png\" alt=\"\">\r\n");
      out.write("                    </a>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-lg-3 col-md-4 col-xs-6 thumb\">\r\n");
      out.write("                    <a class=\"thumbnail\" href=\"#\">\r\n");
      out.write("                        <img class=\"img-responsive\" src=\"ftp://asror:asror@212.64.126.219:9942/Henk@yolo.nl/Portret/Exercise2.png\" alt=\"\">\r\n");
      out.write("                    </a>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-lg-3 col-md-4 col-xs-6 thumb\">\r\n");
      out.write("                    <a class=\"thumbnail\" href=\"#\">\r\n");
      out.write("                        <img class=\"img-responsive\" src=\"ftp://asror:asror@212.64.126.219:9942/Henk@yolo.nl/Portret/Exercise1.png\" alt=\"\">\r\n");
      out.write("                    </a>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-lg-3 col-md-4 col-xs-6 thumb\">\r\n");
      out.write("                    <a class=\"thumbnail\" href=\"#\">\r\n");
      out.write("                        <img class=\"img-responsive\" src=\"ftp://asror:asror@212.64.126.219:9942/Henk@yolo.nl/Portret/Exercise2.png\" alt=\"\">\r\n");
      out.write("                    </a>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-lg-3 col-md-4 col-xs-6 thumb\">\r\n");
      out.write("                    <a class=\"thumbnail\" href=\"#\">\r\n");
      out.write("                        <img class=\"img-responsive\" src=\"ftp://asror:asror@212.64.126.219:9942/Henk@yolo.nl/Portret/Exercise1.png\" alt=\"\">\r\n");
      out.write("                    </a>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-lg-3 col-md-4 col-xs-6 thumb\">\r\n");
      out.write("                    <a class=\"thumbnail\" href=\"#\">\r\n");
      out.write("                        <img class=\"img-responsive\" src=\"ftp://asror:asror@212.64.126.219:9942/Henk@yolo.nl/Portret/Exercise2.png\" alt=\"\">\r\n");
      out.write("                    </a>\r\n");
      out.write("                </div> -->\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </form>\r\n");
      out.write("            <hr>\r\n");
      out.write("\r\n");
      out.write("            <!-- Footer -->\r\n");
      out.write("            <footer>\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-lg-12\">\r\n");
      out.write("                        <p>Copyright &copy; Your Website 2014</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </footer>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- /.container -->\r\n");
      out.write("\r\n");
      out.write("        <!-- jQuery -->\r\n");
      out.write("        <script src=\"JS/jquery.js\"></script>\r\n");
      out.write("\r\n");
      out.write("        <!-- Bootstrap Core JavaScript -->\r\n");
      out.write("        <script src=\"JS/bootstrap.min.js\"></script>\r\n");
      out.write("        </div>\r\n");
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
