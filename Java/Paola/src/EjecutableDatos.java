import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//Con lectura de Datos
public class EjecutableDatos {

	public static void main(String[] args) {
		
		Hotel miHotel;
		File unArchivo;
		Scanner lectura;
		String nombre;
		int tipo, dias;
		boolean resp;
		

		miHotel= new Hotel("Hilton", "Polanco");
		
		unArchivo= new File("Datos.txt");
		
		try {
			lectura= new Scanner(unArchivo);
			int n = lectura.nextInt();
			for(int i=1; i<=n;i++){
				nombre=lectura.next();
				tipo=lectura.nextInt();
				dias=lectura.nextInt();
				resp=miHotel.alta(nombre, tipo, dias);
			}
			
			System.out.println(miHotel.toString());
			
			lectura.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
