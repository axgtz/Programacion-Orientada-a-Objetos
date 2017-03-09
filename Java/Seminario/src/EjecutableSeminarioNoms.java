import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;	

//@Roberto Alejandro Gutierrez Guillen
public class EjecutableSeminarioNoms {

	public static void main(String[] args) {
		SeminarioNoms s;
		String nom;
		int n;
		File ent = new File("Nombre.txt");
		
		try(Scanner lecArch = new Scanner(ent)){
			s = new SeminarioNoms("ITAM", "18/11/2015");
			n = lecArch.nextInt();
			lecArch.nextLine();
			
			for(int i = 0 ;i<n ;i++){
				nom = lecArch.next();
				System.out.println(nom);
				System.out.println(s.agregaParticipante(nom));
			}
			System.out.println(s.toString());
		}catch(FileNotFoundException fnfe){
			System.err.println("ERROR " + fnfe);
			System.exit(-1);
		}
	}
}
