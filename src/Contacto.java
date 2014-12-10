public class Contacto {

	private String nombre;
	private String apellido;
	private int numTelefonico;
	private int edad;
	

	//-------------getters-------------
	public String getNombre(){
		return this.nombre;
	}
	public String getApellido(){
		return this.apellido;
	}
	public int getNumTelefonico(){
		return this.numTelefonico;
	}
	public int getEdad(){
		return this.edad;
	}
	
	//-------------setters-------------
	public void setNombre (String nombre){
		this.nombre = nombre;
	}
	public void setApellido (String apellido){
		this.apellido = apellido;
	}
	public void setNumTelefonico (int numTelefonico){
		this.numTelefonico = numTelefonico;
	}
	public void setEdad (int edad){
		this.edad = edad;
	}
	
}