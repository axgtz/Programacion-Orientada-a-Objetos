//Sebastián Aranda

import java.util.ArrayList;

public class ManjeadorArreglos {
	public static ArrayList <Double> ullman (double num){
		ArrayList<Double> lista;
		
		lista=new ArrayList <Double>();
		while(num!=1){
			lista.add(num);
			if(num%2==0)
				num=num/2;
			else
				num=num*3+1;
		}
		lista.add(num);
		return lista;
	}
		public static double suma(double[]a, int n){
			double suma = 0;
			
			for(int i=0; i<n; i++)
				suma += a[i];
			
			return suma;
		}
		
		public static double promedio(double[]a, int n){
			double sum = 0;
			
				sum = suma(a,n);
			
			return  sum/n;
		}
		
		public static int indiceMayor(double[]a, int n){
			
			int max = 0;
			
			for(int i=0; i<n; i++){
				if(a[max]<a[i])
					max = i;
			}
			
			return max;
		}
		
		public static int indiceMenor(double[]a, int n){
			int menor = (int)a[0];
			
			for(int i=1; i<n; i++)
				if(a[i]<menor)
					menor = i;
			
			return menor;
		}
		
		public static int elementosMayores(double[]a, int n, double num){
			int mayores = 0;
			
			for(int i=0; i<n; i++){
				if(num<a[i])
					mayores++;
			}
			
			return mayores;
		}
		
		public static int elementosMenores(double[]a, int n, double num){
			int menores = 0;
			
			for(int i=0; i<n; i++){
				if(a[i]<num)
					menores++;
			}
			return menores;
		}
		
		public static ArrayList<Integer> cualesMayX(double[]a, int n, double num){
			ArrayList<Integer> lista = new ArrayList<Integer>();
			
			for(int i=0; i<n; i++){
				if(num<a[i])
					lista.add(i);
			}
			
			return lista;
		}
		

		public static ArrayList<Integer> cualesMenX(double []a, int n, double num){
			ArrayList<Integer> lista = new ArrayList<Integer>();
			
			for(int i=0; i<n; i++){
				if(num>a[i])
					lista.add(i);
			}
			
			return lista;
		}
		
	
	public static double[] fibonacci (int n){
		double [] a;
		
		a=new double[n];
		a[0]=0;
		a[1]=1;
		for (int i=2;i<n;i++){
			a[i]=a[i-2]+a[i-1];
		}
		return a;
	}
	
	public static void swap(double[]a, int x, int y){
		double aux;
		
		aux = a[x];
		a[x] = a[y];
		a[y] = aux;
	}
	
	public static void invierte(double []a, int n){
		double aux = 0;
		int m = n;
		
		for(int i=0; i<n; i++){
			a[i] = a[m];
			a[m] = aux;
			m--;
		}
	}
	
	public static void correrDerecha(double []a, int n, int k){
		
		for(int i=0; i<k; i++){
			for(int j=0; j<n; j--){
				a[j] = a[j-1];
			}
			a[i] = 0;
		}
	}
	
	public static void correrIzq(double []a, int n, int k){
		int m = n;
		for(int i=0; i<k; i--){
			for(int j=0; j<n; j++)
				a[j] = a[j+1];
			a[m] = 0;
			m--;
		}	
	}
	
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
		while(i<n && x!=a[i])
			i++;
		if(x==a[i])
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
	public static boolean capicua(double[]a, int n){
		boolean res=false;
		double inicio=a[0];
		double fin=a[n-1];

		for (int i=1; i<=(n/2); i++){
			if(fin==inicio){
				inicio=a[i];
		        fin=a[n-1-i];
		        res=true;
			}
		    else{
		    	i=n;
		        res=false;
		    }
		}
		return res;
	}
	public static int posMinimo(double[]a, int n, int inicio){
		int posmin = inicio;
		
		for(int i = inicio ; i < n;i++){
			if(a[i]<posmin)
				a[i]= posmin; 
		}
		return posmin;
	}
	
	public static void ordenaSeleccionDirecta(double[]a, int n){
		int indmenor = 0;
				
		for(int i=0 ; i<n-1 ; i++){
			indmenor = posMinimo(a,n,i);
			swap(a,n,i); 
		}
	}
	public static ArrayList<Integer> unionArr(int[]a, int nA, int[]b, int nB){
		ArrayList<Integer> lista = new ArrayList<Integer>();
		
		for(int i=0;i<nA;i++)
			lista.add(a[i]);
		
		for(int i=0;i<nB;i++)
			if(!lista.contains(b[i]))
			lista.add(b[i]);
		
		return lista;
	}


}
