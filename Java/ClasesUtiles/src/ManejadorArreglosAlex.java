/*
 * @Roberto Alejandro Gutierrez Guillen
 * 21/20/2015
 */
import java.util.ArrayList;

public class ManejadorArreglosAlex {
	
	public static ArrayList<Double> ulman(double num){
		ArrayList<Double> lista = new ArrayList<Double>();
		
		while(num!=1){
			lista.add(num);
			if(num%2==0)
				num = num/2;
			else
				num = num * 3 +1;
		}
		lista.add(num);
		return lista;
	}
	
	public static double[] fibonacci(int n){ //Es para invocarlos, para no tener que instanciar una clase cuando lo necesitas usar
		double[] a = new double[n];
		
		a[0] = 0; //En la celda 0 se agrega un cero Dentro de las [] va el numero del index
		a[1] = 1;
		
		for(int i = 2; i<n; i++){
		     a[i] = a[i-1] + a[i-2];
		}
		return a;
	}
    //a
	public static double suma(double[] a, int n){
		double sum = 0;
		
		for(int i = 0; i<n ;i++)
			sum+= a[i];
	    return sum;
	}
	//b
	public static double prom(double[] a, int n){
		double prom = 0;
		
		prom = suma(a, n) / n;	
		return prom;
	}
	//c Indica el indice no el contenido
	public static int indicarMayor(double[] a, int n){
		double mayor = a[0];
		int indice = 0;
		
		for(int i = 0; i<n ;i++){
			if(a[i]>mayor){
				mayor = a[i];
				indice = i;
			}
		}	
		return indice;
	}
	//d
	public static int indicarMenor(double[] a, int n){
		double menor = a[0];
		int indice = 0;
		
		for(int i = 1; i<n ;i++){
			if(a[i]<menor){
				menor = a[i];
				indice = i;
			}
		}	
		return indice;
	}
	
	//e Indica el numero de numeros mayores al parametro
	public static int numMayorX(double[] a, int n,double par){
		int numMayor = 0;
		
		for(int i = 0; i<n ;i++){
			if(par<a[i]){
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
	public static ArrayList<Integer> cualesMayorX(double[] a, int n,double par){
		ArrayList<Integer> listaMayX = new ArrayList<Integer>(); 
		
		for(int i = 0; i<n ;i++){
			if(par<a[i]){
				listaMayX.add(i);
			}
		}	
		return listaMayX;
	}
	
	//j  Imprime un arreglo con los indices que contienen numeros menores a x 
	public static ArrayList<Integer> cualesMenorX(double[] a, int n,double par){
		ArrayList<Integer> listaMenorX = new ArrayList<Integer>(); 
		
		for(int i = 0; i<n ;i++){
			if(par>a[i]){
				listaMenorX.add(i);
			}
		}	
		return listaMenorX;
	}
	
	//Cambia de posicion dos numeros 
	public static void swap(double []a, int pos1, int pos2){
		double aux = 0;
		
		aux = a[pos1];
		a[pos1] = a[pos2];
		a[pos2] = aux;
	}
	
	public static void invierte(double []a, int n){
        for(int i=0; i<n/2;i++)
        	swap(a , n-i-1,i);
	}
	
	public static void corrimientoDer(double []a, int n,int k){
		for(int i=(n-1); i>=k; i--){
		    a[i]=a[i-k];
		    a[i-k]=0;
		}
	}
	
	public static void corrimientoIzq(double []a, int n, int k){
		for(int i=0; (i+k)<n; i++){
		    a[i] = a[i+k];
		    a[i+k]=0;
		}
	}
	
	//corrimiento circular ?
	public static void corrimientoCircular(double []a, int n, int k){
        double aux = 0;
		
		for(int i=0; i<k; i++){
			for(int j=0; j<n; j++){
				aux = a[j];
				a[j] = a[j+1];
			}
			a[n] = aux;
		}
	}
	
	// Busqueda secuencial desordenada
	public static int busquedaSecDes(double a[], int n, double x){
		int pos;
		int i = 0;
		
		while(i<n && x!=a[i])
			i++;
		if(i==n)
			pos = -1;
		else
			pos = i;
		return pos;
	}
	
	// Busqueda secuencial ordenada
	public static int busquedaSecOrd(double[]a, int n, double x){
		int pos = -1;
		int i = 0;
		
		while(i<n && x<a[i])
			i++;
		if(i==n || a[i]!=x)
			pos = -i-1;
		else
			pos = i;
		return pos;
	}
	
	/*Busqueda Binaria, va partiendo las partes a la mitad parte por parte, hasta llegar al objetivo. 
	 * EL inicio no puede ser mayor a la mitad
	 * inicio = 0, final = n-1
	 * mitad = (inicio + final) /2
	 * un if a dentro del while if(a[mitad]<x) , adentro recoro al inicio mitad +1, else fin se mueve 
	 * decir donde deberia estar si no se encontro, o donde esta
	 */
	public static int busquedaBinaria(double[]a, int n, double x){
		int inicio = 0;
		int fin = n -1;
		int mitad = (fin+inicio)/2; 
		int pos; 
		
		while(inicio <= fin && x!=a[mitad]){
			if(x>a[mitad]){
				inicio = mitad + 1 ;
			}else{
				fin = mitad - 1;
			}
			    mitad =(fin + inicio)/2;
		}
		pos = mitad; 
		
		if(inicio > fin)
			pos = (mitad)*-1; 
		return pos; 
	}
	/* hay que comparar el inicio y el final e irlos moviendo cuando alguno no sea el mismo parar la ejecucion ?
	public static boolean capicua(double[]a, int n){
		boolean res = false;
		double inicio = a[0]; 
		double fin = a[n-1];
		
		while(n!=0 && inicio==fin){
			for(int i = 1;i<=(n/2);i++){
				if(inicio==fin){
				    inicio = a[i];
				    fin = a[n-1-i];
				    res = true;
				}else{
					i = n; 
					res = false; 
				}
			}	
			
		}
		return res;
	}
	
	*/
	
	public static boolean capicua(double[]a, int n){
		boolean res = true;
		int i = 0;
		do{
			if(a[i]!=a[n-(i+1)]){
				res = false;
			}
			i++;
		}while(i<n/2 && res);
		return res;
	}
	
	/* Lourdes ya acabado
	public static boolean capicua(double[]a, int n){
		boolean res = true;
		int fin = n-1;
		int i = 0;
		while(i<n/2 && a[i]==a[fin]){
			i++;
			i--;
		}
		
		return res;
	}
	*/
	
	//Posicion minima ?
	public static int posMinimo(double[]a, int n, int inicio){
		int posmin = inicio;
		
		for(int i = inicio ; i < n;i++){
			if(a[i]<posmin)
				a[i]= posmin; 
		}
		return posmin;
	}
	//Ordena Seleccion directa ?
	public static void ordenaSeleccionDirecta(double[]a, int n){

		int indmenor = 0;
				
		for(int i=0 ; i<n-1 ; i++){
			indmenor = posMinimo(a,n,i);
			swap(a,n,i); 
		}
	}
	
	public static boolean sonMultiplosParalelos(int []a, int[]b){
		boolean res = false;
		
		if(a.length==b.length)
			for(int i =0;i<a.length;i++)
				if(a[i]%b[i]!=0)
					res = false;
				else
					res = true; 
		
		return res;
	}
}








