package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import Test.PriceSettings;

public final class Price_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Masterpage_final.jsp", out, false);
      out.write("\n");
      out.write("    <!DOCTYPE html>\n");
      out.write("    <html>\n");
      out.write("        <head>\n");
      out.write("            <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("            <title>Prijzen instellen</title>\n");
      out.write("        </head>\n");
      out.write("        <body>\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <div class=\"row-fluid\">\n");
      out.write("                    <div class=\"col-md-10 col-lg-offset-1\">\n");
      out.write("                        <fieldset>\n");
      out.write("                            <legend>Prijzen Instellen</legend>\n");
      out.write("                        ");

                            PriceSettings opp = new PriceSettings();
                            ResultSet rs = opp.getallProductTypes();
                        
      out.write("\n");
      out.write("                        <table class=\"table table-bordered\">\n");
      out.write("                            <tr>\n");
      out.write("                                <th></th>\n");
      out.write("                                <th>Product Naam</th>\n");
      out.write("                                <th>Details</th>\n");
      out.write("                                <th>Prijs €</th>\n");
      out.write("                                <th></th>\n");
      out.write("                                <th></th>\n");
      out.write("                            </tr>\n");
      out.write("                            ");

                                while (rs.next()) {

                            
      out.write("\n");
      out.write("                            <tr>\n");
      out.write("                                <td id=\"id\" style=\"color:grey;\">");
      out.print(rs.getString("ID"));
      out.write("</td>\n");
      out.write("                                <td id=\"naam\">");
      out.print(rs.getString("NAAM"));
      out.write("</td>\n");
      out.write("                                <td id=\"details\">");
      out.print(rs.getString("DETAILS"));
      out.write("</td>\n");
      out.write("                                <td id=\"prijs\">");
      out.print(rs.getString("PRIJS"));
      out.write("</td>\n");
      out.write("                                <td>\n");
      out.write("                                    <form action=\"PriceServlet\" method=\"post\">\n");
      out.write("                                        <!-- Verwijder button met request naar servlet -->\n");
      out.write("                                        <button type=\"submit\" class=\"btn btn-default btn-sm btn-danger\">\n");
      out.write("                                            <span class=\"glyphicon glyphicon-trash\"></span>\n");
      out.write("                                        </button>                                        \n");
      out.write("                                        <input type=\"hidden\" name=\"typeID\" value=\"");
      out.print(rs.getString("ID"));
      out.write("\" />\n");
      out.write("                                    </form>\n");
      out.write("                                </td>\n");
      out.write("                                <td>\n");
      out.write("\n");
      out.write("                                    <!--Dit is de edit button\n");
      out.write("                                    <button type=\"button\" class=\"btn btn-default btn-sm btn-primary\" name=\"btnEdit\" data-toggle=\"modal\" data-target=\"#myModal\">\n");
      out.write("                                        <span class=\"glyphicon glyphicon-edit\"></span>\n");
      out.write("                                    </button> \n");
      out.write("                                    <!--<input type=\"hidden\" name=\"type\" value=\"");
      out.print(rs.getString("ID"));
      out.write("\" />\n");
      out.write("                                    -->\n");
      out.write("                                    <a href=\"#\" class=\"btn btn-primary edit\"> <span class=\"glyphicon glyphicon-edit\"></span></a>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                </td>\n");
      out.write("                            </tr>    \t\n");
      out.write("                            ");

                                }
      out.write("\n");
      out.write("                        </table>\n");
      out.write("                    </fieldset>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-12\">\n");
      out.write("                    <a href=\"#\" class=\"btn btn-primary edit\"> Product Prijs Toevoegen <span class=\"glyphicon glyphicon-plus-sign\"></span></a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <script>\n");
      out.write("            $('a.edit').on('click', function () {\n");
      out.write("                var myModal = $('#myModal');\n");
      out.write("                // now get the values from the table\n");
      out.write("                var id = $(this).closest('tr').find('#id').html();\n");
      out.write("                var naam = $(this).closest('tr').find('#naam').html();\n");
      out.write("                var details = $(this).closest('tr').find('#details').html();\n");
      out.write("                var prijs = $(this).closest('tr').find('#prijs').html();\n");
      out.write("                // and set them in the modal:\n");
      out.write("                $(\".modal-body #id1\").val(id);\n");
      out.write("                $(\".modal-body #naam1\").val(naam);\n");
      out.write("                $(\".modal-body #details1\").val(details);\n");
      out.write("                $(\".modal-body #prijs1\").val(prijs);\n");
      out.write("\n");
      out.write("                // and finally show the modal\n");
      out.write("                myModal.modal({show: true});\n");
      out.write("                return false;\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("        <!-- Modal -->\n");
      out.write("        <div class=\"modal fade\" id=\"myModal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"myModalLabel\" aria-hidden=\"true\">\n");
      out.write("            <div class=\"modal-dialog\">\n");
      out.write("                <div class=\"modal-content\">\n");
      out.write("                    <div class=\"modal-header\">\n");
      out.write("                        <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\"><span aria-hidden=\"true\">&times;</span></button>\n");
      out.write("                        <h4 class=\"modal-title\" id=\"myModalLabel\">Product Aanpassen</h4>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"modal-body\">\n");
      out.write("                        <form class=\"form-horizontal\" id=\"editModal\">\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label class=\"control-label col-sm-2\" for=\"id1\">ID:</label>\n");
      out.write("                                <div class=\"col-sm-4\">\n");
      out.write("                                    <input type=\"number\" class=\"form-control\" name=\"id1\" id=\"id1\" readonly >\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label class=\"control-label col-sm-2\" for=\"naam1\">*Naam:</label>\n");
      out.write("                                <div class=\"col-sm-10\">\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" name=\"naam1\" id=\"naam1\" required>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label class=\"control-label col-sm-2\" for=\"details1\">Details:</label>\n");
      out.write("                                <div class=\"col-sm-10\">          \n");
      out.write("                                    <input type=\"text\" class=\"form-control\" name=\"details1\" id=\"details1\">\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label class=\"control-label col-sm-2\" for=\"prijs1\">*Prijs:</label>\n");
      out.write("                                <div class=\"col-sm-10\">          \n");
      out.write("                                    <input type=\"number\" step=\"0.01\" class=\"form-control\" name=\"prijs1\" id=\"prijs1\" required>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">        \n");
      out.write("                                <div class=\"col-sm-offset-2 col-sm-10\">\n");
      out.write("                                    <button type=\"submit\" name=\"btnBewerk\" class=\"btn btn-primary\">Bewerk</button>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        ");

            if (request.getParameter("btnBewerk") != null) {
                //Get Textbox values
                String sa = request.getParameter("id1");
                if(sa.equals("")){
                    sa = null;
                }

                if (sa != null ) {
                    opp.setTypeNaam(request.getParameter("naam1"));
                    opp.setTypeDetails(request.getParameter("details1"));
                    opp.setPrijs(Double.parseDouble(request.getParameter("prijs1")));
                    opp.setTypeID(Integer.parseInt(request.getParameter("id1")));
                    int a = Integer.parseInt(request.getParameter("id1"));
                    opp.EditProductType(a);
                    response.sendRedirect("Price.jsp");
                } else {
                    opp.setTypeNaam(request.getParameter("naam1"));
                    opp.setTypeDetails(request.getParameter("details1"));
                    opp.setPrijs(Double.parseDouble(request.getParameter("prijs1")));
                    opp.AddProductType();
                    response.sendRedirect("Price.jsp");
                }
            }
        
      out.write("\n");
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
