package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import java.util.ArrayList;
import java.util.ArrayList;
import Model.CoffeeModel;

public final class belikopi_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("                    <li class=\"nav-item active\">\n");
      out.write("                        <a class=\"nav-link\" href=\"index.html#home\">HOME</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link\" href=\"index.html#services\">SERVICES</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link\" href=\"index.html#about-us\">ABOUT US</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link\" href=\"index.html#testimonials\">TESTIMONIAL</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link\" href=\"index.html#footer\">CONTACT</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link\" href=\"\">LOGIN</a>\n");
      out.write("                    </li>\n");
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
      out.write("                <h4>Brazilia</h4>\n");
      out.write("                <p>the coffe shop is the coffe shop which this shop sell all various coffe like arabic, americano, brazilia, luwak, europe, etc coffe. We offer to you the best various coffe in the world.</p>\n");
      out.write("                <p><b>Rp. 20.000</b></p>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <div class=\"mx-auto\">\n");
      out.write("     <form  action=\"TransactionController?data=transaction&proses=input-transaction\" method=\"post\">\n");
      out.write("        <div class=\"container text-center\">\n");
      out.write("        <div class=\"row text-center\">\n");
      out.write("            <label for=\"idkaun\">ID_Akun :</label>\n");
      out.write("            <input class=\"form-control\" type=\"text\" placeholder=\"id_akun\" name=\"id_akun\" value=\"");
      out.print(session.getAttribute("id_akun"));
      out.write("\" required>\n");
      out.write("            <label for=\"prize\">ID_Coffee :</label>\n");
      out.write("            <input class=\"one form-control\" type=\"text\" placeholder=\"idcoffee\" name=\"id_coffee\" value=\"");
      out.print(data.get(0).getId());
      out.write("\" required>\n");
      out.write("            <label for=\"name\">Name :</label>\n");
      out.write("            <input class=\"form-control\" type=\"text\" placeholder=\"Name\" name=\"nama\" value=\"");
      out.print(session.getAttribute("nama"));
      out.write("\" required>\n");
      out.write("            <label for=\"prize\">Coffee Name :</label>\n");
      out.write("            <input class=\"one form-control\" type=\"text\" placeholder=\"Coffee Name\" name=\"coffee_name\" value=\"");
      out.print(data.get(0).getCoffee_name());
      out.write("\" required>\n");
      out.write("            <label for=\"prize\">Price :</label>\n");
      out.write("            <input class=\"one form-control\" type=\"text\" placeholder=\"price\" id=\"txt1\" name=\"price\" value=\"");
      out.print(data.get(0).getPrice());
      out.write("\" onkeyup=\"sum();\" required>\n");
      out.write("            <label for=\"quantity\">Quantity :</label>\n");
      out.write("            <input class=\"form-control\" type=\"text\" placeholder=\"Quantity\" id=\"txt2\" name=\"qty\" onkeyup=\"sum();\" required>\n");
      out.write("            <label for=\"quantity\">Total Price :</label>\n");
      out.write("            <input class=\"form-control\" type=\"text\" placeholder=\"Total Price\" id=\"txt3\" name=\"total_price\" required>\n");
      out.write("            <label for=\"address\">Address :</label>\n");
      out.write("            <textarea class=\"form-control\" name=\"address\" required></textarea>\n");
      out.write("            <label for=\"quantity\">Date Of Purchase :</label>\n");
      out.write("            <input class=\"form-control\" type=\"text\" name=\"date_of_purchase\" id=\"todayDate\" required>\n");
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
      out.write("                <h4>Americano</h4>\n");
      out.write("                <p>the coffe shop is the coffe shop which this shop sell all various coffe like arabic, americano, brazilia, luwak, europe, etc coffe. We offer to you the best various coffe in the world.</p>\n");
      out.write("                <p><b>Rp. 33.000</b></p>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <div class=\"mx-auto\">\n");
      out.write("                          <form  action=\"TransactionController?data=transaction&proses=input-transaction\" method=\"post\">\n");
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
      out.write("                <h4>Luwak</h4>\n");
      out.write("                <p>the coffe shop is the coffe shop which this shop sell all various coffe like arabic, americano, brazilia, luwak, europe, etc coffe. We offer to you the best various coffe in the world.</p>\n");
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
