package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import java.util.ArrayList;
import model.UserModel;

public final class dashboard_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("  <meta charset=\"utf-8\" />\n");
      out.write("  <link rel=\"apple-touch-icon\" sizes=\"76x76\" href=\"assets/img/apple-icon.png\">\n");
      out.write("   <link rel=\"icon\" type=\"image/jpg\" href=\"img/fazee.png\">\n");
      out.write("  <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\" />\n");
      out.write("  <title>\n");
      out.write("    Faze Clan : Dashboard\n");
      out.write("  </title>\n");
      out.write("  <meta content='width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0, shrink-to-fit=no' name='viewport' />\n");
      out.write("  <!--     Fonts and icons     -->\n");
      out.write("  <link href=\"https://fonts.googleapis.com/css?family=Montserrat:400,700,200\" rel=\"stylesheet\" />\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.7.1/css/all.css\" integrity=\"sha384-fnmOCqbTlWIlj8LyTjo7mOUStjsKC4pOpQbqyi7RrhN7udi9RwhKkMHpvLbHG9Sr\" crossorigin=\"anonymous\">\n");
      out.write("  <!-- CSS Files -->\n");
      out.write("  <link href=\"assets/css/bootstrap.min.css\" rel=\"stylesheet\" />\n");
      out.write("  <link href=\"assets/css/now-ui-dashboard.css?v=1.3.0\" rel=\"stylesheet\" />\n");
      out.write("  <!-- CSS Just for demo purpose, don't include it in your project -->\n");
      out.write("  <link href=\"assets/demo/demo.css\" rel=\"stylesheet\" />\n");
      out.write("  \n");
      out.write("  <style>\n");
      out.write("        .dropdown-item{\n");
      out.write("  background-color:  #ff3636;\n");
      out.write("       }\n");
      out.write("       .dropdown-menu {\n");
      out.write("        background-color: #ff3636;\n");
      out.write("       }\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        @font-face {\n");
      out.write("         font-family: \"Font Digital\";\n");
      out.write("         src: url('font/pubg.ttf');\n");
      out.write("         }\n");
      out.write(" \n");
      out.write("        @font-face {\n");
      out.write("         font-family: \"Font foot\";\n");
      out.write("         src: url('font/SoccerLeague.ttf');\n");
      out.write("         }\n");
      out.write(" \n");
      out.write("   h1{\n");
      out.write("         font-family: \"Font Digital\";\n");
      out.write("         font-size: 3.5rem;\n");
      out.write("         }\n");
      out.write("\n");
      out.write("    h2{\n");
      out.write("      font-family: \"Font foot\";\n");
      out.write("    }\n");
      out.write("\n");
      out.write("   h3{\n");
      out.write("         font-family: \"Font Digital\";\n");
      out.write("         font-size: 1.5rem;\n");
      out.write("         color: #fff;\n");
      out.write("         }\n");
      out.write("\n");
      out.write("    @font-face {\n");
      out.write("         font-family: \"Font nav\";\n");
      out.write("         src: url('font/Voltage.otf');\n");
      out.write("         }\n");
      out.write("    .main {\n");
      out.write("  margin-left: 270px; /* Same as the width of the sidenav */\n");
      out.write("  font-size: 15px; /* Increased text to enable scrolling */\n");
      out.write("  padding: 0px 10px;\n");
      out.write("}     \n");
      out.write("         \n");
      out.write("\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body class=\"\">\n");
      out.write("  <div class=\"wrapper \">\n");
      out.write("    <div class=\"sidebar\" data-color=\"red\">\n");
      out.write("      <!--\n");
      out.write("        Tip 1: You can change the color of the sidebar using: data-color=\"blue | green | orange | red | yellow\"\n");
      out.write("    -->\n");
      out.write("    <div class=\"logo\">\n");
      out.write("        <a href=\"dashboard.jsp\" class=\"simple-text logo-mini\">\n");
      out.write("          <img type=\"image/jpg\" src=\"img/fazebot.png\" width=\"100%\">\n");
      out.write("        </a>\n");
      out.write("        <a href=\"dashboard.jsp\" class=\"simple-text logo-normal\">\n");
      out.write("          Faze Clan\n");
      out.write("        </a>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"sidebar-wrapper\" id=\"sidebar-wrapper\">\n");
      out.write("        <ul class=\"nav\">\n");
      out.write("          <li class=\"active \">\n");
      out.write("            <a href=\"dashboard.jsp\">\n");
      out.write("              <i class=\"now-ui-icons design_app\"></i>\n");
      out.write("              <p>Dashboard</p>\n");
      out.write("            </a>\n");
      out.write("          </li>\n");
      out.write("         \n");
      out.write("         <li class=\"nav-item dropdown\">\n");
      out.write("        <a class=\"nav-link dropdown-toggle active\" href=\"#\" id=\"navbarDropdownMenuLink\"  data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("            <i class=\"now-ui-icons design_bullet-list-67\"></i> Table\n");
      out.write("        </a>\n");
      out.write("        <div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdownMenuLink\">\n");
      out.write("            <a class=\"dropdown-item\" href=\"registadmin.jsp\"><i class=\"now-ui-icons users_single-02\"></i><p style=\"color:white\"> User</p></a>\n");
      out.write("            <a class=\"dropdown-item\" href=\"index.jsp\"><i class=\"now-ui-icons ui-1_check\"></i><p style=\"color:white\"> Vote</p></a>\n");
      out.write("            <a class=\"dropdown-item\" href=\"schedule.jsp\"><i class=\"now-ui-icons location_map-big\"></i><p style=\"color:white\">Event</p></a>\n");
      out.write("         <a class=\"dropdown-item\" href=\"contactdash.jsp\"><i class=\"now-ui-icons files_single-copy-04\"></i><p style=\"color:white\">Contact</p></a>\n");
      out.write("        </div>\n");
      out.write("      </li>\n");
      out.write("      <li>\n");
      out.write("       <a href=\"homer.jsp\">\n");
      out.write("              <i class=\"now-ui-icons media-1_button-power\"></i>\n");
      out.write("              <p>Log Out</p>\n");
      out.write("            </a>\n");
      out.write("      </li>\n");
      out.write("        </ul>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("      <div class=\"main\">\n");
      out.write("            \n");
      out.write("              <h1>Welcome ");
      out.print(session.getAttribute("name"));
      out.write(" !</h1>\n");
      out.write("              <br>\n");
      out.write("              <center>\n");
      out.write("              <img src=\"img/fazeSASA.png\">\n");
      out.write("              </center>\n");
      out.write("             \n");
      out.write("      </div>\n");
      out.write("                  \n");
      out.write("  </div>\n");
      out.write("                \n");
      out.write("      <!-- Navbar -->\n");
      out.write("      \n");
      out.write("      <!-- End Navbar -->\n");
      out.write("\n");
      out.write("  <!--   Core JS Files   -->\n");
      out.write("  <script src=\"assets/js/core/jquery.min.js\"></script>\n");
      out.write("  <script src=\"assets/js/core/popper.min.js\"></script>\n");
      out.write("  <script src=\"assets/js/core/bootstrap.min.js\"></script>\n");
      out.write("  <script src=\"assets/js/plugins/perfect-scrollbar.jquery.min.js\"></script>\n");
      out.write("  <!--  Google Maps Plugin    -->\n");
      out.write("  <script src=\"https://maps.googleapis.com/maps/api/js?key=YOUR_KEY_HERE\"></script>\n");
      out.write("  <!-- Chart JS -->\n");
      out.write("  <script src=\"assets/js/plugins/chartjs.min.js\"></script>\n");
      out.write("  <!--  Notifications Plugin    -->\n");
      out.write("  <script src=\"assets/js/plugins/bootstrap-notify.js\"></script>\n");
      out.write("  <!-- Control Center for Now Ui Dashboard: parallax effects, scripts for the example pages etc -->\n");
      out.write("  <script src=\"assets/js/now-ui-dashboard.min.js?v=1.3.0\" type=\"text/javascript\"></script>\n");
      out.write("  <!-- Now Ui Dashboard DEMO methods, don't include it in your project! -->\n");
      out.write("  <script src=\"assets/demo/demo.js\"></script>\n");
      out.write("  <script>\n");
      out.write("    $(document).ready(function() {\n");
      out.write("      // Javascript method's body can be found in assets/js/demos.js\n");
      out.write("      demo.initDashboardPageCharts();\n");
      out.write("\n");
      out.write("    });\n");
      out.write("  </script>\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>");
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
