package org.apache.jsp.html;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class donate1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Latihan Java Web | TutorialPedia.NET</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <center><h1>Input User | TutorialPedia.NET</h1></center>\n");
      out.write("        <form action=\"DonationController?data=donation&proses=input-donation\" method=\"post\">\n");
      out.write("            <table style=\"margin:20px auto;\">\n");
      out.write("\t\t<tr>\n");
      out.write("                    <td>Judul</td>\n");
      out.write("                    <td><input type=\"text\" name=\"judul\"></td>\n");
      out.write("\t\t</tr>\n");
      out.write("\t\t<tr>\n");
      out.write("                    <td>Nama</td>\n");
      out.write("                    <td><input type=\"text\" name=\"nama\"></td>\n");
      out.write("\t\t</tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Phone</td>\n");
      out.write("                    <td><input type=\"number\" name=\"phone\"></td>\n");
      out.write("\t\t</tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Amount</td>\n");
      out.write("                    <td><input type=\"tel\" name=\"jumlah\"></td>\n");
      out.write("\t\t</tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Metode</td>\n");
      out.write("                    <td><select type=\"text\" name=\"metode\"></td>\n");
      out.write("                    <option>Bank mega</option>  \n");
      out.write("                    <option>Bank Muamalat</option>\n");
      out.write("                    <option>Gopay</option>\n");
      out.write("\t\t</tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Pesan</td>\n");
      out.write("                    <td><selectarea type=\"text\" name=\"nama\"></selectarea</td>\n");
      out.write("\t\t</tr>\n");
      out.write("\t\t<tr>\n");
      out.write("                    <td></td>\n");
      out.write("                    <td><input type=\"submit\" value=\"Tambah\"></td>\n");
      out.write("\t\t</tr>\n");
      out.write("            </table>\n");
      out.write("\t</form>\t\n");
      out.write("    \n");
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
