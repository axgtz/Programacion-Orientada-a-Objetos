import java.util.ArrayList;

public class ManejadorDeArreglosGenericos<T extends Comparable<T>> {
	
	public static<T> void swap(T [] a, int x, int y){
		T aux=a[x];

		a[x]=a[y];
		a[y]=aux;
	}
	public static<T> void invierte(T[]a, int n){
		for(int i=0; i<n/2;i++ ){
			swap(a,i,((n-1)-i));
		}
	}
	public static<T extends Comparable<T>> int indiceMenor(T[] a, int num,int pos){
		int min=pos;
		
		for(int i=pos+1 ;i<num; i++){
			if(a[min].compareTo(a[i])<=0){
				min=i;
			}
		}
		return min;
	}

	public static<T extends Comparable<T>> int indiceMayor(T[]a,int n){
		int res=0;
		T max= a[0];
		
		for(int i=1; i<n;i++)
			if(a[i].compareTo(max)>0){
				res =i;
				max=a[i];
			}
		return res;		
	}
	
	
	public static<T extends Comparable> int indiceMenor(T[]a, int num){
		int res=0;
		T men;

		men=a[0];
		for(int i=1; i<num; i++){
			if(a[i].compareTo(men)<0){
				men=a[i];
				res=i;
			}
		}
		return res;
	}
	public static<T extends Comparable<T>> int mayoresA(T[]a, int num, T par){
		int res=0;

		for(int i=0; i<num; i++){
			if(a[i].compareTo(par)>0)
				res+=1;
		}
		return res;
	}
	public static<T extends Comparable<T>> int menoresA(T[]a, int num, T par){
		int res=0;

		for(int i=0;i<num;i++){
			if(a[i].compareTo(par)<0)
				res+=1;
		}
		return res;
	}
	public static<T extends Comparable<T>> ArrayList<Integer> indMayoresA(T []a, int num, T param){
		ArrayList<Integer>lista=new ArrayList<>();

		for(int i=0; i<num; i++){
			if(a[i].compareTo(param)>0)
				lista.add(i);
		}
		return lista;
	}
	public static<T extends Comparable<T>> ArrayList<Integer> indMenoresA(T[]a, int num, T param){
		ArrayList<Integer>lista=new ArrayList<>();

		for(int i=0; i<num; i++){
			if(a[i].compareTo(param)<0)
				lista.add(i);
		 }
		return lista;
	}
	public static<T> void movCirc(T[]a,int num, int klug){
		T aux;
		if(klug>num){
			klug=klug%num;
		}
		for(int i=0;i<klug;i++){
			aux=a[num-1];
			for(int k=0; k<num-1;k++){
				a[(num-k)-(1)]=a[(num-k)-(2)];
				}
			a[0]=aux;
		}
	}
	public static<T> void correIzqu(T []a, int num, int klug){

		for(int i=1; i<klug;i++){
			for(int k=0; k<num-1; k++)
				a[k]=a[k+1];
			a[num-1]=null;
			}
		}

	public static<T extends Comparable<T>> void correIzqu(T []a, int num, int posin){
			
			for(int i=posin; i<num-1;i++)
				a[i]=a[i+1];
			a[num-1]=null;
		}


	public static<T> void correDerech(T[]a, int num, int klug){

		for(int i=1; i<=klug;i++){
			for(int k=0; k<num-1; k++){
				a[(num-k)-(1)]=a[(num-k)-(2)];
			}
			a[0]=null;
		}
	}
	public static<T extends Comparable<T>> void correDerech(T[]a, int num, int posin){

			for(int k=num; k>posin; k--){
				a[(k)]=a[(k-1)];
			}
			a[posin]=null;
		}
	public static <T> int busquedaDesordenada(T[]a, int n, T x){
		int res;
		int i = 0;

		while(i<n&&!a[i].equals(x))
			i++;
		if(i==n)
			res=-1;
		else
			res=i;
		return res;
	}
	public static<T extends Comparable<T>> int busquedaSecOrdenada(T[] a, int n, T x){   
		int i=0;  
		while (i<n && a[i].compareTo(x)<0){    
			i++;
		}
		if (i>=n || a[i].compareTo(x)!=0)    
			i=-i-1;
		return i;  
	}
	public static<T extends Comparable<T>> int busquedaBinaria(T []a, int n, T x){
		int pos;
		int posini = 0;
		int posfin = n-1;
		int mitad = (posini+posfin)/2;
		
		 while ( posini <= posfin && !a[mitad].equals(x) ){
			 
			 if (a[mitad].compareTo(x)>0 )
				 posfin = mitad-1;
			 else
				 posini = mitad+1;
			 mitad = (posini+posfin)/2;
		 }
		 if ( posini > posfin)
			 pos = -posini-1;
		 else
			 pos = mitad;
		 return pos;

	}
	public static<T> boolean capicua(T[]a, int n){
		boolean res=true;
		int i=0;

			while(res&&i<(n-1)/2){
				if(!a[i].equals(a[(n-i)-1]));
					res=false;
				i++;
			}
		return res;
	}
	public static <T extends Comparable<T>> void ordenaSeleccionDirecta(T[]a,int n){
		int ind;
		
		for(int i=0;i<n-1;i++){
			ind= indiceMenor(a,n,i);
			swap(a,i,ind);
		}	
	}


	public static <T extends Comparable<T>> void ordenamientoGenerico(T [] a){
		int men=0;
		int lug=0;
		T aux=a[lug];
		
		while(lug<a.length-1){
			for(int i=lug; i<a.length;i++)
				if(a[i].compareTo(a[men])<0)
					men=i;
				aux=a[lug];
				a[lug]=a[men];
				a[men]=aux;
				lug++;
		}
	}	
	
	public static<T extends Comparable<T>> ArrayList<T> aUnionB(T[] a, int na ,T[] b, int nb){
		ArrayList<T> c;
		c = new ArrayList<T>();
		int ind=0;
			for(int i=0;i<na;i++)
				c.add(a[i]);
			for(int i=0;i<nb;i++){
				T bis=b[i];
				ind=busquedaSecOrdenada(c,c.size(), bis);
				if(ind<0){
					ind*=-1;
					c.add(ind-1,b[i]);	
				}
			}
		return c;
	}
	private static<T extends Comparable<T>> int busquedaSecOrdenada(ArrayList<T> a, int n, T x) {   
		int i=0;  
			
		while (i<n && a.get(i).compareTo(x)>0)    
			i++;
		if (i>=n || a.get(i)!=x)    
			i=-i-1;   
		return i;  
	}
}
