/*Alejandro Gutierrez Guillén
 * 07 de Octubre 2015
 */

public class Autos {
	private String marca, nombreC;
	private double nKm;
	private int nLic, ano;
	private static int claveU = 1;

	public Autos() {
		claveU+=1; 
	}
	
	public Autos(String marca, String nombreC, double nKm, int nLic, int ano, int claveU){
		this();
		this.marca = marca;
		this.nombreC = nombreC;
		this.nKm = nKm;
		this.nLic = nLic;
		this.ano = ano;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public void setNombreC(String nombreC) {
		this.nombreC = nombreC;
	}
	
	public void setNLic(int nLic) {
		this.nLic = nLic;
	}

	public String getNombreC() {
		return nombreC;
	}


	public double getnKm() {
		return nKm;
	}

	public void setnKm(double nKm) {
		this.nKm = nKm;
	}

	public int getnLic() {
		return nLic;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public static int getClaveU() {
		return claveU;
	}

	public static void setClaveU(int claveU) {
		Autos.claveU = claveU;
	}
	
	//Devolucion
	public void devolucion(double kmRec){	
		nKm = nKm + kmRec;
        nombreC = null;
		nLic = 0;	
	}
	
	//Renta
	public double renta(int numD, int ano, double nKm){
		double rentaT = 0;
		
		if(ano < 2005)
			rentaT = numD * 200;
		    if(nKm < 20000)
			   rentaT = rentaT + numD * 20;
		else
			rentaT = numD * 300;
		    if(nKm < 20000)
			   rentaT = rentaT + numD * 20;
		
		return rentaT;
	}
	
	
	
	public String toString(){
		StringBuilder autos;   
		
		autos = new StringBuilder();
		autos.append("Marca del coche: ) " + marca);
		autos.append("\n Numero de km's: " + nKm);
		autos.append("\n El año del coche es: " + ano);
		autos.append("\n El nombre del cliente es: " + nombreC);
		autos.append("\n El número de licencia del cliente es: " + nLic);

	return autos.toString();
	}
	
	public int compareTo(Autos otro){
		int res;

		if(this.claveU == otro.claveU)
		   res = 0;
	    else
		     if(this.claveU>otro.claveU)
		       res = 1;
		     else
		       res = -1;
		return res;
	}
	
	public boolean equals(Autos otro){
	    boolean res;
	
	    if(this.claveU==otro.claveU)
	    	res =true;
	    else
	    	res=false;
	    return res;
	}
}
