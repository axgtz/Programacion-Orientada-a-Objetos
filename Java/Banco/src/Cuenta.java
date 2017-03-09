/*Alejandro Gutierrez Guillén
 * 02 de Octubre 2015
 */

public class Cuenta {
    private double saldo;
    private String titular;
    int nCuenta;
    
	public Cuenta() {
	}
	
	public Cuenta(double saldo, String titular, int nCuenta){
		this.saldo = saldo;
		this.titular = titular;
		this.nCuenta = nCuenta;
	}
	
	//getters(funcion)
	public double getsaldo(){
		return saldo;
	}
	
	public String getstitular(){
		return titular;
	}
	
	public int getnCuenta(){
		return nCuenta;
	}
	
	//Setters 
	public void setsaldo(){
		this.saldo=saldo;
	}
	
	public void settitular(){
		this.titular=titular;
	}
	
	public void setnCuenta(){
		this.nCuenta=nCuenta;
	}
	
    //compareTo 
	public int compareTo(Cuenta otro){
		int res;

		if(nCuenta == otro.nCuenta)
		   res = 0;
	    else
		     if(this.nCuenta>otro.nCuenta)
		       res = 1;
		     else
		       res = -1;
		return res;
	}
	
	//toString 
	public String toString(){
		StringBuilder cuenta;   
		
		cuenta = new StringBuilder(); //Constructor nulo 
		cuenta.append("El nombre del titular es: ) " + titular);
		cuenta.append("\n1 El numero de cuenta es: " + nCuenta);
		cuenta.append("\n2 El saldo es: " + saldo);

	return cuenta.toString();
	}
	
	//equals
	public boolean equals(Cuenta otro){
	    boolean res;
	
	    if(this.nCuenta==otro.nCuenta)
	    	res =true;
	    else
	    	res=false;
	    return res;
	    
	}
	
	//Hacer retiro
	public boolean retiro(double retiro){
		boolean pasaRetiro;
		
		if(retiro < saldo)
			pasaRetiro = true;
		else
			pasaRetiro = false;
		return pasaRetiro;
	}
	
	//Hacer deposito
	public double hacerDeposito(double deposito){
		double saldo = 0;
		
		saldo = saldo + deposito;
		
		return saldo;
	}
	
}
