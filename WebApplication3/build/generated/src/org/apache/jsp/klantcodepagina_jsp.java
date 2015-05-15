package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

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
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>Klant Pagina</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        \r\n");
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
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        <h1>Vult hier uw persoonlijke code voor de foto's in die u wilt bekijken</h1>\r\n");
      out.write("        <form\r\n");
      out.write("         <label for=\"inputvoornaam\" class=\"sr-only\">Code</label>\r\n");
      out.write("        <input type=\"text\" id=\"inputCode\" name=\"Code\" class=\"form-control\" placeholder=\"Code\"required>\r\n");
      out.write("        \r\n");
      out.write("        <button class=\"btn btn-lg btn-primary btn-block\" type=\"submit\" name=\"btnCode\">Bekijk de foto's</button>\r\n");
      out.write("        </form>\r\n");
      out.write("        ");
 
            String code = request.getParameter("Code");
            String error = "";
            if(request.getParameter("btnCode") != null)
                     {
                        Test.Controleercode reg = new Test.Controleercode(code);
                     
                     if(!reg.Verbind()){
                         error = "De code bestaat niet controleer deze en probeer het opnieuw";
                        
                          
                         
                         //response.addHeader("labelmislukt", "inloggen is mislukt");
                     }
                         //response.sendRedirect("Inlogscherm.jsp");}
                         
                     
                         else {
                                
                                out.print("het is gelukt");
                                response.sendRedirect("index.jsp");                     }
                                
                     }
                 
            
       // if(request.getParameter("Code") != null)   
       // {
       //      response.sendRedirect("Inlogscherm.jsp");
       // }
        
      out.write("\r\n");
      out.write("        <font color=\"red\">");
      out.print(error);
      out.write("</font>\r\n");
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
