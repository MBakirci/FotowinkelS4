package org.apache.jsp.js;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Paypal_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("     \n");
      out.write("    <!--Paypal information-->\n");
      out.write("     <form name=\"_xclick\" target=\"paypal\" action=\"https://www.sandbox.paypal.com/us/cgi-bin/webscr\" method=\"post\">\n");
      out.write("    <input type=\"hidden\" name=\"cmd\" value=\"_cart\">\n");
      out.write("    <input type=\"hidden\" name=\"upload\" value=\"1\">\n");
      out.write("    <input type=\"hidden\" name=\"business\" value=\"Townofsalem@Sandbox.nl\">\n");
      out.write("    <input name=\"return\" type=\"hidden\" value=\"http://localhost:8080/PaypalTest/index.html\"> <!-- Return URL -->\n");
      out.write("    <input name=\"cancel_return\" type=\"hidden\" value=\"http://localhost:8080/PaypalTest/index.html\"> <!-- Return URL on cancelling payment --> \n");
      out.write("    <input type=\"hidden\" name=\"no_shipping\" value=\"0\">\n");
      out.write("    <input type=\"hidden\" name=\"no_note\" value=\"1\">\n");
      out.write("    <input type=\"hidden\" name=\"currency_code\" value=\"USD\">\n");
      out.write("    <input type=\"hidden\" name=\"lc\" value=\"AU\">\n");
      out.write("    <input type=\"hidden\" name=\"bn\" value=\"PP-BuyNowBF\">\n");
      out.write("    \n");
      out.write("    <!--Items will be shown in the shopping cart-->\n");
      out.write("    <!--TODO: Gather items from a list:-->\n");
      out.write("    <input type=\"hidden\" name=\"item_name_1\" value=\"HTML book\">  \n");
      out.write("    <input type=\"hidden\" name=\"amount_1\" value=\"24.99\">\n");
      out.write("    <input type=\"hidden\" name=\"quantity_1\" value=\"2\">\n");
      out.write("    \n");
      out.write("    <input type=\"hidden\" name=\"item_name_2\" value=\"Cat\">\n");
      out.write("    <input type=\"hidden\" name=\"amount_2\" value=\"19.99\">\n");
      out.write("    <input type=\"hidden\" name=\"quantity_2\" value=\"2\">\n");
      out.write("\n");
      out.write("    <input type=\"image\" src=\"https://www.paypalobjects.com/en_US/i/btn/x-click-but6.gif\" border=\"0\" name=\"submit\" alt=\"PayPal - The safer, easier way to pay online.\">\n");
      out.write("<!--    <img alt=\"\" border=\"0\" src=\"https://www.paypal.com/en_AU/i/scr/pixel.gif\" width=\"1\" height=\"1\">-->\n");
      out.write("    \n");
      out.write("    \n");
      out.write("</form>\n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
