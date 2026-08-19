package CapaDatabase;

// SOLUCIÓN 1: Faltaba importar List
import java.util.ArrayList;
import java.util.List; 

// SOLUCIÓN 2: Eliminamos la clase externa "caritocompra" para que sea una clase limpia
public class carrito {
    // Atributos privados
    private List<Producto> productos;
    private double total;

    // Constructor para inicializar el objeto
    public carrito() {
        this.productos = new ArrayList<>();
        this.total = 0.0;
    }

    // Método para añadir un producto al carrito
    public void añadirProducto(Producto producto) {
        if (producto != null) {
            this.productos.add(producto);
            calcularTotal(); // Recalcula automáticamente al añadir
        }
    }

    // Método para remover un producto del carrito
    public boolean removerProducto(Producto producto) {
        boolean eliminado = this.productos.remove(producto);
        if (eliminado) {
            calcularTotal(); // Recalcula automáticamente al eliminar
        }
        return eliminado;
    }

    // Método interno para calcular el total acumulado
    public void calcularTotal() {
        double suma = 0.0;
        for (Producto prod : productos) {
            suma += prod.getPrecio();
        }
        this.total = suma;
    }

    // --- Métodos de obtención (Getters) ---
    public List<Producto> getProductos() {
        return productos;
    }

    public double getTotal() {
        return total;
    }

    // Método para mostrar el contenido del carrito
    public void mostrarCarrito() {
        System.out.println("--- CONTENIDO DEL CARRITO ---");
        if (productos.isEmpty()) {
            System.out.println("El carrito está vacío.");
        } else {
            for (Producto prod : productos) {
                System.out.println("- " + prod.getNombre() + " ($" + prod.getPrecio() + ")");
            }
        }
        System.out.println("TOTAL: $" + total);
        System.out.println("-----------------------------");
    }
}