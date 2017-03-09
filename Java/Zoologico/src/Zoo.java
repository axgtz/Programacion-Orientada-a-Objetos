/*
 * @Roberto Alejandro Gutiérrez Guillén
 * 26/10/2015
 */

public class Zoo {
	private String nombre;
	private String direc;
	private int numAnimales;
	private Animal []animales; 
	private final int TOT=20;

	public Zoo() {
		animales = new Animal[20]; //[] el numero que va dentro es el numero de celdas dentro de el arreglo a. 
	}
	
	public Zoo(String n, String d, int tA){
		this();
		n = nombre;
		d = direc;
     //no esta num de animales porque alta animal lleva la cuenta
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDirec() {
		return direc;
	}

	public int getNumAnimales() {
		return numAnimales;
	}

	public String getElementoA(int indice) {
		return animales[indice].toString();
	}

	public boolean altaAnimal(String nom, String raza, int edad){
		Animal a;
		boolean res = false; 
		
		if(numAnimales<animales.length){
			a = new Animal(nom, raza, edad);
			animales[numAnimales] = a;
			numAnimales++;
			res = true;
		}
		return res;
	}
	
	public int cuantosRaza(String raza){
		int numRaza = 0;
		
		for(int i = 0;i<numAnimales ;i++){
			if(animales[i].getRaza().equals(raza))
				numRaza++;
		}
		return numRaza;
	}
	
	public double promEdad(){
	   double res = 0; 
	   for(int i = 0;i<numAnimales ;i++){
		   res+=animales[i].getEdad(); 
		}
		
	return  res/numAnimales;
	}
	
	public String nomAnimalLongevo(){
		String nom;
		int indMayor = 0;
		for(int i=1; i<numAnimales; i++)
			if(animales[i].getEdad()>animales[indMayor].getEdad())
				indMayor = i;
		return animales[indMayor].getNom(); 
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
		Zoo other = (Zoo) obj;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}
    
	public String toString(){
		StringBuilder cad = new StringBuilder(); 
		cad.append("\n               Nombre del Zoo: " + nombre);
		cad.append("\n            Direccion del Zoo: " + direc);
		cad.append("\n Numero de animales en el Zoo: " + numAnimales);
		for(int i=0;i<numAnimales;i++)
			cad.append("\n \nInformacion del animal "+ (i+1) + animales[i].toString());
		
		return cad.toString();
	}
}
