/* @Roberto Alejandro Gutierrez Guillen
 */
import java.util.ArrayList;

public class ManejadorArreglosGenerico {

	//c Indica el indice no el contenido
	public static <T extends Comparable<T>> int indicarMayor(T [] a, int n){
		T mayor = a[0];
		int indice = 0;
		
		for(int i = 0; i<n ;i++){
			if(a[i].compareTo(mayor)>0){
				mayor = a[i];
				indice = i;
			}
		}	
		return indice;
	}
	
	//d
	public static <T extends Comparable<T>> int indicarMenor(T [] a, int n){
		T menor = a[0];
		int indice = 0;
		
		for(int i = 1; i<n ;i++){
			if(a[i].compareTo(menor)<0){
				menor = a[i];
				indice = i;
			}
		}	
		return indice;
	}
	
	//e Indica el numero de numeros mayores al parametro
	public static <T extends Comparable<T>> int numMayorX(T[] a, int n,T par){
		int numMayor = 0;
		
		for(int i = 0; i<n ;i++){
			if(par.compareTo(a[i])<0){
				numMayor++;
			}
		}	
		return numMayor;
	}
	
	//f
	public static int numMenorX(double[] a, int n,double par){
		int numMenor = 0;
		
		for(int i = 0; i<n ;i++){
			if(par>a[i]){
				numMenor++;
			}
		}	
		return numMenor;
	}
	//i Imprime un arreglo con los indices que contienen numeros mayores a x 
	public static <T extends Comparable<T>> ArrayList<Integer> cualesMayorX(T[] a, int n,T par){
		ArrayList<Integer> listaMayX = new ArrayList<Integer>(); 
		
		for(int i = 0; i<n ;i++){
			if(par.compareTo(a[i])<0){
				listaMayX.add(i);
			}
		}	
		return listaMayX;
	}
	
	//j  Imprime un arreglo con los indices que contienen numeros menores a x 
	public static <T extends Comparable<T>> ArrayList<Integer> cualesMenorX(T[] a, int n,T par){
		ArrayList<Integer> listaMenorX = new ArrayList<Integer>(); 
		
		for(int i = 0; i<n ;i++){
			if(par.compareTo(a[i])>0){
				listaMenorX.add(i);
			}
		}	
		return listaMenorX;
	}

	//L  Cambia de posicion dos numeros, T es cualquier tipo de arreglo 
	public static <T > void swap(T []a, int pos1, int pos2){
		T aux;
		
		aux = a[pos1];
		a[pos1] = a[pos2];
		a[pos2] = aux;
	}
	
	//L
	public static <T> void invierte(T []a, int n){
        for(int i=0; i<n/2;i++)
        	swap(a , n-i-1,i);
	}
	
	//
	public static <T> void corrimientoDer(T []a, int n,int k){
		for(int i=(n-1); i>=k; i--){
		    a[i]=a[i-k];
		    a[i-k] = null;
		}
	}
	
	//1 Corrimiento a la derecha desde el indice
	public static <T> void corrimientoDer1(int n,T []a, int pos){
		for(int i=n; i>pos; i--){
			a[i]=a[i-1];
		}
	}
	
	//1 Corrimiento a la izquierda desde el indice
	public static <T> void corrimientoIzq1(int n, T []a, int pos){
		for(int i=pos;i<n-1; i++){
			a[i] = a[i+1];
		}	
	}
	//
	public static <T> void corrimientoIzq(T []a, int n, int k){
		for(int i=0; (i+k)<n; i++){
		    a[i] = a[i+k];
		    a[i+k]=null;
		}
	}
	
	//corrimiento circular ?
	public static <T> void corrimientoCircular(T []a, int n, int k){
        T aux = null;
		
		for(int i=0; i<k; i++){
			for(int j=0; j<n; j++){
				aux = a[j];
				a[j] = a[j+1];
			}
			a[n] = aux;
		}
	}
	
	//L  Busqueda secuencial desordenada
	public static <T> int busquedaSecuencialDesordenada(T a[], int n, T x){
		int i = 0;
		
		while(i<n && !a[i].equals(x))
			i++;
		if(i==n)
			i=-1;
		return i;
	}
	
	// Busqueda secuencial ordenada, devuelve la posicion
	public static <T extends Comparable<T>> int busquedaSecOrd(T[]a, int n, T x){	
		int i = 0;
		
		while(i<n && a[i].compareTo(x)<0)
			i++;
		
		if(i>=n || a[i].compareTo(x)!=0)
			i = -i-1;
		
		return i;
	}
	
	//Busqueda Binaria, va partiendo las partes a la mitad parte por parte, hasta llegar al objetivo. 
	public static <T extends Comparable<T>> int busquedaBinaria(T []a, int n, T x){
		int inicio = 0;
		int fin = n -1;
		int mitad = (fin+inicio)/2; 
		int pos; 
		
		while(inicio <= fin && x!=a[mitad]){
			if(x.compareTo(a[mitad])>0){
				inicio = mitad + 1 ;
			}else{
				fin = mitad - 1;
			}
			    mitad =(fin + inicio)/2;
		}
		pos = mitad; 
		
		if(inicio > fin)
			pos = -mitad-1; 
		return pos; 
	}
	
	//Lourdes ya acabado
	public static <T> boolean capicua(T []a, int n){
		boolean res = true;
		int fin = n-1;
		int i = 0;
		while(i<n/2 && a[i]==a[fin]){
			i++;
			i--;
		}
		return res;
	}
	
	
	//L  Posicion minima (extends = a heredo de...)
	public static <T extends Comparable<T>> int posMinimo(T[] a, int n, int inicio){
		int min = inicio;
		
		for(int i = inicio+1 ; i < n;i++){
			if(a[min].compareTo(a[i])>0)
				min = i; 
		}
		return min;
	}
	//Ordena Seleccion directa ?
	public static <T extends Comparable<T>> void ordenaSeleccionDirecta(T []a , int n){
		int indmenor = 0;
				
		for(int i=0 ; i<n-1 ; i++){
			indmenor = posMinimo(a,n,i);
			swap(a,indmenor,i); 
		}
	}
}
