/* *falta funcion asistio
 * @Roberto Alejandro Gutierrez Guillen
 * 11/18/2015
 */
public class SeminarioPers{
	private String lugar;
	private String fecha;
	private ListaArregloOrdenada<Persona> participantes; 
	
	public SeminarioPers() {
		participantes = new ListaArregloOrdenada<Persona>();
	}
	
	public SeminarioPers(String lugar, String fecha) {
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
	
	public String getPart(int indice){
		String res = "Participante no registrado";
		Persona p;
		p = participantes.get(indice);
		
		if(p!=null)
			res = p.toString();
		return res;
	}
	
	public String getPart(String curp){
		Persona p;
		int indice;
		
		p = new Persona(curp);
		indice = participantes.indexOf(p);
		
		return getPart(indice);
	}

	public boolean agregaParticipante(String curp,String nom, int edad, String sexo, String profesion, String tipoSangre, String edoCivil){
		Persona p = new Persona(curp,nom, edad, sexo, profesion, tipoSangre, edoCivil);
		
		return participantes.add(p);
	}
	
	public String borrarParticipante(String curp){
		Persona p = new Persona(curp);
		Persona pBorr = participantes.remove(p);
		String res;
		
		if(pBorr!=null)
			res = pBorr.toString();
		else
			res = "Persona no registrada";
			
		return res;
	}
	
	public String listaParticipantes(){
       return participantes.toString();
	}
	
	
	public double promEdadParticipantes(){
		int sum = 0;
		
		for(int i =0; i<participantes.size(); i++)
			sum+=participantes.get(i).getEdad();	
		return (double)sum/participantes.size();
	}
	
	public int cuantos(String sexo){
		int cont=0;
		
		for(int i = 0; i<participantes.size();i++)
			if(participantes.get(i).getSexo().equals(sexo))
				cont++;
		return cont;
	}
	
	public boolean equals(SeminarioPers otro) {
		boolean res = false;
		
		if(this.lugar==otro.lugar)
			res = true;
		
		return res;
	}
	
	public int compareTo(SeminarioPers otro){
		int res = -1;
		
		if(this.equals(otro))
			res = 0;
		if(this.lugar.compareTo(otro.lugar)>0)
			res=1;
		
		return res;
	}
	
	public String toString(){
		StringBuilder cad = new StringBuilder();
		
		//cad.append("\n El lugar del seminario es " + lugar);
		//cad.append("\n La fecha del seminario es " + fecha);
		
		for(int i=0; i<participantes.size(); i++)
			cad.append("\n Participante "+ i +" : " + participantes.get(i));
		
		return cad.toString(); 
	}

}