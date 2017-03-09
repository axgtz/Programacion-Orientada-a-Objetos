/*Alejandro Gutierrez
 * 28 de Septiembre 2015
 * Clase Circulo
 */

public class Circulo {
	
	//Atributos
			private double radio;
			
	//Constructores
	public Circulo(){
		
	}
	
	public Circulo(double radio){
		this.radio = radio;

    }
	
	//getters(funcion)
	public Double getradio(){
	return radio;
	
	}
			
	//Setters (metodo)
	public void setradio(double radio) {
	this.radio = radio;
	
	}
	
	//Funcion para calcular area
			public double calcularArea(){
				double area;
						
				area = Math.PI * Math.pow(radio, 2);
				return area;
			}
			
	//Funcion para calcular el perimetro
			public double calcularPer(){
				double perimetro;
						
				perimetro = Math.PI * radio * 2;
				return perimetro;
			}
			
	//toString 
	public String toString(){
		StringBuilder circulo;   
		
		circulo = new StringBuilder();     //Constructor nulo 
		circulo.append("Radio de Circulo: " + radio) ;    //”append” es para juntar

		return circulo.toString();
		}
	//compareTo
	public int compareTo(Circulo otro){
		int res;

		if(radio == otro.radio)
		   res = 0;
	    else
		   if(radio>otro.radio)
		      res = 1;
		   else
		      res = -1;
		return res;
		}
}
