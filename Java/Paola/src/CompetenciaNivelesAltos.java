import java.util.Random;




public class CompetenciaNivelesAltos {

	/**@author Paola Mejia
	 * 27 de noviembre 2015
	 */
	
	/*
	 * Clase competencia con lista generica de patinadoras
	 */
	
	//Atributos
	private String nombre;
	private String sede;
	private int año;
	private ListaArregloDesordenada <Patinadora> patinadoras;
	
	//Arreglos por nivel y categoria   Las letras corresponden a la categoria "P" es pre "I" Infantil y "J" juvenil.. Los numeros son los niveles
	
	//Pre Infantil A
	private Patinadora[] PIA0;
	private int pcia0;
	private Patinadora[] PIA1;
	private int pcia1;
	private Patinadora[] PIA2;
	private int pcia2;
	private Patinadora[] PIA3;
	private int pcia3;
	private Patinadora[] PIA4;
	private int pcia4;
	private Patinadora[] PIA5;
	private int pcia5;
	private Patinadora[] PIA6;
	private int pcia6;
	private Patinadora[] PIA7;
	private int pcia7;
	private Patinadora[] PIA8;
	private int pcia8;
	//Despues es categoria UNICA 

	
	//Pre Infantil B
	private Patinadora[] PIB0;
	private int pcib0;
	private Patinadora[] PIB1;
	private int pcib1;
	private Patinadora[] PIB2;
	private int pcib2;
	private Patinadora[] PIB3;
	private int pcib3;
	private Patinadora[] PIB4;
	private int pcib4;
	private Patinadora[] PIB5;
	private int pcib5;
	private Patinadora[] PIB6;
	private int pcib6;
	private Patinadora[] PIB7;
	private int pcib7;
	private Patinadora[] PIB8;
	private int pcib8;

	
	
	//Categorias Unicas
	private Patinadora[] Novicios;
	private int cNovicios;
	private Patinadora[] A1;
	private int cA1;
	private Patinadora[] A2;
	private int cA2;

	
	//Contructor

	public CompetenciaNivelesAltos(String nombre, String sede, int año) {
		super();
		this.nombre = nombre;
		this.sede = sede;
		this.año = año;
		patinadoras= new ListaArregloDesordenada <Patinadora>();
		
		//Pre Infantil A
		PIA0= new Patinadora[40];
		pcia0=0;
		PIA1= new Patinadora[40];
		pcia1=0;
		PIA2= new Patinadora[40];
		pcia2=0;
		PIA3= new Patinadora[40];
		pcia3=0;
		PIA4= new Patinadora[40];
		pcia4=0;
		PIA5= new Patinadora[40];
		pcia5=0;
		PIA6= new Patinadora[40];
		pcia6=0;
		PIA7= new Patinadora[40];
		pcia7=0;
		PIA8= new Patinadora[40];
		pcia8=0;

		
		//Pre Infantil B
		PIB0= new Patinadora[40];
		pcib0=0;
		PIB1= new Patinadora[40];
		pcib1=0;
		PIB2= new Patinadora[40];
		pcib2=0;
		PIB3= new Patinadora[40];
		pcib3=0;
		PIB4= new Patinadora[40];
		pcib4=0;
		PIB5= new Patinadora[40];
		pcib5=0;
		PIB6= new Patinadora[40];
		pcib6=0;
		PIB7= new Patinadora[40];
		pcib7=0;
		PIB8= new Patinadora[40];
		pcib8=0;
		
		//categorias unicas
		Novicios=new Patinadora[40];
		cNovicios=0;
		A1=new Patinadora[40];
		cA1=0;
		A2=new Patinadora[40];
		cA2=0;
	}
	
	

	//Getters y Setters
	
	public String getSede() {
		return sede;
	}


	public void setSede(String sede) {
		this.sede = sede;
	}


	public String getNombre() {
		return nombre;
	}


	public int getAño() {
		return año;
	}
	
	public int getPcia1() {
		return pcia1;
	}


	//Funcionalidad Minima Requerida
	



	//equals
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CompetenciaNivelesAltos other = (CompetenciaNivelesAltos) obj;
		if (año != other.año)
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}
	
	
	//compareTo
	public int compareTo(CompetenciaNivelesAltos unaCompetencia){
		int resp = 0;
		
		if (nombre.equalsIgnoreCase(unaCompetencia.getNombre()) && año==unaCompetencia.getAño())
			resp=0;
		else
			if (nombre.equalsIgnoreCase(unaCompetencia.getNombre())){
				if(año>unaCompetencia.getAño())
					resp=1;
				else
					resp=-1;
			}
			else
				if(año>unaCompetencia.getAño())
					resp=1;
				else
					resp=-1;
		
		return resp;
	}
	
	//toString
	
	public String toString(){
		StringBuilder sb;
		sb=new StringBuilder();
		sb.append("El nombre de la competencia es   "+nombre+"  \n");
		sb.append("La sede de la competencia es     "+sede+  "\n");
		sb.append("El año de la competencia es      "+año+"  \n");
		sb.append("Las competidoras son        \n "  +patinadoras.toString()+ "\n");
		
		return sb.toString();
	}
	
	//Funcionalidad especifica de la clase
	
	public boolean alta(String nombre, String apellido, int nivel,
			int añoNacimiento, char genero, String asociacion){
		boolean resp;
		int edad = 0;
		Patinadora unaPatinadora;
		
		unaPatinadora= new Patinadora(nombre, apellido, nivel, añoNacimiento, genero, asociacion);
		
		
		if (nivel>8){
			unaPatinadora.setCategoria("Unica");
			
			switch(nivel){
			case 9:
				A1[cA1]= unaPatinadora;
				cA1 ++;
				break;
			case 10:
				A1[cA1]= unaPatinadora;
				cA1 ++;
				break;
			case 11:
				A2[cA2]= unaPatinadora;
				cA2 ++;
				break;
				
				
			}
		
			
		}
		else
			edad=año-añoNacimiento;
		
			if (edad<19){
				switch(edad){
				case 1: case 2: case 3: case 4:
					unaPatinadora.setCategoria("Pre-Infantil A");
					switch(nivel){
					case 0: 
						PIA0[pcia0]= unaPatinadora;
						pcia0 ++;
					break;
					case 1: 
						PIA1[pcia1]= unaPatinadora;
						pcia1 ++;
					break;
					case 2: 
						PIA2[pcia2]= unaPatinadora;
						pcia2 ++;
					break;
					case 3: 
						PIA3[pcia3]= unaPatinadora;
						pcia3 ++;
					break;
					case 4: 
						PIA4[pcia4]= unaPatinadora;
						pcia4 ++;
					break;
					case 5: 
						PIA5[pcia5]= unaPatinadora;
						pcia5 ++;
					break;
					case 6: 
						PIA6[pcia6]= unaPatinadora;
						pcia6 ++;
					break;
					case 7: 
						PIA7[pcia7]= unaPatinadora;
						pcia7 ++;
					break;
					case 8: 
						PIA8[pcia8]= unaPatinadora;
						pcia8 ++;
					break;
					}
					break;
					
				case 5: case 6: 
					unaPatinadora.setCategoria("Pre-Infantil B");
					switch(nivel){
					case 0: 
						PIB0[pcib0]= unaPatinadora;
						pcib0 ++;
					break;
					case 1: 
						PIB1[pcib1]= unaPatinadora;
						pcib1 ++;
					break;
					case 2: 
						PIB2[pcib2]= unaPatinadora;
						pcib2 ++;
					break;
					case 3: 
						PIB3[pcib3]= unaPatinadora;
						pcib3 ++;
					break;
					case 4: 
						PIB4[pcib4]= unaPatinadora;
						pcib4 ++;
					break;
					case 5: 
						PIB5[pcib5]= unaPatinadora;
						pcib5 ++;
					break;
					case 6: 
						PIB6[pcib6]= unaPatinadora;
						pcib6 ++;
					break;
					case 7: 
						PIB7[pcib7]= unaPatinadora;
						pcib7 ++;
					break;
					case 8: 
						PIB8[pcib8]= unaPatinadora;
						pcib8 ++;
					break;
					}
					break;
				case 7: case 8: 
					unaPatinadora.setCategoria("Infantil A");
					break;
				case 9: case 10: 
					unaPatinadora.setCategoria("Infantil B");
					break;
				case 11: case 12: 
					unaPatinadora.setCategoria("Infantil C");
					break;
				case 13: case 14: 
					unaPatinadora.setCategoria("Juvenil A");
					break;
				case 15: case 16: 
					unaPatinadora.setCategoria("Juvenil B");
					break;
				case 17: case 18: 
					unaPatinadora.setCategoria("Juvenil C");
					break;
				}
			}
				else
					unaPatinadora.setCategoria("Mayor");
			
			resp= patinadoras.alta(unaPatinadora);
			
		return resp;
		
		
		}
	

	
	
	public String baja(String nombre, String apellido, int añoNacimiento){
		String info;
		Patinadora unaPatinadora;
		
		//lista en la que pertenece -1;
		
		unaPatinadora= new Patinadora(nombre, apellido, 0, añoNacimiento, 'A', " ");
		unaPatinadora= patinadoras.baja(unaPatinadora);
		
		if(unaPatinadora!=null)
			info=unaPatinadora.toString();
		else
			info="No está";
		
		return info;	
	}
	
	
	//Estadisticas
	
	public int indicaCuantosPorGenero(char genero){
		int cuantas=0, i, n;
		
		n=patinadoras.ocupados();
		for(i=0;i<n;i++)
			if(genero==patinadoras.getElement(i).getGenero())
				cuantas++;
	
		return cuantas;
	}
	
	public int indicaCuantosPorNivel(int nivel){
		int cuantas=0, i, n;
		
		n=patinadoras.ocupados();
		for(i=0;i<n;i++)
			if(nivel==patinadoras.getElement(i).getNivel())
				cuantas++;
	
		return cuantas;
	}
	
	public int indicaCuantosPorCategoria(String categoria){
		int cuantas=0, i, n;
		
		n=patinadoras.ocupados();
		for(i=0;i<n;i++)
			if(categoria.equalsIgnoreCase(patinadoras.getElement(i).getCategoria()))
				cuantas++;
	
		return cuantas;
	}
	
	public int indicaCuantosPorAsociacion(String asociacion){
	int cuantas=0, i, n;
		
		n=patinadoras.ocupados();
		for(i=0;i<n;i++)
			if(asociacion.equalsIgnoreCase(patinadoras.getElement(i).getAsociacion()))
				cuantas++;
	
		return cuantas;
	}
	
	
	public String ordenSalida(int nivel, String categoria){ //Si el usuario escoge el  bloque ?
		
		String info = null;
		Patinadora[] bloque = null;
		int numeroEnBloque = 0, index;
		Random random;
		Patinadora aux;
		
		random= new Random();
		
		bloque=PIA0;
		numeroEnBloque= pcia0;
		
		for(int i=0; i<numeroEnBloque; i++){
			index= random.nextInt(i+1);
			aux= bloque[index];
			bloque[index]= bloque[i];
			bloque[i]=aux;
		}
		
		for(int i=0; i<numeroEnBloque; i++)
			info= info+ (" \n  "+(i+1)+ "   " + bloque[i].getNombre()+"   " + bloque[i].getApellido()+"   "  + bloque[i].getAsociacion() );
			
		
		return info;
		
	
		//Este ya funciona, pero genera una lista aparte...
		/*
		String info = null;
		Patinadora[] bloque;
		int numeroEnBloque;
		ArrayList <String> ordenSalida;
		
		ordenSalida= new ArrayList<String>();
		
		bloque=PIA0;
		numeroEnBloque= pcia0;
		
		for(int i=0; i<numeroEnBloque; i++)
			ordenSalida.add(" \n  "+ "   " + bloque[i].getNombre()+"   " + bloque[i].getApellido()+"   "  + bloque[i].getAsociacion() );
		
		Collections.shuffle(ordenSalida);
		
		info= ordenSalida.toString();
		
		return info;
	*/
		
		
		/*array=PIA0;
		String info;
		
		 bloque=PIA0;
		numeroEnBloque= pcia0;
		
		
		
		for(int i=0; i<numeroEnBloque; i++)
		info=info+bloque[i].toString();
		
		return info;
		  
		  int index;
		  Patinadora temp;
		  Random random = new Random();
		  
		    for (int i = array.length - 1; i > 0; i--) {
		        index = random.nextInt(i + 1);
		        temp = array[index];
		        array[index] = array[i];
		        array[i] = temp;
		    }
		    
		    info=array.toString();
		    
			int i;
			StringBuilder sb;
			sb= new StringBuilder();
			for(i=0;i<array.length;i++)
				sb.append(array[i].toString());
			info=  sb.toString();
			
			
			int i;
			StringBuilder sb;
			sb= new StringBuilder();
			for(i=0;i<PIA0.length;i++)
				sb.append(PIA0[i].toString());
			info=  sb.toString();
			
			return info;
			*/
		    
		/*public String ordenSalidaCorta(int nivel, String categoria){
		int  i, n;
		String info;
		
		boolean resp;
		
		ArrayList <String> ordenSalida;
		ordenSalida= new ArrayList<String>();
		
		
		//ListaArregloDesordenada <Patinadora> bloque;
		//bloque= new ListaArregloDesordenada <Patinadora>();
		
		//Patinadora unaPatinadora = null;
		
		
		n=patinadoras.ocupados();
		 
		for(i=0;i<n;i++)
			if(categoria.equalsIgnoreCase(patinadoras.getElement(i).getCategoria()) && nivel==patinadoras.getElement(i).getNivel()){
				
				ordenSalida.add(" \n  "+ "   " + patinadoras.getElement(i).getNombre()+"   " + patinadoras.getElement(i).getApellido()+"   "  + patinadoras.getElement(i).getAsociacion() );
				
				//unaPatinadora= new Patinadora(patinadoras.getElement(i).getNombre(), patinadoras.getElement(i).getApellido(), patinadoras.getElement(i).getNivel(), patinadoras.getElement(i).getAñoNacimiento(), patinadoras.getElement(i).getGenero(), patinadoras.getElement(i).getAsociacion());
		
				//resp=bloque.alta(unaPatinadora);
			}
		
		
		Collections.shuffle(ordenSalida);
		
		info= ordenSalida.toString();
		
		return info;
				
	}
	
	*/
		    
	}
	
	
	public boolean registroDePuntosCorta(int nivel, String categoria, double[] puntos){
		
		//Esta quiero que sea funcion SOLO de jueces.. 
		
		//Deben de ser en orden de salida.
		Patinadora[] bloque = null;
		int numeroEnBloque = 0;
		boolean resp = false;
		
		bloque=PIA0;
		numeroEnBloque= pcia0;
		
		if(numeroEnBloque==puntos.length)
			for(int i=0; i<numeroEnBloque; i++){
				bloque[i].setPuntosC(puntos[i]);
				resp=true;
			}
		else
			resp=false;
		
		return resp;
		
	}
	
	public String lugaresCorta(int nivel, String categoria){

		String  info = null;
		Patinadora[] bloque = null;
		int numeroEnBloque = 0;
		Patinadora aux;
		
		//ordenar
		for(int i=0; i<numeroEnBloque; i++){
			if(bloque[i+1].getPuntosC()>bloque[i+1].getPuntosC()){
				aux=bloque[i];
				bloque[i]=bloque[i+1];
				bloque[i+1]=aux;
			}
		}
		
		for(int i=0; i<numeroEnBloque; i++){
			bloque[i].setLugarC(i+1);
			info= info+ (" \n  "+(i+1)+ "   " + bloque[i].getNombre()+"   " + bloque[i].getApellido()+"   "  + bloque[i].getAsociacion() );
		}
		
		return info;
	}
	
	
	
	public String ordenSalidaLarga(int nivel, String categoria){ //Si el usuario escoge el  bloque ?
		
		String info = null;
		Patinadora[] bloque = null;
		int numeroEnBloque = 0;
		Patinadora aux;
		
		bloque=PIA0;
		numeroEnBloque= pcia0;
		
		// Invertir orden de lugares corta. 
		
		for(int i=0; i<numeroEnBloque; i++){
			aux=bloque[i];
			bloque[i]=bloque[(numeroEnBloque-i)-1];
			bloque[(numeroEnBloque-i)-1]= aux;
			}
	
	
		for(int i=0; i<numeroEnBloque; i++)
			info= info+ (" \n  "+(i+1)+ "   " + bloque[i].getNombre()+"   " + bloque[i].getApellido()+"   "  + bloque[i].getAsociacion() );
			
		
		return info;
	}
	
	public boolean registroDePuntosLarga(int nivel, String categoria, double[] puntos){
		
		//Esta quiero que sea funcion SOLO de jueces.. 
		
		//Deben de ser en orden de salida.
		Patinadora[] bloque = null;
		int numeroEnBloque = 0;
		boolean resp = false;
		
		bloque=PIA0;
		numeroEnBloque= pcia0;
		
		if(numeroEnBloque==puntos.length)
			for(int i=0; i<numeroEnBloque; i++){
				bloque[i].setPuntosL(puntos[i]);
				resp=true;
			}
		else
			resp=false;
		
		return resp;
		
	}
	
	public String lugaresLarga(int nivel, String categoria){

		String  info = null;
		Patinadora[] bloque = null;
		int numeroEnBloque = 0;
		Patinadora aux;
		
		//ordenar
		for(int i=0; i<numeroEnBloque; i++){
			if(bloque[i+1].getPuntosC()>bloque[i+1].getPuntosC()){
				aux=bloque[i];
				bloque[i]=bloque[i+1];
				bloque[i+1]=aux;
			}
		}
		
		for(int i=0; i<numeroEnBloque; i++){
			bloque[i].setLugarL(i+1);
			info= info+ (" \n  "+(i+1)+ "   " + bloque[i].getNombre()+"   " + bloque[i].getApellido()+"   "  + bloque[i].getAsociacion() );
		}
		
		return info;
	}
	
	
	public String lugaresFinales(int nivel, String categoria){

		String  info = null;
		Patinadora[] bloque = null;
		int numeroEnBloque = 0;
		Patinadora aux;
		double puntosT;
		
		//sumar
		for(int i=0; i<numeroEnBloque; i++){
			puntosT=bloque[i].getPuntosC()+bloque[i].getPuntosL();
			bloque[i].setPuntosT(puntosT);
		}
		
		//ordenar
		for(int i=0; i<numeroEnBloque; i++){
			if(bloque[i+1].getPuntosT()>bloque[i+1].getPuntosT()){
				aux=bloque[i];
				bloque[i]=bloque[i+1];
				bloque[i+1]=aux;
			}
		}
		
		//imprimir
		for(int i=0; i<numeroEnBloque; i++)
			info= info+ (" \n  "+(i+1)+ "   " + bloque[i].getNombre()+"   " + bloque[i].getApellido()+"   "  + bloque[i].getAsociacion() );
			
		
		return info;
	}
	
	
	
	//como cerrar y crear historial?
	public void cierreCompetencia(){
		patinadoras.clear();
		
	}

}


