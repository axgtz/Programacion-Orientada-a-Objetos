/*Alejandro Gutierrez
 * 21 de Septiembre 2015
 * Versión de Lourdes
 */

public class Cientifico2 {
	//Atributos
	private String nombre;
	private String especialidad;
	private int edad;
	
	//Constructores
	public Cientifico2(){
		
	}
	
		public Cientifico2(String nombre, int edad, String especialidad){
			this.nombre = nombre;
			this.especialidad = especialidad;
			this.edad = edad;
		}
		//getters(funcion)
		public String getNombre(){
			return nombre;
		}
		
		public String getEspecialidad(){
			return especialidad;
		}
		
		public int getEdad(){
			return edad;
		}
		
		//Setters (metodo)
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		
		public void setEspecialidad(String especialidad) {
			this.especialidad = especialidad;
		}
		
		public void setEdad(int edad) {
			this.edad = edad;
		}
		//Funciones de Conversion de grados
		public double convierteCaF(double grados){
			double resp;
			
			resp = (9.0/5.0) * grados + 32;
			return resp;
		}
		
		public double convierteFaC(double grados){
			double resp;
			
			resp = (5.0/9.0) * (grados - 32);
			return resp;
		}
		
		//Calcular Factorial
		public double convierteFac(double fac){
			double resp;
			
			resp = 1;
			for(int i=2; i<=fac; i++){
				resp = resp * i;
			}
			
			return resp;
		}
		
}












