package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("        <meta name=\"author\" content=\"prosper\">\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <title>Movie Buff Entertainment</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/tar.css\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/linearicons.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/owl.carousel.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/magnific-popup.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/nice-select.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/main.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
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
      out.write("                            <li><a class=\"active\" href=\"home.jsp\">Home</a></li>\n");
      out.write("                            <li><a href=\"#\">In Theaters</a></li>\n");
      out.write("                            <li><a href=\"#\">Coming Soon</a></li>\n");
      out.write("                            <li><a href=\"bookTicket.jsp\">Book Ticket</a></li>\n");
      out.write("                            <li><a href=\"contact.jsp\">Contact</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </nav>\n");
      out.write("        </header>\n");
      out.write("        <!-- End Header Area -->\n");
      out.write("\n");
      out.write("        <!-- start banner Area -->\n");
      out.write("        <section class=\"home-banner-area relative\" id=\"home\" data-parallax=\"scroll\" data-image-src=\"img/header-bg.jpg\">\n");
      out.write("            <div class=\"overlay-bg overlay\"></div>\n");
      out.write("            <h1 class=\"template-name\">Movie Buff</h1>\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row fullscreen\">\n");
      out.write("                    <div class=\"banner-content col-lg-12\">\n");
      out.write("                        <p>Feel The Movie</p>\n");
      out.write("                        <h1>\n");
      out.write("                            4Dx <br>\n");
      out.write("                            Cinema\n");
      out.write("                        </h1>\n");
      out.write("                        <a href=\"bookTicket.jsp\" class=\"primary-btn\">Book Ticket</a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"head-bottom-meta\">\n");
      out.write("                <div class=\"d-flex meta-left no-padding\">\n");
      out.write("                    <a href=\"#\"><span class=\"fa fa-facebook-f\"></span></a>\n");
      out.write("                    <a href=\"#\"><span class=\"fa fa-twitter\"></span></a>\n");
      out.write("                    <a href=\"#\"><span class=\"fa fa-instagram\"></span></a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("        <!-- End banner Area -->\n");
      out.write("\n");
      out.write("        <!-- Start trailers Area -->\n");
      out.write("        <section class=\"features-area section-gap-top\" id=\"news\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <center><h1>Latest Trailers</h1></center>\n");
      out.write("                <br><br>\n");
      out.write("                <div class=\"row feature_inner\">\n");
      out.write("                    <div class=\"col-lg-3 col-md-6\">\n");
      out.write("                        <div class=\"feature-item\">\n");
      out.write("                            <div><img src=\"css/images/lionKing.jpeg\" height=\"244\" width=\"182\"/></div>\n");
      out.write("                            <br>\n");
      out.write("                            <h4>The Lion King</h4>\n");
      out.write("                            <p>Release Date: July 19, 2019</p>\n");
      out.write("                            <br>\n");
      out.write("                            <button data-toggle=\"modal\" data-target=\"#myModal\" class=\"btn btn-success\">Watch Trailer</button><br><br>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"col-lg-3 col-md-6\">\n");
      out.write("                        <div class=\"feature-item\">\n");
      out.write("                            <div><img src=\"css/images/movie2.jpeg\" height=\"244\" width=\"182\"/></div>\n");
      out.write("                            <br>\n");
      out.write("                            <h4>Pokemon: Detective Pikachu</h4>\n");
      out.write("                            <p>Release Date: May 3, 2019</p>\n");
      out.write("                            <button data-toggle=\"modal\" data-target=\"#myModal2\" class='btn btn-success'>Watch Trailer</button><br><br>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-lg-3 col-md-6\">\n");
      out.write("                        <div class=\"feature-item\">\n");
      out.write("                            <div><img src=\"css/images/aladdin.png\" height=\"244\" width=\"182\"/></div>\n");
      out.write("                            <br>\n");
      out.write("                            <h4>Aladdin</h4>\n");
      out.write("                            <p>Release Date: May 22, 2019</p>\n");
      out.write("                            <br>\n");
      out.write("                            <button data-toggle=\"modal\" data-target=\"#myModal3\" class='btn btn-success'>Watch Trailer</button><br><br>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-lg-3 col-md-6\">\n");
      out.write("                        <div class=\"feature-item\">\n");
      out.write("                            <div><img src=\"css/images/frozen2.jpg\" height=\"244\" width=\"182\"/></div>\n");
      out.write("                            <br>\n");
      out.write("                            <h4>Frozen 2</h4>\n");
      out.write("                            <p>Release Date: November 22, 2019</p>\n");
      out.write("                            <button data-toggle=\"modal\" data-target=\"#myModal4\" class='btn btn-success'>Watch Trailer</button><br><br>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("        <!-- End trailers Area -->\n");
      out.write("\n");
      out.write("        <!-- Start In Theaters Area -->\n");
      out.write("        <section class=\"about-area section-gap\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <center><h1>In Theaters</h1></center>\n");
      out.write("                <br><br>\n");
      out.write("                <div class=\"row feature_inner\">\n");
      out.write("                    <div class=\"col-lg-3 col-md-6\">\n");
      out.write("                        <div class=\"feature-item\">\n");
      out.write("                            <div><img src=\"css/images/movie6.jpeg\" height=\"244\" width=\"182\"/></div>\n");
      out.write("                            <br>\n");
      out.write("                            <h4>Shazam</h4>\n");
      out.write("                            <p>Release Date: April 5, 2019</p>\n");
      out.write("                            <br>\n");
      out.write("                            <button data-toggle=\"modal\" data-target=\"#myModal5\" class='btn btn-success'>Watch Trailer</button><br><br>\n");
      out.write("                            <a href=\"#\" id=\"bt\">Book Ticket</a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-lg-3 col-md-6\">\n");
      out.write("                        <div class=\"feature-item\">\n");
      out.write("                            <div><img src=\"css/images/movie4.jpeg\" height=\"244\" width=\"182\"/></div>\n");
      out.write("                            <br>\n");
      out.write("                            <h4>Alita: Battle Angel</h4>\n");
      out.write("                            <p>Release Date: February 13, 2019</p>\n");
      out.write("                            <button data-toggle=\"modal\" data-target=\"#myModal6\" class='btn btn-success'>Watch Trailer</button><br><br>\n");
      out.write("                            <a href=\"#\" id=\"bt\">Book Ticket</a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-lg-3 col-md-6\">\n");
      out.write("                        <div class=\"feature-item\">\n");
      out.write("                            <div><img src=\"css/images/kesiposter.jpg\" height=\"244\" width=\"182\"/></div>\n");
      out.write("                            <br>\n");
      out.write("                            <h4>Kesari (Hindi)</h4>\n");
      out.write("                            <p>Release Date: March 22, 2019</p>\n");
      out.write("                            <br>\n");
      out.write("                            <button data-toggle=\"modal\" data-target=\"#myModal7\" class='btn btn-success'>Watch Trailer</button><br><br>\n");
      out.write("                            <a href=\"#\" id=\"bt\">Book Ticket</a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-lg-3 col-md-6\">\n");
      out.write("                        <div class=\"feature-item\">\n");
      out.write("                            <div><img src=\"css/images/usposter.jpg\" height=\"244\" width=\"182\"/></div>\n");
      out.write("                            <br>\n");
      out.write("                            <h4>Us</h4>\n");
      out.write("                            <p>Release Date: March 29, 2019</p>\n");
      out.write("                            <br>\n");
      out.write("                            <button data-toggle=\"modal\" data-target=\"#myModal8\" class='btn btn-success'>Watch Trailer</button><br><br>\n");
      out.write("                            <a href=\"#\" id=\"bt\">Book Ticket</a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("        <!-- End In Theaters Area -->\n");
      out.write("        \n");
      out.write("        <!-- Start trailers Area -->\n");
      out.write("        <section class=\"features-area section-gap-top\" id=\"news\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <center><h1>Latest Trailers</h1></center>\n");
      out.write("                <br><br>\n");
      out.write("                <div class=\"row feature_inner\">\n");
      out.write("                    <div class=\"col-lg-3 col-md-6\">\n");
      out.write("                        <div class=\"feature-item\">\n");
      out.write("                            <div><img src=\"css/images/lionKing.jpeg\" height=\"244\" width=\"182\"/></div>\n");
      out.write("                            <br>\n");
      out.write("                            <h4>The Lion King</h4>\n");
      out.write("                            <p>Release Date: July 19, 2019</p>\n");
      out.write("                            <br>\n");
      out.write("                            <button data-toggle=\"modal\" data-target=\"#myModal\" class=\"btn btn-success\">Watch Trailer</button><br><br>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"col-lg-3 col-md-6\">\n");
      out.write("                        <div class=\"feature-item\">\n");
      out.write("                            <div><img src=\"css/images/movie2.jpeg\" height=\"244\" width=\"182\"/></div>\n");
      out.write("                            <br>\n");
      out.write("                            <h4>Pokemon: Detective Pikachu</h4>\n");
      out.write("                            <p>Release Date: May 3, 2019</p>\n");
      out.write("                            <button data-toggle=\"modal\" data-target=\"#myModal2\" class='btn btn-success'>Watch Trailer</button><br><br>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-lg-3 col-md-6\">\n");
      out.write("                        <div class=\"feature-item\">\n");
      out.write("                            <div><img src=\"css/images/aladdin.png\" height=\"244\" width=\"182\"/></div>\n");
      out.write("                            <br>\n");
      out.write("                            <h4>Aladdin</h4>\n");
      out.write("                            <p>Release Date: May 22, 2019</p>\n");
      out.write("                            <br>\n");
      out.write("                            <button data-toggle=\"modal\" data-target=\"#myModal3\" class='btn btn-success'>Watch Trailer</button><br><br>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-lg-3 col-md-6\">\n");
      out.write("                        <div class=\"feature-item\">\n");
      out.write("                            <div><img src=\"css/images/frozen2.jpg\" height=\"244\" width=\"182\"/></div>\n");
      out.write("                            <br>\n");
      out.write("                            <h4>Frozen 2</h4>\n");
      out.write("                            <p>Release Date: November 22, 2019</p>\n");
      out.write("                            <button data-toggle=\"modal\" data-target=\"#myModal4\" class='btn btn-success'>Watch Trailer</button><br><br>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("        <!-- End trailers Area -->\n");
      out.write("\n");
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
      out.write("\n");
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
      out.write("\n");
      out.write("        <!-- Modals -->\n");
      out.write("        <div id=\"myModal\" class=\"modal fade\" role=\"dialog\">\n");
      out.write("            <div class=\"modal-dialog\">\n");
      out.write("                <div class=\"modal-content\">\n");
      out.write("                    <div class=\"modal-header\">\n");
      out.write("                        <button style=\"color: #ffffff !important;\" class=\"close\" data-dismiss=\"modal\">&times;</button>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"modal-body\">\n");
      out.write("                        <iframe src=\"http://localhost:8080/MBE2/css/images/water.gif\" height=\"250\" width=\"450\"></iframe>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"modal-footer\"></div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <div id=\"myModal2\" class=\"modal fade\" role=\"dialog\">\n");
      out.write("            <div class=\"modal-dialog\">\n");
      out.write("                <div class=\"modal-content\">\n");
      out.write("                    <div class=\"modal-header\">\n");
      out.write("                        <button style=\"color: #ffffff !important;\" class=\"close\" data-dismiss=\"modal\">&times;</button>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"modal-body\">\n");
      out.write("                        <iframe src=\"http://localhost:8080/MBE2/css/images/diamond.gif\" height=\"250\" width=\"450\"></iframe>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"modal-footer\"></div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <div id=\"myModal3\" class=\"modal fade\" role=\"dialog\">\n");
      out.write("            <div class=\"modal-dialog\">\n");
      out.write("                <div class=\"modal-content\">\n");
      out.write("                    <div class=\"modal-header\">\n");
      out.write("                        <button style=\"color: #ffffff !important;\" class=\"close\" data-dismiss=\"modal\">&times;</button>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"modal-body\">\n");
      out.write("                        <iframe src=\"http://localhost:8080/MBE2/css/images/water.gif\" height=\"250\" width=\"450\"></iframe>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"modal-footer\"></div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <div id=\"myModal4\" class=\"modal fade\" role=\"dialog\">\n");
      out.write("            <div class=\"modal-dialog\">\n");
      out.write("                <div class=\"modal-content\">\n");
      out.write("                    <div class=\"modal-header\">\n");
      out.write("                        <button style=\"color: #ffffff !important;\" class=\"close\" data-dismiss=\"modal\">&times;</button>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"modal-body\">\n");
      out.write("                        <iframe src=\"http://localhost:8080/MBE2/css/images/diamond.gif\" height=\"250\" width=\"450\"></iframe>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"modal-footer\"></div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <div id=\"myModal5\" class=\"modal fade\" role=\"dialog\">\n");
      out.write("            <div class=\"modal-dialog\">\n");
      out.write("                <div class=\"modal-content\">\n");
      out.write("                    <div class=\"modal-header\">\n");
      out.write("                        <button style=\"color: #ffffff !important;\" class=\"close\" data-dismiss=\"modal\">&times;</button>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"modal-body\">\n");
      out.write("                        <iframe src=\"http://localhost:8080/MBE2/css/images/water.gif\" height=\"250\" width=\"450\"></iframe>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"modal-footer\"></div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <div id=\"myModal6\" class=\"modal fade\" role=\"dialog\">\n");
      out.write("            <div class=\"modal-dialog\">\n");
      out.write("                <div class=\"modal-content\">\n");
      out.write("                    <div class=\"modal-header\">\n");
      out.write("                        <button style=\"color: #ffffff !important;\" class=\"close\" data-dismiss=\"modal\">&times;</button>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"modal-body\">\n");
      out.write("                        <iframe src=\"http://localhost:8080/MBE2/css/images/water.gif\" height=\"250\" width=\"450\"></iframe>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"modal-footer\"></div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <div id=\"myModal7\" class=\"modal fade\" role=\"dialog\">\n");
      out.write("            <div class=\"modal-dialog\">\n");
      out.write("                <div class=\"modal-content\">\n");
      out.write("                    <div class=\"modal-header\">\n");
      out.write("                        <button style=\"color: #ffffff !important;\" class=\"close\" data-dismiss=\"modal\">&times;</button>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"modal-body\">\n");
      out.write("                        <iframe src=\"http://localhost:8080/MBE2/css/images/water.gif\" height=\"250\" width=\"450\"></iframe>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"modal-footer\"></div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <div id=\"myModal8\" class=\"modal fade\" role=\"dialog\">\n");
      out.write("            <div class=\"modal-dialog\">\n");
      out.write("                <div class=\"modal-content\">\n");
      out.write("                    <div class=\"modal-header\">\n");
      out.write("                        <button style=\"color: #ffffff !important;\" class=\"close\" data-dismiss=\"modal\">&times;</button>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"modal-body\">\n");
      out.write("                        <iframe src=\"http://localhost:8080/MBE2/css/images/water.gif\" height=\"250\" width=\"450\"></iframe>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"modal-footer\"></div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </body>\n");
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
