/*@author Alexis Calvillo  Madrid
 *13 de noviembre del 2015
 *Lista Arreglo Ordenada
 */
public class ListaArregloOrdenada<T extends Comparable<T>> {
	private T[] datos;
	private int n;
	private final int MAX=50;
	
	public ListaArregloOrdenada(){
		datos= (T[]) new Comparable[MAX];
		n=0;
	}
	public ListaArregloOrdenada(int max){
		datos=(T[]) new Comparable[max];
		n=0;
	}
	public ListaArregloOrdenada(T[]arr){
		int tam;
		if(arr.length>MAX)
			tam=arr.length*2;
		else
			tam=MAX;
		datos = (T[]) new Comparable[tam];
		n=arr.length;
		for(int i=0;i<arr.length;i++)
			datos[i]=arr[i];
	}
	 public boolean add(T a){
		 boolean res=true;
		 int pos=0;
		 
		 if(n>datos.length)
			 this.expandCapacity();
		 pos=ManejadorDeArreglosGenericos.busquedaBinaria(datos, n, a);
		 if(pos<0){
			pos=-pos-1;
			ManejadorDeArreglosGenericos.correDerech(datos, n, pos);
			datos[pos]=a;
			n++;
		}
		else
			res=false;
		return res;
	 }
	 
	 public T remove(T a){
		 T res=null;
		 int ind;
		 
		 ind=ManejadorDeArreglosGenericos.busquedaSecOrdenada(datos, n, a);
		 if(ind>=0){
			 res=datos[ind];
			 datos[ind]=null;
			 ManejadorDeArreglosGenericos.correIzqu(datos, n, ind);
			 datos[n-1]=null;
			 n--;
		 }
		 return res;
	 }
	 public T remove(int ind){
		 T res=null;
		 
		 if(ind>-1&&ind<n){

			 res=datos[ind];
			 datos[ind]=null;
			 ManejadorDeArreglosGenericos.correIzqu(datos, n, ind);
			 datos[n]=null;
			 n--;
		 }
		 return res;
	 }
	 public T get(int ind){
		 T a=null;
		 if(ind>-1&&ind<n)
			 a=datos[ind];
		 return a;
	 }
	 public int size(){
		 return n;
	 }
	 public boolean isEmpty(){
		 boolean res=false;
		 
		 if(n==0)
			 res=true;
		 return res;
	 }
	 
	 public void clear(){
			datos= (T[]) new Comparable[MAX];
			n=0;
	 }
	 public boolean contains(T a){
		 boolean res=false;
		 int pos=0;
		 
		 pos=ManejadorDeArreglosGenericos.busquedaBinaria(datos, n, a);
		 if(pos>=0)
			 res=true;
		 return res;
	 }
	 public int indexOf(T a){
		 int res;
		 res=ManejadorDeArreglosGenericos.busquedaBinaria(datos, n, a);
		 return res;
	 }
	 public String toString(){
		 StringBuilder cad=new StringBuilder();
		 cad.append(n);
		 for(int i=0; i<n; i++)
			 cad.append("\n"+datos[i].toString());
		 return cad.toString();
	 }
	 public  void expandCapacity(){
		 T[] aux= (T[]) new Comparable[datos.length*2];
		 for(int i=0; i<datos.length;i++)
			 aux[i]=datos[i];
		 datos=aux;
	 }
}
