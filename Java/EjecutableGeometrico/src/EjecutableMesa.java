/*Alejandro Gutierrez
 * 28 de Septiembre 2015
 * Ejecutable para explotar clase Rectangulo 
 * Problema 3 de cuad de ej
 */
public class EjecutableMesa {
	
	public static void main(String[] args) {
		Rectangulo r1, r2, r3; 
		double total;
		
	    r1 = new Rectangulo(2.0, 1.8);
		r2 = new Rectangulo(3.0, 2.0);
		r3 = new Rectangulo(1.5, 1.0);
		
		total = r1.calcularArea() + r2.calcularArea() + r3.calcularArea();
		System.out.println("El total es " + total);


	}


}
