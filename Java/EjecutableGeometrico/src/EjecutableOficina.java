/*Alejandro Gutierrez
 * 28 de Septiembre 2015
 * Ejecutable para explotar clase Rectangulo y Circulo
 */
import java.util.Scanner;

public class EjecutableOficina {

	public static void main(String[] args) {
		Rectangulo oficina; 
		Circulo c1, c2, c3;
		Scanner lec;
		double largoOf, anchoOf, radio, r1, r2, r3, area;
		
		lec = new Scanner(System.in);
		System.out.println("Escribe las medidas de la oficina(largo y ancho): ");
		
		largoOf = lec.nextDouble();
		anchoOf = lec.nextDouble();
		
		System.out.println("Escribe medidas de cada tapete (son 3 medidas de radios): ");
		
		r1 = lec.nextDouble();
		r2 = lec.nextDouble();
		r3 = lec.nextDouble();
		
		oficina = new Rectangulo();
		oficina.setladoLargo(largoOf);
		oficina.setladoLargo(anchoOf);
		
		c1 = new Circulo(r1);
		c2 = new Circulo(r1);
		c3 = new Circulo(r1);
		
		area = oficina.calcularArea()- (c1.calcularArea() + c2.calcularArea() + c3.calcularArea());
		
		System.out.println("Area sin tapete: " + area);
		
		
	}

}
