package CapaDatabase;

public class Categoria {
    // Atributos
	    private int id;
	    private String nombre;

				
	    //  Constructor
	    public Categoria(int id, String nombre) {
	        this.id = id;
	        this.nombre = nombre;
	     	    }
	    public int getid() {
	        return id;
	    }

	    public void setid(int id) {
	        this.id = id;
	    }

	    public String getnombre() {
	        return nombre;
	    }

	    public void setnombre(String nombre) {
	        this.nombre = nombre;
	    }

}