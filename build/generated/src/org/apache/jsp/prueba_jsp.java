package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class prueba_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title>Validar si la contraseña y la repetición de la contraseña son iguales</title>\n");
      out.write("<script>\n");
      out.write("function comprobarClave(){\n");
      out.write("    clave1 = document.f1.clave1.value\n");
      out.write("    clave2 = document.f1.clave2.value\n");
      out.write("\n");
      out.write("    if (clave1 == clave2)\n");
      out.write("       alert(\"SI\")\n");
      out.write("   \n");
      out.write("       \n");
      out.write("       \n");
      out.write("    else\n");
      out.write("       alert(\"Las dos claves son distintas...\\nRealizaríamos las acciones del caso negativo\")\n");
      out.write("\n");
      out.write("\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<h1>Validar si la contraseña y la repetición de la contraseña son iguales</h1>\n");
      out.write("<br>\n");
      out.write("Escribe una supuesta contraseña dos veces, una en cada campo, y pulsa el botón. Javascript te dirá si las dos son iguales.\n");
      out.write("\n");
      out.write("<br>\n");
      out.write("<form method=\"POST\" action=\"prueba\" name=\"f1\">\n");
      out.write("Contraseña: <input type=\"password\" name=\"clave1\" size=\"20\">\n");
      out.write("<br>\n");
      out.write("Repite contraseña: <input type=\"password\" name=\"clave2\" size=\"20\">\n");
      out.write("<br>\n");
      out.write("<input type=\"button\" value=\"Comprobar si son iguales\" onClick=\"comprobarClave()\">\n");
      out.write("</form>\n");
      out.write("\n");

            
            HttpSession sesion = request.getSession();
            
         if(request.getAttribute("Usuarios")=="123")   
         {
                sesion.setAttribute("clave1", request.getAttribute("clave1"));
                response.sendRedirect("login.jsp");
                }
             

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
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
