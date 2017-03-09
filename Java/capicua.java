//Sebastián
public class capicua {
	public static boolean capicua(double[]a, int n){
		boolean res=false;
		double inicio=a[n-n];
		double fin=a[n-1];

		for (int i=1; i<=(n/2); i++){
			if(fin==inicio){
				inicio=a[i];
		        fin=a[n-i];
		        res=true;
			}
		    else{
		    	i=n;
		        res=false;
		    }
		return res;
		}
	}

}
