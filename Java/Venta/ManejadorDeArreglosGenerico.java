import java.util.ArrayList;

public class ManejadorDeArreglosGenerico {
	
	public static <T> void swap( T []ar, int posX, int posY){
		T aux;
		
		aux= ar[posX];
		ar[posX]= ar[posY];
		ar[posY]= aux;
		
	}
	
	public static <T> void invierte(T []ar, int n){
		
		for(int i=0; i<n/2; i++){
			swap(ar,i,n-i-1);
		}
	}
	
	public static <T extends Comparable<T>> int posMinima(T[] ar, int n, int inicio){//Comparable es una interface que indica que este tipo T tiene que tener programado el compareTo
		int menor= inicio;
		
		for(int i=inicio; i<n; i++)
			if(ar[inicio].compareTo(ar[i]) > 0){
				menor= i;
			}
		return menor;
	}
	
	public static <T extends Comparable<T>> int indMay(T[] ar, int n){
		int indMay= 0;
		
		for(int i=1; i<n;i++){
			if(ar[indMay].compareTo(ar[i])<0)
			indMay=i;
			}
		return indMay;
	}
	
	public static <T extends Comparable<T>>int indMen(T[] ar, int n){
		int indMen= 0;
		
		for(int i=1; i<n; i++){
			if(ar[indMen].compareTo(ar[i])>0)
				indMen=i;
		}
		return indMen;		
	}
	
	public static <T extends Comparable<T>> int cuantosMayX(T[] ar, int n, T x){
		int num= 0;
		
		for(int i=0;i<n;i++){
			if(ar[i].compareTo(x)>0){
				num++;
			}
		}
		return num;
	}
	
	public static <T extends Comparable <T>> int cuantosMenX(T[] ar, int n, T x){
		int num= 0;
		
		for(int i=0; i<n; i++){
			if(ar[i].compareTo(x)<0){
				num++;
			}
		}
		return num;
	}
	
	public static <T extends Comparable <T>> ArrayList<Integer> cualesMayX(T[]ar, int n, T x){
		ArrayList<Integer> mayor;
		mayor= new ArrayList<Integer>();
		
		for(int i=0; i<n; i++){
			if(ar[i].compareTo(x)>0){
				mayor.add(i);
			}
		}
		return mayor;
	}
	
	public static <T extends Comparable<T>> ArrayList<Integer> cualesMenX(T[]ar,int n, T x){
		ArrayList<Integer> menor;
		menor= new ArrayList<Integer>();
		
		for(int i=0; i<n; i++){
			if(ar[i].compareTo(x)<0){
				menor.add(i);
			}
		}
		return menor;
	}
	
	public static <T> void corrimientosDer(T[]ar, int n, int k){
		
		for(int i=n-1; i>=k; i--){
			ar[i]= ar[i-k];
			ar[i-k]=null;
		}
	}
	
	public static <T> void corrimientosIzq(T[]ar, int n, int k){
		
		for(int i=0; (i+k)<n; i++){
			ar[i]= ar[i+k];
			ar[i+k]=null;
		}
	}
	
	public static <T> void corrimientosCirculares(T[]ar, int n, int k){
		T aux;
		
		for(int i=1; i<=k; i++){
	
			aux= ar[n-1];
			corrimientosDer(ar,n,1);
			ar[0]= aux;
		}
	}
	
	public static <T> int busquedaSecDesordenada(T[]ar, int n, T x){
		int i=0;
		int res= 0;
		
		while(i<n && !ar[i].equals(x))
			i++;
		if(i==n)
			res= -1;
		else
			res= i;
		return res;
	}
	
	public static <T extends Comparable<T>> int busquedaSecOrdenado(T[]ar, int n, T x){
		int i=0;
		int res=0;
		
		while(i<n && ar[i].compareTo(x)<0)
			i++;
		if(i==n || !ar[i].equals(x))
			res= -i-1;
		
		else
			res= i;
		return res;
	}
	
	public static <T extends Comparable<T>> int busquedaBinaria(T[] ar, int n, T x){
		int i=0;
		int f= n-1;
		int m= (i+f)/2;
		int pos=0;
		
		while(f>=i && !ar[m].equals(x)){
			if(ar[m].compareTo(x)<0)
				i= m+1;
			else
				f= m-1;
		}
		
		if(x==ar[m])
			pos= m;
		else
			pos=-m-1;//No es mitad. Solo puede ser inicio o fin :\
		return pos;	//Probar el algoritmo 
	}
	
	public static <T extends Comparable<T>> boolean capicua(T[] ar, int n){
		int i=0;
		boolean res= false;
		
		while(i<(n/2) && ar[i].equals(ar[n-i-1]))
			i++;
		if(i==(n/2))
			res=true;
		return res;	
	}
	
	public static <T extends Comparable<T>> void ordenaSeleccionDirecta(T[] ar, int n){
		int indMen=0;
		int inicio=0;
		
		for(int i=0; i<n-1; i++){
			indMen= ManejadorDeArreglosGenerico.posMinima(ar, n, inicio);
			ManejadorDeArreglosGenerico.swap(ar, i, indMen);
			inicio++;
		}
	}
}
