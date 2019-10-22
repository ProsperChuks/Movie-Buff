package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class nowShowing_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("    <head>\n");
      out.write("        <title>Now Showing - Movie Buff</title>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style.css\" type=\"text/css\" media=\"all\" />\n");
      out.write("        <script type=\"text/javascript\" src=\"js/jquery-1.4.2.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/jquery-func.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <!-- START PAGE SOURCE -->\n");
      out.write("        <div id=\"shell\">\n");
      out.write("            <div id=\"header\">\n");
      out.write("                <h1><a href=\"index.jsp\" style=\"text-decoration: none;\">Movie Buff Entertainment</a></h1>\n");
      out.write("                <div id=\"navigation\">\n");
      out.write("                    <ul>\n");
      out.write("                        <li><a href=\"home.jsp\">HOME</a></li>\n");
      out.write("                        <li><a class=\"active\" href=\"nowShowing.jsp\">IN THEATERS</a></li>\n");
      out.write("                        <li><a href=\"comingSoon.jsp\">COMING SOON</a></li>\n");
      out.write("                        <li><a href=\"contact.jsp\">CONTACT</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("                <center>\n");
      out.write("                <div id=\"sub-navigation\">\n");
      out.write("                    <div id=\"search\">\n");
      out.write("                        <div action=\"#\" method=\"get\" accept-charset=\"utf-8\">\n");
      out.write("                            <h1>NOW SHOWING</h1>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                </center>\n");
      out.write("            </div>\n");
      out.write("            <div id=\"main\">\n");
      out.write("                <div id=\"content\">\n");
      out.write("                    <div class=\"box\">\n");
      out.write("                        <div class=\"head\">\n");
      out.write("                            <p class=\"text-right\"><a href=\"#\"><BR></a></p>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"movie\">\n");
      out.write("                            <div class=\"movie-image\"> <span class=\"play\"><span class=\"name\">Captain Marvel</span></span> <a href=\"#\"><img src=\"css/images/OPENPOSTER.jpg\" alt=\"\" /></a> </div>\n");
      out.write("                            <div class=\"rating\">\n");
      out.write("                                <p>RATING</p>\n");
      out.write("                                <div class=\"stars\">\n");
      out.write("                                    <div class=\"stars-in\"> </div>\n");
      out.write("                                </div>\n");
      out.write("                                <span class=\"comments\">12</span> </div>\n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                        <div class=\"movie\">\n");
      out.write("                            <div class=\"movie-image\" onclick=\"#we\"> <span class=\"play\"><span class=\"name\">Alita: Battle Angel</span></span>\n");
      out.write("                                <a href=\"#we\"><img src=\"css/images/movie4.jpeg\" alt=\"\" /></a>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"rating\">\n");
      out.write("                                <p>RATING</p>\n");
      out.write("                                <div class=\"stars\">\n");
      out.write("                                    <div class=\"stars-in\"> </div>\n");
      out.write("                                </div>\n");
      out.write("                                <span class=\"comments\">12</span> </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"movie\">\n");
      out.write("                            <div class=\"movie-image\"> <span class=\"play\"><span class=\"name\">US</span></span> <a href=\"#\"><img src=\"css/images/usposter.jpg\" alt=\"\" /></a> </div>\n");
      out.write("                            <div class=\"rating\">\n");
      out.write("                                <p>RATING</p>\n");
      out.write("                                <div class=\"stars\">\n");
      out.write("                                    <div class=\"stars-in\"> </div>\n");
      out.write("                                </div>\n");
      out.write("                                <span class=\"comments\">12</span> </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"movie\">\n");
      out.write("                            <div class=\"movie-image\"> <span class=\"play\"><span class=\"name\">Hotel Mumbai</span></span> <a href=\"#\"><img src=\"css/images/hotelmumposter.jpg\" alt=\"\" /></a> </div>\n");
      out.write("                            <div class=\"rating\">\n");
      out.write("                                <p>RATING</p>\n");
      out.write("                                <div class=\"stars\">\n");
      out.write("                                    <div class=\"stars-in\"> </div>\n");
      out.write("                                </div>\n");
      out.write("                                <span class=\"comments\">12</span> </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"movie\">\n");
      out.write("                            <div class=\"movie-image\"> <span class=\"play\"><span class=\"name\">Junglee</span></span> <a href=\"#\"><img src=\"css/images/jungle.jpg\" alt=\"\" /></a> </div>\n");
      out.write("                            <div class=\"rating\">\n");
      out.write("                                <p>RATING</p>\n");
      out.write("                                <div class=\"stars\">\n");
      out.write("                                    <div class=\"stars-in\"> </div>\n");
      out.write("                                </div>\n");
      out.write("                                <span class=\"comments\">12</span> </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"movie last\">\n");
      out.write("                            <div class=\"movie-image\"> <span class=\"play\"><span class=\"name\">What Men Want</span></span> <a href=\"#\"><img src=\"css/images/WHATPOSTER.jpg\" alt=\"\" /></a> </div>\n");
      out.write("                            <div class=\"rating\">\n");
      out.write("                                <p>RATING</p>\n");
      out.write("                                <div class=\"stars\">\n");
      out.write("                                    <div class=\"stars-in\"> </div>\n");
      out.write("                                </div>\n");
      out.write("                                <span class=\"comments\">12</span> </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"cl\">&nbsp;</div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"box\">\n");
      out.write("                        <div class=\"head\">\n");
      out.write("                            <p class=\"text-right\"><a href=\"#\"><br/></a></p>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"movie\">\n");
      out.write("                            <div class=\"movie-image\"> <span class=\"play\"><span class=\"name\">The Kid Who Would be King</span></span> <a href=\"#\"><img src=\"css/images/KIDPOSTER.jpg\" alt=\"\" /></a> </div>\n");
      out.write("                            <div class=\"rating\">\n");
      out.write("                                <p>RATING</p>\n");
      out.write("                                <div class=\"stars\">\n");
      out.write("                                    <div class=\"stars-in\"> </div>\n");
      out.write("                                </div>\n");
      out.write("                                <span class=\"comments\">12</span> </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"movie\">\n");
      out.write("                            <div class=\"movie-image\"> <span class=\"play\"><span class=\"name\">Dumbo</span></span> <a href=\"#\"><img src=\"css/images/dumbposter.jpg\" alt=\"\" /></a> </div>\n");
      out.write("                            <div class=\"rating\">\n");
      out.write("                                <p>RATING</p>\n");
      out.write("                                <div class=\"stars\">\n");
      out.write("                                    <div class=\"stars-in\"> </div>\n");
      out.write("                                </div>\n");
      out.write("                                <span class=\"comments\">12</span> </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"movie\">\n");
      out.write("                            <div class=\"movie-image\"> <span class=\"play\"><span class=\"name\">Wonder Park</span></span> <a href=\"#\"><img src=\"css/images/wonderposter.jpg\" alt=\"\" /></a> </div>\n");
      out.write("                            <div class=\"rating\">\n");
      out.write("                                <p>RATING</p>\n");
      out.write("                                <div class=\"stars\">\n");
      out.write("                                    <div class=\"stars-in\"> </div>\n");
      out.write("                                </div>\n");
      out.write("                                <span class=\"comments\">12</span> </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"movie\">\n");
      out.write("                            <div class=\"movie-image\"> <span class=\"play\"><span class=\"name\">Stones</span></span> <a href=\"#\"><img src=\"css/images/stonesposter.jpg\" alt=\"\" /></a> </div>\n");
      out.write("                            <div class=\"rating\">\n");
      out.write("                                <p>RATING</p>\n");
      out.write("                                <div class=\"stars\">\n");
      out.write("                                    <div class=\"stars-in\"> </div>\n");
      out.write("                                </div>\n");
      out.write("                                <span class=\"comments\">12</span> </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"movie\">\n");
      out.write("                            <div class=\"movie-image\"> <span class=\"play\"><span class=\"name\">How to Train your Dragon: The Hidden World</span></span> <a href=\"#\"><img src=\"css/images/dragonPOS.jpg\" alt=\"\" /></a> </div>\n");
      out.write("                            <div class=\"rating\">\n");
      out.write("                                <p>RATING</p>\n");
      out.write("                                <div class=\"stars\">\n");
      out.write("                                    <div class=\"stars-in\"> </div>\n");
      out.write("                                </div>\n");
      out.write("                                <span class=\"comments\">12</span> </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"movie last\">\n");
      out.write("                            <div class=\"movie-image\"> <span class=\"play\"><span class=\"name\">Kesari(Hindi)</span></span> <a href=\"#\"><img src=\"css/images/kesiposter.jpg\" alt=\"\" /></a> </div>\n");
      out.write("                            <div class=\"rating\">\n");
      out.write("                                <p>RATING</p>\n");
      out.write("                                <div class=\"stars\">\n");
      out.write("                                    <div class=\"stars-in\"> </div>\n");
      out.write("                                </div>\n");
      out.write("                                <span class=\"comments\">12</span> </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"cl\">&nbsp;</div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"cl\">&nbsp;</div>\n");
      out.write("            </div>\n");
      out.write("            <div id=\"footer\">\n");
      out.write("                <p class=\"lf\">Copyright &copy; 2019 <a href=\"#\">Movie Buff</a> - All Rights Reserved</p>\n");
      out.write("                <div style=\"clear:both;\"></div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- END PAGE SOURCE -->\n");
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
