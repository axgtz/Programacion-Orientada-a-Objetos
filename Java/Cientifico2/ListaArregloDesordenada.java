/*Alexis Calvillo Madrid
 * 13 de Noviembre del 2015
 * Lista Arreglo Desordenada
 */
public class ListaArregloDesordenada<T> {
	private T[] datos;
	private int n;
	private final int MAX=50;
	
	public ListaArregloDesordenada(){
		datos= (T[]) new Object[MAX];
		n=0;
	}
	public ListaArregloDesordenada(int max){
		datos=(T[]) new Object[max];
		n=0;
	}
	public ListaArregloDesordenada(T[]arr){
		int tam;
		if(arr.length>MAX)
			tam=arr.length*2;
		else
			tam=MAX;
		datos = (T[]) new Object[tam];
		n=arr.length;
		for(int i=0;i<arr.length;i++)
			datos[i]=arr[i];
	}
	 public boolean add(int pos, T a){
		 boolean res=true;
		 
		 if(n<datos.length){
			 if(pos>0){
				 ManejadorDeArreglosGenericos.correDerech(datos, n, pos);
				 datos[pos]=a;
				 n++;
			 }
			 else
				 res=false;
		 }
		 else
			 res=false;
		 return res;
	 }
	 public boolean addLast(T a){
		 boolean res=false;
		 if(n<datos.length){
			 datos[n]=a;
			 n++;
			 res=true;
		 }
		 return res;
	 }
	 public boolean addFirst(T a){
		 boolean res=false;
		 if(n<datos.length){
			 ManejadorDeArreglosGenericos.correDerech(datos, n, 1);
			 datos[0]=a;
			 n++;
			 res=true;
		 }
		 return res;
	 }
	 public T remove(T a){
		 T res=null;
		 int ind;
		 
		 ind=ManejadorDeArreglosGenericos.busquedaDesordenada(datos, n, a);
		 if(ind>=0){
			 res=datos[ind];
			 ManejadorDeArreglosGenericos.correIzqu(datos, n, ind);
			 n--;
			
		 }
		 return res;
	 }
	 public T remove(int ind){
		 T res=null;
		 
		 if(ind>=0&&ind<n){

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
		 int ind=0;
		 
		 ind=ManejadorDeArreglosGenericos.busquedaDesordenada(datos, n, a);
		 if(ind>-1)
			 res=true;
		 
		 return res;
	 }
	 public int indexOf(T a){
		 int res=-1;
		 res=ManejadorDeArreglosGenericos.busquedaDesordenada(datos, n, a);
		 return res;
	 }
	 public String toString(){
		 StringBuilder cad=new StringBuilder();
		 cad.append("Tamaño: "+ n);
		 for(int i=0; i<n; i++)
			 cad.append("Elemento "+i +" "+ datos[i].toString());
		 return cad.toString();
	 }
	 public  void expandCapacity(){
		 T[] aux= (T[]) new Object[datos.length*2];
		 for(int i=0; i<datos.length;i++)
			 aux[i]=datos[i];
		 datos=aux;
	 }
}
