import java.util.ArrayList;

public class ManejadorArreglos {
	
	public static ArrayList<Double> ullman(double num){
		//dentro de los cocodrilos debe existir siempre una clase
		ArrayList<Double> lista;
		/* Lista porque queremos que nos devuelvan la serie de ullman,
		 * Lista porque el numero de elementos puede variar,
		 * Imaginemos que nos piden identificar el elemento 5 de la serie de ullman*/
		
		//instanciar
		lista = new ArrayList<Double>();//parametro vacio ya que no conocemos los constructores que tenemos
		
		while(num!=1){
			
			lista.add(num);
			
			if(num%2==0)
				num/=2;
			else
				num= num*3+1;
		}
		//queremos agregar un objeto a la lista
		lista.add(num); //.add agrega al final de la lista
		//regresar resultado de la funcion
		return lista;
	}
	
	public static double[] fibonacci(int n){ //funcion de tipo arreglo double
		double [] a; //corchetes indican que es un arreglo
		
		a = new double [n]; //utilizar el tipo que haya declarado el arreglo (double)
		//n es el numero de elementos de la serie que quiero calcular
		
		a[0] = 0;//primer elemento de la serie de fibonacci
		a[1] = 1;//segundo elemento de la serie de fibonacci
		
		for(int i=2; i<n; i++){
			a[i] = a[i-2]+a[i-1];
		}
		//generar un arreglo y devolverlo
		return a;
	}
	
	//Sumar los elementos de un arreglo de double
	public static double suma(double[]a, int n){
		double suma = 0;
		
		for(int i=0; i<n; i++)
			suma += a[i];
		
		return suma;
	}
	
	//Obtener el promedio de los elementos de un arreglo de double
	public static double promedio(double[]a, int n){
		double suma = 0;
		
		suma = suma(a,n);
		
		return suma/n;
	}
	
	//Obtener el índice donde se encuentra el elemento mayor de un arreglo de double
	public static int indiceMayor(double[]a, int n){
		int mayor = 0;
		int indice = 0;
		for(int i=0; i<n; i++){
			if(mayor<a[i]){
				mayor = (int)a[i];
				indice = i;
			}
		}
		return indice;		
	}
	
	//Obtener el índice donde se encuentra el elemento menor de un arreglo de double
	public static int indiceMenor(double[]a, int n){
		int menor = 0;
		int indice = 0;
		for(int i=0; i<n; i++){
			if(a[i]<menor){
				menor = (int)a[i];
				indice = i;
			}
		}		
		return indice;
	}
	
	//Determinar cuántos elementos de un arreglo de double son mayores a un cierto parámetro
	public static int elementosMayores(double[]a, int n, double num){
		int mayores = 0;
		
		for(int i=0; i<n; i++){
			if(num<a[i])
				mayores++;
		}
		
		return mayores;
	}
	
	//Determinar cuántos elementos de un arreglo de double son menores a un cierto parámetro
	public static int elementosMenores(double[]a, int n, double num){
		int menores = 0;
		
		for(int i=0; i<n; i++){
			if(a[i]<num)
				menores++;
		}
		return menores;
	}
	
	//Determinar cuáles (índices) elementos de un arreglo son mayores a un cierto parámetro
	public static ArrayList<Integer> cualesMayX(double[]a, int n, double num){
		ArrayList<Integer> lista = new ArrayList<Integer>();
		
		for(int i=0; i<n; i++){
			if(num<a[i])
				lista.add(i);
		}
		
		return lista;
	}
	
	//Determinar cuáles (índices) elementos de un arreglo son menores a un cierto parámetro
	public static ArrayList<Integer> cualesMenX(double []a, int n, double num){
		ArrayList<Integer> lista = new ArrayList<Integer>();
		
		for(int i=0; i<n; i++){
			if(num>a[i])
				lista.add(i);
		}
		
		return lista;
	}
	//Lee arreglo: debe estar en el ejecutable
	
	//Swap
	public static void swap(double[]a, int x, int y){
		double aux;
		
		aux = a[x];
		a[x] = a[y];
		a[y] = aux;
	}
	
	//Invierte
	public static void invierte(double []a, int n){
		double aux = 0;
		int m = n;
		
		for(int i=0; i<n; i++){
			a[i] = a[m];
			a[m] = aux;
			m--;
		}
	}
	
	//corrimientos derecha
	public static void correrDerecha(double []a, int n, int k){
		
		for(int i=0; i<k; i++){
			for(int j=0; j<n; j--){
				a[j] = a[j-1];
			}
			a[i] = 0;
		}
	}
	
	//corrimientos izq
	public static void correrIzq(double []a, int n, int k){
		int m = n;
		for(int i=0; i<k; i--){
			for(int j=0; j<n; j++)
				a[j] = a[j+1];
			a[m] = 0;
			m--;
		}	
	}
	
	//corrimiento circular
	public static void correrCircular(double []a, int n, int k){
		double aux = 0;
		
		for(int i=0; i<k; i++){
			for(int j=0; j<n; j++){
				aux = a[j];
				a[j] = a[j+1];
			}
			a[n] = aux;
		}
	}
	
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
	
	public static int busquedaBinaria(double []a, int n, double x){
		int inicio = 0;
		int fin = n-1;
		int mitad = fin/2;
		int pos;
		
		while(inicio<fin && x!=a[mitad]){
			if(x<a[mitad])
				fin = mitad-1;
			else
				inicio = mitad+1;
			mitad = (inicio+fin)/2;
		}
		pos = mitad;
		if(inicio>fin)
			pos = (inicio+1)*-1;
		return pos;		
	}
	
	public static boolean sonMultiplosParalelos(int []a, int[]b){
		boolean res = false;
		
		if(a.length==b.length)
			for(int i =0;i<a.length;i++)
				a[i]%
		
		return res;
	}
}


























