
package modelo;

import java.sql.*;

public class conexion {
private String driver;
private String URL;
private String user;
private String password;
private Connection con;
    
public conexion()
{
this.driver="com.microsoft.sqlserver.jdbc.SQLServerDriver";
this.URL="jdbc:sqlserver://DESKTOP-MCPF58M\\SQLEXPRESS:1433;databaseName=sistemaferreteria";
this.user="sa";
this.password="admin";
this.con=null;
}
public Connection conectar()
{
    try{
        Class.forName(this.driver);
        con=DriverManager.getConnection(this.URL,this.user,this.password);
        return con;
    }
    catch(Exception e)
    {
        return null;
    }
    
}

public void desconectar() throws SQLException
{
     con.close();
}
    
}
 