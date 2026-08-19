package CapaDatabase;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import CapaControlador.UsuarioControlador;

public class UsuarioDao {
	
	private static final String SQL_SELECT = "SELECT Idusuario, nombre, direccion, telefonos, password FROM Usuario";
    private static final String SQL_SELECT_BY_ID = "SELECT Idusuario, nombre, direccion, telefono, password FROM Usuario WHERE IdUsuario = ?";
    private static final String SQL_INSERT = "INSERT INTO Usuario (nombre, direccion, "
            + "telefonos, Password) VALUES(?, ?, ?, ?)";
    private static final String SQL_UPDATE = "UPDATE usuario SET nombre=?, "
            + "direccion = ?, telefono = ?, password = ? WHERE IdUsuario = ?";
    private static final String SQL_DELETE = "DELETE FROM usuario WHERE IdUsuario = ?";
   
	
	
	
	
	public static List<Usuario> listar() {
		
		conexion  objConn = new conexion();
        CallableStatement stmt = null ;      
        ResultSet cursor = null;
        List<Usuario> Usuario = new ArrayList<>();
                    
    try {
    	 
    	 
         stmt = objConn.conectar().prepareCall(SQL_SELECT);
         cursor = stmt.executeQuery();
         
        while (cursor.next()) {
            int idusuario = cursor.getInt("id_cliente");
            String nombre = cursor.getString("nombre");
            String direccion = cursor.getString("direccion");
            String email = cursor.getString("email");
            String telefonos = cursor.getString("telefonos");
            String password = cursor.getString("Password");
            Usuario.add(new Usuario(idusuario, direccion, nombre, telefonos,email, password));
        }
      }
    catch (SQLException ex) {
        ex.printStackTrace(System.out);
    } finally {
        // ceramos variables de conexion
    	cursor = null;
    	stmt = null;
    	//conexion.close(stmt);
    	objConn = null;
    }
    return Usuario;

}
}
