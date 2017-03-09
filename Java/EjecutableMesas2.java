/*JPaul VirueÃ±a Iturriaga
* 26-sep-15
* Este Ejecutable esta hecho para explotar las capacidades de la clase Rectangulo y la clase
* del Circulo de acuerdo con el ejercicio 5
*/
	import java.util.Scanner;
public class EjecutableMesas2 {
		
		public static void main(String[] args) {
			
			Scanner lec;
			double area, radio, r, c, base, altura, z, i, n, k;
			area=0;
			
			lec=new Scanner(System.in);
			System.out.println("¿Cuantas oficinas son?");
			n=lec.nextInt();
			
			for(z=1;z<=n;z++){
				System.out.println("Dame las medidas (ByA) de la oficina nº"+z);
				base=lec.nextInt();
				altura=lec.nextInt();
				
				r=rec.area();
				area=area+r;
				System.out.println("¿Cuantos tapetes tiene la oficina?");
				k=lec.nextInt();
				
				for(i=1;i<=k;i++){
					
					System.out.println("Dame el radio del tapete nº"+i);
					c=circ.area();
					area=area-c;
				}
			}
			System.out.println("El area descubierta es:"+area);
	
			System.out.println("Adios!");
	}

}
