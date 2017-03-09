import java.util.ArrayList;

/*
 * @Roberto Alejandro Gutierrez Guillen
 * 4/11/2015
 */

public class Examen2013 {
	
	public static boolean sonMultiplosParalelos(int []a, int[]b){
		boolean res = false;
		
		if(a.length==b.length)
			for(int i = 0;i<a.length;i++)
				if(b[i]%a[i]!=0)
					res = false;
				else
					res = true; 	
		return res;
	}
	
	public static ArrayList<Integer> datosIntervalo(int []c, int x, int y){
		ArrayList<Integer> lista = new ArrayList<Integer>(); 
		
		return lista;
	}
	
	public static void main(String[] args){
	int c[] = {};
	int a[] = {3,2,15,20};
	int b[] = {6,8,30,40};
	
	if(sonMultiplosParalelos(a,b))
	     System.out.println("Muy Bien");
	}

}
