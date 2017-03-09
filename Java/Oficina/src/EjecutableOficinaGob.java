import java.util.Scanner;

/*
 * @Roberto Alejandro Gutiérrez Guillén
 * Corregido Lourdes
 * 23/10/2015
 */
public class EjecutableOficinaGob {
	
	public static void main(String[] args){
		
	
	OficinaGob ofiG;
	String nom;
	double pob;
	int n;
	Scanner lec = new Scanner(System.in);
	
	ofiG = new OficinaGob("Martin Cuenta");
	System.out.println("¡Cuantos estados vas a dar de alta?");
	n=lec.nextInt();
	for(int i = 1; i<=n; i ++){
		System.out.println("¿Nombre del Estado?");
		nom = lec.next();
		System.out.println("¿Poblacion?");
		pob = lec.nextDouble(); 
		ofiG.altaInfo(pob, nom);
	}
	}
}
	