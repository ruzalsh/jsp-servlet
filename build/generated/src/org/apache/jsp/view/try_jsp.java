package org.apache.jsp.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.formwithmvc.model.Employee;
import com.formwithmvc.dao.Dao;

public final class try_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("          \n");
      out.write("          <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\n");
      out.write("          \n");
      out.write("    </head>\n");
      out.write("    <body>        \n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("               <div class=\"col-sm-2\"></div>\n");
      out.write("               <h1 align=\"center\">Update!!</h1>\n");
      out.write("                <div class=\"col-sm-8\"  align=\"center\">\n");
      out.write("                    \n");
      out.write("                        <form class=\"form-horizontal\" action=\"EmployeeController\" method=\"post\">\n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("<!--                        <div class=\"form-group\">\n");
      out.write("                            <label hidden=\"hidden\">Id:</label>\n");
      out.write("                            <div class=\"col-sm-5\">\n");
      out.write("                            <input type=\"hidden\" class=\"form-control\" name=\"hidden\"\n");
      out.write("                                   id=\"id\" value=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${student.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(">\n");
      out.write("                            </div>\n");
      out.write("                        </div>-->\n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                            <label class=\"control-label col-sm-2\" for=\"firstName\">First Name:</label>\n");
      out.write("                            <div class=\"col-sm-5\">\n");
      out.write("                                <input type=\"text\" class=\"form-control\" id=\"firstname\" name=\"firstname\" placeholder=\"Enter First Name\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${student.fname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                            </div>\n");
      out.write("                         </div>\n");
      out.write("                         <div class=\"form-group\">\n");
      out.write("                            <label class=\"control-label col-sm-2\" for=\"lastName\">Last Name:</label>\n");
      out.write("                            <div class=\"col-sm-5\">\n");
      out.write("                                <input type=\"text\" class=\"form-control\" id=\"lastname\" name=\"lastname\" placeholder=\"Enter Last Name\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${student.lname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                            </div>\n");
      out.write("                         </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label class=\"control-label col-sm-2\" for=\"email\">Email:</label>\n");
      out.write("                            <div class=\"col-sm-5\">\n");
      out.write("                                <input type=\"email\" class=\"form-control\" id=\"email\" name=\"email\" placeholder=\"Enter Email\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${student.email}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                            </div>\n");
      out.write("                         </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label class=\"control-label col-sm-2\" for=\"password\">Password:</label>\n");
      out.write("                            <div class=\"col-sm-5\">\n");
      out.write("                                <input type=\"password\" class=\"form-control\" id=\"password\" name=\"password\" placeholder=\"Enter Password\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${student.password}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                            </div>\n");
      out.write("                         </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                           \n");
      out.write("                               \n");
      out.write("                                <input type=\"submit\" class=\"btn btn-success\" value=\"Update\" name=\"button\">\n");
      out.write("                                \n");
      out.write("                               \n");
      out.write("                                </div>\n");
      out.write("                            \n");
      out.write("                            \n");
      out.write("                    </form>\n");
      out.write("                        \n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-2\"></div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
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
}
