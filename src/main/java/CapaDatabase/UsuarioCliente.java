package CapaDatabase;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsuarioCliente extends Usuario {

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

	
    public UsuarioCliente(int idusuario, String nombre, int iddireccion, String telefonos,
                          String email, String password,
                          int idroles) {

        super( idusuario,  nombre,  iddireccion, telefonos, email, password,   idroles);

      }

    public void listarProductos() {
        System.out.println("El cliente puede listar productos.");
    }

    public void comprarProducto() {
        System.out.println("El cliente puede comprar productos.");
    }

    public void realizarPedido() {
        System.out.println("El cliente puede realizar pedidos.");
    }

    public void consultarPedidos() {
        System.out.println("El cliente puede consultar sus pedidos.");
    }

    
   
    
}