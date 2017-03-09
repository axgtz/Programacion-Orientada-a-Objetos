//@Roberto Alejandro Gutierrez Guillen
public class ejecutableSemPer {

	public static void main(String[] args) {
		SeminarioPers sp;

		sp = new SeminarioPers("ITAM", "Hoy");
		sp.agregaParticipante("asda523", "Juan", 19, "Hombre", "Ing comp", "O+", "Divorciado");
		sp.agregaParticipante("ghsd123a", "Pepe", 15, "Hombre", "Ing tele", "A+", "Casado");
		sp.agregaParticipante("214sfd", "Paula", 18, "Mujer", "Ing neg", "B+", "Soltera");
		
		System.out.println(sp.toString());
	}

}
