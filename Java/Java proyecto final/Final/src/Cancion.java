/*@Roberto Alejandro Gutiérrez Guillén 
 * Proyecto Final Java
 */

public class Cancion implements Comparable<Cancion>{
	private String nombreC;
	private String album;
	private int duracion;
	private String genero;
	private int bitRate;
	
	public Cancion(){
	}

	public Cancion(String nombreC) {
		this.nombreC = nombreC;
	}
	
	public Cancion(String nombre, String album, int duracion) {
		this(nombre);
		this.album = album;
		this.duracion = duracion;
	}
	
	public Cancion(String nombre, String album, int duracion, String genero, int bitRate) {
		this(nombre, album, duracion);
		this.genero = genero;
		this.bitRate = bitRate;
	}
	
	public String getNombreC() {
		return nombreC;
	}

	public String getAlbum() {
		return album;
	}

	public int getDuracion() {
		return duracion;
	}

	public String getGenero() {
		return genero;
	}

	public int getBitRate() {
		return bitRate;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nombreC == null) ? 0 : nombreC.hashCode());
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
		Cancion other = (Cancion) obj;
		if (nombreC == null) {
			if (other.nombreC != null)
				return false;
		} else if (!nombreC.equals(other.nombreC))
			return false;
		return true;
	}

	public int compareTo(Cancion otra){
		int res = -1;
		
		if(this.equals(otra))
			res = 0;
		if(this.nombreC.compareTo(otra.nombreC)>0)
			res=1;
		
		return res;
	}
	
	public String toString(){
		StringBuilder cad = new StringBuilder();
		
		cad.append("\n\tNombre: " + nombreC);
		cad.append("\n\tAlbum: " + album);
		cad.append("\n\tDuracion: " + duracion);
		cad.append("\n\tGenero: " + genero);
		cad.append("\n\tBitRate: " + bitRate);
		
		return cad.toString(); 
	}
}