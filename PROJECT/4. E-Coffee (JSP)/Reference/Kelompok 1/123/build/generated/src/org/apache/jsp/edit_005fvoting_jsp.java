package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import java.util.ArrayList;
import model.UserModel;

public final class edit_005fvoting_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("       \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"modal-header\">\n");
      out.write("            <button type=\"button\" class=\"close\" data-dismiss=\"modal\">x</button>\n");
      out.write("        </div>\n");
      out.write("         <div class=\"modal-body\">\n");
      out.write("              <div class=\"panel panel-default\">\n");
      out.write("        <div class=\"panel-body\">\n");
      out.write("        <form action=\"UserController?data=user&proses=update-user\" method=\"post\">\n");
      out.write("            <table style=\"margin:20px auto;\">\n");
      out.write("            ");

                String player_id = request.getParameter("player_id");
                UserModel am = new UserModel();
                am.setId(player_id);
                List<UserModel> datas = new ArrayList<UserModel>();
                datas = am.cariID(); 
                if (datas.size() > 0) {

            
      out.write("\n");
      out.write("               <h1>Vote!</h1>\n");
      out.write("\t\t<tr>\n");
      out.write("              \n");
      out.write("                    <td><input type=\"hidden\" name=\"nama\" value=\"");
      out.print(datas.get(0).getNama());
      out.write("\"></td>\n");
      out.write("\t\t</tr>\n");
      out.write("\t\t<tr>\n");
      out.write("               \n");
      out.write("          <td><input type=\"hidden\" name=\"divisi\" value=\"");
      out.print(datas.get(0).getDivisi());
      out.write("\"></td>\n");
      out.write("\t\t</tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td> <input type=\"number\" name=\"vote\" value=\"");
      out.print(datas.get(0).getVote());
      out.write("\"></td>\n");
      out.write("                     <td> <input type=\"hidden\" name=\"player_id\" value=\"");
      out.print(datas.get(0).getId());
      out.write("\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td> <input type=\"submit\" value=\"Update\"></td>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                  ");
}
      out.write("\n");
      out.write("            </table>\n");
      out.write("\t</form>\t\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("     <div class=\"modal-footer\">\n");
      out.write("        <div class=\"panel-footer\">\n");
      out.write("\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
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
