package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class bookTicket_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_h_select_property_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_h_form_method;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_h_submit;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_h_text_property_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_h_select_property_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_h_form_method = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_h_submit = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_h_text_property_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_h_select_property_nobody.release();
    _jspx_tagPool_h_form_method.release();
    _jspx_tagPool_h_submit.release();
    _jspx_tagPool_h_text_property_nobody.release();
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
      out.write("        <title>Book Ticket - Movie Buff</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/tar.css\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/linearicons.css\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.css\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/owl.carousel.css\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/magnific-popup.css\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/nice-select.css\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/main.css\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"fonts/fontawesome.min.css\"/>\n");
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
      out.write("                            <li><a href=\"home.jsp\">Home</a></li>\n");
      out.write("                            <li><a href=\"#\">In Theaters</a></li>\n");
      out.write("                            <li><a href=\"#\">Coming Soon</a></li>\n");
      out.write("                            <li><a class=\"active\" href=\"bookTicket.jsp\">Book Ticket</a></li>\n");
      out.write("                            <li><a href=\"contact.jsp\">Contact</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </nav>\n");
      out.write("        </header>\n");
      out.write("        <!-- End Header Area -->\n");
      out.write("\n");
      out.write("        <!-- start banner Area -->\n");
      out.write("        <section class=\"home-banner-area relative\" id=\"home\" data-parallax=\"scroll\" data-image-src=\"img/shazam.jpg\">\n");
      out.write("            <div class=\"overlay-bg overlay\"></div>\n");
      out.write("            <h1 class=\"template-name\">Movie Buff</h1>\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row fullscreen\">\n");
      out.write("                    <div class=\"jos banner-content col-lg-12\">\n");
      out.write("                        <p>Book Your</p>\n");
      out.write("                        <h1>\n");
      out.write("                            Tickets <br>\n");
      out.write("                            Here!\n");
      out.write("                        </h1>\n");
      out.write("                        <a href=\"#\"><i class=\"fa fa-youtube\"></i></a>\n");
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
      out.write("        <br><br>\n");
      out.write("\n");
      out.write("        <!-- Start Book Ticket Form -->\n");
      out.write("        <div class=\"container\">\n");
      out.write("            ");
      if (_jspx_meth_h_form_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <!-- End Book Ticket Form -->\n");
      out.write("\n");
      out.write("        <br><br>\n");
      out.write("\n");
      out.write("        <!-- start footer Area -->\n");
      out.write("        <footer class=\"footer-area section-gap\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row footer-bottom d-flex justify-content-between\">\n");
      out.write("                    <h4 class=\"lf\">Copyright &copy; 2019 <a href=\"#\">Movie Buff</a> - All Rights Reserved</h4>\n");
      out.write("                    <div style=\"clear:both;\"></div>\n");
      out.write("                    <div class=\"col-lg-4 col-sm-12 footer-social\">\n");
      out.write("                        <a href=\"#\"><i class=\"fa fa-car\"></i></a>\n");
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
      out.write("    </body>\n");
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

  private boolean _jspx_meth_h_form_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:form
    org.apache.struts.taglib.html.FormTag _jspx_th_h_form_0 = (org.apache.struts.taglib.html.FormTag) _jspx_tagPool_h_form_method.get(org.apache.struts.taglib.html.FormTag.class);
    _jspx_th_h_form_0.setPageContext(_jspx_page_context);
    _jspx_th_h_form_0.setParent(null);
    _jspx_th_h_form_0.setMethod("post");
    int _jspx_eval_h_form_0 = _jspx_th_h_form_0.doStartTag();
    if (_jspx_eval_h_form_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                <b><h1>Book Ticket</h1></b>\n");
        out.write("                <br><br>\n");
        out.write("                <div id=\"fullname\">\n");
        out.write("                    <label for=\"fullname\">Fullname: </label>\n");
        out.write("                    ");
        if (_jspx_meth_h_text_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_h_form_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                    </div>\n");
        out.write("                    <div>\n");
        out.write("                        <label for=\"movie\">Movie Name:</label>\n");
        out.write("                    ");
        if (_jspx_meth_h_select_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_h_form_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                    </div>\n");
        out.write("                ");
        if (_jspx_meth_h_submit_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_h_form_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("            ");
        int evalDoAfterBody = _jspx_th_h_form_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_h_form_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_h_form_method.reuse(_jspx_th_h_form_0);
      return true;
    }
    _jspx_tagPool_h_form_method.reuse(_jspx_th_h_form_0);
    return false;
  }

  private boolean _jspx_meth_h_text_0(javax.servlet.jsp.tagext.JspTag _jspx_th_h_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:text
    org.apache.struts.taglib.html.TextTag _jspx_th_h_text_0 = (org.apache.struts.taglib.html.TextTag) _jspx_tagPool_h_text_property_nobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_h_text_0.setPageContext(_jspx_page_context);
    _jspx_th_h_text_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_form_0);
    _jspx_th_h_text_0.setProperty("fullname");
    int _jspx_eval_h_text_0 = _jspx_th_h_text_0.doStartTag();
    if (_jspx_th_h_text_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_h_text_property_nobody.reuse(_jspx_th_h_text_0);
      return true;
    }
    _jspx_tagPool_h_text_property_nobody.reuse(_jspx_th_h_text_0);
    return false;
  }

  private boolean _jspx_meth_h_select_0(javax.servlet.jsp.tagext.JspTag _jspx_th_h_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:select
    org.apache.struts.taglib.html.SelectTag _jspx_th_h_select_0 = (org.apache.struts.taglib.html.SelectTag) _jspx_tagPool_h_select_property_nobody.get(org.apache.struts.taglib.html.SelectTag.class);
    _jspx_th_h_select_0.setPageContext(_jspx_page_context);
    _jspx_th_h_select_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_form_0);
    _jspx_th_h_select_0.setProperty("movie");
    int _jspx_eval_h_select_0 = _jspx_th_h_select_0.doStartTag();
    if (_jspx_th_h_select_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_h_select_property_nobody.reuse(_jspx_th_h_select_0);
      return true;
    }
    _jspx_tagPool_h_select_property_nobody.reuse(_jspx_th_h_select_0);
    return false;
  }

  private boolean _jspx_meth_h_submit_0(javax.servlet.jsp.tagext.JspTag _jspx_th_h_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:submit
    org.apache.struts.taglib.html.SubmitTag _jspx_th_h_submit_0 = (org.apache.struts.taglib.html.SubmitTag) _jspx_tagPool_h_submit.get(org.apache.struts.taglib.html.SubmitTag.class);
    _jspx_th_h_submit_0.setPageContext(_jspx_page_context);
    _jspx_th_h_submit_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_form_0);
    int _jspx_eval_h_submit_0 = _jspx_th_h_submit_0.doStartTag();
    if (_jspx_eval_h_submit_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_h_submit_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_h_submit_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_h_submit_0.doInitBody();
      }
      do {
        out.write("Book");
        int evalDoAfterBody = _jspx_th_h_submit_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_h_submit_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_h_submit_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_h_submit.reuse(_jspx_th_h_submit_0);
      return true;
    }
    _jspx_tagPool_h_submit.reuse(_jspx_th_h_submit_0);
    return false;
  }
}
