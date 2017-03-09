
public class Huesped implements Comparable<Huesped>{
	
	//Atributos
	private String nombre;
	private int tipo; //tipo de habitacion [1=eco, 2=suite]
	private int dias; //dias de estancia
	
	
	//Contructor
	public Huesped(String nombre, int tipo, int dias) {
		this.nombre = nombre;
		this.tipo = tipo;
		this.dias = dias;
	}
	
	//getters y setters

	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getTipo() {
		return tipo;
	}


	public void setTipo(int tipo) {
		this.tipo = tipo;
	}


	public int getDias() {
		return dias;
	}


	public void setDias(int dias) {
		this.dias = dias;
	}
	
	//Funcionalidad minima requerida

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
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
		Huesped other = (Huesped) obj;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}
	
	
	public int compareTo(Huesped otro){
		return nombre.compareTo(otro.getNombre());
	}
	
	public String toString(){
		StringBuilder sb;
		sb=new StringBuilder();
		sb.append("    Nombre:     "+ nombre+" \n");
		sb.append("    Tipo:       "+tipo+" \n");
		sb.append("    Dias:       "+dias+" \n");
		
		return sb.toString();
	}
	
	
	
	
	
	
	

}
