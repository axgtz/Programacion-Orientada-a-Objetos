import java.util.ArrayList;
import java.util.Scanner;

/*
 * @Roberto Alejandro Gutiérrez Guillén
 * 23/10/2015
 */

public class EjecutableManejadorArreglos {
	
	public static final int CELDAS = 16;
	
    public static void imprimeArreglo(double [] a, int n){ //No se puede imprimir todo el arreglo, tienes que imprimir celda por celda
		
		for(int i=0; i<n; i++)
			System.out.println("\t " +a[i]); 
		System.out.println(); 
	}
	
    public static int leerArreglo(double []a){ 
    	Scanner lec = new Scanner(System.in);
    	int n; 
    	
    	System.out.println("Cuantas celdas vas a usar en el arreglo. Max: " + CELDAS);
    	n = lec.nextInt();
    	System.out.println("Escribe los valores de cada celda");
    	for(int i=0;i<n;i++)
    		a[i]=lec.nextDouble();
    	return n;
    }
	
    public static void main(String[] args){
    	ManejadorArreglosAlex m = new ManejadorArreglosAlex(); 
		int n;
		double[] a = new double[CELDAS];
		
		n = leerArreglo(a);
		System.out.println("Este es el arreglo: ");
		imprimeArreglo(a,n);
		System.out.println("--------------------");
		//m.corrimientoCircular(a, n, 2);
        System.out.println(m.capicua(a, n));
		imprimeArreglo(a,n);

	}
	
}









