
package modelo;

import java.sql.*;

public class login {
    private Connection con;
    private Statement stm;
    private ResultSet rs;    
    
public login()
{
        this.con=null;
        this.stm=null;
}    
  
public String buscarUsuario(String usuario, String password)
    {
        String user="";
        conexion cn = new conexion();
        rs=null;
    try{
        con=cn.conectar();
        stm=con.createStatement();
        rs=stm.executeQuery("select perfil from usuario where nombreusuario='" + usuario +"' and password='" + password + "' ");
        
        while (rs.next()){
        user = rs.getString("perfil");
        }
        cn.desconectar();
        con.close();
        stm.close();
        
       return user;
    }
    catch(Exception e){
        return "";
    }
    
    }        
}
    
 /*  "select * from usuario  where nombreusuario='"+usuario+"'"
                    + "and password ='"+pass+"' "
*/











 
