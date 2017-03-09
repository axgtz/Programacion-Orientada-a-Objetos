/*
 * @Roberto Alejandro Gutierrez Guillen
 * 11/18/2015
 */
public class SeminarioNoms{
	private String lugar;
	private String fecha;
	private ListaArregloOrdenada<String> participantes; 
	
	public SeminarioNoms() {
		participantes = new ListaArregloOrdenada<String>();
	}
	
	public SeminarioNoms(String lugar, String fecha) {
		this();
		this.fecha = fecha;
		this.lugar = lugar;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	
	public int numPers(){
		return participantes.size();
	}
	
	public String getUnParticipante(int indice){
		return participantes.get(indice);
	}

	public boolean agregaParticipante(String participante){
		return participantes.add(participante);
	}
	
	//? funciona
	public boolean borrarParticipante(String participante){
		boolean res = false;
		
		if(participantes.remove(participante) == null)
			res = true;
	
		return res;
	}
	
	public String listaParticipantes(){
       return participantes.toString();
	}
	
	public boolean asistio(String participante){
		boolean res = false;
		
		if(participantes.contains(participante))
			res = true;
		return res;
	}
	
	public boolean equals(SeminarioNoms otro) {
		boolean res = false;
		if(this.lugar==otro.lugar)
			res = true;
		
		return res;
	}
	
	public int compareTo(SeminarioNoms otro){
		int res = -1;
		
		if(this.equals(otro))
			res = 0;
		if(this.lugar.compareTo(otro.lugar)>0)
			res=1;
		
		return res;
	}
	
	public String toString(){
		StringBuilder cad = new StringBuilder();
		
		cad.append("\n El lugar del seminario es " + lugar);
		cad.append("\n La fecha del seminario es " + fecha);
		for(int i=0; i<participantes.size(); i++)
			cad.append("\n Participante "+ i +" : " + participantes.get(i));
		
		return cad.toString(); 
	}

}
