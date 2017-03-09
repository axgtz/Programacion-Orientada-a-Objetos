/*
 * @Roberto Alejandro Gutierrez Guillen
 */

public class FiestaIngenieria {
	private String direc;
	private String nombre;
	private String fecha;
	private Persona[] invitados;
	private int MAX = 50; 
	private int nInvitados = 0 ;

	public FiestaIngenieria() {
		invitados = new Persona[MAX];
	}
	
	public FiestaIngenieria(String direc, String nombre, String fecha){
		this();
		this.direc = direc;
		this.nombre = nombre;
		this.fecha = fecha;
	}
	
	public boolean altaInvitado(String nombre, String carrera ,int semstre, int claveU){
		boolean res = false;
		Persona p;
		
		if(nInvitados<MAX){
			p = new Persona(nombre,carrera,semstre,claveU);
		    invitados[nInvitados] = p;
			nInvitados++;
			res = true;
		}
		
		return res;
	}
	
	public int nCarrera(String carrera){
		int res =0;
		for(int i = 0;i<nInvitados;i++){
			if(invitados[i].getCarrera().equals(carrera))
				res++;
		}
		return res;
	}
	
	public double promSemestre(){
		double prom = 0;
		for(int i =0;i<nInvitados;i++)
			prom+=invitados[i].getSemestre();
		return prom/nInvitados;
	}

	public String getDirec() {
		return direc;
	}

	public String getNombre() {
		return nombre;
	}

	public String getFecha() {
		return fecha;
	}

	public int getnInvitados() {
		return nInvitados;
	}
			

}













