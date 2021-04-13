
package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.login;

public class svrlogin extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
             RequestDispatcher rd=null;
 
            String Usuarios,contrasenia;
            String perfil="";
            String userResp ="";
            login log = new login();
            
            if (request.getParameter("ingresar")!=null){
             
            Usuarios= request.getParameter("txtusuario").toString();
            contrasenia=request.getParameter("txtcontra").toString();
            perfil=log.buscarUsuario(Usuarios,contrasenia);            
             
             if (perfil !=""){
                 
                userResp="True";
             }
             else
             {
                userResp="False";
             }
             request.setAttribute("usuario", Usuarios);
             request.setAttribute("respuesta", userResp);
             request.setAttribute("perfil", perfil);
             rd=request.getRequestDispatcher("login.jsp");
            }
   
            rd.forward(request, response);
              
            
            
            
           /*
            // TODO output your page here. You may use following sample code. 
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet svrlogin</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet svrlogin at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
            */
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }


    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
