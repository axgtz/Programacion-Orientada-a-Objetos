//Alejandro Gutiérrez
public class Pan2 {
    private int numId;
    private static int serie =1111; 
    private int clave;
    private String nombre;
    private int numIn;
    private String tipoHarina;
    private char figura;
    
	public Pan2( String nombre, int clave){
		serie++;
		numId = serie; 
		this.nombre = nombre;
		this.clave = clave;
	}
	
	public Pan2(int clave, String nombre, int numIn, String tipoHarina, char figura){
		this(nombre,clave);
		this.numIn = numIn;
		this.tipoHarina = tipoHarina;
		this.figura = figura;
	}
	
	

}