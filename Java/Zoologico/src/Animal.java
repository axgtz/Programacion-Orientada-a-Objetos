/*
 * @Roberto Alejandro Gutiérrez Guillén
 * 26/10/2015
 */

public class Animal {
	private String raza;
	private String nom;
	private int edad;

	public Animal() {
	}	

	public Animal(String raza, String nom, int edad) {
		this.raza = raza;
		this.nom = nom;
		this.edad = edad;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public int compareTo(Animal otro){
		return nom.compareTo(otro.nom);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nom == null) ? 0 : nom.hashCode());
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
		Animal other = (Animal) obj;
		if (nom == null) {
			if (other.nom != null)
				return false;
		} else if (!nom.equals(other.nom))
			return false;
		return true;
	}
	
	public String toString(){
		StringBuilder cad = new StringBuilder();
		
		cad.append("\n   Nombre del animal: "+ nom);
		cad.append("\n   Edad de " +nom+ ": "+ edad);
		cad.append("\n   Raza de " +nom+ ": " + raza);
		
		return cad.toString();
	}

}
