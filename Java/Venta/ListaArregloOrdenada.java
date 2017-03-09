/*Javier Montiel González
 * 13 de Noviembre de 2015
 * Crear una lista con un arreglo de datos []T
 */

public class ListaArregloOrdenada<T extends Comparable<T>> {
	private T[] datos;
	private int n;
	private final int  MAX=50;
	
	public ListaArregloOrdenada(){
		datos= (T[]) new Comparable[MAX];
	}
	
	public ListaArregloOrdenada(int max){
		datos= (T[]) new Comparable[max];
		n=0;
	}
	
	public ListaArregloOrdenada(T [] ar){
		int t;
		
		if(ar.length > MAX)
			t= ar.length*2;
		else
			t= MAX;
		datos= (T[]) new Comparable[t];
		n= ar.length;
		for(int i=0; i<n; i++)
			datos[i]= ar[i];
		ManejadorDeArreglosGenerico.ordenaSeleccionDirecta(datos, n);
	}
	
	public boolean add(T x){
		boolean res= false;
		int pos= 0;
		
		if (n<datos.length){
			pos= ManejadorDeArreglosGenerico.busquedaSecOrdenado(datos, n, x);
			if(pos<0){
				pos= (pos+1)*-1;
				ManejadorDeArreglosGenerico.corrimientosDer(datos, n, pos);
				datos[pos]= x;
				n++;
				res=true;
			}
		}
		return res;
	}
	
	public T remove(T x){
		int pos= 0;
		
		pos= ManejadorDeArreglosGenerico.busquedaSecOrdenado(datos, n, x);
		ManejadorDeArreglosGenerico.corrimientosIzq(datos, n, pos);
		
		return x;
	}
	
	public T remove(int ind){
		T x= null;
		
		x= datos[ind];
		ManejadorDeArreglosGenerico.corrimientosIzq(datos, n, ind);
		
		return x;
	}
	
	public int size(){
		return datos.length;
	}
	
	public T get(int i){
		return datos[i];
	}
	
	public boolean contains(T x){
		boolean res= false;
		int pos= 0;
		
		pos= ManejadorDeArreglosGenerico.busquedaSecOrdenado(datos, n, x);
		if(pos>=0){
			res= true;
		}
		return res;
	}
	
	public int indexOf(T x){
		int i=0;
		
		while(i<n && datos[i]!=x){
			i++;
		}
		
		if(i==n)
			i= -1;
	return i;
	}
	
	public boolean expandCapacity(){
		boolean res= false;
	}
	
	public boolean isEmpty(){
		
	}
	
	public String toString(){
		StringBuilder cad= new StringBuilder();
		
		cad.append("El arreglo es "+datos);
		cad.append("Número de datos "+n);
		cad.append("Capacidad máxima celdas "+MAX);
		
		return cad.toString();
	}
	
	public boolean clear(){
		T c= null;
		
		for(int i=0; i<n; i++)
			datos[i]= c;
		
	return true;
	}
}

