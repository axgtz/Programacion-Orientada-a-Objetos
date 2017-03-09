/*Alejandro Gutierrez
 * 23 de Septiembre 2015
 * Ejecutable para explotar clase Cientifico 2
 */

public class EjecutableCientifico2 {

	public static void main(String[] args) {
		// Declarar Variables que me interesa
		Cientifico2 c1,c2; 
		
		c1 = new Cientifico2();
		c1.setNombre("Fernando");
		System.out.println("Dime c1 cómo te llamas? " + c1.getNombre());
		System.out.println("c1 convierte celsius a fahrenheit " + c1.convierteCaF(-40));
		
		
		c2 = new Cientifico2("Juan Carlos",18,"Telecomunicaciones");
		System.out.println("Dime c2 cual es tu especialidad? " + c2.getEspecialidad());
		System.out.println("c1 convierte fahrenheit a celsius " + c1.convierteFaC(-40));
		
		

	}

}
