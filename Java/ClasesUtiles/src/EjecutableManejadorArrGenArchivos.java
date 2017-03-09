//@Roberto Alejandro Gutierrez Guillen

public class EjecutableManejadorArrGenArchivos {

	public static void main(String[] args) {
		String[] noms = {"Pepetls", "Sebastian", "Mariano", "Javier", "Alex"};
		//File e = new File("nombres.txt")
		
		for(int i = 0; i <noms.length; i++)
			System.out.println(noms[i]);
		System.out.println(); //Impresion en falso
		
		ManejadorArreglosGenerico.corrimientoDer(noms, noms.length, 1);
		
		for(int i = 0; i <noms.length; i++)
			System.out.println(noms[i]);
		System.out.println(); //Impresion en falso
	}

}
