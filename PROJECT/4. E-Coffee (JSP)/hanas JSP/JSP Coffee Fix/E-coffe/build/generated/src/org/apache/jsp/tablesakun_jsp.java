package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import java.util.ArrayList;
import java.util.ArrayList;
import Model.CoffeeModel;

public final class tablesakun_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("  <title>E - Coffee Account</title>\n");
      out.write("\n");
      out.write("  <link href=\"assets/fontawesome-free/css/all.min.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("  <link href=\"https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i\" rel=\"stylesheet\">\n");
      out.write("  <link href=\"assets/bootstrap/css/bootstrap.css\" rel=\"stylesheet\">\n");
      out.write("  <link href=\"assets/datatables/dataTables.bootstrap4.min.css\" rel=\"stylesheet\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"css/dashboard.css\">\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body id=\"page-top\">\n");
      out.write("\n");
      out.write("  <!-- Page Wrapper -->\n");
      out.write("  <div id=\"wrapper\">\n");
      out.write("\n");
      out.write("    <!-- Sidebar -->\n");
      out.write("    <ul class=\"navbar-nav bg-gradient sidebar sidebar-dark accordion\" id=\"accordionSidebar\">\n");
      out.write("\n");
      out.write("      <!-- Sidebar - Brand -->\n");
      out.write("      <a class=\"sidebar-brand d-flex align-items-center justify-content-center\" href=\"dashboard.jsp\">\n");
      out.write("        <div class=\"sidebar-brand-icon rotate-n-15\">\n");
      out.write("          <i class=\"fas fa-coffee\"></i>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"sidebar-brand-text mx-3\">E - Coffee</div>\n");
      out.write("      </a>\n");
      out.write("\n");
      out.write("      <!-- Divider -->\n");
      out.write("      <hr class=\"sidebar-divider my-0\">\n");
      out.write("\n");
      out.write("      <!-- Nav Item - Dashboard -->\n");
      out.write("      <li class=\"nav-item\">\n");
      out.write("        <a class=\"nav-link\" href=\"dashboard.jsp\">\n");
      out.write("          <i class=\"fas fa-fw fa-tachometer-alt\"></i>\n");
      out.write("          <span>Dashboard</span></a>\n");
      out.write("      </li>\n");
      out.write("    \n");
      out.write("      <!-- Nav Item - Tables -->\n");
      out.write("      <li class=\"nav-item\">\n");
      out.write("        <a class=\"nav-link\" href=\"tablesakun.jsp\">\n");
      out.write("          <i class=\"fas fa-fw fa-users\"></i>\n");
      out.write("          <span>Coffee Account</span></a>\n");
      out.write("      </li>\n");
      out.write("      \n");
      out.write("      <li class=\"nav-item\">\n");
      out.write("        <a class=\"nav-link\" href=\"tablescoffee.jsp\">\n");
      out.write("          <i class=\"fas fa-fw fa-table\"></i>\n");
      out.write("          <span>Coffee Tables</span></a>\n");
      out.write("      </li>\n");
      out.write("      \n");
      out.write("\n");
      out.write("      <!-- Divider -->\n");
      out.write("      <hr class=\"sidebar-divider d-none d-md-block\">\n");
      out.write("\n");
      out.write("    </ul>\n");
      out.write("\n");
      out.write("    <div id=\"content-wrapper\" class=\"d-flex flex-column\">\n");
      out.write("\n");
      out.write("      <!-- Main Content -->\n");
      out.write("      <div id=\"content\">\n");
      out.write("\n");
      out.write("        <!-- Topbar -->\n");
      out.write("        <nav class=\"navbar navbar-expand navbar-light bg-white topbar mb-4 static-top shadow\">\n");
      out.write("          <ul class=\"navbar-nav ml-auto\">\n");
      out.write("            <div class=\"topbar-divider d-none d-sm-block\"></div>\n");
      out.write("\n");
      out.write("            <!-- Nav Item - User Information -->\n");
      out.write("            <li class=\"nav-item dropdown no-arrow\">\n");
      out.write("              <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"userDropdown\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                <span class=\"mr-2 d-none d-lg-inline text-gray-600 small\">Welcome ");
      out.print(session.getAttribute("username"));
      out.write(" ♥</span>\n");
      out.write("                <img class=\"img-profile rounded-circle\" src=\"img/admin.ico\">\n");
      out.write("              </a>\n");
      out.write("              <!-- Dropdown - User Information -->\n");
      out.write("              <div class=\"dropdown-menu dropdown-menu-right shadow animated--grow-in\" aria-labelledby=\"userDropdown\">\n");
      out.write("                \n");
      out.write("                <a class=\"dropdown-item\" href=\"#\" data-toggle=\"modal\" data-target=\"#logoutModal\">\n");
      out.write("                  <i class=\"fas fa-sign-out-alt fa-sm fa-fw mr-2 text-gray-400\"></i>\n");
      out.write("                  Logout\n");
      out.write("                </a>\n");
      out.write("              </div>\n");
      out.write("            </li>\n");
      out.write("\n");
      out.write("          </ul>\n");
      out.write("\n");
      out.write("        </nav>\n");
      out.write("        <!-- End of Topbar -->\n");
      out.write("\n");
      out.write("        <!-- Begin Page Content -->\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("\n");
      out.write("          <!-- Page Heading -->\n");
      out.write("          <h1 class=\"h3 mb-2 text-gray-800\">E-Coffee Account</h1>\n");
      out.write("          <p class=\"mb-4\">This is table coffee account</p>\n");
      out.write("\n");
      out.write("          <!-- DataTales Example -->\n");
      out.write("          <div class=\"card shadow mb-4\">\n");
      out.write("            <div class=\"card-header py-3\">\n");
      out.write("              <h6 class=\"m-0 font-weight-bold text-primary\">E-Coffee Account</h6>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"card-body\">\n");
      out.write("              <div class=\"table-responsive\">\n");
      out.write("                <table class=\"table table-bordered\" id=\"dataTable\" width=\"100%\" cellspacing=\"0\">\n");
      out.write("                  <thead>\n");
      out.write("                    <tr>\n");
      out.write("                      <th>ID Account</th>\n");
      out.write("                      <th>Name</th>\n");
      out.write("                      <th>Email</th>\n");
      out.write("                      <th>Password</th>\n");
      out.write("                      <th>Action</th>\n");
      out.write("                    </tr>\n");
      out.write("                  </thead>\n");
      out.write("                  <tfoot>\n");
      out.write("                    <tr>\n");
      out.write("                      <th>ID Account</th>\n");
      out.write("                      <th>Name</th>\n");
      out.write("                      <th>Email</th>\n");
      out.write("                      <th>Password</th>\n");
      out.write("                      <th>Action</th>\n");
      out.write("                    </tr>\n");
      out.write("                  </tfoot>\n");
      out.write("                  <tbody>\n");
      out.write("                   ");

                  CoffeeModel km = new CoffeeModel();
                  List<CoffeeModel> data = new ArrayList<CoffeeModel>();
                  String ket = request.getParameter("ket");
                  if (ket == null) {
                      data = km.CoffeeAkun();
                  } 
                  for (int x = 0; x < data.size(); x++) {
              
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                  <td>");
      out.print(data.get(x).getId_akun());
      out.write("</td>\n");
      out.write("                  <td>");
      out.print(data.get(x).getNama());
      out.write("</td>\n");
      out.write("                  <td>");
      out.print(data.get(x).getEmail());
      out.write("</td>\n");
      out.write("                  <td>");
      out.print(data.get(x).getPassword_akun());
      out.write("</td>\n");
      out.write("                  <td>\n");
      out.write("                      <a href=\"RegisterController?proses=edit-user&id_akun=");
      out.print(data.get(x).getId_akun());
      out.write("\"><button class=\"btn btn-primary\">Edit</button></a>\n");
      out.write("                      <a href=\"RegisterController?proses=hapus-user&id_akun=");
      out.print(data.get(x).getId_akun());
      out.write("\"><button class=\"btn btn-danger\">Delete</button></a>\n");
      out.write("                  </td>\n");
      out.write("                    </tr>\n");
      out.write("                    ");
}
      out.write("\n");
      out.write("                  </tbody>\n");
      out.write("                </table>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <!-- /.container-fluid -->\n");
      out.write("\n");
      out.write("      </div>\n");
      out.write("      <!-- End of Main Content -->\n");
      out.write("\n");
      out.write("      <!-- Footer -->\n");
      out.write("      <footer class=\"sticky-footer bg-white\">\n");
      out.write("        <div class=\"container my-auto\">\n");
      out.write("          <div class=\"copyright text-center my-auto\">\n");
      out.write("            <span>Copyright &copy; E-Coffee 2019</span>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </footer>\n");
      out.write("      <!-- End of Footer -->\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("    <!-- End of Content Wrapper -->\n");
      out.write("\n");
      out.write("  </div>\n");
      out.write("  <!-- End of Page Wrapper -->\n");
      out.write("\n");
      out.write("  <!-- Scroll to Top Button-->\n");
      out.write("  <a class=\"scroll-to-top rounded\" href=\"#page-top\">\n");
      out.write("    <i class=\"fas fa-angle-up\"></i>\n");
      out.write("  </a>\n");
      out.write("\n");
      out.write("  <!-- Logout Modal-->\n");
      out.write("  <div class=\"modal fade\" id=\"logoutModal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"exampleModalLabel\" aria-hidden=\"true\">\n");
      out.write("    <div class=\"modal-dialog\" role=\"document\">\n");
      out.write("      <div class=\"modal-content\">\n");
      out.write("        <div class=\"modal-header\">\n");
      out.write("          <h5 class=\"modal-title\" id=\"exampleModalLabel\">Ready to Leave?</h5>\n");
      out.write("          <button class=\"close\" type=\"button\" data-dismiss=\"modal\" aria-label=\"Close\">\n");
      out.write("            <span aria-hidden=\"true\">×</span>\n");
      out.write("          </button>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"modal-body\">Select \"Logout\" below if you are ready to end your current session.</div>\n");
      out.write("        <div class=\"modal-footer\">\n");
      out.write("          <button class=\"btn btn-secondary\" type=\"button\" data-dismiss=\"modal\">Cancel</button>\n");
      out.write("          <a class=\"btn btn-primary\" href=\"loginadmin.jsp\">Logout</a>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("  <!-- DataTable JavaScript-->\n");
      out.write("  <script src=\"assets/jquery/jquery.min.js\"></script>\n");
      out.write("  <script src=\"assets/datatables/jquery.dataTables.min.js\"></script>\n");
      out.write("  <script src=\"assets/datatables/dataTables.bootstrap4.min.js\"></script>\n");
      out.write("  <script src=\"js/datatables.js\"></script>\n");
      out.write("  <script src=\"assets/bootstrap/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("\n");
      out.write("</body>\n");
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
