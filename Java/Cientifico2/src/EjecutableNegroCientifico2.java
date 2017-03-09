import java.util.Scanner;

/*Alejandro Gutierrez
 * 25 de Septiembre 2015
 * Ejecutable para explotar clase Cientifico 2
 */

public class EjecutableNegroCientifico2 {

	public static void main(String[] args) {
		//Declarar variables 
		Cientifico2 c; 
		Scanner lec;
		String nombre, especialidad;
		double cantidad, r;
		int opcion, edad;
		boolean trabajar;
		
		c = new Cientifico2();
		
		System.out.println(c.convierteCaF(21));
		
	
		r=-1;
		//Preguntar sobre edad, nombre y especialidad
		lec = new Scanner (System.in);
		System.out.println("Indica el nombre, edad y especialidad del Cientifico");
		nombre = lec.nextLine();
		edad = lec.nextInt();
		especialidad = lec.nextLine();
		c = new Cientifico2(nombre, edad, especialidad);
		
		System.out.println("¿Quieres que trabaje el cientifico? True o False");
		trabajar = lec.nextBoolean();
		
		while(trabajar = true){
		
		 System.out.println("Opciones:\n1. Para convertir de Farenheit a Celsius esscribir 1"
				+ "\n2. Para convertir de Celius a Farenheit 2\n3. Para resolver factorial 3");
		 
         opcion = lec.nextInt();
		
         System.out.println("Escribe el numero que quieres que use para la operacion: ");
         cantidad = lec.nextDouble();
        
		 switch(opcion){
		 case 1: r = c.convierteFaC(cantidad);
			break;
			
		 case 2: r = c. convierteCaF(cantidad);
			break;
		
		 case 3: r = c. convierteFac(cantidad);
		 }
		 System.out.println("El resultado es: " + r);
		 System.out.println("¿Quieres que trabaje el cientifico? True o False");
		 trabajar = lec.nextBoolean();
		 
		}
		System.out.println("Comunicacion Terminada...");
		

	}

}
