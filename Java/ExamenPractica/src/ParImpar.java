import java.util.ArrayList;

/*
 * @Roberto Alejandro Gutierrez Guillen
 * 4/11/2015
 */

public class ParImpar {

	public static ArrayList<Integer> parImpar(int par[], int impar[]){
		ArrayList<Integer> lista = new ArrayList<Integer>();
		int pos = 0;
		int aux2 = 0;
		int aux1 = 0;
		int des = 0;
		
		while( aux1 < par.length && aux2 < impar.length ){
			des = pos%2;
			if(des==0){
				while(aux1<par.length && par[aux1]%2!=0)
					aux1++;
				if(aux1!=par.length)
			        lista.add(par[aux1]);
			}else{
				while(aux2 < impar.length && impar[aux2]%2!=1)
					aux2++;
				if(aux2 != impar.length)
					lista.add(impar[aux2]);
			}
		pos++;
		}
		if(aux1==par.length && aux2< impar.length){
			while(aux2 <impar.length){
				if(impar[aux2]%2==1)
					lista.add(impar[aux2]);
				aux2++;
			}
		}else{
			if(aux2==impar.length &&aux1 <par.length){
				while(aux1< par.length){
					if(par[aux1]%2==0)
						lista.add(par[aux1]);
					aux1++;
				}
			}
		}
		return lista;
	}

}
