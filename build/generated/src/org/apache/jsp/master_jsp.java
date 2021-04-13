package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class master_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("<link href=\"//netdna.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\n");
      out.write("<script src=\"//netdna.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js\"></script>\n");
      out.write("<script src=\"//code.jquery.com/jquery-1.11.1.min.js\"></script>\n");
      out.write("\n");
      out.write("<link href=\"estiloscss/masterpage.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("\n");
      out.write("<link href=\"estiloscss/masterpage.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("<link href=\"//maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("<title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("      <div class=\"nav-side-menu\">\n");
      out.write("    <div class=\"brand\">Sistema Ferreteria</div>\n");
      out.write("    <i class=\"fa fa-bars fa-2x toggle-btn\" data-toggle=\"collapse\" data-target=\"#menu-content\"></i>\n");
      out.write("  \n");
      out.write("        <div class=\"menu-list\">\n");
      out.write("  \n");
      out.write("            <ul id=\"menu-content\" class=\"menu-content collapse out\">\n");
      out.write("                <li>\n");
      out.write("                  <a href=\"#\">\n");
      out.write("                  <i class=\"fa fa-dashboard fa-lg\"></i> Dashboard\n");
      out.write("                  </a>\n");
      out.write("                </li>\n");
      out.write("\n");
      out.write("                <li  data-toggle=\"collapse\" data-target=\"#products\" class=\"collapsed active\">\n");
      out.write("                  <a href=\"#\"><i class=\"fa fa-gift fa-lg\"></i> UI Elements <span class=\"arrow\"></span></a>\n");
      out.write("                </li>\n");
      out.write("                <ul class=\"sub-menu collapse\" id=\"products\">\n");
      out.write("                    <li class=\"active\"><a href=\"#\">CSS3 Animation</a></li>\n");
      out.write("                    <li><a href=\"#\">General</a></li>\n");
      out.write("                    <li><a href=\"#\">Buttons</a></li>\n");
      out.write("                    <li><a href=\"#\">Tabs & Accordions</a></li>\n");
      out.write("                    <li><a href=\"#\">Typography</a></li>\n");
      out.write("                    <li><a href=\"#\">FontAwesome</a></li>\n");
      out.write("                    <li><a href=\"#\">Slider</a></li>\n");
      out.write("                    <li><a href=\"#\">Panels</a></li>\n");
      out.write("                    <li><a href=\"#\">Widgets</a></li>\n");
      out.write("                    <li><a href=\"#\">Bootstrap Model</a></li>\n");
      out.write("                </ul>\n");
      out.write("\n");
      out.write("\n");
      out.write("                <li data-toggle=\"collapse\" data-target=\"#service\" class=\"collapsed\">\n");
      out.write("                  <a href=\"#\"><i class=\"fa fa-globe fa-lg\"></i> Services <span class=\"arrow\"></span></a>\n");
      out.write("                </li>  \n");
      out.write("                <ul class=\"sub-menu collapse\" id=\"service\">\n");
      out.write("                  <li>New Service 1</li>\n");
      out.write("                  <li>New Service 2</li>\n");
      out.write("                  <li>New Service 3</li>\n");
      out.write("                </ul>\n");
      out.write("\n");
      out.write("\n");
      out.write("                <li data-toggle=\"collapse\" data-target=\"#new\" class=\"collapsed\">\n");
      out.write("                  <a href=\"#\"><i class=\"fa fa-car fa-lg\"></i> New <span class=\"arrow\"></span></a>\n");
      out.write("                </li>\n");
      out.write("                <ul class=\"sub-menu collapse\" id=\"new\">\n");
      out.write("                  <li>New New 1</li>\n");
      out.write("                  <li>New New 2</li>\n");
      out.write("                  <li>New New 3</li>\n");
      out.write("                </ul>\n");
      out.write("\n");
      out.write("\n");
      out.write("                 <li>\n");
      out.write("                  <a href=\"#\">\n");
      out.write("                  <i class=\"fa fa-user fa-lg\"></i> Profile\n");
      out.write("                  </a>\n");
      out.write("                  </li>\n");
      out.write("\n");
      out.write("                 <li>\n");
      out.write("                  <a href=\"\">\n");
      out.write("                  <i class=\"fa fa-users fa-lg\"></i> Usuarios\n");
      out.write("                  </a>\n");
      out.write("                </li>\n");
      out.write("            </ul>\n");
      out.write("     </div>\n");
      out.write("</div>  \n");
      out.write("        \n");
      out.write("        \n");
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
