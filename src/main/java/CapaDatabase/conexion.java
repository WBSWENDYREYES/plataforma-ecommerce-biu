package CapaDatabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class conexion {
	
	String url = "jdbc:sqlserver://localhost:1433;DatabaseName=bsEcomerce01;integratedSecurity=false;encrypt=false; trustServerCertificate=false;";
    String user = "sa";
    String password = "Jabroca23";
    
	public Connection conectar() {
		Connection dbconect = null;
		
		try
		{
	     Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
	     
	     dbconect = DriverManager.getConnection(url,user,password);
 
	     return dbconect;	
		} catch (ClassNotFoundException e) {
            System.out.println("❌ No se encontró el driver JDBC: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("❌ Error de conexión: " + e.getMessage());
        }
		
		return dbconect;
}
	
	


    public static void close(ResultSet rs) {
        try {
            rs.close();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }

    public static void close(PreparedStatement stmt) {
        try {
            stmt.close();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }

    public static void close(Connection conn) {
        try {
            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }
	
}