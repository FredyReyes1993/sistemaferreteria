package modelo;

import java.sql.*;
import java.util.ArrayList;

public class gestionusuarios {

    private Connection con;
    private Statement stm;
    private ResultSet rs; 
  
    public String usuario, contrasenia,perfil;
    public int idusuario;

    public gestionusuarios() {
        this.con = null;
        this.stm = null;
        this.rs= rs;
        
    }

    public gestionusuarios(int idusuario,String usuario, String contrasenia, String perfil) {
        this.usuario = usuario;
        this.contrasenia = contrasenia;
        this.perfil = perfil;
        this.idusuario = idusuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }

    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }


    public boolean AgregarUsuarios(int idusuario, String usuario, String contrasenia,String perfil) throws SQLException {
        boolean Agregarusuario = false;
        
        conexion cn = new conexion();
       
        if (idusuario == 0) {
            con = cn.conectar();
            stm = con.createStatement();
            stm.executeUpdate("insert into usuario(nombreusuario,password,perfil)values ('" + usuario + "','" + contrasenia + "','" + perfil + "')");
            Agregarusuario = true;

        }
        return Agregarusuario;

    }
    
    
   public ArrayList<gestionusuarios> mostrarPerfil(){
 
ArrayList<gestionusuarios> lista =new ArrayList<gestionusuarios>();
conexion cn=new conexion();
rs=null;

try{

con=cn.conectar();
stm=con.createStatement();
rs=stm.executeQuery("select * from usuario");

while (rs.next()){
    gestionusuarios gu= new gestionusuarios ();
    
    gu.setIdusuario(rs.getInt(1));
    gu.setPerfil(rs.getString("perfil"));
    lista.add(gu);
}
    con.close();
    stm.close();
    rs.close();
    
 return lista;
}catch(Exception e){
            System.out.println("*-*-*-*-*-*-*");
            System.err.println("ERROR AL MOSTRAR: "+ e);
            System.out.println("*-*-*-*-*");  
    
}
return lista;
   
} 

   
    
    
    

}
