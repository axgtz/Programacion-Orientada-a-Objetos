/*
 * @Roberto Alejandro Gutiérrez Guillén
 * 26/10/2015
 */
import java.util.Scanner;

public class EjecutableEscuelaNatacion {
	final private static int PRECIO=1000;

	public static void main(String[] args) {
		int totalAlbercas; 
		Scanner lec = new Scanner(System.in);
		double ancho,largo, areaTotal, dinero; 
		EscuelaNatacion eN = new EscuelaNatacion("Natacion"," Guerrero #3"); 
		
		System.out.println("¿Cuantas Albercas quieres? LIMITE 10");
		totalAlbercas = lec.nextInt();
		
		for(int i = 1;i<=totalAlbercas;i++){
			System.out.println("Dame las dimensiones de la alberca "+ i + ": ");
			largo = lec.nextDouble();
			ancho = lec.nextDouble();
		    eN.altaAlberca(largo, ancho); 
		}
		dinero = eN.calcularArea() * 1000; 
		System.out.println(" Total: " + dinero);
	}
}
