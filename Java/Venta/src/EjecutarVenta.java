/*Alejandro Gutierrez Guillén
 * 02 de Octubre 2015
 * Ejercicio 19 creo cuad de ej.
 */

public class EjecutarVenta {

	public static void main(String[] args) {
	    Venta v1, v2;
	    int res;
	    
	    v1 = new Venta(850, "Andrea");
	    v2 = new Venta(2350, "Carlos");
	    System.out.println(v1.toString());
	    System.out.println(v2.toString());
	    
	    System.out.println("Comision de la primera venta 1 es " + v1.calComision());
	    System.out.println("Comision de la primera venta 2 es " + v2.calComision());
	    
	    res = v1.compareTo(v2);
	    if(res == 0)
	    	 System.out.println("Las ventas son iguales");
	    else
	    	if(res > 0)
	    		System.out.println("La venta 1 es mayor que la 2");
	    	else
	    		System.out.println("La venta 2 es mayor que la 1");
	}
}
