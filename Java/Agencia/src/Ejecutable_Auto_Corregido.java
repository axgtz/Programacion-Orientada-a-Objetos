/*Alejandro Gutierrez Guillén
 * 07 de Octubre 2015
 * Corregido de Lourdes
 */
import java.util.Scanner;
public class Ejecutable_Auto_Corregido {

	public static void main(String[] args) {
		Auto_Corregido a1, a2, a3;
		Scanner lec = new Scanner(System.in);
		String nombreC;
		
        a1 = new Auto_Corregido();
        nombreC = lec.nextLine();
        System.out.println(nombreC);
        
        a2 = new Auto_Corregido("Honda", 2006, 10000);
        a3 = new Auto_Corregido("Toyota", 2015);
        
        
        System.out.println(a1.toString());
        System.out.println(a2.toString());
        System.out.println(a3.toString());
        
        System.out.println("\n A pagar: " + a3.renta("Pepe", 1234, 12));
        System.out.println(a3.toString());
        
        a3.devoulcion(10000);
        System.out.println(a3.toString());
	}

}
