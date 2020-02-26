package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\n");
      out.write("    <title>E-Coffee Shop</title>\n");
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
      out.write("<section id=\"nav-bar\">\n");
      out.write("    <nav class=\"navbar navbar-expand-lg navbar-light\">\n");
      out.write("        <a class=\"navbar-brand\" href=\"#\">\n");
      out.write("            <img src=\"img/coffee.png\" alt=\"Coffe\">\n");
      out.write("        </a>\n");
      out.write("        <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarNav\" aria-controls=\"navbarNav\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("            <i class=\"fa fa-bars\" aria-hidden=\"true\"></i>\n");
      out.write("        </button>\n");
      out.write("        <div class=\"collapse navbar-collapse\" id=\"navbarNav\">\n");
      out.write("            <ul class=\"navbar-nav ml-auto\">\n");
      out.write("                <li class=\"nav-item active\">\n");
      out.write("                    <a class=\"nav-link\" href=\"#top\">HOME</a>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"nav-item\">\n");
      out.write("                    <a class=\"nav-link\" href=\"#services\">SERVICES</a>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"nav-item\">\n");
      out.write("                    <a class=\"nav-link\" href=\"#about-us\">ABOUT US</a>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"nav-item\">\n");
      out.write("                    <a class=\"nav-link\" href=\"#testimonials\">TESTIMONIAL</a>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"nav-item\">\n");
      out.write("                    <a class=\"nav-link\" href=\"#footer\">CONTACT</a>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"nav-item\">\n");
      out.write("                    <a class=\"nav-link\" href=\"login.jsp\">LOGIN</a>\n");
      out.write("                </li>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("    </nav>\n");
      out.write("</section>\n");
      out.write("\n");
      out.write("<!--------------------- Banner Section ------------------>\n");
      out.write("\n");
      out.write("<section id=\"banner\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-md-6\">\n");
      out.write("                <p class=\"promo-title\">E-COFFEE SHOP</p>\n");
      out.write("                <p>E-Coffe is a coffe shop which this shop sell all various coffe like arabic, americano, brazilia, luwak, europe, etc coffe. We offer to you the best various coffe in the world</p>\n");
      out.write("                <a href=\"register.jsp\"><img src=\"img/cart.png\" class=\"play-btn\"></a>Let's Buy a coffee\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-6 text-center\">\n");
      out.write("                <img src=\"img/home2.png\" class=\"img-fluid\">\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <img src=\"img/wave1.png\" class=\"bottom-img\">  \n");
      out.write("</section>\n");
      out.write("\n");
      out.write("<!------------------- Services Section --------------->\n");
      out.write("<section id=\"services\">\n");
      out.write("    <div class=\"container text-center\">\n");
      out.write("        <h1 class=\"title\">WHAT WE DO ?</h1>\n");
      out.write("        <div class=\"row text-center\">\n");
      out.write("            <div class=\"col-md-4 services\">\n");
      out.write("                <img src=\"img/brown.png\" class=\"service-img\">\n");
      out.write("                <h4>Mocha</h4>\n");
      out.write("                <p>A mocha is a mix between a cappuccino and a hot chocolate. It is made by putting mixing chocolate powder with an espresso shot and then adding steamed milk and micro-foam into the beverage.</p>\n");
      out.write("                <p><b>Rp. 20.000</b></p>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-4 services\">\n");
      out.write("                <img src=\"img/old.png\" class=\"service-img\">\n");
      out.write("                <h4>Café Latte</h4>\n");
      out.write("                <p>A café latte, or “latte” for short, is an espresso based drink with steamed milk and micro-foam added to the coffee. This coffee is much sweeter compared to an espresso due to the steamed milk.</p>\n");
      out.write("                <p><b>Rp. 35.000</b></p>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-4 services\">\n");
      out.write("                <img src=\"img/cup.png\" class=\"service-img\">\n");
      out.write("                <h4>Affogato</h4>\n");
      out.write("                <p>An affogato is a simple dessert coffee that is treat during summer and after dinner. It is made by placing one big scoope of vanilla ice cream within a single or double shot of espresso, and then this coffee is one of the best.</p>\n");
      out.write("                <p><b>Rp. 45.000</b></p>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <button type=\"button\" class=\"btn btn-primary\">GET NOW !</button>\n");
      out.write("    </div>\n");
      out.write("</section>\n");
      out.write("\n");
      out.write("<!-- ----------------About Us----------------------- -->\n");
      out.write("\n");
      out.write("<section id=\"about-us\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <h1 class=\"title text-center\">WHY CHOOSE US ?</h1>\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-md-6\">\n");
      out.write("                <p class=\"about-title\">Why we're Different</p>\n");
      out.write("                <ul>\n");
      out.write("                    <li>Mengerti racikan kopi yang tepat</li>\n");
      out.write("                    <li>Paket dikemas dengan baik</li>\n");
      out.write("                    <li>We deliver on time</li>\n");
      out.write("                    <li>Kami mempunyai reseller terpercaya</li>\n");
      out.write("                    <li>Kami melindungi hak konsumen</li>\n");
      out.write("                    <li>Harga yang terjangkau untuk pasar</li>\n");
      out.write("                    <li>Kami memberikan kualitas kopi terbaik</li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-6\">\n");
      out.write("                <img src=\"img/e-coffe.png\" class=\"img-fluid\" style=\"width: 70%;\">\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</section>\n");
      out.write("\n");
      out.write("<!--------------- Testimonials --------------------->\n");
      out.write("<section id=\"testimonials\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <h1 class=\"title text-center\">ABOUT US</h1>\n");
      out.write("        <div class=\"row offset-1\">\n");
      out.write("            <div class=\"col-md-5 testimonials\">\n");
      out.write("                <p>the coffe shop is the coffe shop which this shop sell all various coffe like arabic, americano, brazilia, luwak, europe, etc coffe. We offer to you the best various coffe in the world</p>\n");
      out.write("                <img src=\"img/user1.png\">\n");
      out.write("                <p class=\"userdetails\">\n");
      out.write("                    <b>Hanas Bayu Pratama</b>\n");
      out.write("                    <br>\n");
      out.write("                    Internasional Freelance\n");
      out.write("                </p>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-5 testimonials\">\n");
      out.write("                <p style=\"margin-bottom: 20px;\">Coffee has always been a significant part of my life. For me, it's a chance to start my day and gather my thoughts - it's fuel for my creative process.</p>\n");
      out.write("                <img style=\"margin-top: 10px; margin-bottom: 10px;\" src=\"img/user2.png\">\n");
      out.write("                <p class=\"userdetails\">\n");
      out.write("                    <b>Muhamad Dani Setiawan</b>\n");
      out.write("                    <br>\n");
      out.write("                    Newbie\n");
      out.write("                </p>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</section>\n");
      out.write("\n");
      out.write("<!----------------------- Social Media section ------------------>\n");
      out.write("<section id=\"social-media\">\n");
      out.write("    <div class=\"container text-center\">\n");
      out.write("        <p>FIND US ON SOCIAL MEDIA</>\n");
      out.write("        <div class=\"social-icons\">\n");
      out.write("            <a href=\"#\"><img src=\"img/facebook-icon.png\"></a>\n");
      out.write("            <a href=\"#\"><img src=\"img/instagram-icon.png\"></a>\n");
      out.write("            <a href=\"#\"><img src=\"img/twitter-icon.png\"></a>\n");
      out.write("            <a href=\"#\"><img src=\"img/wa-icon.png\"></a>\n");
      out.write("            <a href=\"#\"><img src=\"img/linkedin-icon.png\"></a>\n");
      out.write("            <a href=\"#\"><img src=\"img/snapchat-icon.png\"></a>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</section>\n");
      out.write("\n");
      out.write("<!-------------------- footer section -------------------------->\n");
      out.write("<section id=\"footer\">\n");
      out.write("    <img src=\"img/wave2.png\" class=\"footer-img\"> \n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-md-4 footer-box\">\n");
      out.write("                <img src=\"img/coffee.png\" alt=\"Coffe\">\n");
      out.write("                <p>Subscribe coffe shop Youtube Channel to watch videos How to login coffeshop account, How to become reseller of coffe shop, How to become the master of  </p>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-4 footer-box\">\n");
      out.write("                <p><b>CONTACT US</b></p>\n");
      out.write("                <p><i class=\"fa fa-map-marker\"></i> Depok, West Java, Indonesia</p>\n");
      out.write("                <p><i class=\"fa fa-phone\"></i> +628 7623792837</p>\n");
      out.write("                <p><i class=\"fa fa-envelope-o\"></i> coffeshop@gmail.com</p>\n");
      out.write("            </div>\n");
      out.write("            <form action=\"SubcriberController?data=subcriber&proses=input-subcriber\" method=\"post\">\n");
      out.write("            <div class=\"footer-box\">\n");
      out.write("                <p><b>SUBSCRIBE NEWSLETTER</b></p>\n");
      out.write("                <input type=\"email\" name=\"email_subcriber\" class=\"form-control\" placeholder=\"Your Email\" required>\n");
      out.write("                <input type=\"text\"  name=\"phone_number\"  class=\"form-control\" placeholder=\"Your Phone Number\" required>\n");
      out.write("                <button class=\"btn btn-primary\">Subscribe</button>\n");
      out.write("            </div>\n");
      out.write("            <form>\n");
      out.write("        </div>\n");
      out.write("        <hr>\n");
      out.write("        <p class=\"copyright\">Website Crafted by E-Coffee</p>\n");
      out.write("    </div>\n");
      out.write("</section>  \n");
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
