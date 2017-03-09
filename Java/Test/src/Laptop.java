
public class Laptop {
	private String taco;
	private int id;
	private static int  folio = 0;
	

	public Laptop() {
		id = folio;
		folio++;
	}
	
	public Laptop(String taco){
		this.taco = taco;
		
	}
	public boolean equals(Laptop otro){
		boolean res = false;
		if(this.taco == otro.taco)
			res = true;
		return res;
	}
	
	public int compareTo(Laptop otra){
	int res= -1;
	
	if(this.id==otra.id)
		res= 0;
	else
		if (this.id>otra.id)
			res= 1;
	return res;
	}
	
	public String toString(){
		StringBuilder cad = new StringBuilder();
		
		cad.append("tacoos");
		
		return cad.toString();
	}
	
}
