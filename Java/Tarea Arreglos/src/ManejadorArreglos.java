/*
 * @Roberto Alejandro Gutierrez Guillen
 * 21/20/2015
 */
import java.util.ArrayList;

public class ManejadorArreglos {
	
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
	//c
	public static int indicarMayor(double[] a, int n){
		double mayor = a[0];
		int indice = 0;
		
		for(int i = 1; i<n ;i++){
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
	
	//e
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
	//i
	public static ArrayList<Integer> cualesMayorX(double[] a, int n,double par){
		ArrayList<Integer> listaMayX = new ArrayList<Integer>(); 
		
		for(int i = 0; i<n ;i++){
			if(par<a[i]){
				listaMayX.add(i);
			}
		}	
		return listaMayX;
	}
	
	//j
	public static ArrayList<Integer> cualesMenorX(double[] a, int n,double par){
		ArrayList<Integer> listaMenorX = new ArrayList<Integer>(); 
		
		for(int i = 0; i<n ;i++){
			if(par>a[i]){
				listaMenorX.add(i);
			}
		}	
		return listaMenorX;
	}
}
