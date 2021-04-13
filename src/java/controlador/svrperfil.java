/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.gestionusuarios;

public class svrperfil extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
           gestionusuarios gu = new gestionusuarios();
            
           /* 
           if(request.getParameter("actualizar")!=null)
            {
             US.setUsuario(request.getParameter("USUARIO"));
             US.setContrasenia(request.getParameter("CONTRA"));
             US.setPerfil(request.getParameter("PERFIL"));
             
             if(request.getParameter("IDUSUARIO").equals("")){
                 //Insertar
             }
             else
             {
             US.setIdusuario(Integer.parseInt(request.getParameter("IDUSUARIO")));
             //Editar
             US.EditarUsuarios(US);
             }    
             response.sendRedirect("usuariomantenimiento.jsp");
             
             
            }
            else
            {
                //Borrar
             US.BorrarUsuarios(Integer.parseInt(request.getParameter("id")));
             response.sendRedirect("usuariomantenimiento.jsp");
            }
             
            */
            
            
            
            /*
            // TODO output your page here. You may use following sample code. 
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet svrperfil</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet svrperfil at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
            */
            }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
