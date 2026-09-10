package CapaDatabase;

public class UsuarioCliente extends Usuario {


	
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