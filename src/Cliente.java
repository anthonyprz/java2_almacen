public class Cliente {

	private String nombre;
	private String apellidos;
	private String dni;
	private Direccion direccion;
	private Double num_socio;
	private Double dto;

	//getters  
	public String getNombre(){
		return this.nombre;
	}
	public String getApellidos(){
		return this.apellidos;
	}
	public String getDni(){
		return this.dni;
	}
	public Direccion getDireccion(){
		return this.direccion;
	}
	public Double getNum_socio(){
		return this.num_socio;
	}
	public Double getDto(){
		return this.dto;
	}
	//setters
	public void setNombre (String nombre){
		this.nombre = nombre;
	}
	public void setApellido (String apellidos){
		this.apellidos = apellidos;
	}
	public void setDni (String dni){
		this.dni = dni;
	}
	public void setDireccion (Direccion direccion){
		this.direccion = direccion;
	}
	public void setNum_socio (Double num_socio){
		this.num_socio = num_socio;
	}
	public void setDto (Double dto){
		this.dto = dto;
	}
}