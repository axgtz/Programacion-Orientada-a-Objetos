/*Alejandro Gutierrez
 * 28 de Septiembre 2015
 * Ejecutable para explotar clase Rectangulo y
 * Ejercicio 1 o 2 cuad de ej.
 */

public class EjecutableRectangulo {

	public static void main(String[] args) {
		Rectangulo r, r1, r2;
		double perimetro;
		int resComp;
		
		r = new Rectangulo(1.1, 2.2);
		System.out.println("Area" +r.calcularArea());
		System.out.println(r.toString());
		
		r.setladoLargo(4.0);
		r.setladoCorto(2.10);
		System.out.println(r.toString());
		
		perimetro = r.calcularPer();
		
		System.out.println("El perimetro es " + perimetro);
		System.out.println("Area" + r.calcularArea());
		r1 = new Rectangulo(3,6);
		r2 = new Rectangulo(2,3);
		resComp=r1.compareTo(r2);
		if (resComp==0)
			System.out.println("r1 y r2 son iguales");
		else 
			if(resComp>0)
				System.out.println("r1 es mayor que r2");
			else 
				System.out.println("r1 es menor que r2");
		System.out.println("Los objetos r1 y r2 son iguales "+ r1.equals(r2));

	}

}
