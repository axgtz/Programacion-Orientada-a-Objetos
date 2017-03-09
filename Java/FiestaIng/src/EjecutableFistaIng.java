/*
 * @Roberto Alejandro Gutierrez Guillen
 */
public class EjecutableFistaIng {

	public static void main(String[] args) {
		FiestaIngenieria f = new FiestaIngenieria("perif", "fiesa", "mañana");
		
		f.altaInvitado("Peper", "Ing", 5, 2341);
		f.altaInvitado("peogf", "wet", 4, 234234);
		System.out.println("Numero de personas de la carrera Ing: " + f.nCarrera("Ing"));
		System.out.println("Prom del semestre: " + f.promSemestre());
		
	}

}
