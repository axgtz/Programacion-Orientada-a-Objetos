/*Alejandro Gutierrez
 * 28 de Septiembre 2015
 * Ejecutable para explotar clase Rectangulo
 */

import java.util.Scanner;

public class EjectuableGeometrico {

	public static void main(String[] args) {
		//Declarar variables 
		Rectangulo r; 
		Circulo c;
		Scanner lec;
		double ladoLargo, ladoCorto, radio;
				
		//Rectangulo Area y Perimetro
		lec = new Scanner (System.in);		
		System.out.println("Escribe los dos lados");
		ladoLargo = lec.nextDouble();
		ladoCorto = lec.nextDouble();
		r = new Rectangulo(ladoLargo, ladoCorto); //Instanciando la clase rectangulo, es como add object
		System.out.println("El perimetro es " + r.calcularPer(ladoLargo, ladoCorto));
		System.out.println("El area es " + r.calcularArea(ladoLargo, ladoCorto));
		
		//Circulo Perimetro y Area
		System.out.println("Escribe el radio");
		radio = lec.nextDouble();
		c = new Circulo(radio);
		System.out.println("El area es " + c.calcularArea(radio));
		System.out.println("El perimetro es " + c.calcularPer(radio));

	}

}
