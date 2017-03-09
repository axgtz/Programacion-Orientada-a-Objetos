import java.util.ArrayList;

/*
 * @Roberto Alejandro Gutierrez Guillen
 * 2/11/2015
 */
public class EjSumarArreglos {
	//Une dos arreglos si repeticiones
	public static ArrayList<Integer> aub(int []a, int []b){
	     ArrayList<Integer> lista = new ArrayList<Integer>();
	     
	     for(int i=0; i<a.length; i++)
	    	 lista.add(a[i]);
	     for(int i=0;i<b.length;i++)
	    	 if(!lista.contains(b[i]))
	    	     lista.add(b[i]);
	     
	     return lista;
	}
	
	public static void main(String[] args){
		int []a ={1,14,6,4,2,3,24};
		int []b ={1,7,16,3,14};
		ArrayList<Integer> i;
		
		i = aub(a,b);
		System.out.println(i);
	}

}
