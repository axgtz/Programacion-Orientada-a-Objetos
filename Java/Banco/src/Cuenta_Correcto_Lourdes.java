/*Alejandro Gutierrez Guillén
 * 02 de Octubre 2015
 */

public class Cuenta_Correcto_Lourdes {
    private double saldo;
    private String titular;
    private int nCuenta;
    
	public Cuenta_Correcto_Lourdes() {
	}
	
	public Cuenta_Correcto_Lourdes(double saldo, String titular, int nCuenta){
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
	
	/*Setters 
	*Lourdes dice que esta mal, para no cambiar el saldo al gusto del cliente
	Sino que se cambia con depositos y retiros
	/*public void setsaldo(){
		this.saldo=saldo;
	}
	*/
	
	public void settitular(){
		this.titular=titular;
	}
	
	public void setnCuenta(){
		this.nCuenta=nCuenta;
	}
	
    //compareTo 
	public int compareTo(Cuenta otro){
		int res;

		if(nCuenta == otro.getnCuenta())
		   res = 0;
	    else
		     if(this.nCuenta>otro.getnCuenta())
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
		cuenta.append("\n El numero de cuenta es: " + nCuenta);
		cuenta.append("\n El saldo es: " + saldo);

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
	
	//Hacer retiro (Corregido Lourdes)
	public boolean retiro(double retiro){
		boolean pasaRetiro = false;
		
		if(retiro <= saldo)
			pasaRetiro = true;
		    saldo = saldo - retiro;
		
		return pasaRetiro;
	}
	
	//Hacer deposito
	public double hacerDeposito(double deposito){
		double saldo = 0;
		
		saldo = saldo + deposito;
		
		return saldo;
	}
	
}

