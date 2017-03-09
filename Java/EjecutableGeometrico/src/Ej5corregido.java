/*Alejandro Gutierrez
 * 30 de Septiembre 2015
 * Ejecutable para explotar clase Rectangulo y Circulo
 * Ejercicio 5 cuad de ej.
 */
import java.util.Scanner;


public class Ej5corregido {
	
	
    public static void main(String[] args) {

   
	    int nOfi, nTapetes,z ,i,r,c ;
		double largoOf, anchoOf, radio, areaLibre, areaOf,areaTapetes;  
		areaLibre = 0;
		areaOf = 0;
		
		Scanner lec;
		
		r = new rectangulo(largoOf,anchoOf);
		c = new Circulo (radio);
		
		lec = new Scanner(System.in);
		System.out.println("Escribe el numero de oficinas:");
		nOfi = lec.nextInt();
		
		for(i=1;i<=nOfi;i++){
			System.out.println("Escribe las medidas de la oficina(largo y ancho) en la oficina "+ i);
			
			largoOf = lec.nextDouble();
			anchoOf = lec.nextDouble();
			
			r = rectangulo.calcularArea(); 
			
			areaOf = areaOf + r;
			
			System.out.println("Escribe el numero de tapetes en la oficina" + i);
		    nTapetes = lec.nextInt();
	
			for(z=1;z<=nTapetes;z++){
				System.out.println("Escribe el radio del tapete en la oficina + i");
			    radio = lec.nextDouble();
			    c = circulo.calcularArea();
			    areaTapetes = areaTapetes + c;
			}
		}
		
		areaLibre = areaOf - areaTapetes;
		System.out.println("Area sin tapete: " + areaLibre);
		System.out.println("Listo");
		}
}