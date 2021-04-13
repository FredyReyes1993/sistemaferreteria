package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("<link href=\"//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\n");
      out.write("<script src=\"//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js\"></script>\n");
      out.write("<script src=\"//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("\n");
      out.write("\t<!--Boostrap 4 -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css\" integrity=\"sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO\" crossorigin=\"anonymous\">\n");
      out.write("    \n");
      out.write("    <!--Fontawesome-->\n");
      out.write("\t<link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.3.1/css/all.css\" integrity=\"sha384-mzrmE5qonljUremFsqc01SB46JvROS7bZs3IO2EmfFsd15uHvIt+Y8vEf7N7fWAU\" crossorigin=\"anonymous\">\n");
      out.write("        <link href=\"estiloscss/login.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        \n");
      out.write("        <script src=\"https://ajax.googleapes.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"boostrap/js/sweetalert.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        \n");
      out.write(" <script type=\"text/javascript\">  \n");
      out.write("        function validate(){\n");
      out.write("                var password=document.Login.txtcontra.value;\n");
      out.write("                var user=document.Login.txtusuario.value;\n");
      out.write("                 if (user==\"\")\n");
      out.write("                 {\n");
      out.write("                     alert(\"Ingrese su Usuario\");\n");
      out.write("                     document.Login.txtusuario.focus();\n");
      out.write("                     return false;\n");
      out.write("                 }\n");
      out.write("                 else if (password==\"\")\n");
      out.write("                 {\n");
      out.write("                     alert(\"Ingrese su Contraseña \");\n");
      out.write("                     document.Login.txtcontra.focus();\n");
      out.write("                     return false;\n");
      out.write("                 }\n");
      out.write("            }\n");
      out.write(" </script>     \n");
      out.write("            \n");
      out.write("        \n");
      out.write("   <title>Sistema Ferreteria</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("<div class=\"container\">\n");
      out.write("    <div class=\"d-flex justify-content-center h-100\">\n");
      out.write("\t\t<div class=\"card\">\n");
      out.write("\t\t\t<div class=\"card-header\">        \n");
      out.write("        <h3>Inicio de Sesion</h3>\n");
      out.write("    <div class=\"d-flex justify-content-end social_icon\">\n");
      out.write("        <span><i class=\"fab fa-facebook-square\"></i></span>\n");
      out.write("\t<span><i class=\"fab fa-google-plus-square\"></i></span>\n");
      out.write("\t<span><i class=\"fab fa-twitter-square\"></i></span>\n");
      out.write("    </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"card-body\">        \n");
      out.write("        \n");
      out.write("<form name=\"frmLogin\" action=\"svrlogin\" method=\"POST\">\n");
      out.write(" \t<div class=\"input-group form-group\">\n");
      out.write("\t<div class=\"input-group-prepend\">\n");
      out.write("        <span class=\"input-group-text\"><i class=\"fas fa-user\"></i></span>\n");
      out.write("\t</div>   \n");
      out.write("    <input type=\"usuario\" class=\"form-control\"  name=\"txtusuario\" placeholder=\"Usuario\">\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("<div class=\"input-group form-group\">\n");
      out.write("    <div class=\"input-group-prepend\">\n");
      out.write("\t<span class=\"input-group-text\"><i class=\"fas fa-key\"></i></span>\n");
      out.write("    </div>    \n");
      out.write("    \n");
      out.write(" <input type=\"password\" class=\"form-control\" name=\"txtcontra\" placeholder=\"Contraseña\">\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"row align-items-center remember\">\n");
      out.write("    <input type=\"checkbox\">Recordar credenciales\n");
      out.write("</div>\n");
      out.write("    <div class=\"form-group\">    \n");
      out.write("    \n");
      out.write(" <input type=\"submit\" onClick=\"return validate();\" name=\"ingresar\" value=\"Acceder\" class=\"btn float-right login_btn\">\n");
      out.write("    </div>\n");
      out.write("</form>                    \n");
      out.write(" </div>                 \n");
      out.write("<div class=\"card-footer\">\n");
      out.write("\t<div class=\"d-flex justify-content-center links\">\n");
      out.write("\tNo tiene acceso?<a href=\"#\">Registrate</a>\n");
      out.write("        </div>\n");
      out.write("\t<div class=\"d-flex justify-content-center\">\n");
      out.write("\t<a href=\"#\">Olvidaste tu contraseña?</a>\n");
      out.write("\t</div>\n");
      out.write("      \t</div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("                    \n");
      out.write("       ");

            
            HttpSession sesion = request.getSession();
            
         if(request.getAttribute("respuesta")!=null)   
         {
              if(request.getAttribute("respuesta")=="True")
                {
                sesion.setAttribute("usuario", request.getAttribute("usuario"));
                sesion.setAttribute("perfil", request.getAttribute("perfil"));
                response.sendRedirect("master.jsp");
                }
              else
              {
        
      out.write("  \n");
      out.write("                <script> swal ( \"Usuario No Encontrado\" ,  \"Sin Acceso al Sistema!\" ,  \"error\" );</script>\n");
      out.write("                ");

              }
          }
          if (request.getParameter("cerrar")!=null)
            {
              session.invalidate();
            }
                
      out.write("\n");
      out.write("     \n");
      out.write("        <script src=\"js/jquery-3.3.1.slim.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"js/popper.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"js/bootstrap.min.js\" type=\"text/javascript\"></script>                \n");
      out.write("      \n");
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
