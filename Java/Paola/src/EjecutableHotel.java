import java.io.File;

//Prueba funcionalidad de Clases.

public class EjecutableHotel {

	public static void main(String[] args) {
		
		boolean alta1, alta2, dias;
		String info;
		
		Hotel miHotel;
		miHotel= new Hotel("Hilton", "Polanco");
		
		alta1=miHotel.alta("Paola", 1, 5);
		
		alta2=miHotel.alta("Julia", 1, 5);
		
		System.out.println(alta1);
		
		info=miHotel.baja("Julia");
		
		System.out.println(info);
		
		System.out.println(miHotel.toString());
		
		dias=miHotel.prolongarEstancia("Paola", 10);
		System.out.println(dias);
		
		System.out.println(miHotel.toString());

	}

}
