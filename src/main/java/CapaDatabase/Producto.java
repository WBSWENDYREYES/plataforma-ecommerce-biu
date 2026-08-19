package CapaDatabase;

public class Producto {

	private int idproducto;
    private String referencia;
    private String nombre;
    private String descripcion;
    private double precio;
    private int existencia;
    private int idcategoria;

    // Constructor
    public Producto(int idproducto,String referencia, String nombre, String descripcion, double precio, int existencia,int idcategoria) {
        this.idproducto = idproducto;
        this.referencia = referencia;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.existencia = existencia;
        this.idcategoria = idcategoria;
           }
    // Métodos (Propiedades)
    public int getidproducto () {
        return idproducto;
    }
    public void setidproducto (int idproducto) {
        this.idproducto = idproducto;
    }
    public String getReferencia() {
        return referencia;
    }    
    public void setReferencia(String referencia) {
    	this.referencia = referencia;
    }  
    public String getNombre() {
        return nombre;
    }
    public void setNombre( String nombre) {
        this.nombre = nombre;
    }
    
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

     public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public int getExistencia() {
        return existencia;
    }
    public void setExistencia(int existencia) {
        this.existencia = existencia;
    }
    public int getIdcategoria() {
        return idcategoria;
    }
    public void setIdcategoria(int idcategoria) {
        this.idcategoria = idcategoria;
    }
    public String getDetalles() {
        return "Producto: " + descripcion + " - Precio: " + precio;
    }

    
    
}
