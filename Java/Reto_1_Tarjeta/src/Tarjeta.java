/*Alejandro Gutiérrez Guillén
 * 08/10/2015
 * Reto 1 cuaderno de ej
 */
public class Tarjeta {
	private int numT;
	private int numC;
	private static int folio = 1000;
	private String tipo;
	private int cat;
	private int ano;
	private int anoV;
	private int secreto;
	private int limiteC; 
	private double saldo;

	public Tarjeta() {
		numC = folio;
		folio++;
	}
	
	public Tarjeta(String tipo, int cat, int ano, int anoV, int secreto, int limiteC, double saldo){
		this();
		this.tipo = tipo;
		this.cat = cat;
		this.ano = ano;
		this.anoV = anoV;
		this.secreto = secreto;
		this.limiteC = limiteC;
		this.saldo = saldo;
	}

	public String toString() {
		StringBuilder cad = new StringBuilder(); 
	
		cad.append("\n Numero de Tarjeta: " + numT);
		cad.append("\n Numero de Cliente: " + numC);
		cad.append("\n Año de Expedicion: " + ano);
		cad.append("\n   Año de Vigencia: " + anoV);
		cad.append("\n    Numero Secreto: " + secreto);
		cad.append("\n             Saldo: " + saldo);
		cad.append("\n Limite de Credito: " + limiteC);
		
		return cad.toString();
	}
    public void activaT(int numT, int numC, String tipo, int cat, int limiteC){
		this.numT = numT;
		this.numC = numC;
		this.tipo = tipo;
		this.cat = cat;
		ano = 2012;
	    anoV = ano + 5;
	    secreto = (int) Math.random();
	    switch(cat){
	    	case 0: limiteC = 20000;
	    		break;
	    	case 1: limiteC = 30000;
	    		break;
	    	case 2: limiteC = 50000;
	    }
	}
    
    public double calcCD(double saldo, int limiteC){
    	double res = 1;
    	
    	if(saldo < limiteC)
    		res = limiteC - saldo;
    	else
    		res = 0;
    	return res;
    }
  /*  
    public int calcC(int limiteC,int cat, String tipo){
        double comision = 0;
        if(tipo.equals("titular"))
        	
 
    	return comision; 
    }
	*/
	public int compareTo(Tarjeta otro){
		int res = 1; 
			
		if(this.numT == otro.numT)
			res = 0;
		else
			if(this.numT<otro.numT)
			    res = -1;
		return res;
	}
	
	public boolean equals(Tarjeta otro) {
		boolean res = false;
		
		if(this.numT==otro.numT);
		    res = true;
		return res;
	}	
}
