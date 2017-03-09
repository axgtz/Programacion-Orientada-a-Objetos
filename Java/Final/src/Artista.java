/* @Roberto Alejandro Gutiérrez Guillén
 * Proyecto Final Java
 * Artista
 */
public class Artista implements Comparable<Artista>{
	private String nombreA;
	protected ListaArregloOrdenada<Cancion> canciones;

	public Artista() {
		canciones = new  ListaArregloOrdenada<Cancion>();
	}
	
	public Artista(String nombreA) {
		this();
		this.nombreA = nombreA;
	}
	
	public int numCanciones(){
		return canciones.size();
	}
	
	public boolean agregaCancion(String nombre, String album, int duracion, String genero, int bitRate){
		Cancion c = new Cancion(nombre, album, duracion, genero, bitRate);	
		return canciones.add(c);
	}
	
	public String borrarCancion(Cancion c){
		Cancion cancionBorr = canciones.remove(c);
		return cancionBorr.getNombreC();
	}
	
	public String borrarCancion(String nombreC){
		Cancion c = new Cancion(nombreC);
		c = canciones.get(canciones.indexOf(c));
		
		Cancion cancionBorr = canciones.remove(c);
		
		return cancionBorr.getNombreC();
	}
	
	public double promDuracionCancion(){
		int sum = 0;
		
		for(int i =0; i<canciones.size(); i++)
			sum+=canciones.get(i).getDuracion();	
		return (double)sum/canciones.size();
	}

	public String getCancion(int indice){
		String res = "Cancion no encontrada";
		
		if(indice<=canciones.size()){
			res = canciones.get(indice).toString();		
		}
		return res;
	}
	
	public String getCancionToString(String nombreC) {
		String res = "No hay canciones en el artista";
		
		if(canciones.size()>=0){
			res = "Cancion no registrada";
			Cancion c = new Cancion(nombreC);
			int indice = canciones.indexOf(c);
			if(indice>=0)
				res = canciones.get(indice).toString();
		}		
		return res;
	}
	
	public String getCancion(String nombreC){
		int indice;
		Cancion c = new Cancion(nombreC);
		
		indice = canciones.indexOf(c);		
		return getCancion(indice);
	}
	
	public String getNombreA() {
		return nombreA;
	}

	public void setNombreA(String nombreA) {
		this.nombreA = nombreA;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nombreA == null) ? 0 : nombreA.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Artista other = (Artista) obj;
		if (nombreA == null) {
			if (other.nombreA != null)
				return false;
		} else if (!nombreA.equals(other.nombreA))
			return false;
		return true;
	}

	public int compareTo(Artista otra){
		int res = -1;
		
		if(this.nombreA.equals(otra.nombreA))
			res = 0;
		if(this.nombreA.compareTo(otra.nombreA)>0)
			res=1;
		
		return res;
	}
	
	public String toString(){
		StringBuilder cad = new StringBuilder();
		
		cad.append("\nNombre del artista: " + nombreA);
		
		for(int i=0; i<canciones.size(); i++){
			cad.append("\n\n Cancion "+ (i+1) +": " + canciones.get(i).toString());
		}
		cad.append("\n ------------------------------------------------------------------------------------------------\n");
		
		return cad.toString(); 
	}
}
