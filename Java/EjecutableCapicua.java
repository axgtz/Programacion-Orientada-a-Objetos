import java.util.Scanner;

public class EjecutableCapicua {

		public static void imprimeArreglo(double[] a, int n){
			
			for(int i=0;i<n;i++)
				System.out.print(a[i]+"t");
			System.out.println();
		}
		public static int leeArreglo(double[] a){
			Scanner lec= new Scanner(System.in);
			int n;
			
			System.out.println("¿Celdas?");
			n=lec.nextInt();
			for (int i=0;i<n;i++){
				System.out.println("Valores");
			    a[i]=lec.nextDouble();
			}
			return n;
		}
		public static void main(String[] args){
		double[] a={3, 4, 5, 4, 6};
		System.out.println(ManjeadorArreglos.capicua(a, 5));
		}
		
		
	
		

}
