/*
 * @Roberto Alejandro Gutiérrez Guillén
 * 26/10/2015
 */
public class OficinaGob {
	private String encargado;
	private String[] nomEdo;
	private double[] pob;
	private int numEdos;
	
	public OficinaGob(){
		numEdos=0;
		pob = new double[numEdos];
		nomEdo = new String[numEdos]; 
	}
	/* No Existe Por Cuestion de seguridad
	public OficinaGob(String encargado, double[] pob, String [] nomedo, int numEdos){
		this.encargado = encargado;
		this.numEdos = numEdos;
		this.pob = pob;
		this.nomEdo = nomEdo;
	}
	*/ 
	
	public OficinaGob(String encargado){
		this();
		this.encargado = encargado;
	}
	
	public OficinaGob(String encargado, int numEdos){
		this.encargado = encargado;
		this.numEdos = numEdos = 0; 
		pob = new double[numEdos];
		nomEdo = new String[numEdos];
	}
	
	//getters
    public String getEncargado() {
		return encargado;
	}
    
    public String getElementoNomEdo(int indice) {
		return nomEdo[indice];
	}
    
	public int getNumEdos() {
		return numEdos;
	}
	
	public double getElementoPob(int indice) {
		return pob[indice];
	}

	//Setters
	public void setEncargado(String encargado) {
		this.encargado = encargado;
	}

	public void setElementoNomEdo(int indice,String nomEdo) {
		this.nomEdo[indice] = nomEdo;
	}

	public void setElementoPob(int indice, double pob) {
		this.pob[indice] = pob;
	}
	
	//Funciones y Metodos
	public void altaInfo(double pob, String nomEdo){ //p es poblacion, n es el nombre del estado
		this.pob[numEdos] = pob;
		this.nomEdo[numEdos] = nomEdo;
		numEdos++; 
	}
	
	public double getprom(){
		return ManejadorArreglosAlex.prom(pob, numEdos);
	}
	
	public int menAProm(){
		double prom = ManejadorArreglosAlex.prom(pob, numEdos);
	
		return ManejadorArreglosAlex.numMenorX(pob, numEdos, prom);
	}
	
	public String edoMayorPob(){
		String edoMayor = nomEdo[0]; 
		ManejadorArreglosAlex.indicarMayor(pob, numEdos);
		return edoMayor;
	}

	//compareTo 
	public int compareTo(OficinaGob otro){
		return encargado.compareTo(otro.encargado);
	}
	
	//toString 
	public String toString(){
		StringBuilder OficinaGob;   
		
		OficinaGob = new StringBuilder(); //Constructor nulo 
		OficinaGob.append("El nombre del encargado es: ) " + encargado);
		OficinaGob.append("\n1 El numero de estados es: " + numEdos);
		OficinaGob.append("\n2 Estado \t \t Poblacion");
		for(int i=0;i<numEdos;i++)
			OficinaGob.append(nomEdo[i] + "\t  \t" + pob[i]);

	return OficinaGob.toString();
	}
	
	//equals
	public boolean equals(OficinaGob otro){
	    boolean res;
	
	    if(this.numEdos==otro.numEdos)
	    	res =true;
	    else
	    	res=false;
	    return res;
	    
	}

}
