/*Alejandro Gutierrez
 * 30 de Septiembre 2015
 * Ejecutable para explotar clase Rectangulo y Circulo
 * Ejercicio 5 cuad de ej.
 */
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		int nOfi, nTapetes; 
		double largoOf, anchoOf, radio, areaLibre, areaOf, areaTapete;
		areaLibre = 0;
		areaTapete = 0;
		areaOf = 0;

		Scanner lec;
		
		lec = new Scanner(System.in);
		System.out.println("Escribe el numero de oficinas: ");
		nOfi = lec.nextInt();
		Rectangulo [] office = new Rectangulo [nOfi];
		
		for(int i=0; i<nOfi;i++){
		    System.out.println("Escribe las medidas de la oficina(largo y ancho) en la oficina "+ i);
			
			largoOf = lec.nextDouble();
			anchoOf = lec.nextDouble();
			office [i]  = new Rectangulo (largoOf,anchoOf);

		    System.out.println("Escribe el numero de tapetes en la oficina" + i);
		    nTapetes = lec.nextInt();
			Circulo [] tapete = new Circulo [nTapetes];
		    
		    for(int z=0; z<nTapetes ;z++){
		    System.out.println("Escribe el radio del tapete en la oficina + i");
		    radio = lec.nextDouble();
		    tapete [z]  = new Circulo (radio);
		    areaTapete = areaTapete + tapete[z].calcularArea();
		    }
		areaOf = areaOf + office[i].calcularArea();
		}
		areaLibre = areaOf - areaTapete;
		System.out.println("Area sin tapete: " + areaLibre);
		
		
	}

}
