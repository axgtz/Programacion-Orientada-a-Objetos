
public class Patinadora implements Comparable<Patinadora> {

	/**@author Paola Mejia
	 * 27 de noviembre 2015
	 */
	
	/*
	 * Clase patinadora 
	 */
	
	//Atributos
	private String nombre;
	private String apellido; //necesario?
	private int nivel; //Empieza en cero. el manual de usuario está el valor de cada nivel. (De String a int) Se entra como numero y se convierte despues a String en el construcotr
	private String[] arregloNombresNiveles={"Debutantes 1", "Debutantes 2","Pre-Basicos", "Basicos", "Pre-Preliminar", "Preliminar","Intermedios 1", "Intermedios 2", "Novicios", "Avanzados 1", "Avanzados 2"};
	private String nombreNivel;
	private int añoNacimiento;
	private char genero;
	private String categoria; //Se calcula en base al año de nacimiento y el año de la competencia, //Quierohacer lo mismo que con nivel

//quiero hacer que el bloque al que pertenece sea atributo... pero el bloque es un arreglo de tipo patinadora...
	private String asociacion;
	private int ordenSalidaC;
	private double puntosC;
	private int lugarC;
	private int ordenSalidaL;
	private double puntosL;
	private double puntosT;
	private int lugarL;
	
	
	//Contructores
	//No se programo el c n pq no tiene caso..
	
	public Patinadora(String nombre, String apellido, int nivel,
			int añoNacimiento, char genero, String asociacion) {
	
		this.nombre = nombre;
		this.apellido = apellido;
		this.nivel = nivel;
		this.añoNacimiento = añoNacimiento;
		this.genero = genero;
		this.asociacion = asociacion;
		
		nombreNivel=arregloNombresNiveles[nivel];
	}




	//Getters y Setters

	public String getNombre() {
		return nombre;
	}
	
	

	public double getPuntosT(){
		return puntosT;
	}


	public String getApellido() {
		return apellido;
	}


	public int getNivel() {
		return nivel;
	}


	public int getAñoNacimiento() {
		return añoNacimiento;
	}


	public String getCategoria() {
		return categoria;
	}
	
	
	
	public void setNivel(int nivel) {
		this.nivel = nivel;
	}


	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	


	public void setPuntosC(double puntosC) {
		this.puntosC = puntosC;
	}




	public String getAsociacion() {
		return asociacion;
	}


	public int getOrdenSalidaC() {
		return ordenSalidaC;
	}
	
	


	public void setLugarC(int lugarC) {
		this.lugarC = lugarC;
	}




	public void setPuntosL(double puntosL) {
		this.puntosL = puntosL;
	}




	public void setPuntosT(double puntosT) {
		this.puntosT = puntosT;
	}




	public void setLugarL(int lugarL) {
		this.lugarL = lugarL;
	}




	public double getPuntosC() {
		return puntosC;
	}


	public int getLugarC() {
		return lugarC;
	}


	public int getOrdenSalidaL() {
		return ordenSalidaL;
	}


	public double getPuntosL() {
		return puntosL;
	}


	public int getLugarL() {
		return lugarL;
	}
	
	public char getGenero() {
		return genero;
	}

	//Funcionalidad Minima Requerida
	
	//Equals



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Patinadora other = (Patinadora) obj;
		if (apellido == null) {
			if (other.apellido != null)
				return false;
		} else if (!apellido.equals(other.apellido))
			return false;
		if (añoNacimiento != other.añoNacimiento)
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}
	
	//CompareTo
	
	public int compareTo(Patinadora unaPatinadora){
		int resp=0;
		
		if(añoNacimiento==unaPatinadora.getAñoNacimiento() && nombre.equals(unaPatinadora.getNombre()) && apellido.equals(unaPatinadora.getApellido()))
			resp=0;
		else
			if (añoNacimiento==unaPatinadora.getAñoNacimiento())
				if (apellido.equals(unaPatinadora.getApellido()))
					if(nombre.compareToIgnoreCase(unaPatinadora.getNombre())<0)
						resp=-1;
					else 
						resp=1;
				else
					if (apellido.compareToIgnoreCase(unaPatinadora.getApellido())<0)
						resp=-1;
					else 
						resp=1;
			else 
				if(añoNacimiento>unaPatinadora.getAñoNacimiento())
					resp=1;
				else
					resp=-1;

		return resp;
	}
	
	//Hay dos porque uno se usa para generar el orden de salida y el otro es para imprimir la informacion
	//public String toString(){
		//StringBuilder sb;
		//sb=new StringBuilder();
		//sb.append("  " +nombre+ "   "  +apellido+  "       "  +asociacion+ "  \n");
		
		//return sb.toString();
	//}
	
	public String toString(){
		StringBuilder sb;
		sb=new StringBuilder();
		sb.append("El nombre de la competidora es                 "+nombre+ "  " +apellido+"  \n");
		sb.append("La nivel de la competidora es                  "+nombreNivel+"  \n");
		sb.append("La categoria de la patinadora es               "+categoria+"  \n");
		sb.append("La asociacion de la patinadora es              "+asociacion+"  \n");
		
		return sb.toString();
	}
	
	
	

	
	
	
	
	
	
	
	
}
