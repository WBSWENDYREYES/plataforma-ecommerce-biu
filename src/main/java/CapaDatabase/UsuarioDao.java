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
    private static final String SQL_SELECT_BY_EMAIL =
            "SELECT Idusuario, nombre, direccion, telefonos, email, password " +
            "FROM Usuario WHERE email = ?";
  
	
	
	
	
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
            int iddireccion = cursor.getInt("iddireccion");
            String email = cursor.getString("email");
            String telefonos = cursor.getString("telefonos");
            String password = cursor.getString("Password");
            int idroles = cursor.getInt("idroles");
        Usuario.add(new Usuario(idusuario, nombre,iddireccion, telefonos,email, password,idroles));
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
	
	 // ==========================================
    // BUSCAR USUARIO POR EMAIL
    // ==========================================

    public static Usuario buscarPorEmail(String cemail) {

        conexion objConn = new conexion();

        CallableStatement stmt = null;
        ResultSet cursor = null;

        Usuario usuario = null;

        try {

            stmt = objConn.conectar().prepareCall(SQL_SELECT_BY_EMAIL);

            stmt.setString(1, cemail);
            cursor = stmt.executeQuery();
            if (cursor.next()) {

                int idusuario = cursor.getInt("Idusuario");
                String nombre = cursor.getString("nombre");
                int iddireccion = cursor.getInt("iddireccion");
                String telefonos = cursor.getString("telefonos");
                String email = cursor.getString("email");
                String password = cursor.getString("password");
                int idroles = cursor.getInt("idroles");
                usuario = new Usuario(
                    idusuario,
                    nombre,
                    iddireccion,
                    telefonos,
                    email,
                    password,
                    idroles
                );
            }

        } catch (SQLException ex) {

            ex.printStackTrace();

        } finally {

            cursor = null;
            stmt = null;
            objConn = null;
        }

        return usuario;
    }
}
