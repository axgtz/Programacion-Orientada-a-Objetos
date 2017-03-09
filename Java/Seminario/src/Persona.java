//@Roberto Alejandro Gutierrez Guillen
public class Persona implements Comparable<Persona>{
	private String nom;
	private String curp;
	private int edad;
	private String sexo;
	private String profesion;
	private String tipoSangre;
	private String edoCivil;

	public Persona() {
	}
	
	public Persona(String curp) {
		this.curp = curp;
	}
	
	public Persona(String curp,String nom, int edad, String sexo, String profesion, String tipoSangre, String edoCivil) {
		this();
		this.nom = nom;
		this.edad = edad;
		this.sexo = sexo;
		this.profesion = profesion;
		this.tipoSangre = tipoSangre;
		this.edoCivil = edoCivil;
	}
	
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getProfesion() {
		return profesion;
	}

	public void setProfesion(String profesion) {
		this.profesion = profesion;
	}

	public String getEdoCivil() {
		return edoCivil;
	}

	public void setEdoCivil(String edoCivil) {
		this.edoCivil = edoCivil;
	}

	public String getCurp() {
		return curp;
	}

	public int getEdad() {
		return edad;
	}

	public String getTipoSangre() {
		return tipoSangre;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((curp == null) ? 0 : curp.hashCode());
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
		Persona other = (Persona) obj;
		if (curp == null) {
			if (other.curp != null)
				return false;
		} else if (!curp.equals(other.curp))
			return false;
		return true;
	}

	public int compareTo(Persona otra){
		int res = -1;
		
		if(this.equals(otra))
			res = 0;
		if(this.curp.compareTo(otra.curp)>0)
			res=1;
		
		return res;
	}
}
