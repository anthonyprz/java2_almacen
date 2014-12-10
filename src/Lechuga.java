public class Lechuga  {
	
	//propiedades 
	private String tipoLechuga;
	private String procedencia;
	private String color;
	private Double eurosKilo;
	private Distribuidor distribuidor;


		//-------------getters-------------
		public String getTipoLechuga(){
			return this.tipoLechuga;
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
		public void setTipoLechuga (String tipoLechuga){
			this.tipoLechuga = tipoLechuga;
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