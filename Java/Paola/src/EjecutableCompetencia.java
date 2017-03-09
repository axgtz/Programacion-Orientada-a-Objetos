
public class EjecutableCompetencia {

	public static void main(String[] args) {
		
		Competencia nacional;
		boolean resp1, resp2, resp3;
		String info;
		int cuantos;
		
		
		nacional= new Competencia("Nacional", "IceDome", 2015);
		
		resp1=nacional.alta("Paola", "Mejia", 0, 2013, 'F', "Pas DF");
		resp2=nacional.alta("Julia", "Castro", 0, 2003, 'F', "Pas DF");
		resp3=nacional.alta("Andres", "Mejia", 0, 2013, 'M', "Mty");
		
		
		info= nacional.ordenSalida(0, "Pre-Infantil A");
		
		//System.out.println(nacional.toString()); 
		
		
		System.out.println(info);
		
		cuantos=nacional.indicaCuantosPorNivel(0);
		System.out.println(cuantos);
		
		

		
		
	
		
		
		
		
	

	}

}
