
public class PortafolioInversion {
	private String nombre;
	private int numInv;
	private Inversion []sebas;
	private final int MAX=50;
	
	public PortafolioInversion(){
		sebas=new Inversion[MAX];
		numInv=0;
	}
	public boolean altaInversion(String nomFondo, double monto, int meses, double rendimiento){
		boolean respuesta=false;
		Inversion nueva=new Inversion(nomFondo, monto, meses, rendimiento);
		if(numInv<sebas.length){
			sebas[numInv]=nueva;
			numInv=numInv+1;
			respuesta=true;
		}
		return respuesta;	
	}
	public int busqueda(String nomFondo){
		int i=0;
		while(i<numInv && sebas[i].getNomFondo()!=nomFondo)
			i++;
		if(i==numInv)//Significa que no lo encontró
			i=-1;
		return i;
	}
	public boolean encuentraInv(String nomFondo){
		boolean res=false;
		int pos=busqueda(nomFondo);
		if(pos>=0)
			res=true;
		return res;
		
	}
	
	public int invMayorX(int x){
		for(int i = 0;i<numInv;i++)
			if(sebas[i].getMonto()>)
	}
	
	

}
