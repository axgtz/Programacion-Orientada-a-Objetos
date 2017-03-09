/*Alejandro Gutierrez
 * 28 de Septiembre 2015
 * Clase Rectangulo
 */

public class Rectangulo {

	//Atributos
		private double ladoLargo;
		private double ladoCorto;
		
		//Constructores
		public Rectangulo(){
		}
		
		public Rectangulo(double ladoLargo, double ladoCorto){
			this.ladoLargo = ladoLargo;
			this.ladoCorto = ladoCorto;
			
		}
		
		//getters(funcion)
		public Double ladoCorto(){
		return ladoCorto;
		
		}
		
		public Double ladoLargo(){
			return ladoLargo;
		}
		
		//Setters (metodo)
		public void setladoLargo(double ladoLargo) {
		this.ladoLargo = ladoLargo;
		
		}
		
		public void setladoCorto(double ladoCorto) {
		this.ladoCorto = ladoCorto;
			
		}
		
		//Funcion para calcular area
		public double calcularArea(){
			double area;
					
			area = (ladoLargo * ladoCorto);
			return area;
		}
		
		//Funcion para calcular perimetro
		public double calcularPer(){
			double per;
					
			per =( ladoLargo  + ladoCorto ) * 2;
			return per;
		}
		
		//toString 
		public String toString(){
			StringBuilder rectangulo;   
			
			rectangulo = new StringBuilder();     //Constructor nulo 
			rectangulo.append("Lados del Rectangulo:(ladoCorto, ladoLargo) " + ladoCorto + " ") ;
			rectangulo.append(ladoLargo+"\n");

			return rectangulo.toString();
			}
		
		//compareTo area
		public int compareTo(Rectangulo otro){ // parametro de tipo rectangulo
			int res;

			if(calcularArea() == otro.calcularArea())
			   res = 0;
		    else
			   if(this.calcularArea()>otro.calcularArea())
			      res = 1;
			   else
			      res = -1;
			return res;
		}
		
		//equals
		public boolean equals(Rectangulo otro){
		    boolean res;
		
		    if(this.calcularArea()==otro.calcularArea())
		    	res =true;
		    else
		    	res=false;
		    return res;
		    
		}
}
		
