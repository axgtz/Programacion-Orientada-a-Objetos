/*
 * @Roberto Alejandro Gutiérrez Guillén
 * 26/10/2015
 */

public class EscuelaNatacion {
	private String nombre;
	private String dom;
	private int totalAlbercas;
	private Rectangulo[] datAlberca; 
	
	public EscuelaNatacion(){
		totalAlbercas = 0;
		datAlberca = new Rectangulo[10];
	}

	public EscuelaNatacion(String nombre, String dom, int totalAlbercas) {
		this.nombre = nombre;
		this.dom = dom;
		this.totalAlbercas = totalAlbercas; 
	}
	
	public EscuelaNatacion(String nombre, String dom) {
		this.nombre = nombre;
		this.dom = dom; 	
	}

	//Getter & Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDomicilio() {
		return dom;
	}

	public int getTotalAlbercas() {
		return totalAlbercas;
	}

	public String getElementoDatAlberca(int indice) {
		return datAlberca[indice].toString();
	}

	public void setElementoDatAlberca(int indice, double largo, double ancho) {
		if(indice<totalAlbercas)
			datAlberca[indice] = new Rectangulo(largo, ancho);
	}	
	
	//Funcion y funcionalidad minima 
	public boolean altaAlberca(double largo, double ancho){
		boolean res = false;
		Rectangulo r = new Rectangulo(largo, ancho);
		if(totalAlbercas<datAlberca.length){
			datAlberca[totalAlbercas] = r;
			totalAlbercas++;
			res = true;
		}
		return res;
	}
	
	public double calcularArea(){
		double suma = 0;
		for(int i =0;i<totalAlbercas; i++)
		     suma += datAlberca[i].calcularArea();
		return suma; 
	}
	
/*	//equals
	
	public boolean equals(EscuelaNatacion otro){
	    boolean res;
	
	    if(this.dom==otro.dom)
	    	res =true;
	    else
	    	res=false;
	    return res;
	}
*/
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EscuelaNatacion other = (EscuelaNatacion) obj;
		if (dom == null) {
			if (other.dom != null)
				return false;
		} else if (!dom.equals(other.dom))
			return false;
		return true;
	}

	//toString
	public String toString(){
		
		StringBuilder cad = new StringBuilder(); //Constructor nulo 
		cad.append("El nombre de la escuela de natacion es:  " + nombre);
		cad.append("\n1                    El domicilio es: " + dom);
		cad.append("\n1           El numero de albercas es: " + totalAlbercas);
		for(int i=0;i<totalAlbercas;i++)
			cad.append("Informacion de la alberca "+ (i+1) +datAlberca[i].toString());

	return cad.toString();
	}
	
	//compareTo 
		public int compareTo(EscuelaNatacion otro){
			int res;

			if(this.dom.equals(otro.dom ))
			   res = 0;
		    else
			   if(this.dom.compareTo(otro.dom)>0)
			      res = 1;
			   else
			      res = -1;
			return res;
		}
		

}
