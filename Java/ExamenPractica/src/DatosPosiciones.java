import java.util.ArrayList;

/*
 * @Roberto Alejandro Gutierrez Guillen
 * 4/11/2015
 */

public class DatosPosiciones {
	
	public static ArrayList<Integer> datpsPosiciones(double []a, int x){
		ArrayList<Integer> indices = new ArrayList<Integer>();
		
		for(int i=x; i<a.length;i+=x)
			indices.add(i);
		return indices;	
	}

}
