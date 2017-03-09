/*
 * @Roberto Alejandro Gutierrez Guillen
 */
public class Persona {
	private String nombre;
	private String carrera;
	private int semestre;
	private int claveU;

	public Persona() {
	}
	
	public Persona(String nombre, String carrera, int semestre, int claveU) {
		this.nombre = nombre;
		this.carrera = carrera;
		this.semestre = semestre;
		this.claveU = claveU;
	}

	public String getNombre() {
		return nombre;
	}

	public String getCarrera() {
		return carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}

	public int getSemestre() {
		return semestre;
	}

	public void setSemestre(int semestre) {
		this.semestre = semestre;
	}
	
	public int getClaveU(){
		return claveU;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + claveU;
		return result;
	}

	public boolean equals(Persona otra) {
		boolean res = false;
		if(this.claveU==otra.claveU)
			res = true;
		
		return res;
	}
	
	public int compareTo(Persona otra){
		int res = -1;
		
		if(this.equals(otra))
			res = 0;
		if(this.claveU > otra.claveU)
			res=1;
		
		return res;
	}
	
	public String toString(){
		StringBuilder cad = new StringBuilder();
		cad.append("El nombre es "+ nombre);
		cad.append("gsdf");
		
		return cad.toString(); 
	}
	
}
