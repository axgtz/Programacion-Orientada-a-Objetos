/*Alejandro Gutierrez Guillén
 * 30 de Septiembre 2015
 * Ejercicio 8 cuad de ej.
 */

public class CientificoMatematico {
	private String nombre;
	private String aEspecialidad;
	private int edad;
	
	public CientificoMatematico() {
	}
	
	public CientificoMatematico(String nombre, String aEspecialidad, int edad){
		this.nombre = nombre;
		this.aEspecialidad = aEspecialidad;
		this.edad = edad;
	}
	
	//getters
	public int getEdad(){
		return edad;
	}
	
	public String getNombre(){
		return nombre;
	}
	
	public String aEspecialidad(){
		return aEspecialidad;
	}
	
	//Setters
	public void setEdad(){
		this.edad=edad;
	}
	
	public void setaEspecialidad(){
		this.aEspecialidad=aEspecialidad;
	}
	
	public void setNombre(){
		this.nombre=nombre;
	}
	
	public String toString(){
		StringBuilder cad= new StringBuilder();
		cad.append("\n Soy un Cientifico Matematico");
		cad.append("\n Me llamo" + nombre);
		cad.append("\n Tengo" +edad+ "años");
		cad.append("\n Mi area de especialidad es " + aEspecialidad);
		
		return cad.toString();
	}
	
	public int compareTo(CientificoMatematico otro){
		int res;

		if(this.nombre.equals(otro.nombre ))
		   res = 0;
	    else
		   if(this.nombre.compareTo(otro.nombre)>0)
		      res = 1;
		   else
		      res = -1;
		return res;
	}
	
	//Funciones 
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
	
	public double convierteFac(double fac){
		double resp;
		
		resp = 1;
		for(int i=2; i<=fac; i++){
			resp = resp * i;
		}
		
		return resp;
	}
	//Funcion Orden Creciente
	public boolean ordenaCreciente(int num1, int num2){
		boolean res;
		
		if(num1<num2)
			res = true;
		else
			res = false;
		return res;		
	}
	
	//Funcion Ordena Creciente
	public String ordenCreciente(int num1, int num2){
		StringBuilder cad = new StringBuilder();
	
		if(num1<num2)
			cad.append(num1 + "-" + num2);
		else
			cad.append(num2 + "-" + num1);
		return cad.toString();		
	}
	
	//Funcion es impar
	public boolean esImpar(int num){
		boolean res;
			
		if(num%2 != 0)
		   res= true;
		else
		   res= false;
			
		return res;		
	}
	
	/*Otra manera de hacer: es impar
	 * public boolean esImpar(int num){
		boolean res = true;
			
		if(num%2 != 0)
		   res= false;

		return res;		
	} 
	 */
	
	//Funcion calcula F1 ej 13
	public double calcF1(double x){
		
		return res;
	}
	
	//Funcion calcula F2 ej 13 (x es parametro)
	public double calcF2(int x){
		double res = 0;
			
		switch (x%4){
		case 0: res = Math.pow(x, 2);
		   break;
		case 1: res = (double) x/6.0; //Ese double es un "cast" cambias la variable de manera provicional(mientras dura la ejecucion)
		   break;
		case 2: res = Math.sqrt(x);
		   break;
		case 3: res = Math.pow(x, 3) + 5;
		}
		return res;
		}
		//Funcion calcula F3 
	public double calcF3(int v, int num){
		double res;
		
		switch (num){
		case 1: res = 100 * v;
		   break;
		case 2: res = Math.pow(100, v);
		   break;
		case 3: if(v!=0)
			        res=(double)100/v;
		        else
		            res =-1; 
		   break;
		default: res = 0;
		}
		return res;
	}
}




















