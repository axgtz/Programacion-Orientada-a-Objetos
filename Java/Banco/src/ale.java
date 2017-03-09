/*Alejandro Gutierrez Guillén
 * 02 de Octubre 2015
 */
import java.util.Scanner;

public class Banco {

	public static void main(String[] args) {
		Cuenta c1, c2;
		double saldo, retiro, deposito;
		int nCuenta, nCuentas;
		String titular;
		boolean ret, nuevaCuenta, hacerDeposito;
		Scanner lec;
		
		lec = new Scanner(System.in);
		System.out.println("Escribe en orden el nombre del titular, en el siguiente parrafo; numero de cuenta y el saldo: ");
		
		titular = lec.nextLine();
		nCuenta = lec.nextInt();
		saldo = lec.nextDouble();
		
		System.out.println("Nombre del titular = " + titular);
		System.out.println("El numero de cuenta es = " + nCuenta);
		System.out.println("El saldo es = " + saldo);
		
		
		System.out.println("¿Desea hacer un retiro? (boolean)");
		ret = lec.nextBoolean(); 
		if(ret == true){
			System.out.println("Escriba la cantida a continuacion: ");
			retiro = lec.nextDouble(); 
			
			if(retiro < saldo){
				saldo = saldo - retiro;
			    System.out.println("Su saldo actual es: " + saldo);
			}
			else
				System.out.println("No tienes suficiente saldo para el retiro ");
		}
		
		System.out.println("¿Desea crear otra cuenta? (boolean)");
		nuevaCuenta = lec.nextBoolean(); 
		if(nuevaCuenta == true){
			lec = new Scanner(System.in);
			System.out.println("Escribe en orden el nombre del titular, en el siguiente parrafo; numero de cuenta y el saldo: ");
			titular = lec.nextLine();
			nCuenta = lec.nextInt();
			saldo = lec.nextDouble();

			System.out.println("Nombre del titular = " + titular);
			System.out.println("El numero de cuenta es = " + nCuenta);
			System.out.println("El saldo es = " + saldo);
			System.out.println("¿Desea hacer un retiro? (boolean)");
			
			hacerDeposito = lec.nextBoolean(); 
			if(hacerDeposito == true){
				System.out.println("Escriba la cantida que quiere depositar a continuacion: ");
				deposito = lec.nextDouble(); 
				c2 = new Cuenta(saldo, titular, nCuenta);
			    c2.hacerDeposito(deposito);
			    System.out.println("Su nuevo saldo es: " + saldo);
			}
	    }	
    System.out.println("Gracias por escoger el Banco Alex");
	}
}
