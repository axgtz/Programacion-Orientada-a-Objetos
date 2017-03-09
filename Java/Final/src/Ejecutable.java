//@Roberto Alejandro Gutierrez Guillen
public class Ejecutable {

	public static void main(String[] args) {
		Musica m = new Musica("Alex");
		
		m.agregaArtista("Miguel Bose");
		Artista mb = m.getArtista("Miguel Bose");
		
		System.out.println(m.toString());
	}

}
