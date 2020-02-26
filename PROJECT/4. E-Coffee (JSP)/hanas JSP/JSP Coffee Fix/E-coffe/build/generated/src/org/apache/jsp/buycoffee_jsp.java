package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import java.util.ArrayList;
import java.util.ArrayList;
import Model.CoffeeModel;

public final class buycoffee_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\n");
      out.write("    <title>Buy Coffe</title>\n");
      out.write("\n");
      out.write("    <!-- My Css -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("\n");
      out.write("    <!-- Bootstrap -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css\">\n");
      out.write("\n");
      out.write("    <!-- Bootstrap Font Awesome -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("    \n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<section id=\"nav-bar\">\n");
      out.write("        <nav class=\"navbar navbar-expand-lg navbar-light\">\n");
      out.write("            <a class=\"navbar-brand\" href=\"#\">\n");
      out.write("                <img src=\"img/coffee.png\" alt=\"Coffe\">\n");
      out.write("            </a>\n");
      out.write("            <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarNav\" aria-controls=\"navbarNav\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                <i class=\"fa fa-bars\" aria-hidden=\"true\"></i>\n");
      out.write("            </button>\n");
      out.write("            <div class=\"collapse navbar-collapse\" id=\"navbarNav\">\n");
      out.write("                <ul class=\"navbar-nav ml-auto\">\n");
      out.write("                   <li class=\"nav-item dropdown no-arrow\">\n");
      out.write("              <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"userDropdown\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                <span class=\"mr-2 d-none d-lg-inline text-gray-600\"> Welcome ");
      out.print(session.getAttribute("nama"));
      out.write(" ♥</span>\n");
      out.write("                <img class=\"img-profile rounded-circle\" src=\"img/admin2.ico\">\n");
      out.write("              </a>\n");
      out.write("              <!-- Dropdown - User Information -->\n");
      out.write("              <div class=\"dropdown-menu dropdown-menu-right shadow animated--grow-in\" aria-labelledby=\"userDropdown\">\n");
      out.write("                <div class=\"dropdown-divider\"></div>\n");
      out.write("                <a class=\"dropdown-item text-gray-400\" href=\"#\" data-toggle=\"modal\" data-target=\"#logoutModal\">\n");
      out.write("                    <i class=\"fas fa-sign-out-alt fa-sm fa-fw mr-2 text-gray-400\"></i>\n");
      out.write("                  Logout\n");
      out.write("                </a>\n");
      out.write("              </div>\n");
      out.write("            </li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("    </section>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</div>\n");
           
            CoffeeModel km = new CoffeeModel();
            List<CoffeeModel> data = new ArrayList<CoffeeModel>();
            data = km.CoffeeDetail();
             if (data.size() > 0) {
            
      out.write("   \n");
      out.write("<!------------------- Services Section --------------->\n");
      out.write("<section id=\"services\">\n");
      out.write("    <div class=\"container text-center\">\n");
      out.write("        <h1 class=\"title\">Select Your Coffee ");
      out.print(session.getAttribute("nama"));
      out.write(" ♥</h1>\n");
      out.write("        <div class=\"row text-center\">\n");
      out.write("            <div class=\"col-md-4 services\">\n");
      out.write("                <img src=\"img/brown.png\" class=\"service-img\">\n");
      out.write("                <h4>Mocha</h4>\n");
      out.write("                <p>A mocha is a mix between a cappuccino and a hot chocolate. It is made by putting mixing chocolate powder with an espresso shot and then adding steamed milk and micro-foam into the beverage.</p>\n");
      out.write("                <p><b>Rp. 20.000</b></p>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <div class=\"mx-auto\">\n");
      out.write("     <form  action=\"TransactionController?data=transaction&proses=input-transaction\" method=\"post\">\n");
      out.write("        <div class=\"container text-center\">\n");
      out.write("        <div class=\"row text-center\">\n");
      out.write("            <input class=\"form-control\" type=\"hidden\" placeholder=\"id_akun\" name=\"id_akun\" value=\"");
      out.print(session.getAttribute("id_akun"));
      out.write("\" required>\n");
      out.write("            <input class=\"one form-control\" type=\"hidden\" placeholder=\"idcoffee\" name=\"id_coffee\" value=\"");
      out.print(data.get(0).getId());
      out.write("\" required>\n");
      out.write("            <input class=\"form-control\" type=\"hidden\" placeholder=\"Name\" name=\"nama\" value=\"");
      out.print(session.getAttribute("nama"));
      out.write("\" required>\n");
      out.write("            <input class=\"one form-control\" type=\"hidden\" placeholder=\"Coffee Name\" name=\"coffee_name\" value=\"");
      out.print(data.get(0).getCoffee_name());
      out.write("\" required>\n");
      out.write("            <input class=\"one form-control\" type=\"hidden\" placeholder=\"price\" id=\"txt1\" name=\"price\" value=\"");
      out.print(data.get(0).getPrice());
      out.write("\" onkeyup=\"sum();\" required>\n");
      out.write("            <label for=\"quantity\">Quantity :</label>\n");
      out.write("            <input class=\"form-control\" type=\"text\" placeholder=\"Quantity\" id=\"txt2\" name=\"qty\" onkeyup=\"sum();\" required>\n");
      out.write("            <label for=\"quantity\">Total Price :</label>\n");
      out.write("            <input class=\"form-control\" type=\"text\" placeholder=\"Total Price\" id=\"txt3\" name=\"total_price\" required>\n");
      out.write("            <label for=\"address\">Address :</label>\n");
      out.write("            <textarea class=\"form-control\" name=\"address\" required></textarea>\n");
      out.write("            <input class=\"form-control\" type=\"hidden\" name=\"date_of_purchase\" id=\"todayDate\" required>\n");
      out.write("            <button class=\"btn btn-primary btn-user btn-block\">BUY</button>         \n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</form>\n");
      out.write("                    </div>\n");
      out.write("                   \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-4 services\">\n");
      out.write("                <img src=\"img/old.png\" class=\"service-img\">\n");
      out.write("                <h4>Café Latte</h4>\n");
      out.write("                <p>A café latte, or “latte” for short, is an espresso based drink with steamed milk and micro-foam added to the coffee. This coffee is much sweeter compared to an espresso due to the steamed milk.</p>\n");
      out.write("                <p><b>Rp. 35.000</b></p>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <div class=\"mx-auto\">\n");
      out.write("        <form  action=\"TransactionController?data=transaction&proses=input-transaction\" method=\"post\">\n");
      out.write("        <div class=\"container text-center\">\n");
      out.write("        <div class=\"row text-center\">\n");
      out.write("            <label for=\"idkaun\">ID_Akun :</label>\n");
      out.write("            <input class=\"form-control\" type=\"text\" placeholder=\"id_akun\" name=\"id_akun\" value=\"");
      out.print(session.getAttribute("id_akun"));
      out.write("\" required>\n");
      out.write("            <label for=\"prize\">ID_Coffee :</label>\n");
      out.write("            <input class=\"one form-control\" type=\"text\" placeholder=\"idcoffee\" name=\"id_coffee\" value=\"");
      out.print(data.get(1).getId());
      out.write("\" required>\n");
      out.write("            <label for=\"name\">Name :</label>\n");
      out.write("            <input class=\"form-control\" type=\"text\" placeholder=\"Name\" name=\"nama\" value=\"");
      out.print(session.getAttribute("nama"));
      out.write("\" required>\n");
      out.write("            <label for=\"prize\">Coffee Name :</label>\n");
      out.write("            <input class=\"one form-control\" type=\"text\" placeholder=\"Coffee Name\" name=\"coffee_name\" value=\"");
      out.print(data.get(1).getCoffee_name());
      out.write("\" required>\n");
      out.write("            <label for=\"prize\">Price :</label>\n");
      out.write("            <input class=\"one form-control\" type=\"text\" placeholder=\"price\" id=\"txt12\" name=\"price\" value=\"");
      out.print(data.get(1).getPrice());
      out.write("\" onkeyup=\"sum2();\" required>\n");
      out.write("            <label for=\"quantity\">Quantity :</label>\n");
      out.write("            <input class=\"form-control\" type=\"text\" placeholder=\"Quantity\" id=\"txt22\" name=\"qty\" onkeyup=\"sum2();\" required>\n");
      out.write("            <label for=\"quantity\">Total Price :</label>\n");
      out.write("            <input class=\"form-control\" type=\"text\" placeholder=\"Total Price\" id=\"txt32\" name=\"total_price\" required>\n");
      out.write("            <label for=\"address\">Address :</label>\n");
      out.write("            <textarea class=\"form-control\" name=\"address\" required></textarea>\n");
      out.write("            <label for=\"quantity\">Date Of Purchase :</label>\n");
      out.write("            <input class=\"form-control\" type=\"text\" name=\"date_of_purchase\" id=\"todayDate2\" required>\n");
      out.write("            <button class=\"btn btn-primary btn-user btn-block\">BUY</button>         \n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</form>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-4 services\">\n");
      out.write("                <img src=\"img/cup.png\" class=\"service-img\">\n");
      out.write("                <h4>Affogato</h4>\n");
      out.write("                <p>An affogato is a simple dessert coffee that is treat during summer and after dinner. It is made by placing one big scoope of vanilla ice cream within a single or double shot of espresso, and then this coffee is one of the best</p>\n");
      out.write("                <p><b>Rp. 45.000</b></p>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <div class=\"mx-auto\">\n");
      out.write("<form  action=\"TransactionController?data=transaction&proses=input-transaction\" method=\"post\">\n");
      out.write("        <div class=\"container text-center\">\n");
      out.write("        <div class=\"row text-center\">\n");
      out.write("            <label for=\"idkaun\">ID_Akun :</label>\n");
      out.write("            <input class=\"form-control\" type=\"text\" placeholder=\"id_akun\" name=\"id_akun\" value=\"");
      out.print(session.getAttribute("id_akun"));
      out.write("\" required>\n");
      out.write("            <label for=\"prize\">ID_Coffee :</label>\n");
      out.write("            <input class=\"one form-control\" type=\"text\" placeholder=\"idcoffee\" name=\"id_coffee\" value=\"");
      out.print(data.get(2).getId());
      out.write("\" required>\n");
      out.write("            <label for=\"name\">Name :</label>\n");
      out.write("            <input class=\"form-control\" type=\"text\" placeholder=\"Name\" name=\"nama\" value=\"");
      out.print(session.getAttribute("nama"));
      out.write("\" required>\n");
      out.write("            <label for=\"prize\">Coffee Name :</label>\n");
      out.write("            <input class=\"one form-control\" type=\"text\" placeholder=\"Coffee Name\" name=\"coffee_name\" value=\"");
      out.print(data.get(2).getCoffee_name());
      out.write("\" required>\n");
      out.write("            <label for=\"prize\">Price :</label>\n");
      out.write("            <input class=\"one form-control\" type=\"text\" placeholder=\"price\" id=\"txt13\" name=\"price\" value=\"");
      out.print(data.get(2).getPrice());
      out.write("\" onkeyup=\"sum3();\" required>\n");
      out.write("            <label for=\"quantity\">Quantity :</label>\n");
      out.write("            <input class=\"form-control\" type=\"text\" placeholder=\"Quantity\" id=\"txt23\" name=\"qty\" onkeyup=\"sum3();\" required>\n");
      out.write("            <label for=\"quantity\">Total Price :</label>\n");
      out.write("            <input class=\"form-control\" type=\"text\" placeholder=\"Total Price\" id=\"txt33\" name=\"total_price\" required>\n");
      out.write("            <label for=\"address\">Address :</label>\n");
      out.write("            <textarea class=\"form-control\" name=\"address\" required></textarea>\n");
      out.write("            <label for=\"quantity\">Date Of Purchase :</label>\n");
      out.write("            <input class=\"form-control\" type=\"text\" name=\"date_of_purchase\" id=\"todayDate3\" required>\n");
      out.write("            <button class=\"btn btn-primary btn-user btn-block\">BUY</button>         \n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</form>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</section>\n");
      out.write("\n");
      out.write("\n");
      out.write("<!----------------------- Smooth Scrool -------------------->\n");
      out.write("<!----------------------- Smooth Scroll -------------------->  \n");
      out.write("\n");
      out.write("<script src=\"js/jquery-1.10.2.js\"></script>\n");
      out.write("<script src=\"js/smooth-scroll.js\"></script>\n");
      out.write("<script>\n");
      out.write("   var scroll = new SmoothScroll('a[href*=\"#\"]');\n");
      out.write("</script>\n");
      out.write("<script src=\"js/script.js\"></script>\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\"></script>\n");
      out.write("<script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/js/bootstrap.min.js\"></script>\n");
      out.write("<script src=\"js/datesum.js\"></script>\n");
      out.write("\n");
      out.write("</body>\n");
}
      out.write("\n");
      out.write("<div class=\"modal fade\" id=\"logoutModal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"exampleModalLabel\" aria-hidden=\"true\">\n");
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
      out.write("          <a class=\"btn btn-primary\" href=\"index.jsp\">Logout</a>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
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
