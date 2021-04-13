package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class newjsp_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            //Al hacer click en el botón ingresar
            if (request.getParameter("btn_ingresar") != null) 
            {
                //Crea dos strings, una para el user y otra para el password.
                String username = request.getParameter("txt_username");
                String password = request.getParameter("txt_password");
                
                //Si ambas son "admin"...
                if (username.equals("admin")&&password.equals("admin"))
                {
                    //Redirecciona al servlet 'crear_departamento.do'
                    response.sendRedirect("prueba");
                }
                //Si no...
                else
                {
                    //Muestra un mensaje javascript señalando que hay daros erróneos
                    out.println("<script>alert('Usuario o contraseña incorrecta');</script>");
                }
            }
        
      out.write("\n");
      out.write("    <center>\n");
      out.write("        <div style=\"\"font-family: sans-serif\">\n");
      out.write("            <h2> Banco notNull </h2>\n");
      out.write("            <h3 style=\"font-family:sans-serif\">Ingreso administrador</h3>\n");
      out.write("            <form action=\"newjsp.jsp\" method=\"POST\">\n");
      out.write("                <table border=\"1\" style=\"font-family:sans-serif\">\n");
      out.write("                    <tbody>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>Usuario</td>\n");
      out.write("                            <td><input type=\"text\" name=\"txt_username\" value=\"\" /></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>Contraseña</td>\n");
      out.write("                            <td><input type=\"password\" name=\"txt_password\" value=\"\" /></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td></td>\n");
      out.write("                            <td><input type=\"submit\" value=\"Ingresar\" name=\"btn_ingresar\" /></td>\n");
      out.write("                        </tr>\n");
      out.write("                    </tbody>\n");
      out.write("                </table>\n");
      out.write("            </form>\n");
      out.write("            <hr>\n");
      out.write("        </center>\n");
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
