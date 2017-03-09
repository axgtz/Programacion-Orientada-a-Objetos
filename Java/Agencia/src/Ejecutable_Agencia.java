/*Alejandro Gutierrez Guillén
 * 07 de Octubre 2015
 * Ejecutable Autos
 */
import java.util.Scanner;

public class Ejecutable_Agencia {

	public static void main(String[] args) {
	    String marca, nombreC;
		double nKm,kmRec, rentaT = 0;
		int nLic, ano, numD, auto, numC;
		boolean dev;
		Scanner lec;
		Autos a1, a2, a3, a4, a5;
		
		lec = new Scanner(System.in);
		
		System.out.println("Escribe el numero de clientes ");
		numC = lec.nextInt();
		
	    for(int i=0; i<numC; i++){
	    	
	    lec = new Scanner(System.in);
		System.out.println("Escribe en orden el numero de la licencia y el nombre del cliente ");
		nLic = lec.nextInt();
		nombreC = lec.next();
		
		System.out.println("Escribe el numero de días que desea tener el auto: ");
		numD = lec.nextInt();
		
		System.out.println("¿Que auto desea rentar? (1, 2, 3, 4, 5 )");
		auto = lec.nextInt();
		
		switch(auto){
		 case 1: a1 = new Autos();
		        rentaT = a1.renta(numD, 2001, 10065);
			break;
		 case 2: a2 = new Autos();
		        rentaT = a2.renta(numD, 2002, 84040);
		   	break;
		 case 3: a3 = new Autos();
		        rentaT = a3.renta(numD, 2009, 50700);
			break;
		 case 4: a4 = new Autos();
		        rentaT = a4.renta(numD, 2010, 18949);
			break;
		 case 5: a5 = new Autos();
		        rentaT = a5.renta(numD, 2015, 0);
		 }
		System.out.println("El total a pagar es: " + rentaT);
	    }
	    
	    System.out.println("¿Desea devolver el auto? (true & false)");
	    dev = lec.nextBoolean();
	    
		if(dev == true){
			System.out.println("¿Cuanto kilometros recorrio?");
		    kmRec = lec.nextDouble(); 
		    
		    System.out.println("¿Que auto usó? (1, 2, 3, 4, 5)");
		    auto = lec.nextInt(); 
		    
			switch(auto){
			 case 1: a1 = new Autos();
			         a1.devolucion(kmRec);
				break;
			 case 2: a2 = new Autos();
			         a2.devolucion(kmRec);
				break;
			 case 3: a3 = new Autos();
			         a3.devolucion(kmRec);
				break;
			 case 4: a4 = new Autos();
			         a4.devolucion(kmRec);
				break;
			 case 5: a5 = new Autos();
			         a5.devolucion(kmRec);
			 }
		}
		System.out.println("Adios!"); 
	}
}
