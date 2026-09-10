package CapaDatabase;

public class ProductoFisico extends Producto {

    private double peso;
    private double alto;
    private double ancho;
    private double profundidad;

    public ProductoFisico(int idproducto, String referencia, String nombre,
                          String descripcion, double precio, int existencia,
                          int idcategoria, double peso, double alto,
                          double ancho, double profundidad) {

        super(idproducto, referencia, nombre, descripcion, precio,
              existencia, idcategoria);

        this.peso = peso;
        this.alto = alto;
        this.ancho = ancho;
        this.profundidad = profundidad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getProfundidad() {
        return profundidad;
    }

    public void setProfundidad(double profundidad) {
        this.profundidad = profundidad;
    }
}