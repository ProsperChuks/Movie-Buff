package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;;
import struts.logAction.*;;
import struts.logAction;;

public final class profile_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 String driverName = "org.sqlite.JDBC";
String url = "jdbc:sqlite:C:/Users/FOCUS/Documents/NetBeansProjects/MBE2/MBF.db";
  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_j_set_var_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_j_out_value_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_j_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_j_out_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_j_set_var_value_nobody.release();
    _jspx_tagPool_j_out_value_nobody.release();
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
      if (_jspx_meth_j_set_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    <html>\n");
      out.write("        <head>\n");
      out.write("            <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("            <meta name=\"author\" content=\"prosper\">\n");
      out.write("            <title>Welcome ");
      if (_jspx_meth_j_out_0(_jspx_page_context))
        return;
      out.write("</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"fonts/font-awesome.min.css\" />\n");
      out.write("            <link rel=\"stylesheet\" href=\"css/tar.css\"/>\n");
      out.write("            <link rel=\"stylesheet\" href=\"css/linearicons.css\"/>\n");
      out.write("            <link rel=\"stylesheet\" href=\"css/bootstrap.css\"/>\n");
      out.write("            <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\"/>\n");
      out.write("            <link rel=\"stylesheet\" href=\"css/owl.carousel.css\"/>\n");
      out.write("            <link rel=\"stylesheet\" href=\"css/magnific-popup.css\"/>\n");
      out.write("            <link rel=\"stylesheet\" href=\"css/nice-select.css\"/>\n");
      out.write("            <link rel=\"stylesheet\" href=\"css/main.css\"/>\n");
      out.write("        </head>\n");
      out.write("        <body>\n");
      out.write("\n");
      out.write("            ");
      out.write("\n");
      out.write("            ");
      out.write("\n");
      out.write("\n");
      out.write("            <!-- Start Header Area -->\n");
      out.write("            <header class=\"default-header\">\n");
      out.write("                <nav class=\"navbar navbar-expand-lg navbar-light\">\n");
      out.write("                    <div class=\"container\">\n");
      out.write("                        <a class=\"navbar-brand\" href=\"home.jsp\">\n");
      out.write("                            <h3 style=\"color: white;\">Movie Buff Entertainment</h3>\n");
      out.write("                        </a>\n");
      out.write("                        <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\"\n");
      out.write("                                aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                            <span class=\"fa fa-bars\"></span>\n");
      out.write("                        </button>\n");
      out.write("\n");
      out.write("                        <div class=\"collapse navbar-collapse justify-content-end align-items-center\" id=\"navbarSupportedContent\">\n");
      out.write("                            <ul class=\"navbar-nav navbar-right\">\n");
      out.write("                                <li><a href=\"home.jsp\">Home</a></li>\n");
      out.write("                                <li><a href=\"nowShowing.jsp\">In Theaters</a></li>\n");
      out.write("                                <li><a href=\"comingSoon.jsp\">Coming Soon</a></li>\n");
      out.write("                                <li><a href=\"bookTick.jsp\">Book Ticket</a></li>\n");
      out.write("                                <li><a href=\"contact.jsp\">Contact</a></li>\n");
      out.write("                                <li><a class=\"active\" href=\"profile.jsp\"><i class=\"fa fa-user-circle fa-2x\"></i></a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </nav>\n");
      out.write("            </header>\n");
      out.write("            <!-- End Header Area -->\n");
      out.write("\n");
      out.write("            <!-- start banner Area -->\n");
      out.write("            <section class=\"home-banner-area relative\" id=\"home\" data-parallax=\"scroll\" style=\"margin-top: -120px !important;\">\n");
      out.write("                <div class=\"overlay-bg overlay\"></div>\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"row fullscreen\">\n");
      out.write("                        <div class=\"jos banner-content col-lg-12\">\n");
      out.write("                            <center>\n");
      out.write("                                <i style=\"color: #ffffff !important; font-size: 190px;\" class=\"fa fa-user-circle-o\"></i>\n");
      out.write("                                <br><br><br>\n");
      out.write("                                <h3>User Profile: <span style=\"color: whitesmoke;\">");
      if (_jspx_meth_j_out_1(_jspx_page_context))
        return;
      out.write("</span></h3>\n");
      out.write("                                    <br>\n");
      out.write("                                    <div class=\"container\" style=\"color: whitesmoke;\">\n");
      out.write("                                        <br>\n");
      out.write("\n");
      out.write("                                    <!-- Java Database Output Variables //-->\n");
      out.write("                                    \n");
      out.write("                                    ");

                                        try {
                                            logAction la = new logAction();
                                            Connection con = null;
                                            PreparedStatement ps = null;
                                            Class.forName(driverName);
                                            con = DriverManager.getConnection(url);
                                            con.setAutoCommit(false);
                                            String sql = "SELECT fullname,email,phone FROM UserR WHERE Username='" + la.loggedUser + "';";
                                            ps = con.prepareStatement(sql);
                                            ResultSet rs = ps.executeQuery();
                                    
      out.write("\n");
      out.write("                                    ");

                                        String fullname = rs.getString("fullname").toLowerCase();
                                    
      out.write("\n");
      out.write("                                    <label style=\"margin-left: -190px; color: #263a4e;\" for=\"fullname\">Fullname: </label>\n");
      out.write("                                    <p>");
      //  j:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_j_out_2 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_j_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_j_out_2.setPageContext(_jspx_page_context);
      _jspx_th_j_out_2.setParent(null);
      _jspx_th_j_out_2.setValue(fullname);
      int _jspx_eval_j_out_2 = _jspx_th_j_out_2.doStartTag();
      if (_jspx_th_j_out_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_j_out_value_nobody.reuse(_jspx_th_j_out_2);
        return;
      }
      _jspx_tagPool_j_out_value_nobody.reuse(_jspx_th_j_out_2);
      out.write(" </p>\n");
      out.write("                                    ");

                                        String email = rs.getString("Email");
                                    
      out.write("\n");
      out.write("                                    <label style=\"margin-left: -215px; color: #263a4e;\" for=\"email\">E-mail: </label>\n");
      out.write("                                    <p>");
      //  j:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_j_out_3 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_j_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_j_out_3.setPageContext(_jspx_page_context);
      _jspx_th_j_out_3.setParent(null);
      _jspx_th_j_out_3.setValue(email);
      int _jspx_eval_j_out_3 = _jspx_th_j_out_3.doStartTag();
      if (_jspx_th_j_out_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_j_out_value_nobody.reuse(_jspx_th_j_out_3);
        return;
      }
      _jspx_tagPool_j_out_value_nobody.reuse(_jspx_th_j_out_3);
      out.write("</p>\n");
      out.write("                                    ");

                                        String phone = rs.getString("Phone");
                                    
      out.write("\n");
      out.write("                                    <label style=\"margin-left: -150px; color: #263a4e;\" for=\"phone\">Mobile Number: </label>\n");
      out.write("                                    <p>");
      //  j:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_j_out_4 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_j_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_j_out_4.setPageContext(_jspx_page_context);
      _jspx_th_j_out_4.setParent(null);
      _jspx_th_j_out_4.setValue(phone);
      int _jspx_eval_j_out_4 = _jspx_th_j_out_4.doStartTag();
      if (_jspx_th_j_out_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_j_out_value_nobody.reuse(_jspx_th_j_out_4);
        return;
      }
      _jspx_tagPool_j_out_value_nobody.reuse(_jspx_th_j_out_4);
      out.write("</p>\n");
      out.write("                                    ");

                                        } catch (SQLException es) {
                                            System.err.println(es.getMessage());
                                        }
                                    
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                                <a href=\"index.jsp\" class=\"btn btn-danger\">Sign Out</a>\n");
      out.write("                            </center>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </section>\n");
      out.write("            <!-- End banner Area -->\n");
      out.write("\n");
      out.write("            <!-- start footer Area -->\n");
      out.write("            <footer class=\"footer-area section-gap\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"row footer-bottom d-flex justify-content-between\">\n");
      out.write("                        <h4 class=\"lf\">Copyright &copy; 2019 <a href=\"home.jsp\">Movie Buff</a> - All Rights Reserved</h4>\n");
      out.write("                        <div style=\"clear:both;\"></div>\n");
      out.write("                        <div class=\"col-lg-4 col-sm-12 footer-social\">\n");
      out.write("                            <a href=\"#\"><i class=\"fa fa-car\"></i></a>\n");
      out.write("                            <a href=\"#\"><i class=\"fa fa-twitter\"></i></a>\n");
      out.write("                            <a href=\"#\"><i class=\"fa fa-dribbble\"></i></a>\n");
      out.write("                            <a href=\"#\"><i class=\"fa fa-linkedin\"></i></a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </footer>\n");
      out.write("            <!-- End footer Area -->\n");
      out.write("\n");
      out.write("        </body>\n");
      out.write("\n");
      out.write("    <script src=\"js/jquery.min.js\"></script>\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("    <script src=\"js/vendor/jquery-2.2.4.min.js\"></script>\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.11.0/umd/popper.min.js\" integrity=\"sha384-b/U6ypiBEHpOf/4+1nzFpr53nxSS+GLCkfwBdFNTxtclqqenISfwAzpKaMNFNmj4\"\n");
      out.write("    crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"js/vendor/bootstrap.min.js\"></script>\n");
      out.write("    <script src=\"js/jquery.ajaxchimp.min.js\"></script>\n");
      out.write("    <script src=\"js/parallax.min.js\"></script>\n");
      out.write("    <script src=\"js/owl.carousel.min.js\"></script>\n");
      out.write("    <script src=\"js/isotope.pkgd.min.js\"></script>\n");
      out.write("    <script src=\"js/jquery.nice-select.min.js\"></script>\n");
      out.write("    <script src=\"js/jquery.magnific-popup.min.js\"></script>\n");
      out.write("    <script src=\"js/jquery.sticky.js\"></script>\n");
      out.write("    <script src=\"js/main.js\"></script>\n");
      out.write("\n");
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

  private boolean _jspx_meth_j_set_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  j:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_j_set_0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_j_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_j_set_0.setPageContext(_jspx_page_context);
    _jspx_th_j_set_0.setParent(null);
    _jspx_th_j_set_0.setVar("user");
    _jspx_th_j_set_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.usr}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_j_set_0 = _jspx_th_j_set_0.doStartTag();
    if (_jspx_th_j_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_j_set_var_value_nobody.reuse(_jspx_th_j_set_0);
      return true;
    }
    _jspx_tagPool_j_set_var_value_nobody.reuse(_jspx_th_j_set_0);
    return false;
  }

  private boolean _jspx_meth_j_out_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  j:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_j_out_0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_j_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_j_out_0.setPageContext(_jspx_page_context);
    _jspx_th_j_out_0.setParent(null);
    _jspx_th_j_out_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_j_out_0 = _jspx_th_j_out_0.doStartTag();
    if (_jspx_th_j_out_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_j_out_value_nobody.reuse(_jspx_th_j_out_0);
      return true;
    }
    _jspx_tagPool_j_out_value_nobody.reuse(_jspx_th_j_out_0);
    return false;
  }

  private boolean _jspx_meth_j_out_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  j:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_j_out_1 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_j_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_j_out_1.setPageContext(_jspx_page_context);
    _jspx_th_j_out_1.setParent(null);
    _jspx_th_j_out_1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_j_out_1 = _jspx_th_j_out_1.doStartTag();
    if (_jspx_th_j_out_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_j_out_value_nobody.reuse(_jspx_th_j_out_1);
      return true;
    }
    _jspx_tagPool_j_out_value_nobody.reuse(_jspx_th_j_out_1);
    return false;
  }
}
