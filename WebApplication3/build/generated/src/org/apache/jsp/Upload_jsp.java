package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import org.apache.commons.net.ftp.FTPClient;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.net.URLConnection;
import java.net.URL;
import java.util.Map;
import Test.FTPUpload;
import Test.Categorieën;
import Test.Databaseconnecter;
import Test.Categorie;

public final class Upload_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>JSP Page</title>\r\n");
      out.write("        ");
 Test.FTPUpload ftpload = new Test.FTPUpload(); 
      out.write("\r\n");
      out.write("        ");
 Test.Categorie categorie = new Test.Categorie(); 
      out.write("\r\n");
      out.write("        ");
 Test.Categorieën categorieën = new Test.Categorieën(); 
      out.write("\r\n");
      out.write("        ");
 Test.Databaseconnecter dbconnect = new Test.Databaseconnecter(); 
      out.write("\r\n");
      out.write("        \r\n");
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
      out.write("       \r\n");
      out.write("    \t\t<script src=\"http://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js\"></script>\r\n");
      out.write("\t\t<style>\r\n");
      out.write("\t\t\t.frame {\r\n");
      out.write("\t\t\t\tposition: absolute;\r\n");
      out.write("\t\t\t\ttop: -9999px;\r\n");
      out.write("\t\t\t\tleft: -9999px;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t.progress-bar {\r\n");
      out.write("\t\t\t\theight: 20px;\r\n");
      out.write("\t\t\t\twidth: 100px;\r\n");
      out.write("\t\t\t\tdisplay: none;\r\n");
      out.write("\t\t\t\tborder: 2px solid green;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t.progress {\r\n");
      out.write("\t\t\t\tbackground-color: blue;\r\n");
      out.write("\t\t\t\theight: 100%;\r\n");
      out.write("\t\t\t\twidth: 0px;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t</style>\r\n");
      out.write("\r\n");
      out.write("                \r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"masthead\">\r\n");
      out.write("                <h3 class=\"text-muted\">Project name</h3>\r\n");
      out.write("                <nav>\r\n");
      out.write("                    <ul class=\"nav nav-justified\">\r\n");
      out.write("                        <li><a href=\"index.jsp\">Home</a></li>\r\n");
      out.write("                        <li><a href=\"Adminpage.jsp\">Accountinformatie</a></li>\r\n");
      out.write("                        <li><a href=\"fotograafProfiel.jsp\">Profiel</a></li>\r\n");
      out.write("                        <li><a href=\"Registreren.jsp\">Registreren</a></li>\r\n");
      out.write("                        <li><a href=\"Inlogscherm.jsp\">login</a></li>\r\n");
      out.write("                        <li><a href=\"logout.jsp\">Logout</a></li>\r\n");
      out.write("                        <li class=\"active\"><a href=\"Upload.jsp\">Upload</a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </nav>\r\n");
      out.write("            </div>\r\n");
      out.write("            \r\n");
      out.write("        \r\n");
      out.write("        <form name=\"form1\" id=\"form1\" action=\"test\" method=\"post\" enctype=\"multipart/form-data\">\r\n");
      out.write("        <input type=\"hidden\" name=\"hiddenfield1\" value=\"ok\">\r\n");
      out.write("\tFiles to upload:\r\n");
      out.write("\t<br/>\r\n");
      out.write("\t<input id=\"file\" type=\"file\" name=\"file1\" multiple accept=\"image/*\" >\r\n");
      out.write("\t<br/>\r\n");
      out.write("            <div id=\"formsubmitbutton\">\r\n");
      out.write("                <input type=\"submit\" name=\"btnUpload\" value=\"Upload\"  onclick=\"ButtonClicked()\">\r\n");
      out.write("            </div>\r\n");
      out.write("            <div id=\"buttonreplacement\" style=\"margin-left:30px; display:none;\">\r\n");
      out.write("                <p>\r\n");
      out.write("                <img src=\"ajax-loader.gif\" alt=\"\"/>\r\n");
      out.write("                Uploading....\r\n");
      out.write("                </p>\r\n");
      out.write("            </div>\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("\r\n");
      out.write("            <script type=\"text/javascript\">\r\n");
      out.write("            function ButtonClicked()\r\n");
      out.write("            {\r\n");
      out.write("               document.getElementById(\"formsubmitbutton\").style.display = \"none\"; // to undisplay\r\n");
      out.write("               document.getElementById(\"buttonreplacement\").style.display = \"\"; // to display\r\n");
      out.write("               return true;\r\n");
      out.write("            }\r\n");
      out.write("            var FirstLoading = true;\r\n");
      out.write("            function RestoreSubmitButton()\r\n");
      out.write("            {\r\n");
      out.write("               if( FirstLoading )\r\n");
      out.write("               {\r\n");
      out.write("                  FirstLoading = false;\r\n");
      out.write("                  return;\r\n");
      out.write("               }\r\n");
      out.write("               document.getElementById(\"formsubmitbutton\").style.display = \"\"; // to display\r\n");
      out.write("               document.getElementById(\"buttonreplacement\").style.display = \"none\"; // to undisplay\r\n");
      out.write("            }\r\n");
      out.write("            // To disable restoring submit button, disable or delete next line.\r\n");
      out.write("            document.onfocus = RestoreSubmitButton;\r\n");
      out.write("            </script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        \r\n");
      out.write("\r\n");
      out.write("                \r\n");
      out.write("        \r\n");
      out.write("        </form>\r\n");
      out.write("            \r\n");
      out.write("                ");

        String progress = "";
        if(request.getAttribute("bla") != null){            
        progress = (String) request.getAttribute("bla"); 
        }
        else{
                progress = "Please select a file" ;
                }
        
      out.write("\r\n");
      out.write("            <p>");
      out.print( progress );
      out.write("</p>\r\n");
      out.write("            <br/>\r\n");
      out.write("            <br/>\r\n");
      out.write("        \r\n");
      out.write("        ");
 String Category = ""; 
      out.write("\r\n");
      out.write("        ");

                String user = "";
        if (session.getAttribute("Name") != null) {
        user =  session.getAttribute("Name").toString();
        }
        
        List<Categorie> categories = categorieën.GetAllCategories(user); 
      out.write("\r\n");
      out.write("            <form method=\"get\" name=\"productForm\">\r\n");
      out.write("    <select name=\"category\"> \r\n");
      out.write("        ");
   for(Categorie es: categories) { 
      out.write("\r\n");
      out.write("        <option>");
      out.print( es.GetNaam() );
      out.write("</option>\r\n");
      out.write("        ");
 } 
      out.write("\r\n");
      out.write("    </select>\r\n");
      out.write("    <input type=\"submit\" value=\"Kies!\" name=\"dropdown\" id=\"dropdown\">\r\n");
      out.write("    ");

        Category = request.getParameter("category");
               if (session.getAttribute("Name") != null) {
        user =  session.getAttribute("Name").toString();
        }
        Test.StaticValues.setMyStaticMember(Category, user);
        out.println(Category);
    
      out.write("  \r\n");
      out.write("        </form>\r\n");
      out.write("\r\n");
      out.write("        <br/>\r\n");
      out.write(" \r\n");
      out.write("        <form>\r\n");
      out.write("        <input type=\"text\" name=\"FolderCategory\" value=\"\"/>    \r\n");
      out.write("        <input type=\"submit\" value=\"Category!\" name=\"btnCategory\" />\r\n");
      out.write("        ");

                if (request.getParameter("btnCategory") != null)
                {    
                      if (session.getAttribute("Name") != null) {
        user =  session.getAttribute("Name").toString();
        }
        Test.StaticValues.setMyStaticMember(Category, user);
                 ftpload.uploadDiretory(request.getParameter("FolderCategory").toString(), user);
                }
                
      out.write("\r\n");
      out.write("\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
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
