package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;
import modelo.gestionusuarios;

public class svragregarusuario extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
             RequestDispatcher rd=null;
            
            
            int idnuevousuario=0;
            String nvusuario= request.getParameter("nuevousuario");
            String nvcontra=request.getParameter("nuevacontra");
            String nvcontra2=request.getParameter("confirm");
            boolean agregarusuarios =false;
            
            String perfilseleccinado= request.getParameter("perfiles");
           
           
            if(nvcontra.equals(nvcontra2)){
                
                gestionusuarios gu = new gestionusuarios(idnuevousuario,nvusuario,nvcontra,perfilseleccinado);
               agregarusuarios=gu.AgregarUsuarios(idnuevousuario, nvusuario, nvcontra,perfilseleccinado);
                
                if(agregarusuarios!=false){
                    response.sendRedirect("master.jsp");
                    
                }
            }else{
                
   out.println("<meta http-equiv='refresh' content='3;URL=registrousuario.jsp'>");//redirects after 3 seconds
   
   out.println("<p style='color:red;'><h1>Las contraseñas no coinciden!</h1></p>");
   
                
            } //if de comparacion contraseñas

            

           
             /*
            //TODO output your page here. You may use following sample code. 
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet svragregarusuario</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet svragregarusuario at " + Perfilseleccinado + "</h1>");
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
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(svragregarusuario.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(svragregarusuario.class.getName()).log(Level.SEVERE, null, ex);
        }
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
