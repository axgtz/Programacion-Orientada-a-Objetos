/*@Roberto Alejandro Gutierrez Guillen
 * 13/11/2015
 */

public class ListaArregloDesordenada <T>{
	private T[] datos;
	private int n;
	private final int MAX = 50;
	
	public ListaArregloDesordenada() {
		datos = (T[]) new Object[MAX];
		n=0;
	}
	
	public ListaArregloDesordenada(int max) {
		datos = (T[]) new Object[max];
		n=0;
	}
	
	// tam = tamaño, 
	public ListaArregloDesordenada(T [] arr){
		int tam;
		
		if(arr.length > MAX)
			tam = arr.length*2;
		else
			tam = MAX;
		datos = (T[]) new Object[tam];
		n = arr.length;
		
		for(int i = 0; i<n; i++)
			datos[i] = arr[i];
	}
	
	public boolean addFirst(T x){
		boolean res = false;
		
		if(n<datos.length){
    		ManejadorArreglosGenerico.corrimientoDer1(n, datos, 0);
    		datos[0] = x;
    		n++;
    		res = true;
		}
    	
		return res;
	}
	
    public boolean addLast(T x){
    	boolean res = false;
    	if(n<datos.length){
    		datos[n] = x;
    		n++;
    		res= true;
    	}
		return res;
	}
    
	public boolean add(T x, int pos){
		boolean res = false;
		
		if(datos.length > n){
		    ManejadorArreglosGenerico.corrimientoDer1(n, datos, pos);
		    datos[pos] = x;
			n++;
			res = true;
		}
		return res;
	}
	//Remueve un objeto, no importa el indice 
	public T remove(T x){
		int pos = 0;
	    
		pos = ManejadorArreglosGenerico.busquedaSecuencialDesordenada(datos, n, x);
	    ManejadorArreglosGenerico.corrimientoIzq(datos, n, pos);
	
	    return x;
	}
	//Remueve lo que haya en el indice, sin importar que sea
	public T remove(int i){
		T obj = null;

		obj = datos[i];
		ManejadorArreglosGenerico.corrimientoIzq(datos, n, i);
		
		return obj;
	}
	
	public T get(int i){
		return datos[i];
	}
	
	public int size(){
		return n;
	}
	
	public boolean isEmpty(){
		boolean res = false;
	 
	   	if(n==0)
	   		res = true;	   	
		return res;
		}
    
    public void clear(){	  	  
        datos = (T[]) new Object[MAX];
        n=0;
	}
    
    public boolean contains(T x){
		boolean res = false;
		
		int pos = ManejadorArreglosGenerico.busquedaSecuencialDesordenada(datos, n, x);
		if(pos >= 0){
			res= true;
		}	
		return res;
	}
    
    public int indexOf(T x){
		int i  = ManejadorArreglosGenerico.busquedaSecuencialDesordenada(datos, n, x);
	    return i;
	}
    
    public String toString(){
		StringBuilder cad= new StringBuilder();

		cad.append("\n [ ");
		for(int i=0; i<n; i++)
			cad.append(datos[i].toString() + " ");
		cad.append("]");
		
		return cad.toString();
	}
	
	public void expandCapacity(){
		T[] newArray = (T[]) new Object[datos.length * 2];
		
		for(int i = 0; i < datos.length; i++)
			newArray[i] = datos[i];
		datos = newArray;
	}
}