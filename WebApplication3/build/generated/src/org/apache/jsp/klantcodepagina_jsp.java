package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import oracle.net.aso.a;
import Test.Foto_klant;
import Test.Photo;

public final class klantcodepagina_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!-- \r\n");
      out.write("    Document   : klantcodepagina\r\n");
      out.write("    Created on : 8-apr-2015, 11:11:12\r\n");
      out.write("    Author     : hsm\r\n");
      out.write("-->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>Klant Pagina</title>\r\n");
      out.write("                <!-- Bootstrap core CSS -->\r\n");
      out.write("        <link href=\"CSS/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("\r\n");
      out.write("        <!-- Custom styles for this template -->\r\n");
      out.write("        <link href=\"CSS/justified-nav.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("        <!-- Just for debugging purposes. Don't actually copy these 2 lines! -->\r\n");
      out.write("        <!--[if lt IE 9]><script src=\"../../assets/js/ie8-responsive-file-warning.js\"></script><![endif]-->\r\n");
      out.write("        <script src=\"js/ie-emulation-modes-warning.js\"></script>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <form>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"masthead\">\r\n");
      out.write("                <h3 class=\"text-muted\">Project name</h3>\r\n");
      out.write("                <nav>\r\n");
      out.write("                    <ul class=\"nav nav-justified\">\r\n");
      out.write("                        <li class=\"active\"><a href=\"#\">Home</a></li>\r\n");
      out.write("                        <li><a href=\"Adminpage.jsp\">Accountinformatie</a></li>\r\n");
      out.write("                        <li><a href=\"fotograafProfiel.jsp\">Profiel</a></li>\r\n");
      out.write("                        <li><a href=\"Registreren.jsp\">Registreren</a></li>\r\n");
      out.write("                        <li><a href=\"Inlogscherm.jsp\">login</a></li>\r\n");
      out.write("                        <!--<li><a href=\"logout.jsp\">Logout</a></li>-->\r\n");
      out.write("                        <!--<li><a href=\"Upload.jsp\">Upload</a></li>-->\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </nav>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <h1>Vult hier uw persoonlijke code voor de foto's in die u wilt bekijken</h1>\r\n");
      out.write("\r\n");
      out.write("            <label for=\"inputvoornaam\" class=\"sr-only\">Code</label>\r\n");
      out.write("            ");
 if(session.getAttribute("Name")!=null)
            {
               out.print("U bent niet ingelogd!");
            
      out.write("\r\n");
      out.write("           \r\n");
      out.write("            <input type=\"text\" id=\"inputCode\" name=\"Code\" placeholder=\"Code\" required>\r\n");
      out.write("\r\n");
      out.write("            <button type=\"submit\" name=\"btnCode\">Bekijk de foto's</button>\r\n");
      out.write("            ");

 
            }
                
      out.write("\r\n");
      out.write("\r\n");
      out.write("                ");

                    String error = "";
                    if (request.getParameter("btnCode") != null) {
                    String code = request.getParameter("Code");
  
                    Test.Foto_klant FotoCode = new Test.Foto_klant();
                    String src = FotoCode.VraagFoto(code);
                    request.setAttribute("image", src);
                               // Test.Controleercode reg = new Test.Controleercode(code);
                        if (src == null) {
                            error = "De code bestaat niet controleer deze en probeer het opnieuw";

                            //response.addHeader("labelmislukt", "inloggen is mislukt");
                        } //response.sendRedirect("Inlogscherm.jsp");}
                        else {

                            request.setAttribute("image", src);
                            out.print("het is gelukt");
                            Test.Photo idcode =  new Test.Photo();
                            String a = idcode.getID(session.getAttribute("Name").toString());
                            int b = Integer.parseInt(a);
                            Test.SQL sql = new Test.SQL();
                            sql.koppeling(b, code);
                            
                             
                            
                            
                            //   response.sendRedirect("index.jsp");                     }

                        }
                    }
               // if(request.getParameter("Code") != null)   
                        // {
                        //      response.sendRedirect("Inlogscherm.jsp");
                // }

      out.write("\r\n");
      out.write("                <img src=\"");
      out.print(request.getAttribute("image"));
      out.write("\">\r\n");
      out.write("                </form>\r\n");
      out.write("\r\n");
      out.write("                <font color=\"red\">");
      out.print(error);
      out.write("</font>\r\n");
      out.write("\r\n");
      out.write("                </body>\r\n");
      out.write("                </html>\r\n");
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
