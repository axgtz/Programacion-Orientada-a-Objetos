
public class Hotel {
	
	private String nombre;
	private String direccion;
	private ListaArregloDesordenada <Huesped> listaH;
	
	public Hotel() {
		super();
		listaH= new ListaArregloDesordenada<Huesped>(40);
	}

	public Hotel(String nombre, String direccion) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		listaH= new ListaArregloDesordenada<Huesped>(40);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

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
		Hotel other = (Hotel) obj;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}
	
	public int compareTo(Hotel otro){
		return nombre.compareTo(otro.getNombre());
	}
	
	public String toString(){
		StringBuilder sb;
		sb=new StringBuilder();
		sb.append("    Nombre:      "+ nombre+" \n");
		sb.append("    Direccion:   "+direccion+" \n");
		sb.append("    Huespedes:   "+listaH.toString()+" \n");
		
		return sb.toString();
	}
	
	public boolean alta(String nombre, int tipo, int dias) {
		boolean resp;
		Huesped nuevoHuesped;
	
		nuevoHuesped=new Huesped(nombre, tipo, dias);
		resp=listaH.alta(nuevoHuesped);
			
		return resp;
			
		}
	
	
	public String baja(String nombre){
		String info;
		Huesped nuevoHuesped;
		
		nuevoHuesped=new Huesped(nombre, 0, 0);
		
		nuevoHuesped=listaH.baja(nuevoHuesped);
		
		if(nuevoHuesped!=null)
			info=nuevoHuesped.toString();
		else
			info="no está";
		
		return info;
			
		}
	
	
	public int indicaCuantosPorTipo(int tipo){
		int cuantos=0, i, n;
		
		n=listaH.ocupados();
		for(i=0;i<n;i++)
			if(tipo==listaH.getElement(i).getTipo())
				cuantos++;
	
		return cuantos;
	}
	
	public boolean prolongarEstancia(String nombre, int dias){
		boolean resp;
		int i,n;
		i=0;
		
		resp=false; 
		
		n=listaH.ocupados();
		
		while(i<n && !nombre.equalsIgnoreCase(listaH.getElement(i).getNombre()))
			i++;
		
		if(nombre.equalsIgnoreCase(listaH.getElement(i).getNombre()))
			listaH.getElement(i).setDias(dias);
			resp=true;	
		
		return resp;
	}
}
