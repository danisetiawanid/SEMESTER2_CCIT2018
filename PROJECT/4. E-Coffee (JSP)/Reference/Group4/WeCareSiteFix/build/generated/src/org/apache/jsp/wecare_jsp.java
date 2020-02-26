package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class wecare_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Donate - We Care Site :)</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"normalize.css\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"skeleton.css\">\n");
      out.write("  <link rel=\"icon\" type=\"image/png\" href=\"images/care.png\">\n");
      out.write("   <style>\n");
      out.write(".container1{\n");
      out.write("  position: relative;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".logo1 {\n");
      out.write("  position: absolute;\n");
      out.write("  top: 8px;\n");
      out.write("  right: 100px;\n");
      out.write("  width: 3.6%;\n");
      out.write("  opacity: 0.8;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".linetop {\n");
      out.write("  position: absolute;\n");
      out.write("  top: 15px;\n");
      out.write("  right: 140px;\n");
      out.write("  width: 2.7%;\n");
      out.write("  opacity: 0.6;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".aboutus {\n");
      out.write("  position: absolute;\n");
      out.write("  top: 25px;\n");
      out.write("  right: 175px;\n");
      out.write("  font-size: 20px;\n");
      out.write("  color: white;\n");
      out.write("  line-height: 1.1;\n");
      out.write("}\n");
      out.write(".donasi{\n");
      out.write("  position: absolute;\n");
      out.write("top: 25px;\n");
      out.write("right: 270px;\n");
      out.write("font-size: 20px;\n");
      out.write("color: white;\n");
      out.write("line-height: 1.1;\n");
      out.write("}\n");
      out.write("\n");
      out.write("a {\n");
      out.write("  text-decoration: none;\n");
      out.write("  color: #FFFFFF;\n");
      out.write("}\n");
      out.write("a:hover{\n");
      out.write("  color: #a4b0be;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".facebook{\n");
      out.write("  position: absolute; \n");
      out.write("  width: 3%;\n");
      out.write("  margin-left: 590px;\n");
      out.write("}\n");
      out.write(".twitter{\n");
      out.write("  position: absolute;\n");
      out.write("  width: 3%;\n");
      out.write("  margin-left: 690px;\n");
      out.write("}\n");
      out.write(".instagram{\n");
      out.write("  position: absolute;\n");
      out.write("  width: 3%;\n");
      out.write("  margin-left: 790px;\n");
      out.write("}\n");
      out.write(".line{\n");
      out.write("  position: absolute;\n");
      out.write("  width: 3%;\n");
      out.write("  margin-left: 890px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("img { \n");
      out.write("  width: 100%;\n");
      out.write("  height: auto;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("     <div class=\"container1\">\n");
      out.write("\n");
      out.write("  <img src=\"images/people.jpg\" alt=\"people\"> <!-- Background -->\n");
      out.write("\n");
      out.write("  <div class=\"logo1\"> <a href=\"wecare.jsp\"> <b><img src=\"images/care-logo.png\" alt=\"logo\"></b> </a> </div>\n");
      out.write("    <div class=\"linetop\"> <img src=\"images/small-line.png\" alt=\"line\"> </div>\n");
      out.write("      <div class=\"aboutus\"> <a href=\"aboutus.jsp\">about us</a></div> <!-- GO TO ABOUT US PAGE -->\n");
      out.write("      <div class=\"donasi\"><a href=\"donate.jsp\">donation</b></a></div>\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write(" <div class=\"container\">\n");
      out.write("    <div class=\"row\">\n");
      out.write("      <div class=\"twelve column\" style=\"margin-top:-60%; color:white\">\n");
      out.write("        <div style=\"width:15%\"><img src=\"images/logo-white.png\"></div>\n");
      out.write("        <h4>\"we share what they need\"</h4>\n");
      out.write("        <p>We Care Site is a website of caring and social service for people in need with donation features which will then be channeled to people or communities who need the donation.</p>\n");
      out.write("      \n");
      out.write("        \t\n");
      out.write("            <form method=\"post\" action=\"donate.jsp\">\n");
      out.write("        \t\t<input type =  \"submit\" value = \"DONATE\" style=\"color:white\" > <!-- GO TO DONATE PAGE -->\n");
      out.write("        \t</form>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  \n");
      out.write("\n");
      out.write("  <div style=\"text-align: center; margin-top: 50px\"> <h3>Find us on :</h3></div>\n");
      out.write("  <br>\n");
      out.write("\n");
      out.write("  <div class=\"facebook\"><a href=\"https://www.facebook.com\" target=\"_blank\"> <img src=\"images/facebook.png\" alt=\"facebook\"> </a></div>\n");
      out.write("  <div class=\"twitter\"><a href=\"https://www.twitter.com\" target=\"_blank\"> <img src=\"images/twitter.png\" alt=\"twitter\"> </a></div>\n");
      out.write("  <div class=\"instagram\"><a href=\"https://www.instagram.com\" target=\"_blank\"> <img src=\"images/instagram.png\" alt=\"instagram\"> </a></div>\n");
      out.write("  <div class=\"line\"><a href=\"https://line.me/en\" target=\"_blank\"> <img src=\"images/line.png\" alt=\"line\"> </a></div>\n");
      out.write("  <br>\n");
      out.write("  <br>\n");
      out.write("  <br>\n");
      out.write("  <br><br><br><br><br>\n");
      out.write("\n");
      out.write("  <div style=\"background-color: #57606f; opacity:0.8; padding: 35px;\">\n");
      out.write("  <div style=\"text-align: center; color: white; margin-top: 30px\"> <h3>Contact us!</h3></div>\n");
      out.write("  <div style=\"text-align: center; color: white; margin-top: 50px;\"> <h6 style=\"font-size:18px\"/>+62 87885852822 (Haidar)</h6></div>\n");
      out.write("  <div style=\"text-align: center; color: white; margin-top: -20px\"> <h6 style=\"font-size:18px\">+62 87719021760 (Raka)</h6></div>\n");
      out.write("  <br><br><br>\n");
      out.write("   <p style=\"font-weight:normal; font-family: raleway; position:absolute; margin-top:2.6px; color:white; \">&copy <b>2019 We Care Site</b> |</p>\n");
      out.write("    <div><a href=\"wecare.jsp\"><p style=\"font-weight:normal; font-size:16px; margin-top:2px;margin-left:10.9%; font-family: raleway; position:absolute;\">Privacy & Terms</p></div>\n");
      out.write("\n");
      out.write("</body>\n");
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
