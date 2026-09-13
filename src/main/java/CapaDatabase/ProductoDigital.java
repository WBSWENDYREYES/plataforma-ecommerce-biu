package CapaDatabase;

public class ProductoDigital extends Producto {

    private String formatoArchivo;
    private double tamanoArchivo;
    

    public ProductoDigital(int idproducto, String referencia, String nombre,
                          String descripcion, double precio, int existencia,
                          int idcategoria, String formatoArchivo,
                          double tamanoArchivo) {

        super(idproducto, referencia, nombre, descripcion, precio,
              existencia, idcategoria);

        this.formatoArchivo = formatoArchivo;
        this.tamanoArchivo = tamanoArchivo;
    }

    public String getformatoArchivo() {
        return formatoArchivo;
    }

    public void setformatoArchivo(String formatoArchivo) {
        this.formatoArchivo = formatoArchivo;
    }

    public double getTamanoArchivo() {
        return tamanoArchivo;
    }

    public void setTamanoArchivo(double tamanoArchivo) {
        this.tamanoArchivo = tamanoArchivo;
    }
    
    
    

    
}