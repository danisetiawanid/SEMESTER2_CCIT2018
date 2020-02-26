package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import java.util.ArrayList;
import Model.CoffeeModel;

public final class coffeedetail_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Admin Dashboad | Field Table</title>\n");
      out.write("    <link href=\"assets/plugins/bootstrap/bootstrap.css\" rel=\"stylesheet\" />\n");
      out.write("    <link href=\"assets/font-awesome/css/font-awesome.css\" rel=\"stylesheet\" />\n");
      out.write("    <link href=\"assets/plugins/pace/pace-theme-big-counter.css\" rel=\"stylesheet\" />\n");
      out.write("  <link href=\"assets/css/style.css\" rel=\"stylesheet\" />\n");
      out.write("      <link href=\"assets/css/main-style.css\" rel=\"stylesheet\" />\n");
      out.write("\n");
      out.write("    <link href=\"assets/plugins/dataTables/dataTables.bootstrap.css\" rel=\"stylesheet\" />\n");
      out.write("    <style>\n");
      out.write("       button {\n");
      out.write("  background-color: black;\n");
      out.write("  color: white;\n");
      out.write("  padding: 14px 20px;\n");
      out.write("  margin: 8px 0;\n");
      out.write("  border: none;\n");
      out.write("  cursor: pointer;\n");
      out.write("  width: 100%;\n");
      out.write("}\n");
      out.write("\n");
      out.write("button:hover {\n");
      out.write("  opacity: 0.8;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Extra styles for the cancel button */\n");
      out.write(".cancelbtn {\n");
      out.write("  width: auto;\n");
      out.write("  padding: 10px 18px;\n");
      out.write("  background-color: #f44336;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Center the image and position the close button */\n");
      out.write(".imgcontainer {\n");
      out.write("  text-align: center;\n");
      out.write("  margin: 24px 0 12px 0;\n");
      out.write("  position: relative;\n");
      out.write("}\n");
      out.write("\n");
      out.write("img.avatar {\n");
      out.write("  width: 40%;\n");
      out.write("  border-radius: 50%;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".container {\n");
      out.write("  padding: 16px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("span.psw {\n");
      out.write("  float: right;\n");
      out.write("  padding-top: 16px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* The Modal (background) */\n");
      out.write(".modal {\n");
      out.write("  display: none; /* Hidden by default */\n");
      out.write("  position: fixed; /* Stay in place */\n");
      out.write("  z-index: 1; /* Sit on top */\n");
      out.write("  left: 0;\n");
      out.write("  top: 0;\n");
      out.write("  width: 100%; /* Full width */\n");
      out.write("  height: 100%; /* Full height */\n");
      out.write("  overflow: auto; /* Enable scroll if needed */\n");
      out.write("  background-color: rgb(0,0,0); /* Fallback color */\n");
      out.write("  background-color: rgba(0,0,0,0.4); /* Black w/ opacity */\n");
      out.write("  padding-top: 60px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Modal Content/Box */\n");
      out.write(".modal-content {\n");
      out.write("  background-color: #fefefe;\n");
      out.write("  margin: 5% auto 15% auto; /* 5% from the top, 15% from the bottom and centered */\n");
      out.write("  border: 1px solid #888;\n");
      out.write("  width: 80%; /* Could be more or less, depending on screen size */\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* The Close Button (x) */\n");
      out.write(".close {\n");
      out.write("  position: absolute;\n");
      out.write("  right: 25px;\n");
      out.write("  top: 0;\n");
      out.write("  color: #000;\n");
      out.write("  font-size: 35px;\n");
      out.write("  font-weight: bold;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".close:hover,\n");
      out.write(".close:focus {\n");
      out.write("  color: red;\n");
      out.write("  cursor: pointer;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Add Zoom Animation */\n");
      out.write(".animate {\n");
      out.write("  -webkit-animation: animatezoom 0.6s;\n");
      out.write("  animation: animatezoom 0.6s\n");
      out.write("}\n");
      out.write("\n");
      out.write("@-webkit-keyframes animatezoom {\n");
      out.write("  from {-webkit-transform: scale(0)} \n");
      out.write("  to {-webkit-transform: scale(1)}\n");
      out.write("}\n");
      out.write("  \n");
      out.write("@keyframes animatezoom {\n");
      out.write("  from {transform: scale(0)} \n");
      out.write("  to {transform: scale(1)}\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Change styles for span and cancel button on extra small screens */\n");
      out.write("@media screen and (max-width: 300px) {\n");
      out.write("  span.psw {\n");
      out.write("     display: block;\n");
      out.write("     float: none;\n");
      out.write("  }\n");
      out.write("  .cancelbtn {\n");
      out.write("     width: 100%;\n");
      out.write("  }\n");
      out.write("}\n");
      out.write("\n");
      out.write("* {\n");
      out.write("  box-sizing: border-box;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("    <body>    \n");
      out.write("            <div class=\"row\">\n");
      out.write("                 <!--  page header -->\n");
      out.write("                <div class=\"col-lg-12\">\n");
      out.write("                    <h1 class=\"page-header\">Coffee_Detail</h1>\n");
      out.write("                </div>\n");
      out.write("                 </div>\n");
      out.write("                <div class=\"col-lg-12\">\n");
      out.write("                    <!-- Advanced Tables -->\n");
      out.write("                    <div class=\"panel panel-default\">\n");
      out.write("                       \n");
      out.write("                        <div class=\"panel-body\">\n");
      out.write("                            <div class=\"table-responsive\">\n");
      out.write("                                <table class=\"table table-striped table-bordered table-hover\" id=\"dataTables-example\">\n");
      out.write("                                    <thead>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <th>ID Coffee</th>\n");
      out.write("                                            <th>Coffee Name</th>\n");
      out.write("                                            <th>Stock</th>\n");
      out.write("                                            <th>Price</th>\n");
      out.write("                                            <th>Expired</th>\n");
      out.write("                                        </tr>\n");
      out.write("                                    </thead>\n");
      out.write("                                    <tbody>\n");
      out.write("                ");

                     CoffeeModel km = new CoffeeModel();
                     List<CoffeeModel> data = new ArrayList<CoffeeModel>();
                     String ket = request.getParameter("ket");
                     if (ket == null) {
                         data = km.CoffeeDetail();
                     } 
                     for (int x = 0; x < data.size(); x++) {
                
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                  <td>");
      out.print(data.get(x).getID_Coffee());
      out.write("</td>\n");
      out.write("                  <td>");
      out.print(data.get(x).getCoffee_Name());
      out.write("</td>\n");
      out.write("                  <td>");
      out.print(data.get(x).getStock());
      out.write("</td>\n");
      out.write("                  <td>");
      out.print(data.get(x).getPrice());
      out.write("</td>\n");
      out.write("                  <td>");
      out.print(data.get(x).getExpired());
      out.write("</td>      \n");
      out.write("                </tr>\n");
      out.write("            ");
}
      out.write("\n");
      out.write("                                        \n");
      out.write("                            </tbody>\n");
      out.write("                        </table>\n");
      out.write("                    </div>            \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    <!-- end wrapper -->\n");
      out.write("\n");
      out.write("    <!-- Core Scripts - Include with every page -->\n");
      out.write("    <script src=\"assets/plugins/jquery-1.10.2.js\"></script>\n");
      out.write("    <script src=\"assets/plugins/bootstrap/bootstrap.min.js\"></script>\n");
      out.write("    <script src=\"assets/plugins/metisMenu/jquery.metisMenu.js\"></script>\n");
      out.write("    <script src=\"assets/plugins/pace/pace.js\"></script>\n");
      out.write("    <script src=\"assets/scripts/siminta.js\"></script>\n");
      out.write("    <!-- Page-Level Plugin Scripts-->\n");
      out.write("    <script src=\"assets/plugins/dataTables/jquery.dataTables.js\"></script>\n");
      out.write("    <script src=\"assets/plugins/dataTables/dataTables.bootstrap.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
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
