package CapaDatabase;

public class Usuario {
    // Atributos
	    private int idusuario;
	    private String nombre;
	    private String telefonos;
	 	private String email;
		private String password;
		private int iddireccion;
		private int idroles;
					
	    //  Constructor
	    public Usuario(int idusuario, String nombre, int iddireccion, String telefonos,String email,  String password, int idroles) {
	        this.idusuario = idusuario;
	        this.nombre = nombre;
	        this.iddireccion = iddireccion;
		    this.telefonos = telefonos;
	        this.email = email;
	    	this.password = password;
	    	this.idroles = idroles;
	    }

	    
	    public int getIdusuario() {
	        return idusuario;
	    }

	    public void setIdusuario(int idusuario) {
	        this.idusuario = idusuario;
	    }

	    public String getNombre() {
	        return nombre;
	    }

	    public void setNombre(String nombre) {
	        this.nombre = nombre;
	    }

	    public int getidDireccion() {
	        return iddireccion;
	    }

	    public void setidDireccion(int iddireccion) {
	        this.iddireccion = iddireccion;
	    }

	    public String getTelefonos() {
	        return telefonos;
	    }

	    public void setTelefonos(String telefonos) {
	    	this.telefonos = telefonos;
	    }
	    public String getEmail() {
	        return email;
	    }

	    public void setEmail(String email) {
	        this.email = email;
	    }
	    public String getPassword() {
	        return password;
	    }

	    public void setPassword(String password) {
	    	this.password = password;
	    }
	    public int getidroles() {
	        return idroles;
	    }

	    public void setidroles(int idroles) {
	        this.idroles = idroles;
	    }

}