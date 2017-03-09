/*Alejandro Gutierrez Guillén
 * 07 de Octubre 2015
 * Corregido de Lourdes
 */

public class Auto_Corregido {
	private String marca;
	private double nKm;
	private int ano;
	private static int folio = 1;
	private String nombreC;
	private int nLic;
	private int claveU;

	public Auto_Corregido() {
		claveU = folio; 
		folio++;
	}
	
	public Auto_Corregido(String marca, double nKm, int ano){
		this();
		this.marca = marca;
		this.nKm = nKm;
		this.ano = ano;
		nombreC = null;
		nLic = 0; 
	}
	
	public Auto_Corregido(String marca,int ano){
		this();
		this.marca = marca;
		this.ano = ano;
		nKm = 0;
		nombreC = null;
		nLic = 0;
	}
	
	public int getClaveU(){
		return claveU;
	}
	
	public String getMarca(){
		return marca;
	}
	
	public int getAno(){
		return ano;
	}
	
	public double getNkm(){
		return nKm;
	}
	
	public String getNombreC(){
		return nombreC;
	}
	
	public int getNLic(){
		return nLic;
	}
	
	
	
	public double renta(String nombreC, int nLic, int numD){
		double rentaT, r;
		
		this.nombreC= nombreC;
		this.nLic = nLic;
		
		if(this.ano > 2005)
			r=200;
		else
			r=300;
		rentaT = r * numD;
		if(nKm < 20000)
			rentaT = rentaT + 20 * numD;
		
		return rentaT;
	}
	
	public void devoulcion(double nKm){
		this.nKm+=nKm; 
		nombreC = null;
		nLic = 0;
	}
	
	public String toString(){
		StringBuilder cad = new StringBuilder();
		cad.append("\n Auto para la renta de clave unica: " + claveU);
		cad.append("\n                             Marca: " + marca);
		cad.append("\n                               Ano: " + ano);
		cad.append("\n              Numero de kilometros: " + nKm);
		cad.append("\n                Nombre del Cliente: " + nombreC);
		cad.append("\n    Numero de licencia del Cliente: " + nLic);
		return cad.toString();
	}
	public int compareTo(Auto_Corregido otro){
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
	
	public boolean equals(Auto_Corregido otro){
		boolean res = false;
		
		if(this.claveU == otro.claveU);
		   res=true;
		return res;
	}
}












