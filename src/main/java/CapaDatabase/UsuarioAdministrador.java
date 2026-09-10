package CapaDatabase;

public class UsuarioAdministrador extends Usuario {


	
    public UsuarioAdministrador(int idusuario, String nombre, int iddireccion, String telefonos,
                          String email, String password,
                          int idroles) {

        super( idusuario,  nombre,  iddireccion, telefonos, email, password,   idroles);

      }

    public void crearProducto() {
        System.out.println("El administrador puede crear productos.");
    }

    public void modificarProducto() {
        System.out.println("El administrador puede modificar productos.");
    }

    public void eliminarProducto() {
        System.out.println("El administrador puede eliminar productos.");
    }

    public void crearCategoria() {
        System.out.println("El administrador puede crear categorías.");
    }

    public void administrarCategorias() {
        System.out.println("El administrador puede administrar categorías.");
    }

    public void crearMarca() {
        System.out.println("El administrador puede crear marcas.");
    }

    public void administrarMarcas() {
        System.out.println("El administrador puede administrar marcas.");
    }

    public void administrarPedidos() {
        System.out.println("El administrador puede administrar pedidos.");
    }

    
}