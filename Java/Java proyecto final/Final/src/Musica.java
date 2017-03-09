/* Proyecto Final Java
 */
public class Musica {
	private String usuario; //nombre del usuario
	private ListaArregloDesordenada<Artista> artistas;

	public Musica(){
		artistas = new  ListaArregloDesordenada<Artista>();
	}
	public Musica(String usuario) {
		this();
		this.usuario = usuario;
	}
	
	public String getUsuario() {
		return usuario;
	}
	
	public String getArtista(int indice) {
		String res = "Artista no registrado";
		Artista a = artistas.get(indice);
		
		if(a!=null)
			res = a.toString();
		return res;
	}
	
	public Artista getArtistaClase(String nombreA){
		Artista a = new Artista(nombreA);
		int indice = artistas.indexOf(a);
		if(indice>=0){		
			artistas.get(indice);
		}
		return a;
	}
	
	public String getArtista(String nombreA) {
		String res = "No hay artistas en la libreria";
		if(artistas.size()>0){
			res = "Artista no registrado";
			Artista a = new Artista(nombreA);
			int indice =  artistas.indexOf(a);
			if(indice>0)
				res = artistas.get(indice).toString();
		}		
		return res;
	}
	
	public boolean agregaArtista(String nombreA){
		Artista a = new Artista(nombreA);	
		return artistas.addFirst(a);
	}
	
	public String borrarArtista(Artista c){
		Artista artistaBorr = artistas.remove(c);
		return artistaBorr.toString();
	}
	
	public String borrarArtista(String nombreA){
		String res = null;
		
		Artista a = new Artista(nombreA);	
		if(artistas.contains(a)){
			a = artistas.get(artistas.indexOf(a));
			res = a.getNombreA();
			artistas.remove(a);
		}else{
			res = "Artista no registrado";
		}
		return res;
	}	
	public boolean agregaCancion(String nombreA, String nombre, String album, int duracion, String genero, int bitRate){
		Artista a = new Artista(nombreA);	
		int i = -1;
		boolean res = false;
		
		res = artistas.contains(a);
		if(res){
			i = artistas.indexOf(a);
			if(i>0){
				res = false;
			}else{
				a = artistas.get(i);
				res = a.agregaCancion(nombre, album, duracion, genero, bitRate);
			}
		}
		return res;
	}
	
	public String borrarCancion(String nombreC, String nombreA){
		String res = null;
		
		Artista a = new Artista(nombreA);	
		if(artistas.contains(a)){
			a = artistas.get(artistas.indexOf(a));
			res = a.getCancion(nombreC);
			a.borrarCancion(nombreC);
		}else{
			res = "Artista no registrado";
		}
		return res;
	}	
	
	public int numCanciones(){
		int contNumC = 0;
		
		if(artistas.size()>0){
			for(int i =0; i<artistas.size(); i++)
				contNumC +=artistas.get(i).numCanciones();
		}	
		return contNumC;
	}
	
	public double promDuracionCancion(){
		int tot = 0;
		
		for(int i =0; i<artistas.size(); i++)
			tot+=artistas.get(i).promDuracionCancion();
		return tot/artistas.size();
	}
	
	public String listaArtistas(){
	       return artistas.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((usuario == null) ? 0 : usuario.hashCode());
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
		Musica other = (Musica) obj;
		if (usuario == null) {
			if (other.usuario != null)
				return false;
		} else if (!usuario.equals(other.usuario))
			return false;
		return true;
	}

	public int compareTo(Musica otra){
		int res = -1;
		
		if(this.equals(otra))
			res = 0;
		if(this.usuario.compareTo(otra.usuario)>0)
			res=1;
		
		return res;
	}
	
	public String toString(){
		StringBuilder cad = new StringBuilder();
		
		cad.append("\n	\t \t Nombre del Usuario: " + usuario + "\n ");
		for(int i=0; i<artistas.size(); i++)
			cad.append("\nArtista "+ (i+1) + artistas.get(i).toString());
		
		return cad.toString(); 
	}
}
