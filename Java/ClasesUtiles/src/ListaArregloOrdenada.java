/*@Roberto Alejandro Gutierrez Guillen
 * 13/11/2015
 */

public class ListaArregloOrdenada <T extends Comparable <T>>{
	private T[] datos;
	private int n;
	private final int MAX = 50;

	public ListaArregloOrdenada() {
		datos = (T[]) new Comparable[MAX];
		n = 0;
	}
	
	public ListaArregloOrdenada(int max) {
		datos = (T[]) new Comparable[max];
		n = 0;
	}
	
	// tam = tamaño, 
	public ListaArregloOrdenada(T [] arr){
		int tam;
		
		if(arr.length > MAX)
			tam = arr.length*2;
		else
			tam = MAX;
		datos = (T[]) new Comparable[tam];
		n = arr.length;
		
		for(int i = 0; i<n; i++)
			datos[i] = arr[i];
		ManejadorArreglosGenerico.ordenaSeleccionDirecta(datos, n); 
	}
	
	public boolean add(T x){
		boolean res = false;
		int pos = 0;
		
		if(datos.length > n){
			pos = ManejadorArreglosGenerico.busquedaBinaria(datos, pos, x);
		    if(pos<0){
		    	pos=-pos-1;
		    	ManejadorArreglosGenerico.corrimientoDer1(n, datos, pos);
		    	datos[pos] = x; 
				n++;
				res = true;
		    }
		}
		return res;
	}
	//Remueve un objeto, no importa el indice 
	
	public T remove(T x){
		T res = null; //nuevo x va a ser null, para borrar
		int pos;
	    
		pos = ManejadorArreglosGenerico.busquedaBinaria(datos, n, x);
		if(pos>=0){
			res = datos[pos];
			datos[pos] = null;
			ManejadorArreglosGenerico.corrimientoIzq(datos, n, pos);
			datos[n-1]= null; //ultima celda se pone null
			n--;
		}
	    return res;
	}
	//Remueve lo que haya en el indice, sin importar que sea
	public T remove(int i){
		T obj = null;
		
		if(i>-1 && i<n){
			obj = datos[i];
			datos[i] = null;
			ManejadorArreglosGenerico.corrimientoIzq(datos, n, i);
			datos[n-1] = null;
			n--;
		}	
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
    	datos = (T[]) new Comparable[MAX];
    	n=0;
	}
    
    public boolean contains(T x){
		boolean res = false;
		
		int pos = ManejadorArreglosGenerico.busquedaSecOrd(datos, n, x);
		if(pos >= 0){
			res= true;
		}	
		return res;
	}
    
    public int indexOf(T x){
		int i  = ManejadorArreglosGenerico.busquedaSecOrd(datos, n, x);
		
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
		T[] newArray = (T[]) new Comparable[datos.length * 2];
		
		for(int i = 0; i < datos.length; i++)
			newArray[i] = datos[i];
		datos = newArray;
	}
}





