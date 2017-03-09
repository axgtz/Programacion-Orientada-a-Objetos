import java.util.Scanner;

/*Alejandro Gutierrez
 * 21 de Septiembre 2015
 * Ejecutable para conversion de pesos a dlls
 */

public class EjecutableConversion {

	public static void main(String[] args) {
		double pesos, dlls;
		Scanner lec;
		
		lec = new Scanner (System.in);
		System.out.println("Dime cuanto pesos quieres convertir a dlls");
		pesos = lec.nextDouble();
		dlls = pesos/16.80;
		System.out.println("Equivale a los siguientes dlls : " + dlls);

	}

}
