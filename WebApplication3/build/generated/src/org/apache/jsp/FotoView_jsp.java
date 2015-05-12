package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import java.io.OutputStream;
import java.sql.*;
import Test.Databaseconnector;
import Test.Foto_klant;

public final class FotoView_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>JSP Page</title>\r\n");
      out.write("            <!-- Bootstrap core CSS -->\r\n");
      out.write("    <link href=\"CSS/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("\r\n");
      out.write("    <!-- Custom styles for this template -->\r\n");
      out.write("    <link href=\"CSS/justified-nav.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Just for debugging purposes. Don't actually copy these 2 lines! -->\r\n");
      out.write("    <!--[if lt IE 9]><script src=\"../../assets/js/ie8-responsive-file-warning.js\"></script><![endif]-->\r\n");
      out.write("    <script src=\"js/ie-emulation-modes-warning.js\"></script>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <h1>Hello World!</h1>\r\n");
      out.write("         <form>\r\n");
      out.write("        <div>\r\n");
      out.write("                        ");

            if (request.getParameter("btnGetfoto") != null)
    {
    Test.Foto_klant FotoCode = new Test.Foto_klant();
    
    String src = FotoCode.VraagFoto(request.getParameter("FotoCode").toString());
    request.setAttribute("image", src);
    //request.setAttribute("image", src);
    }
            
      out.write("\r\n");
      out.write("            <img src=\"");
      out.print(request.getAttribute("image") );
      out.write("\">\r\n");
      out.write("\r\n");
      out.write("        <input type=\"FotoCode\" id=\"FotoCode\" name=\"FotoCode\" class=\"form-control\" placeholder=\"FotoCode\">\r\n");
      out.write("         <button class=\"\" type=\"submit\" name=\"btnGetfoto\">Get Image</button>\r\n");
      out.write("        </div>\r\n");
      out.write("          <input type=\"Email\" id=\"Email\" name=\"Email\" class=\"form-control\" placeholder=\"Email\">\r\n");
      out.write("         <button class=\"\" type=\"submit\" name=\"btnGetCode\">Get Codes</button>\r\n");
      out.write("\r\n");
      out.write("         ");

               
if (request.getParameter("btnGetCode") != null)
{
    Test.Foto_klant FotoCode = new Test.Foto_klant();
    
    String Code = FotoCode.Vraagcode(request.getParameter("Email").toString());
    out.print(Code);
}
             
      out.write("\r\n");
      out.write("             </form>\r\n");
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
