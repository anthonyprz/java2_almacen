public class Manzana  {
	
	//propiedades 
	private String tipoManzana;
	private String procedencia;
	private String color;
	private Double eurosKilo;
	private Distribuidor distribuidor;


		//-------------getters-------------
		public String getTipoManzana(){
			return this.tipoManzana;
		}
		public String getProcedencia(){
			return this.procedencia;
		}
		public String getColor(){
			return this.color;
		}
		public Double getEurosKilo(){
			return this.eurosKilo;
		}
		public Distribuidor getDistribuidor(){
			return this.distribuidor;
		}
		//-------------setters----------------
		public void setTipoManzana (String tipoManzana){
			this.tipoManzana = tipoManzana;
		}
		public void setProcedencia (String procedencia){
			this.procedencia = procedencia;
		}
		public void setColor (String color){
			this.color = color;
		}
		public void setEurosKilo(Double eurosKilo){
			this.eurosKilo = eurosKilo;
		}
		public void setDistribuidor (Distribuidor distribuidor){
			this.distribuidor = distribuidor;
		}

}