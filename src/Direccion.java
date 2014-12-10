public class Direccion {

	private String ciudad;
	private int codigoPostal;
	private String calle;
	private int numero;


	//-------------getters-------------

	public String getCiudad (){
		return this.ciudad;
	}
	public int getCodigoPostal(){
		return this.codigoPostal;
	}
	public String getCalle (){
		return this.calle;
	}
	public int getNumero(){
		return this.numero;
	}
	//-------------setters----------------
	public void setCiudad (String ciudad){
		this.ciudad = ciudad;
	}
	public void setCodigoPostal (int codigoPostal){
		this.codigoPostal = codigoPostal;
	}
	public void setCalle (String calle){
		this.calle = calle;
	}
	public void setNumero (int numero){
		this.numero = numero;
	}
}