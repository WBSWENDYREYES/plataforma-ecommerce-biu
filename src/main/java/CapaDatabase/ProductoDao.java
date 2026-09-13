package CapaDatabase;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import CapaControlador.ProductoControlador;

public class ProductoDao {
	
	private static final String SQL_SELECT = "SELECT * FROM Producto";
    private static final String SQL_SELECT_BY_ID = "SELECT * FROM Producto WHERE idproducto = ?";
    private static final String SQL_INSERT = "INSERT INTO Producto (referencia,  nombre,  descripcion,  precio,  existencia, idcategoria"
            + ") VALUES(?, ?, ?, ?, ?, ?)";
    private static final String SQL_UPDATE = "UPDATE Producto SET referencia=?, "
            + "nombre = ?, descripcion = ?, precio = ?, existencia = ?, idcategoria = ? WHERE idproducto = ?";
    private static final String SQL_DELETE = "DELETE FROM Producto WHERE idproducto = ?";
    
public static List<Producto> listar() {
		
		conexion  objConn = new conexion();
        CallableStatement stmt = null ;      
        ResultSet cursor = null;
        List<Producto> Producto = new ArrayList<>();
                    
    try {
    	 
    	 
         stmt = objConn.conectar().prepareCall(SQL_SELECT);
         cursor = stmt.executeQuery();
         
        while (cursor.next()) {
            int idproducto = cursor.getInt("id_cliente");
            String referencia = cursor.getString("referencia");
            String nombre = cursor.getString("nombre");
            String descripcion = cursor.getString("descripcion");
            Double precio = cursor.getDouble("precio");
            int existencia = cursor.getInt("existencia");
            int idcategoria = cursor.getInt("idcategoria");
            Producto.add(new Producto(idproducto, referencia,  nombre,  descripcion,  precio,  existencia, idcategoria));
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
    return Producto;
}


}