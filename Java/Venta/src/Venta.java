/*Alejandro Gutierrez Guillén
 * 02 de Octubre 2015
 * Ejercicio 19 creo cuad de ej.
 */

public class Venta {
	private double monto;
	private String nombreVendedor;

	public Venta() {	
	}
	
	public Venta(double monto, String nombreVendedor){
	   this.monto = monto;
	   this.nombreVendedor = nombreVendedor;
	}
	
	//getters(funcion)
	public double getMonto(){
		return monto;
	}
	
	public String getNombreVendedor(){
		return nombreVendedor;
	}
	
	//Setters (metodo)
	public void setnombreVendedor(String nombreVendedor) {
	    this.nombreVendedor = nombreVendedor;
	}
	public void setmonto(double monto) {
	    this.monto = monto;
	}
	
	//compareTo 
	public int compareTo(Venta otro){
		int res;

		if(monto == otro.monto)
		   res = 0;
	    else
		     if(this.monto>otro.monto)
		       res = 1;
		     else
		       res = -1;
		return res;
	}
	
	//toString 
	public String toString(){
		StringBuilder venta;   
		
		venta = new StringBuilder(); //Constructor nulo 
		venta.append("\n El nombre del vendedor que realizo la venta es:  " + nombreVendedor);
		venta.append("\n    El monto es: " + monto);

	return venta.toString();
	}
	
	//equals
	public boolean equals(Venta otro){
	    boolean res;
	
	    if(this.monto==otro.monto)
	    	res =true;
	    else
	    	res=false;
	    return res;   
	}
	
	//Calcula comision
	public double calComision(){
		double comision;
		
		if(monto<1000)
			comision = monto * 0.03;
		else
			comision = monto * 0.05;
		return comision;
	}
	
			
}
