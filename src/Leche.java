public class  Leche {
	
	//propiedades 
	private String tipo;
	private String procedencia;
	private Double eurosLitro;
	private Distribuidor distribuidor;


		//-------------getters-------------
		public String getTipo(){
			return this.tipo;
		}
		public String getProcedencia(){
			return this.procedencia;
		}
		public Double getEurosLitro(){
			return this.eurosLitro;
		}
		public Distribuidor getDistribuidor(){
			return this.distribuidor;
		}
		//-------------setters----------------
		public void setTipo (String tipo){
			this.tipo = tipo;
		}
		public void setProcedencia (String procedencia){
			this.procedencia = procedencia;
		}
		public void  setEurosLitro(Double eurosLitro){
			this.eurosLitro = eurosLitro;
		}
		public void setDistribuidor (Distribuidor distribuidor){
			this.distribuidor = distribuidor;
		}

}