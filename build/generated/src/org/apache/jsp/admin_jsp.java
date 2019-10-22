package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;;

public final class admin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 String driverName = "org.sqlite.JDBC";
String url = "jdbc:sqlite:C:/Users/FOCUS/Documents/NetBeansProjects/MBE2/MBF.db";
  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_j_out_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_form_styleId_styleClass_method_action;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_submit_styleClass_property;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_text_property_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_j_out_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_form_styleId_styleClass_method_action = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_submit_styleClass_property = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_text_property_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_j_out_value_nobody.release();
    _jspx_tagPool_html_form_styleId_styleClass_method_action.release();
    _jspx_tagPool_html_submit_styleClass_property.release();
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Movie Buff Administrator</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"fonts/font-awesome.min.css\" />\n");
      out.write("    </head>\n");
      out.write("    <body style=\"background-color: #CCC;\">\n");
      out.write("        ");
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("        <section class=\"jumbotron jumb\" style=\"float: left; height: 66.3rem; padding-left: 35px; padding-right: 35px;\">\n");
      out.write("            <center>\n");
      out.write("                <br><br>\n");
      out.write("                <i style=\"color: #ffffff !important; font-size: 190px;\" class=\"fa fa-user-circle-o\"></i>\n");
      out.write("                <h3 style=\"color: whitesmoke;\">ADMINISTRATOR</h3>\n");
      out.write("                <br><br><br><br><br><br><br><br><br><br><br><br><br><br>\n");
      out.write("                <a href=\"index.jsp\" class=\"lin btn btn-danger\">log out</a>\n");
      out.write("            </center>\n");
      out.write("        </section>\n");
      out.write("\n");
      out.write("        <nav class=\"navbar navbar-fixed-top\" style=\"border-radius: 0px; background-color: #263a4e !important;\">\n");
      out.write("            <div class=\"container\" style=\"margin-right: -380px;\">\n");
      out.write("                <b class=\"navbar-header\">\n");
      out.write("                    <a class=\"navbar-brand\" href=\"admin.jsp\" style=\"color: whitesmoke;\">MOVIE BUFF ADMIN</a>\n");
      out.write("                </b>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("\n");
      out.write("        <div class=\"container\" style=\"margin-left: 300px; padding-top: 90px; width: 30vw;\">\n");
      out.write("            <div class=\"panel panel-primary\">\n");
      out.write("                <div class=\"panel-heading\">\n");
      out.write("                    <h4>ADD MOVIES</h4>\n");
      out.write("                </div>\n");
      out.write("                <center class=\"panel-body\" style=\"height: 30vh;\">\n");
      out.write("                    <button class=\"btn btn-primary\" data-toggle=\"collapse\" data-target=\"#mov\">Add Movie</button>\n");
      out.write("                    <br><br>\n");
      out.write("                    ");
      if (_jspx_meth_html_form_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                </center>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!-- Total Number of Users //-->\n");
      out.write("        ");

            try {
                Connection con = null;
                PreparedStatement ps = null;
                Class.forName(driverName);
                con = DriverManager.getConnection(url);
                con.setAutoCommit(false);
                String sql = "SELECT COUNT(*) FROM UserR;";
                ps = con.prepareStatement(sql);
                ResultSet rs = ps.executeQuery();
        
      out.write("\n");
      out.write("        ");

            int tnu = rs.getInt("COUNT(*)");
        
      out.write("\n");
      out.write("        <div class=\"container\" style=\"margin-left: 800px; width: 30vw; margin-top: -573px;\">\n");
      out.write("            <div class=\"panel panel-success\" style=\"border: 1px solid #5cb85c;\">\n");
      out.write("                <div class=\"panel-heading\">\n");
      out.write("                    <h4>TOTAL NO. USERS SIGNED UP</h4>\n");
      out.write("                </div>\n");
      out.write("                <center class=\"panel-body\" style=\"height: 30vh;\">\n");
      out.write("                    <i class=\"fa fa-users fa-3x\" style=\"color: #5cb85c;\"></i><br>\n");
      out.write("                    <h2>24</h2>\n");
      out.write("                    ");
      //  j:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_j_out_0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_j_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_j_out_0.setPageContext(_jspx_page_context);
      _jspx_th_j_out_0.setParent(null);
      _jspx_th_j_out_0.setValue(tnu);
      int _jspx_eval_j_out_0 = _jspx_th_j_out_0.doStartTag();
      if (_jspx_th_j_out_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_j_out_value_nobody.reuse(_jspx_th_j_out_0);
        return;
      }
      _jspx_tagPool_j_out_value_nobody.reuse(_jspx_th_j_out_0);
      out.write("\n");
      out.write("                        <p>NEW USERS</p>\n");
      out.write("                    </center>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        ");

            } catch (SQLException es) {
                System.err.println(es.getMessage());
            }
        
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("    <script src=\"js/jquery.min.js\"></script>\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("    <style type=\"text/css\">\n");
      out.write("\n");
      out.write("        .jumb{\n");
      out.write("            background-color: #263a4e;\n");
      out.write("            margin-bottom: 0px !important;\n");
      out.write("        }        \n");
      out.write("\n");
      out.write("        .jumbotron{\n");
      out.write("            margin-bottom: 0px !important;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .navbar-nav{\n");
      out.write("            background-color: #263a4e !important;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .lin{\n");
      out.write("            text-decoration: none !important;\n");
      out.write("            text-transform: uppercase;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .active{\n");
      out.write("            padding: 13px 75px;\n");
      out.write("            color: whitesmoke;\n");
      out.write("            background-color: #cea06c !important;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("    </style>\n");
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

  private boolean _jspx_meth_html_form_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:form
    org.apache.struts.taglib.html.FormTag _jspx_th_html_form_0 = (org.apache.struts.taglib.html.FormTag) _jspx_tagPool_html_form_styleId_styleClass_method_action.get(org.apache.struts.taglib.html.FormTag.class);
    _jspx_th_html_form_0.setPageContext(_jspx_page_context);
    _jspx_th_html_form_0.setParent(null);
    _jspx_th_html_form_0.setStyleClass("collapse");
    _jspx_th_html_form_0.setStyleId("mov");
    _jspx_th_html_form_0.setAction("/addmovie");
    _jspx_th_html_form_0.setMethod("post");
    int _jspx_eval_html_form_0 = _jspx_th_html_form_0.doStartTag();
    if (_jspx_eval_html_form_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                        <label for=\"moviename\">Movie Name:</label><br>\n");
        out.write("                        ");
        if (_jspx_meth_html_text_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_html_form_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                        ");
        if (_jspx_meth_html_submit_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_html_form_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                    ");
        int evalDoAfterBody = _jspx_th_html_form_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_html_form_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_form_styleId_styleClass_method_action.reuse(_jspx_th_html_form_0);
      return true;
    }
    _jspx_tagPool_html_form_styleId_styleClass_method_action.reuse(_jspx_th_html_form_0);
    return false;
  }

  private boolean _jspx_meth_html_text_0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_text_0 = (org.apache.struts.taglib.html.TextTag) _jspx_tagPool_html_text_property_nobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_text_0.setPageContext(_jspx_page_context);
    _jspx_th_html_text_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_text_0.setProperty("mn");
    int _jspx_eval_html_text_0 = _jspx_th_html_text_0.doStartTag();
    if (_jspx_th_html_text_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_text_property_nobody.reuse(_jspx_th_html_text_0);
      return true;
    }
    _jspx_tagPool_html_text_property_nobody.reuse(_jspx_th_html_text_0);
    return false;
  }

  private boolean _jspx_meth_html_submit_0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:submit
    org.apache.struts.taglib.html.SubmitTag _jspx_th_html_submit_0 = (org.apache.struts.taglib.html.SubmitTag) _jspx_tagPool_html_submit_styleClass_property.get(org.apache.struts.taglib.html.SubmitTag.class);
    _jspx_th_html_submit_0.setPageContext(_jspx_page_context);
    _jspx_th_html_submit_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_submit_0.setProperty("but1");
    _jspx_th_html_submit_0.setStyleClass("btn btn-primary");
    int _jspx_eval_html_submit_0 = _jspx_th_html_submit_0.doStartTag();
    if (_jspx_eval_html_submit_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_submit_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_submit_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_submit_0.doInitBody();
      }
      do {
        out.write("Add");
        int evalDoAfterBody = _jspx_th_html_submit_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_submit_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_html_submit_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_submit_styleClass_property.reuse(_jspx_th_html_submit_0);
      return true;
    }
    _jspx_tagPool_html_submit_styleClass_property.reuse(_jspx_th_html_submit_0);
    return false;
  }
}
