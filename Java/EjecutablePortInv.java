
public class EjecutablePortInv {

	public static void main(String[] args) {
		PortafolioInversion guti= new PortafolioInversion();
		
		guti.altaInversion("A", 100, 5, 90);
		guti.altaInversion("B", 30, 10, 15);
		guti.altaInversion("C", 10, 5, 5);
		
		if (guti.encuentraInv("C")==true)
			System.out.println ("Se invirtió en C");

	}

}
