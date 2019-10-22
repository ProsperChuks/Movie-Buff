package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class contact_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("        <meta name=\"author\" content=\"prosper\">\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <title>Contact - Movie Buff</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/tar.css\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/linearicons.css\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.css\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/owl.carousel.css\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/magnific-popup.css\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/nice-select.css\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/main.css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <!-- Start Header Area -->\n");
      out.write("        <header class=\"default-header\">\n");
      out.write("            <nav class=\"navbar navbar-expand-lg navbar-light\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <a class=\"navbar-brand\" href=\"home.jsp\">\n");
      out.write("                        <h3 style=\"color: white;\">Movie Buff Entertainment</h3>\n");
      out.write("                    </a>\n");
      out.write("                    <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\"\n");
      out.write("                            aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                        <span class=\"fa fa-bars\"></span>\n");
      out.write("                    </button>\n");
      out.write("\n");
      out.write("                    <div class=\"collapse navbar-collapse justify-content-end align-items-center\" id=\"navbarSupportedContent\">\n");
      out.write("                        <ul class=\"navbar-nav navbar-right\">\n");
      out.write("                            <li><a href=\"home.jsp\">Home</a></li>\n");
      out.write("                            <li><a href=\"#\">In Theaters</a></li>\n");
      out.write("                            <li><a href=\"#\">Coming Soon</a></li>\n");
      out.write("                            <li><a href=\"bookTicket.jsp\">Book Ticket</a></li>\n");
      out.write("                            <li><a class=\"active\" href=\"contact.jsp\">Contact</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </nav>\n");
      out.write("        </header>\n");
      out.write("        <!-- End Header Area -->\n");
      out.write("\n");
      out.write("\t<!-- Start top-section Area -->\n");
      out.write("\t<section class=\"banner-area relative\">\n");
      out.write("\t\t<div class=\"overlay overlay-bg\"></div>\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<div class=\"row justify-content-between align-items-center text-center banner-content\">\n");
      out.write("\t\t\t\t<div class=\"col-lg-12\">\n");
      out.write("\t\t\t\t\t<h1 class=\"text-white\">Contact Us</h1>\n");
      out.write("                                        <h6>Movie Buff</h6><br><p><b>Address:</b> 112, Obafemi Awolowo Way, Alausa, Ikeja, Lagos State.  <b>Phone:</b> +234 81 439 403 60</p>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</section>\n");
      out.write("\t<!-- End top-section Area -->\n");
      out.write("        \n");
      out.write("        <!-- start footer Area -->\n");
      out.write("        <footer class=\"footer-area section-gap\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row footer-bottom d-flex justify-content-between\">\n");
      out.write("                    <h4 class=\"lf\">Copyright &copy; 2019 <a href=\"#\">Movie Buff</a> - All Rights Reserved</h4>\n");
      out.write("                    <div style=\"clear:both;\"></div>\n");
      out.write("                    <div class=\"col-lg-4 col-sm-12 footer-social\">\n");
      out.write("                        <a href=\"#\"><i class=\"fa fa-facebook\"></i></a>\n");
      out.write("                        <a href=\"#\"><i class=\"fa fa-twitter\"></i></a>\n");
      out.write("                        <a href=\"#\"><i class=\"fa fa-dribbble\"></i></a>\n");
      out.write("                        <a href=\"#\"><i class=\"fa fa-linkedin\"></i></a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </footer>\n");
      out.write("        <!-- End footer Area -->\n");
      out.write("        \n");
      out.write("        <script src=\"js/jquery.min.js\"></script>\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"js/vendor/jquery-2.2.4.min.js\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.11.0/umd/popper.min.js\" integrity=\"sha384-b/U6ypiBEHpOf/4+1nzFpr53nxSS+GLCkfwBdFNTxtclqqenISfwAzpKaMNFNmj4\"\n");
      out.write("        crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"js/vendor/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"js/jquery.ajaxchimp.min.js\"></script>\n");
      out.write("        <script src=\"js/parallax.min.js\"></script>\n");
      out.write("        <script src=\"js/owl.carousel.min.js\"></script>\n");
      out.write("        <script src=\"js/isotope.pkgd.min.js\"></script>\n");
      out.write("        <script src=\"js/jquery.nice-select.min.js\"></script>\n");
      out.write("        <script src=\"js/jquery.magnific-popup.min.js\"></script>\n");
      out.write("        <script src=\"js/jquery.sticky.js\"></script>\n");
      out.write("        <script src=\"js/main.js\"></script>\n");
      out.write("    </body>\n");
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
