package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;;
import struts.ticketBean;;
import org.apache.struts.action.ActionForm;;

public final class bookTick_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 String driverName = "org.sqlite.JDBC";
String url = "jdbc:sqlite:C:/Users/FOCUS/Documents/NetBeansProjects/MBE2/MBF.db";
  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_j_set_var_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_text_value_property_disabled_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_reset_styleClass;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_option_value;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_form_method_action;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_submit_styleClass;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_select_property;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_text_property_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_j_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_text_value_property_disabled_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_reset_styleClass = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_option_value = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_form_method_action = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_submit_styleClass = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_select_property = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_text_property_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_j_set_var_value_nobody.release();
    _jspx_tagPool_html_text_value_property_disabled_nobody.release();
    _jspx_tagPool_html_reset_styleClass.release();
    _jspx_tagPool_html_option_value.release();
    _jspx_tagPool_html_form_method_action.release();
    _jspx_tagPool_html_submit_styleClass.release();
    _jspx_tagPool_html_select_property.release();
    _jspx_tagPool_html_text_property_nobody.release();
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      if (_jspx_meth_j_set_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("        <meta name=\"author\" content=\"prosper\">\r\n");
      out.write("        <title>Book Ticket - Movie Buff</title>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"fonts/font-awesome.min.css\" />\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/tar.css\"/>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/linearicons.css\"/>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.css\"/>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\"/>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/owl.carousel.css\"/>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/magnific-popup.css\"/>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/nice-select.css\"/>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/main.css\"/>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <!-- Start Header Area -->\r\n");
      out.write("        <header class=\"default-header\">\r\n");
      out.write("            <nav class=\"navbar navbar-expand-lg navbar-light\">\r\n");
      out.write("                <div class=\"container\">\r\n");
      out.write("                    <a class=\"navbar-brand\" href=\"home.jsp\">\r\n");
      out.write("                        <h3 style=\"color: white;\">Movie Buff Entertainment</h3>\r\n");
      out.write("                    </a>\r\n");
      out.write("                    <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\"\r\n");
      out.write("                            aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("                        <span class=\"fa fa-bars\"></span>\r\n");
      out.write("                    </button>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"collapse navbar-collapse justify-content-end align-items-center\" id=\"navbarSupportedContent\">\r\n");
      out.write("                        <ul class=\"navbar-nav navbar-right\">\r\n");
      out.write("                            <li><a href=\"home.jsp\">Home</a></li>\r\n");
      out.write("                            <li><a href=\"#\">In Theaters</a></li>\r\n");
      out.write("                            <li><a href=\"#\">Coming Soon</a></li>\r\n");
      out.write("                            <li><a class=\"active\" href=\"bookTick.jsp\">Book Ticket</a></li>\r\n");
      out.write("                            <li><a href=\"contact.jsp\">Contact</a></li>\r\n");
      out.write("                            <li><a href=\"profile.jsp\"><i class=\"fa fa-user-circle fa-2x\"></i></a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </nav>\r\n");
      out.write("        </header>\r\n");
      out.write("        <!-- End Header Area -->\r\n");
      out.write("\r\n");
      out.write("        <!-- start banner Area -->\r\n");
      out.write("        <section class=\"home-banner-area relative\" id=\"home\" data-parallax=\"scroll\" data-image-src=\"img/shazam.jpg\">\r\n");
      out.write("            <div class=\"overlay-bg overlay\"></div>\r\n");
      out.write("            <h1 class=\"template-name\">Movie Buff</h1>\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"row fullscreen\">\r\n");
      out.write("                    <div class=\"jos banner-content col-lg-12\">\r\n");
      out.write("                        <p>Book Your</p>\r\n");
      out.write("                        <h1>\r\n");
      out.write("                            Tickets <br>\r\n");
      out.write("                            Here!\r\n");
      out.write("                        </h1>\r\n");
      out.write("                        <a href=\"#fro\"><i class=\"fa fa-angle-double-down fa-3x\" style=\"color: #fff;\"></i></a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </section>\r\n");
      out.write("        <!-- End banner Area -->\r\n");
      out.write("\r\n");
      out.write("        <!-- Start Booking Form Area -->\r\n");
      out.write("    <center>\r\n");
      out.write("        <section class=\"about-area section-gap\" id=\"fro\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <center><h1>Book Tickets Now!</h1></center>\r\n");
      out.write("                <br><br>\r\n");
      out.write("                <div class=\"container\">\r\n");
      out.write("                    ");
      //  html:form
      org.apache.struts.taglib.html.FormTag _jspx_th_html_form_0 = (org.apache.struts.taglib.html.FormTag) _jspx_tagPool_html_form_method_action.get(org.apache.struts.taglib.html.FormTag.class);
      _jspx_th_html_form_0.setPageContext(_jspx_page_context);
      _jspx_th_html_form_0.setParent(null);
      _jspx_th_html_form_0.setMethod("post");
      _jspx_th_html_form_0.setAction("/book");
      int _jspx_eval_html_form_0 = _jspx_th_html_form_0.doStartTag();
      if (_jspx_eval_html_form_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                        <div>\r\n");
          out.write("                            <label for=\"username\">Username: </label>\r\n");
          out.write("                            ");
          if (_jspx_meth_html_text_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("                        </div>\r\n");
          out.write("                            <br>\r\n");
          out.write("                        <div>\r\n");
          out.write("                            <label for=\"movie\">Movie: </label>\r\n");
          out.write("                            ");

                                try {
                                    Connection con = null;
                                    PreparedStatement ps = null;
                                    Class.forName(driverName);
                                    con = DriverManager.getConnection(url);
                                    String sql = "SELECT MovieName FROM Movie";
                                    ps = con.prepareStatement(sql);
                                    ResultSet rs = ps.executeQuery();
                            
          out.write("\r\n");
          out.write("                            ");
          //  html:select
          org.apache.struts.taglib.html.SelectTag _jspx_th_html_select_0 = (org.apache.struts.taglib.html.SelectTag) _jspx_tagPool_html_select_property.get(org.apache.struts.taglib.html.SelectTag.class);
          _jspx_th_html_select_0.setPageContext(_jspx_page_context);
          _jspx_th_html_select_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
          _jspx_th_html_select_0.setProperty("movie");
          int _jspx_eval_html_select_0 = _jspx_th_html_select_0.doStartTag();
          if (_jspx_eval_html_select_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_html_select_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_html_select_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_html_select_0.doInitBody();
            }
            do {
              out.write("\r\n");
              out.write("                                ");
              if (_jspx_meth_html_option_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_html_select_0, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("                                ");

                                    while (rs.next()) {
                                        String fmovie = rs.getString("moviename");
                                
              out.write("\r\n");
              out.write("                                ");
              //  html:option
              org.apache.struts.taglib.html.OptionTag _jspx_th_html_option_1 = (org.apache.struts.taglib.html.OptionTag) _jspx_tagPool_html_option_value.get(org.apache.struts.taglib.html.OptionTag.class);
              _jspx_th_html_option_1.setPageContext(_jspx_page_context);
              _jspx_th_html_option_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_select_0);
              _jspx_th_html_option_1.setValue(fmovie);
              int _jspx_eval_html_option_1 = _jspx_th_html_option_1.doStartTag();
              if (_jspx_eval_html_option_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                if (_jspx_eval_html_option_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_html_option_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_html_option_1.doInitBody();
                }
                do {
                  out.print(fmovie);
                  int evalDoAfterBody = _jspx_th_html_option_1.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
                if (_jspx_eval_html_option_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
                  out = _jspx_page_context.popBody();
              }
              if (_jspx_th_html_option_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _jspx_tagPool_html_option_value.reuse(_jspx_th_html_option_1);
                return;
              }
              _jspx_tagPool_html_option_value.reuse(_jspx_th_html_option_1);
              out.write("\r\n");
              out.write("                                ");

                                    }
                                
              out.write("\r\n");
              out.write("                            ");
              int evalDoAfterBody = _jspx_th_html_select_0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_html_select_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
              out = _jspx_page_context.popBody();
          }
          if (_jspx_th_html_select_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_html_select_property.reuse(_jspx_th_html_select_0);
            return;
          }
          _jspx_tagPool_html_select_property.reuse(_jspx_th_html_select_0);
          out.write("\r\n");
          out.write("                            ");

                                } catch (SQLException sqe) {
                                    out.println(sqe);
                                }
                            
          out.write("\r\n");
          out.write("                        </div>\r\n");
          out.write("                        <br>\r\n");
          out.write("                        <div>\r\n");
          out.write("                            <label for=\"date\">Date: </label>\r\n");
          out.write("                            <br>\r\n");
          out.write("                            ");
          if (_jspx_meth_html_text_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("                        </div>\r\n");
          out.write("                            <br>\r\n");
          out.write("                        <div>\r\n");
          out.write("                            <label for=\"time\">Time:</label>\r\n");
          out.write("                                <br>\r\n");
          out.write("                            ");
          if (_jspx_meth_html_text_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("                        </div>\r\n");
          out.write("                            <br>\r\n");
          out.write("                        <div>\r\n");
          out.write("                            <label for=\"class\">Class: </label>\r\n");
          out.write("                            ");
          if (_jspx_meth_html_select_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("                                ");

                                ticketBean tb = new ticketBean();
                                String conv = String.valueOf(tb);

                                if(tb.getClassT() == "Platinum"){
                                    tb.setCost("$100");
                                }else if(tb.getClassT() == "Gold"){
                                    tb.setCost("$50");
                                }else if(tb.getClassT() == "Silver"){
                                    tb.setCost("$20");
                                }
                            
          out.write("\r\n");
          out.write("                        </div>\r\n");
          out.write("                            <br>\r\n");
          out.write("                        <div>\r\n");
          out.write("                            <label for=\"cost\">Cost: </label>\r\n");
          out.write("                                <br>\r\n");
          out.write("                                \r\n");
          out.write("                                ");
          if (_jspx_meth_html_text_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("                        </div>\r\n");
          out.write("                            <br>\r\n");
          out.write("                            <br>\r\n");
          out.write("                        <div class=\"col-lg-12\">\r\n");
          out.write("                            ");
          if (_jspx_meth_html_submit_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("                                &nbsp;\r\n");
          out.write("                            ");
          if (_jspx_meth_html_reset_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_html_form_0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("                        </div>\r\n");
          out.write("                    ");
          int evalDoAfterBody = _jspx_th_html_form_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_html_form_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_html_form_method_action.reuse(_jspx_th_html_form_0);
        return;
      }
      _jspx_tagPool_html_form_method_action.reuse(_jspx_th_html_form_0);
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </section>\r\n");
      out.write("    </center>\r\n");
      out.write("    <!-- End Booking Form Area -->\r\n");
      out.write("\r\n");
      out.write("    <!-- start footer Area -->\r\n");
      out.write("    <footer class=\"footer-area section-gap\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"row footer-bottom d-flex justify-content-between\">\r\n");
      out.write("                <h4 class=\"lf\">Copyright &copy; 2019 <a href=\"home.jsp\">Movie Buff</a> - All Rights Reserved</h4>\r\n");
      out.write("                <div style=\"clear:both;\"></div>\r\n");
      out.write("                <div class=\"col-lg-4 col-sm-12 footer-social\">\r\n");
      out.write("                    <a href=\"#\"><i class=\"fa fa-car\"></i></a>\r\n");
      out.write("                    <a href=\"#\"><i class=\"fa fa-twitter\"></i></a>\r\n");
      out.write("                    <a href=\"#\"><i class=\"fa fa-dribbble\"></i></a>\r\n");
      out.write("                    <a href=\"#\"><i class=\"fa fa-linkedin\"></i></a>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </footer>\r\n");
      out.write("    <!-- End footer Area -->\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("<script src=\"js/jquery.min.js\"></script>\r\n");
      out.write("<script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("<script src=\"js/vendor/jquery-2.2.4.min.js\"></script>\r\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.11.0/umd/popper.min.js\" integrity=\"sha384-b/U6ypiBEHpOf/4+1nzFpr53nxSS+GLCkfwBdFNTxtclqqenISfwAzpKaMNFNmj4\"\r\n");
      out.write("crossorigin=\"anonymous\"></script>\r\n");
      out.write("<script src=\"js/vendor/bootstrap.min.js\"></script>\r\n");
      out.write("<script src=\"js/jquery.ajaxchimp.min.js\"></script>\r\n");
      out.write("<script src=\"js/parallax.min.js\"></script>\r\n");
      out.write("<script src=\"js/owl.carousel.min.js\"></script>\r\n");
      out.write("<script src=\"js/isotope.pkgd.min.js\"></script>\r\n");
      out.write("<script src=\"js/jquery.nice-select.min.js\"></script>\r\n");
      out.write("<script src=\"js/jquery.magnific-popup.min.js\"></script>\r\n");
      out.write("<script src=\"js/jquery.sticky.js\"></script>\r\n");
      out.write("<script src=\"js/main.js\"></script>\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
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

  private boolean _jspx_meth_html_text_0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_text_0 = (org.apache.struts.taglib.html.TextTag) _jspx_tagPool_html_text_value_property_disabled_nobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_text_0.setPageContext(_jspx_page_context);
    _jspx_th_html_text_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_text_0.setProperty("username");
    _jspx_th_html_text_0.setDisabled(true);
    _jspx_th_html_text_0.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_html_text_0 = _jspx_th_html_text_0.doStartTag();
    if (_jspx_th_html_text_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_text_value_property_disabled_nobody.reuse(_jspx_th_html_text_0);
      return true;
    }
    _jspx_tagPool_html_text_value_property_disabled_nobody.reuse(_jspx_th_html_text_0);
    return false;
  }

  private boolean _jspx_meth_html_option_0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_select_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:option
    org.apache.struts.taglib.html.OptionTag _jspx_th_html_option_0 = (org.apache.struts.taglib.html.OptionTag) _jspx_tagPool_html_option_value.get(org.apache.struts.taglib.html.OptionTag.class);
    _jspx_th_html_option_0.setPageContext(_jspx_page_context);
    _jspx_th_html_option_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_select_0);
    _jspx_th_html_option_0.setValue("Select Movie");
    int _jspx_eval_html_option_0 = _jspx_th_html_option_0.doStartTag();
    if (_jspx_eval_html_option_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_option_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_option_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_option_0.doInitBody();
      }
      do {
        out.write(" Select Movie");
        int evalDoAfterBody = _jspx_th_html_option_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_option_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_html_option_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_option_value.reuse(_jspx_th_html_option_0);
      return true;
    }
    _jspx_tagPool_html_option_value.reuse(_jspx_th_html_option_0);
    return false;
  }

  private boolean _jspx_meth_html_text_1(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_text_1 = (org.apache.struts.taglib.html.TextTag) _jspx_tagPool_html_text_property_nobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_text_1.setPageContext(_jspx_page_context);
    _jspx_th_html_text_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_text_1.setProperty("date");
    int _jspx_eval_html_text_1 = _jspx_th_html_text_1.doStartTag();
    if (_jspx_th_html_text_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_text_property_nobody.reuse(_jspx_th_html_text_1);
      return true;
    }
    _jspx_tagPool_html_text_property_nobody.reuse(_jspx_th_html_text_1);
    return false;
  }

  private boolean _jspx_meth_html_text_2(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_text_2 = (org.apache.struts.taglib.html.TextTag) _jspx_tagPool_html_text_property_nobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_text_2.setPageContext(_jspx_page_context);
    _jspx_th_html_text_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_text_2.setProperty("time");
    int _jspx_eval_html_text_2 = _jspx_th_html_text_2.doStartTag();
    if (_jspx_th_html_text_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_text_property_nobody.reuse(_jspx_th_html_text_2);
      return true;
    }
    _jspx_tagPool_html_text_property_nobody.reuse(_jspx_th_html_text_2);
    return false;
  }

  private boolean _jspx_meth_html_select_1(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:select
    org.apache.struts.taglib.html.SelectTag _jspx_th_html_select_1 = (org.apache.struts.taglib.html.SelectTag) _jspx_tagPool_html_select_property.get(org.apache.struts.taglib.html.SelectTag.class);
    _jspx_th_html_select_1.setPageContext(_jspx_page_context);
    _jspx_th_html_select_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_select_1.setProperty("classT");
    int _jspx_eval_html_select_1 = _jspx_th_html_select_1.doStartTag();
    if (_jspx_eval_html_select_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_select_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_select_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_select_1.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("                                ");
        if (_jspx_meth_html_option_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_html_select_1, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                ");
        if (_jspx_meth_html_option_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_html_select_1, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                ");
        if (_jspx_meth_html_option_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_html_select_1, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                ");
        if (_jspx_meth_html_option_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_html_select_1, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                            ");
        int evalDoAfterBody = _jspx_th_html_select_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_select_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_html_select_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_select_property.reuse(_jspx_th_html_select_1);
      return true;
    }
    _jspx_tagPool_html_select_property.reuse(_jspx_th_html_select_1);
    return false;
  }

  private boolean _jspx_meth_html_option_2(javax.servlet.jsp.tagext.JspTag _jspx_th_html_select_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:option
    org.apache.struts.taglib.html.OptionTag _jspx_th_html_option_2 = (org.apache.struts.taglib.html.OptionTag) _jspx_tagPool_html_option_value.get(org.apache.struts.taglib.html.OptionTag.class);
    _jspx_th_html_option_2.setPageContext(_jspx_page_context);
    _jspx_th_html_option_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_select_1);
    _jspx_th_html_option_2.setValue("Select Ticket Class");
    int _jspx_eval_html_option_2 = _jspx_th_html_option_2.doStartTag();
    if (_jspx_eval_html_option_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_option_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_option_2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_option_2.doInitBody();
      }
      do {
        out.write("Select Ticket Class");
        int evalDoAfterBody = _jspx_th_html_option_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_option_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_html_option_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_option_value.reuse(_jspx_th_html_option_2);
      return true;
    }
    _jspx_tagPool_html_option_value.reuse(_jspx_th_html_option_2);
    return false;
  }

  private boolean _jspx_meth_html_option_3(javax.servlet.jsp.tagext.JspTag _jspx_th_html_select_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:option
    org.apache.struts.taglib.html.OptionTag _jspx_th_html_option_3 = (org.apache.struts.taglib.html.OptionTag) _jspx_tagPool_html_option_value.get(org.apache.struts.taglib.html.OptionTag.class);
    _jspx_th_html_option_3.setPageContext(_jspx_page_context);
    _jspx_th_html_option_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_select_1);
    _jspx_th_html_option_3.setValue("Platinum");
    int _jspx_eval_html_option_3 = _jspx_th_html_option_3.doStartTag();
    if (_jspx_eval_html_option_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_option_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_option_3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_option_3.doInitBody();
      }
      do {
        out.write("Platinum");
        int evalDoAfterBody = _jspx_th_html_option_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_option_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_html_option_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_option_value.reuse(_jspx_th_html_option_3);
      return true;
    }
    _jspx_tagPool_html_option_value.reuse(_jspx_th_html_option_3);
    return false;
  }

  private boolean _jspx_meth_html_option_4(javax.servlet.jsp.tagext.JspTag _jspx_th_html_select_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:option
    org.apache.struts.taglib.html.OptionTag _jspx_th_html_option_4 = (org.apache.struts.taglib.html.OptionTag) _jspx_tagPool_html_option_value.get(org.apache.struts.taglib.html.OptionTag.class);
    _jspx_th_html_option_4.setPageContext(_jspx_page_context);
    _jspx_th_html_option_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_select_1);
    _jspx_th_html_option_4.setValue("Gold");
    int _jspx_eval_html_option_4 = _jspx_th_html_option_4.doStartTag();
    if (_jspx_eval_html_option_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_option_4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_option_4.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_option_4.doInitBody();
      }
      do {
        out.write("Gold");
        int evalDoAfterBody = _jspx_th_html_option_4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_option_4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_html_option_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_option_value.reuse(_jspx_th_html_option_4);
      return true;
    }
    _jspx_tagPool_html_option_value.reuse(_jspx_th_html_option_4);
    return false;
  }

  private boolean _jspx_meth_html_option_5(javax.servlet.jsp.tagext.JspTag _jspx_th_html_select_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:option
    org.apache.struts.taglib.html.OptionTag _jspx_th_html_option_5 = (org.apache.struts.taglib.html.OptionTag) _jspx_tagPool_html_option_value.get(org.apache.struts.taglib.html.OptionTag.class);
    _jspx_th_html_option_5.setPageContext(_jspx_page_context);
    _jspx_th_html_option_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_select_1);
    _jspx_th_html_option_5.setValue("Silver");
    int _jspx_eval_html_option_5 = _jspx_th_html_option_5.doStartTag();
    if (_jspx_eval_html_option_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_option_5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_option_5.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_option_5.doInitBody();
      }
      do {
        out.write("Silver");
        int evalDoAfterBody = _jspx_th_html_option_5.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_option_5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_html_option_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_option_value.reuse(_jspx_th_html_option_5);
      return true;
    }
    _jspx_tagPool_html_option_value.reuse(_jspx_th_html_option_5);
    return false;
  }

  private boolean _jspx_meth_html_text_3(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_text_3 = (org.apache.struts.taglib.html.TextTag) _jspx_tagPool_html_text_value_property_disabled_nobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_text_3.setPageContext(_jspx_page_context);
    _jspx_th_html_text_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_text_3.setProperty("cost");
    _jspx_th_html_text_3.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${conv}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    _jspx_th_html_text_3.setDisabled(true);
    int _jspx_eval_html_text_3 = _jspx_th_html_text_3.doStartTag();
    if (_jspx_th_html_text_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_text_value_property_disabled_nobody.reuse(_jspx_th_html_text_3);
      return true;
    }
    _jspx_tagPool_html_text_value_property_disabled_nobody.reuse(_jspx_th_html_text_3);
    return false;
  }

  private boolean _jspx_meth_html_submit_0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:submit
    org.apache.struts.taglib.html.SubmitTag _jspx_th_html_submit_0 = (org.apache.struts.taglib.html.SubmitTag) _jspx_tagPool_html_submit_styleClass.get(org.apache.struts.taglib.html.SubmitTag.class);
    _jspx_th_html_submit_0.setPageContext(_jspx_page_context);
    _jspx_th_html_submit_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_submit_0.setStyleClass("btn btn-success");
    int _jspx_eval_html_submit_0 = _jspx_th_html_submit_0.doStartTag();
    if (_jspx_eval_html_submit_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_submit_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_submit_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_submit_0.doInitBody();
      }
      do {
        out.write("Book Ticket");
        int evalDoAfterBody = _jspx_th_html_submit_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_submit_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_html_submit_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_submit_styleClass.reuse(_jspx_th_html_submit_0);
      return true;
    }
    _jspx_tagPool_html_submit_styleClass.reuse(_jspx_th_html_submit_0);
    return false;
  }

  private boolean _jspx_meth_html_reset_0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:reset
    org.apache.struts.taglib.html.ResetTag _jspx_th_html_reset_0 = (org.apache.struts.taglib.html.ResetTag) _jspx_tagPool_html_reset_styleClass.get(org.apache.struts.taglib.html.ResetTag.class);
    _jspx_th_html_reset_0.setPageContext(_jspx_page_context);
    _jspx_th_html_reset_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_reset_0.setStyleClass("btn btn-danger");
    int _jspx_eval_html_reset_0 = _jspx_th_html_reset_0.doStartTag();
    if (_jspx_eval_html_reset_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_reset_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_reset_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_reset_0.doInitBody();
      }
      do {
        out.write("Reset");
        int evalDoAfterBody = _jspx_th_html_reset_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_reset_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_html_reset_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_reset_styleClass.reuse(_jspx_th_html_reset_0);
      return true;
    }
    _jspx_tagPool_html_reset_styleClass.reuse(_jspx_th_html_reset_0);
    return false;
  }
}
