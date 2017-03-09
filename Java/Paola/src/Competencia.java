
import java.util.Random;




public class Competencia {

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
	
	//Rama Femenil
	
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
	
	//Infantil A
	private Patinadora[] IA0;
	private int cia0;
	private Patinadora[] IA1;
	private int cia1;
	private Patinadora[] IA2;
	private int cia2;
	private Patinadora[] IA3;
	private int cia3;
	private Patinadora[] IA4;
	private int cia4;
	private Patinadora[] IA5;
	private int cia5;
	private Patinadora[] IA6;
	private int cia6;
	private Patinadora[] IA7;
	private int cia7;
	private Patinadora[] IA8;
	private int cia8;
	
	//Infantil B
	private Patinadora[] IB0;
	private int cib0;
	private Patinadora[] IB1;
	private int cib1;
	private Patinadora[] IB2;
	private int cib2;
	private Patinadora[] IB3;
	private int cib3;
	private Patinadora[] IB4;
	private int cib4;
	private Patinadora[] IB5;
	private int cib5;
	private Patinadora[] IB6;
	private int cib6;
	private Patinadora[] IB7;
	private int cib7;
	private Patinadora[] IB8;
	private int cib8;
	
	//Infantil C
	private Patinadora[] IC0;
	private int cic0;
	private Patinadora[] IC1;
	private int cic1;
	private Patinadora[] IC2;
	private int cic2;
	private Patinadora[] IC3;
	private int cic3;
	private Patinadora[] IC4;
	private int cic4;
	private Patinadora[] IC5;
	private int cic5;
	private Patinadora[] IC6;
	private int cic6;
	private Patinadora[] IC7;
	private int cic7;
	private Patinadora[] IC8;
	private int cic8;
	
	//Juvenil A
	private Patinadora[] JA0;
	private int cja0;
	private Patinadora[] JA1;
	private int cja1;
	private Patinadora[] JA2;
	private int cja2;
	private Patinadora[] JA3;
	private int cja3;
	private Patinadora[] JA4;
	private int cja4;
	private Patinadora[] JA5;
	private int cja5;
	private Patinadora[] JA6;
	private int cja6;
	private Patinadora[] JA7;
	private int cja7;
	private Patinadora[] JA8;
	private int cja8;
	
	//Juvenil B
	private Patinadora[] JB0;
	private int cjb0;
	private Patinadora[] JB1;
	private int cjb1;
	private Patinadora[] JB2;
	private int cjb2;
	private Patinadora[] JB3;
	private int cjb3;
	private Patinadora[] JB4;
	private int cjb4;
	private Patinadora[] JB5;
	private int cjb5;
	private Patinadora[] JB6;
	private int cjb6;
	private Patinadora[] JB7;
	private int cjb7;
	private Patinadora[] JB8;
	private int cjb8;
	
	//Juvenil C
	private Patinadora[] JC0;
	private int cjc0;
	private Patinadora[] JC1;
	private int cjc1;
	private Patinadora[] JC2;
	private int cjc2;
	private Patinadora[] JC3;
	private int cjc3;
	private Patinadora[] JC4;
	private int cjc4;
	private Patinadora[] JC5;
	private int cjc5;
	private Patinadora[] JC6;
	private int cjc6;
	private Patinadora[] JC7;
	private int cjc7;
	private Patinadora[] JC8;
	private int cjc8;
	
	//Mayor
	private Patinadora[] M0;
	private int cm0;
	private Patinadora[] M1;
	private int cm1;
	private Patinadora[] M2;
	private int cm2;
	private Patinadora[] M3;
	private int cm3;
	private Patinadora[] M4;
	private int cm4;
	private Patinadora[] M5;
	private int cm5;
	private Patinadora[] M6;
	private int cm6;
	private Patinadora[] M7;
	private int cm7;
	private Patinadora[] M8;
	private int cm8;

	
	
	//Categorias Unicas
	private Patinadora[] Novicios;
	private int cNovicios;
	private Patinadora[] A1;
	private int cA1;
	private Patinadora[] A2;
	private int cA2;

	
	//Rama Varoniml
	
	//Pre Infantil A
	private Patinadora[] VPIA0;
	private int vpcia0;
	private Patinadora[] VPIA1;
	private int vpcia1;
	private Patinadora[] VPIA2;
	private int vpcia2;
	private Patinadora[] VPIA3;
	private int vpcia3;
	private Patinadora[] VPIA4;
	private int vpcia4;
	private Patinadora[] VPIA5;
	private int vpcia5;
	private Patinadora[] VPIA6;
	private int vpcia6;
	private Patinadora[] VPIA7;
	private int vpcia7;
	private Patinadora[] VPIA8;
	private int vpcia8;
	//Despues es categoria UNICA 

	
	//Pre Infantil B
	private Patinadora[] VPIB0;
	private int vpcib0;
	private Patinadora[] VPIB1;
	private int vpcib1;
	private Patinadora[] VPIB2;
	private int vpcib2;
	private Patinadora[] VPIB3;
	private int vpcib3;
	private Patinadora[] VPIB4;
	private int vpcib4;
	private Patinadora[] VPIB5;
	private int vpcib5;
	private Patinadora[] VPIB6;
	private int vpcib6;
	private Patinadora[] VPIB7;
	private int vpcib7;
	private Patinadora[] VPIB8;
	private int vpcib8;
	
	//Infantil A
	private Patinadora[] VIA0;
	private int vcia0;
	private Patinadora[] VIA1;
	private int vcia1;
	private Patinadora[] VIA2;
	private int vcia2;
	private Patinadora[] VIA3;
	private int vcia3;
	private Patinadora[] VIA4;
	private int vcia4;
	private Patinadora[] VIA5;
	private int vcia5;
	private Patinadora[] VIA6;
	private int vcia6;
	private Patinadora[] VIA7;
	private int vcia7;
	private Patinadora[] VIA8;
	private int vcia8;
	
	//Infantil B
	private Patinadora[] VIB0;
	private int vcib0;
	private Patinadora[] VIB1;
	private int vcib1;
	private Patinadora[] VIB2;
	private int vcib2;
	private Patinadora[] VIB3;
	private int vcib3;
	private Patinadora[] VIB4;
	private int vcib4;
	private Patinadora[] VIB5;
	private int vcib5;
	private Patinadora[] VIB6;
	private int vcib6;
	private Patinadora[] VIB7;
	private int vcib7;
	private Patinadora[] VIB8;
	private int vcib8;
	
	//Infantil C
	private Patinadora[] VIC0;
	private int vcic0;
	private Patinadora[] VIC1;
	private int vcic1;
	private Patinadora[] VIC2;
	private int vcic2;
	private Patinadora[] VIC3;
	private int vcic3;
	private Patinadora[] VIC4;
	private int vcic4;
	private Patinadora[] VIC5;
	private int vcic5;
	private Patinadora[] VIC6;
	private int vcic6;
	private Patinadora[] VIC7;
	private int vcic7;
	private Patinadora[] VIC8;
	private int vcic8;
	
	//Juvenil A
	private Patinadora[] VJA0;
	private int vcja0;
	private Patinadora[] VJA1;
	private int vcja1;
	private Patinadora[] VJA2;
	private int vcja2;
	private Patinadora[] VJA3;
	private int vcja3;
	private Patinadora[] VJA4;
	private int vcja4;
	private Patinadora[] VJA5;
	private int vcja5;
	private Patinadora[] VJA6;
	private int vcja6;
	private Patinadora[] VJA7;
	private int vcja7;
	private Patinadora[] VJA8;
	private int vcja8;
	
	//Juvenil B
	private Patinadora[] VJB0;
	private int vcjb0;
	private Patinadora[] VJB1;
	private int vcjb1;
	private Patinadora[] VJB2;
	private int vcjb2;
	private Patinadora[] VJB3;
	private int vcjb3;
	private Patinadora[] VJB4;
	private int vcjb4;
	private Patinadora[] VJB5;
	private int vcjb5;
	private Patinadora[] VJB6;
	private int vcjb6;
	private Patinadora[] VJB7;
	private int vcjb7;
	private Patinadora[] VJB8;
	private int vcjb8;
	
	//Juvenil C
	private Patinadora[] VJC0;
	private int vcjc0;
	private Patinadora[] VJC1;
	private int vcjc1;
	private Patinadora[] VJC2;
	private int vcjc2;
	private Patinadora[] VJC3;
	private int vcjc3;
	private Patinadora[] VJC4;
	private int vcjc4;
	private Patinadora[] VJC5;
	private int vcjc5;
	private Patinadora[] VJC6;
	private int vcjc6;
	private Patinadora[] VJC7;
	private int vcjc7;
	private Patinadora[] VJC8;
	private int vcjc8;
	
	//Mayor
	private Patinadora[] VM0;
	private int vcm0;
	private Patinadora[] VM1;
	private int vcm1;
	private Patinadora[] VM2;
	private int vcm2;
	private Patinadora[] VM3;
	private int vcm3;
	private Patinadora[] VM4;
	private int vcm4;
	private Patinadora[] VM5;
	private int vcm5;
	private Patinadora[] VM6;
	private int vcm6;
	private Patinadora[] VM7;
	private int vcm7;
	private Patinadora[] VM8;
	private int vcm8;

	
	
	//Categorias Unicas
	private Patinadora[] VNovicios;
	private int vcNovicios;
	private Patinadora[] VA1;
	private int vcA1;
	private Patinadora[] VA2;
	private int vcA2;

	
	
	//Contructor

	public Competencia(String nombre, String sede, int año) {
		super();
		this.nombre = nombre;
		this.sede = sede;
		this.año = año;
		patinadoras= new ListaArregloDesordenada <Patinadora>();
		
		//Rama Femenil
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
		
		//Infantil A
		IA0= new Patinadora[40];
		cia0=0;
		IA1= new Patinadora[40];
		cia1=0;
		IA2= new Patinadora[40];
		cia2=0;
		IA3= new Patinadora[40];
		cia3=0;
		IA4= new Patinadora[40];
		cia4=0;
		IA5= new Patinadora[40];
		cia5=0;
		IA6= new Patinadora[40];
		cia6=0;
		IA7= new Patinadora[40];
		cia7=0;
		IA8= new Patinadora[40];
		cia8=0;

		
		// Infantil B
		IB0= new Patinadora[40];
		cib0=0;
		IB1= new Patinadora[40];
		cib1=0;
		IB2= new Patinadora[40];
		cib2=0;
		IB3= new Patinadora[40];
		cib3=0;
		IB4= new Patinadora[40];
		cib4=0;
		IB5= new Patinadora[40];
		cib5=0;
		IB6= new Patinadora[40];
		cib6=0;
		IB7= new Patinadora[40];
		cib7=0;
		IB8= new Patinadora[40];
		cib8=0;
		
		// Infantil C
		IC0= new Patinadora[40];
		cic0=0;
		IC1= new Patinadora[40];
		cic1=0;
		IC2= new Patinadora[40];
		cic2=0;
		IC3= new Patinadora[40];
		cic3=0;
		IC4= new Patinadora[40];
		cic4=0;
		IC5= new Patinadora[40];
		cic5=0;
		IC6= new Patinadora[40];
		cic6=0;
		IC7= new Patinadora[40];
		cic7=0;
		IC8= new Patinadora[40];
		cic8=0;
		
		//Juvenil A
		JA0= new Patinadora[40];
		cja0=0;
		JA1= new Patinadora[40];
		cja1=0;
		JA2= new Patinadora[40];
		cja2=0;
		JA3= new Patinadora[40];
		cja3=0;
		JA4= new Patinadora[40];
		cja4=0;
		JA5= new Patinadora[40];
		cja5=0;
		JA6= new Patinadora[40];
		cja6=0;
		JA7= new Patinadora[40];
		cja7=0;
		JA8= new Patinadora[40];
		cja8=0;

		
		// Juvenil B
		JB0= new Patinadora[40];
		cjb0=0;
		JB1= new Patinadora[40];
		cjb1=0;
		JB2= new Patinadora[40];
		cjb2=0;
		JB3= new Patinadora[40];
		cjb3=0;
		JB4= new Patinadora[40];
		cjb4=0;
		JB5= new Patinadora[40];
		cjb5=0;
		JB6= new Patinadora[40];
		cjb6=0;
		JB7= new Patinadora[40];
		cjb7=0;
		JB8= new Patinadora[40];
		cjb8=0;
		
		// Juvenil C
		JC0= new Patinadora[40];
		cjc0=0;
		JC1= new Patinadora[40];
		cjc1=0;
		JC2= new Patinadora[40];
		cjc2=0;
		JC3= new Patinadora[40];
		cjc3=0;
		JC4= new Patinadora[40];
		cjc4=0;
		JC5= new Patinadora[40];
		cjc5=0;
		JC6= new Patinadora[40];
		cjc6=0;
		JC7= new Patinadora[40];
		cjc7=0;
		JC8= new Patinadora[40];
		cjc8=0;
		
		
		// Mayor
		M0= new Patinadora[40];
		cm0=0;
		M1= new Patinadora[40];
		cm1=0;
		M2= new Patinadora[40];
		cm2=0;
		M3= new Patinadora[40];
		cm3=0;
		M4= new Patinadora[40];
		cm4=0;
		M5= new Patinadora[40];
		cm5=0;
		M6= new Patinadora[40];
		cm6=0;
		M7= new Patinadora[40];
		cm7=0;
		M8= new Patinadora[40];
		cm8=0;
		
		
		
		//Categorias unicas
		Novicios=new Patinadora[40];
		cNovicios=0;
		A1=new Patinadora[40];
		cA1=0;
		A2=new Patinadora[40];
		cA2=0;
		
		
		
		
		//Rama Varonil
		//Pre Infantil A
		VPIA0= new Patinadora[40];
		vpcia0=0;
		VPIA1= new Patinadora[40];
		vpcia1=0;
		VPIA2= new Patinadora[40];
		vpcia2=0;
		VPIA3= new Patinadora[40];
		vpcia3=0;
		VPIA4= new Patinadora[40];
		vpcia4=0;
		VPIA5= new Patinadora[40];
		vpcia5=0;
		VPIA6= new Patinadora[40];
		vpcia6=0;
		VPIA7= new Patinadora[40];
		vpcia7=0;
		VPIA8= new Patinadora[40];
		vpcia8=0;

		
		//Pre Infantil B
		VPIB0= new Patinadora[40];
		vpcib0=0;
		VPIB1= new Patinadora[40];
		vpcib1=0;
		VPIB2= new Patinadora[40];
		vpcib2=0;
		VPIB3= new Patinadora[40];
		vpcib3=0;
		VPIB4= new Patinadora[40];
		vpcib4=0;
		VPIB5= new Patinadora[40];
		vpcib5=0;
		VPIB6= new Patinadora[40];
		vpcib6=0;
		VPIB7= new Patinadora[40];
		vpcib7=0;
		VPIB8= new Patinadora[40];
		vpcib8=0;
		
		//Infantil A
		VIA0= new Patinadora[40];
		vcia0=0;
		VIA1= new Patinadora[40];
		vcia1=0;
		VIA2= new Patinadora[40];
		vcia2=0;
		VIA3= new Patinadora[40];
		vcia3=0;
		VIA4= new Patinadora[40];
		vcia4=0;
		VIA5= new Patinadora[40];
		vcia5=0;
		VIA6= new Patinadora[40];
		vcia6=0;
		VIA7= new Patinadora[40];
		vcia7=0;
		VIA8= new Patinadora[40];
		vcia8=0;

		
		// Infantil B
		VIB0= new Patinadora[40];
		vcib0=0;
		VIB1= new Patinadora[40];
		vcib1=0;
		VIB2= new Patinadora[40];
		vcib2=0;
		VIB3= new Patinadora[40];
		vcib3=0;
		VIB4= new Patinadora[40];
		vcib4=0;
		VIB5= new Patinadora[40];
		vcib5=0;
		VIB6= new Patinadora[40];
		vcib6=0;
		VIB7= new Patinadora[40];
		vcib7=0;
		VIB8= new Patinadora[40];
		vcib8=0;
		
		// Infantil C
		VIC0= new Patinadora[40];
		vcic0=0;
		VIC1= new Patinadora[40];
		vcic1=0;
		VIC2= new Patinadora[40];
		vcic2=0;
		VIC3= new Patinadora[40];
		vcic3=0;
		VIC4= new Patinadora[40];
		vcic4=0;
		VIC5= new Patinadora[40];
		vcic5=0;
		VIC6= new Patinadora[40];
		vcic6=0;
		VIC7= new Patinadora[40];
		vcic7=0;
		VIC8= new Patinadora[40];
		vcic8=0;
		
		//Juvenil A
		VJA0= new Patinadora[40];
		vcja0=0;
		VJA1= new Patinadora[40];
		vcja1=0;
		VJA2= new Patinadora[40];
		vcja2=0;
		VJA3= new Patinadora[40];
		vcja3=0;
		VJA4= new Patinadora[40];
		vcja4=0;
		VJA5= new Patinadora[40];
		vcja5=0;
		VJA6= new Patinadora[40];
		vcja6=0;
		VJA7= new Patinadora[40];
		vcja7=0;
		VJA8= new Patinadora[40];
		vcja8=0;

		
		// Juvenil B
		VJB0= new Patinadora[40];
		vcjb0=0;
		VJB1= new Patinadora[40];
		vcjb1=0;
		VJB2= new Patinadora[40];
		vcjb2=0;
		VJB3= new Patinadora[40];
		vcjb3=0;
		VJB4= new Patinadora[40];
		vcjb4=0;
		VJB5= new Patinadora[40];
		vcjb5=0;
		VJB6= new Patinadora[40];
		vcjb6=0;
		VJB7= new Patinadora[40];
		vcjb7=0;
		VJB8= new Patinadora[40];
		vcjb8=0;
		
		// Juvenil C
		VJC0= new Patinadora[40];
		vcjc0=0;
		VJC1= new Patinadora[40];
		vcjc1=0;
		VJC2= new Patinadora[40];
		vcjc2=0;
		VJC3= new Patinadora[40];
		vcjc3=0;
		VJC4= new Patinadora[40];
		vcjc4=0;
		VJC5= new Patinadora[40];
		vcjc5=0;
		VJC6= new Patinadora[40];
		vcjc6=0;
		VJC7= new Patinadora[40];
		vcjc7=0;
		VJC8= new Patinadora[40];
		vcjc8=0;
		
		
		// Mayor
		VM0= new Patinadora[40];
		vcm0=0;
		VM1= new Patinadora[40];
		vcm1=0;
		VM2= new Patinadora[40];
		vcm2=0;
		VM3= new Patinadora[40];
		vcm3=0;
		VM4= new Patinadora[40];
		vcm4=0;
		VM5= new Patinadora[40];
		vcm5=0;
		VM6= new Patinadora[40];
		vcm6=0;
		VM7= new Patinadora[40];
		vcm7=0;
		VM8= new Patinadora[40];
		vcm8=0;
		
		
		
		//Categorias unicas
		VNovicios=new Patinadora[40];
		vcNovicios=0;
		VA1=new Patinadora[40];
		vcA1=0;
		VA2=new Patinadora[40];
		vcA2=0;
		
		
		
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
		Competencia other = (Competencia) obj;
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
	public int compareTo(Competencia unaCompetencia){
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
		
		if(genero=='F'){ //Mujeres. Rama Femenil
		
			if (nivel>8){
				unaPatinadora.setCategoria("Unica");
				
				switch(nivel){
				case 9:
					Novicios[cNovicios]= unaPatinadora;
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
						
						switch(nivel){
						case 0: 
							IA0[cia0]= unaPatinadora;
							cia0 ++;
						break;
						case 1: 
							IA1[cia1]= unaPatinadora;
							cia1 ++;
						break;
						case 2: 
							IA2[cia2]= unaPatinadora;
							cia2 ++;
						break;
						case 3: 
							IA3[cia3]= unaPatinadora;
							cia3 ++;
						break;
						case 4: 
							IA4[cia4]= unaPatinadora;
							cia4 ++;
						break;
						case 5: 
							IA5[cia5]= unaPatinadora;
							cia5 ++;
						break;
						case 6: 
							IA6[cia6]= unaPatinadora;
							cia6 ++;
						break;
						case 7: 
							IA7[cia7]= unaPatinadora;
							cia7 ++;
						break;
						case 8: 
							IA8[cia8]= unaPatinadora;
							cia8 ++;
						break;
						}
						
						break;
						
					case 9: case 10: 
						unaPatinadora.setCategoria("Infantil B");
						
						switch(nivel){
						case 0: 
							IB0[cib0]= unaPatinadora;
							cib0 ++;
						break;
						case 1: 
							IB1[cib1]= unaPatinadora;
							cib1 ++;
						break;
						case 2: 
							IB2[cib2]= unaPatinadora;
							cib2 ++;
						break;
						case 3: 
							IB3[cib3]= unaPatinadora;
							cib3 ++;
						break;
						case 4: 
							IB4[cib4]= unaPatinadora;
							cib4 ++;
						break;
						case 5: 
							IB5[cib5]= unaPatinadora;
							cib5 ++;
						break;
						case 6: 
							IB6[cib6]= unaPatinadora;
							cib6 ++;
						break;
						case 7: 
							IB7[cib7]= unaPatinadora;
							cib7 ++;
						break;
						case 8: 
							IB8[cib8]= unaPatinadora;
							cib8 ++;
						break;
						}
						
						break;
					case 11: case 12: 
						unaPatinadora.setCategoria("Infantil C");
						
						switch(nivel){
						case 0: 
							IC0[cic0]= unaPatinadora;
							cic0 ++;
						break;
						case 1: 
							IC1[cic1]= unaPatinadora;
							cic1 ++;
						break;
						case 2: 
							IC2[cic2]= unaPatinadora;
							cic2 ++;
						break;
						case 3: 
							IC3[cic3]= unaPatinadora;
							cic3 ++;
						break;
						case 4: 
							IC4[cic4]= unaPatinadora;
							cic4 ++;
						break;
						case 5: 
							IC5[cic5]= unaPatinadora;
							cic5 ++;
						break;
						case 6: 
							IC6[cic6]= unaPatinadora;
							cic6 ++;
						break;
						case 7: 
							IC7[cic7]= unaPatinadora;
							cic7 ++;
						break;
						case 8: 
							IC8[cic8]= unaPatinadora;
							cic8 ++;
						break;
						}
						
						break;
					case 13: case 14: 
						unaPatinadora.setCategoria("Juvenil A");
						
						switch(nivel){
						case 0: 
							JA0[cja0]= unaPatinadora;
							cja0 ++;
						break;
						case 1: 
							JA1[cja1]= unaPatinadora;
							cja1 ++;
						break;
						case 2: 
							JA2[cja2]= unaPatinadora;
							cja2 ++;
						break;
						case 3: 
							JA3[cja3]= unaPatinadora;
							cja3 ++;
						break;
						case 4: 
							JA4[cja4]= unaPatinadora;
							cja4 ++;
						break;
						case 5: 
							JA5[cja5]= unaPatinadora;
							cja5 ++;
						break;
						case 6: 
							JA6[cja6]= unaPatinadora;
							cja6 ++;
						break;
						case 7: 
							JA7[cja7]= unaPatinadora;
							cja7 ++;
						break;
						case 8: 
							JA8[cja8]= unaPatinadora;
							cja8 ++;
						break;
						}
						
						break;
					case 15: case 16: 
						unaPatinadora.setCategoria("Juvenil B");
						
						switch(nivel){
						case 0: 
							JB0[cjb0]= unaPatinadora;
							cjb0 ++;
						break;
						case 1: 
							JB1[cjb1]= unaPatinadora;
							cjb1 ++;
						break;
						case 2: 
							JB2[cjb2]= unaPatinadora;
							cjb2 ++;
						break;
						case 3: 
							JB3[cjb3]= unaPatinadora;
							cjb3 ++;
						break;
						case 4: 
							JB4[cjb4]= unaPatinadora;
							cjb4 ++;
						break;
						case 5: 
							JB5[cjb5]= unaPatinadora;
							cjb5 ++;
						break;
						case 6: 
							JB6[cjb6]= unaPatinadora;
							cjb6 ++;
						break;
						case 7: 
							JB7[cjb7]= unaPatinadora;
							cjb7 ++;
						break;
						case 8: 
							JB8[cjb8]= unaPatinadora;
							cjb8 ++;
						break;
						}
						
						
						break;
					case 17: case 18: 
						unaPatinadora.setCategoria("Juvenil C");
						

						switch(nivel){
						case 0: 
							JC0[cjc0]= unaPatinadora;
							cjc0 ++;
						break;
						case 1: 
							JC1[cjc1]= unaPatinadora;
							cjc1 ++;
						break;
						case 2: 
							JC2[cjc2]= unaPatinadora;
							cjc2 ++;
						break;
						case 3: 
							JC3[cjc3]= unaPatinadora;
							cjc3 ++;
						break;
						case 4: 
							JC4[cjc4]= unaPatinadora;
							cjc4 ++;
						break;
						case 5: 
							JC5[cjc5]= unaPatinadora;
							cjc5 ++;
						break;
						case 6: 
							JC6[cjc6]= unaPatinadora;
							cjc6 ++;
						break;
						case 7: 
							JC7[cjc7]= unaPatinadora;
							cjc7 ++;
						break;
						case 8: 
							JC8[cjc8]= unaPatinadora;
							cjc8 ++;
						break;
						}
						
						break;
					}
				}
					else{
						unaPatinadora.setCategoria("Mayor");
						

						switch(nivel){
						case 0: 
							M0[cm0]= unaPatinadora;
							cm0 ++;
						break;
						case 1: 
							M1[cm1]= unaPatinadora;
							cm1 ++;
						break;
						case 2: 
							M2[cm2]= unaPatinadora;
							cm2 ++;
						break;
						case 3: 
							M3[cm3]= unaPatinadora;
							cm3 ++;
						break;
						case 4: 
							M4[cm4]= unaPatinadora;
							cm4 ++;
						break;
						case 5: 
							M5[cm5]= unaPatinadora;
							cm5 ++;
						break;
						case 6: 
							M6[cm6]= unaPatinadora;
							cm6 ++;
						break;
						case 7: 
							M7[cm7]= unaPatinadora;
							cm7 ++;
						break;
						case 8: 
							M8[cm8]= unaPatinadora;
							cm8 ++;
						break;
						}
					}
				
			
		}
		else{ //Hombres. Rama Varonil
			
			if (nivel>8){
				unaPatinadora.setCategoria("Unica");
				
				switch(nivel){
				case 9:
					VNovicios[vcNovicios]= unaPatinadora;
					vcA1 ++;
					break;
				case 10:
					VA1[vcA1]= unaPatinadora;
					vcA1 ++;
					break;
				case 11:
					VA2[vcA2]= unaPatinadora;
					vcA2 ++;
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
							VPIA0[pcia0]= unaPatinadora;
							vpcia0 ++;
						break;
						case 1: 
							VPIA1[pcia1]= unaPatinadora;
							vpcia1 ++;
						break;
						case 2: 
							VPIA2[vpcia2]= unaPatinadora;
							vpcia2 ++;
						break;
						case 3: 
							VPIA3[vpcia3]= unaPatinadora;
							vpcia3 ++;
						break;
						case 4: 
							VPIA4[vpcia4]= unaPatinadora;
							vpcia4 ++;
						break;
						case 5: 
							VPIA5[vpcia5]= unaPatinadora;
							vpcia5 ++;
						break;
						case 6: 
							VPIA6[vpcia6]= unaPatinadora;
							vpcia6 ++;
						break;
						case 7: 
							VPIA7[vpcia7]= unaPatinadora;
							vpcia7 ++;
						break;
						case 8: 
							VPIA8[vpcia8]= unaPatinadora;
							vpcia8 ++;
						break;
						}
						break;
						
					case 5: case 6: 
						unaPatinadora.setCategoria("Pre-Infantil B");
						
						switch(nivel){
						case 0: 
							VPIB0[vpcib0]= unaPatinadora;
							vpcib0 ++;
						break;
						case 1: 
							VPIB1[vpcib1]= unaPatinadora;
							vpcib1 ++;
						break;
						case 2: 
							VPIB2[vpcib2]= unaPatinadora;
							vpcib2 ++;
						break;
						case 3: 
							VPIB3[vpcib3]= unaPatinadora;
							vpcib3 ++;
						break;
						case 4: 
							VPIB4[vpcib4]= unaPatinadora;
							vpcib4 ++;
						break;
						case 5: 
							VPIB5[vpcib5]= unaPatinadora;
							vpcib5 ++;
						break;
						case 6: 
							VPIB6[vpcib6]= unaPatinadora;
							vpcib6 ++;
						break;
						case 7: 
							VPIB7[vpcib7]= unaPatinadora;
							vpcib7 ++;
						break;
						case 8: 
							VPIB8[vpcib8]= unaPatinadora;
							vpcib8 ++;
						break;
						}
						break;
						
					case 7: case 8: 
						unaPatinadora.setCategoria("Infantil A");
						
						switch(nivel){
						case 0: 
							VIA0[vcia0]= unaPatinadora;
							vcia0 ++;
						break;
						case 1: 
							VIA1[vcia1]= unaPatinadora;
							vcia1 ++;
						break;
						case 2: 
							VIA2[vcia2]= unaPatinadora;
							vcia2 ++;
						break;
						case 3: 
							VIA3[vcia3]= unaPatinadora;
							vcia3 ++;
						break;
						case 4: 
							VIA4[vcia4]= unaPatinadora;
							vcia4 ++;
						break;
						case 5: 
							VIA5[vcia5]= unaPatinadora;
							vcia5 ++;
						break;
						case 6: 
							VIA6[vcia6]= unaPatinadora;
							vcia6 ++;
						break;
						case 7: 
							VIA7[vcia7]= unaPatinadora;
							vcia7 ++;
						break;
						case 8: 
							VIA8[vcia8]= unaPatinadora;
							vcia8 ++;
						break;
						}
						
						break;
						
					case 9: case 10: 
						unaPatinadora.setCategoria("Infantil B");
						
						switch(nivel){
						case 0: 
							VIB0[vcib0]= unaPatinadora;
							vcib0 ++;
						break;
						case 1: 
							VIB1[vcib1]= unaPatinadora;
							vcib1 ++;
						break;
						case 2: 
							VIB2[vcib2]= unaPatinadora;
							vcib2 ++;
						break;
						case 3: 
							VIB3[vcib3]= unaPatinadora;
							vcib3 ++;
						break;
						case 4: 
							VIB4[vcib4]= unaPatinadora;
							vcib4 ++;
						break;
						case 5: 
							VIB5[vcib5]= unaPatinadora;
							vcib5 ++;
						break;
						case 6: 
							VIB6[vcib6]= unaPatinadora;
							vcib6 ++;
						break;
						case 7: 
							VIB7[vcib7]= unaPatinadora;
							vcib7 ++;
						break;
						case 8: 
							VIB8[vcib8]= unaPatinadora;
							vcib8 ++;
						break;
						}
						
						break;
					case 11: case 12: 
						unaPatinadora.setCategoria("Infantil C");
						
						switch(nivel){
						case 0: 
							VIC0[vcic0]= unaPatinadora;
							vcic0 ++;
						break;
						case 1: 
							VIC1[vcic1]= unaPatinadora;
							vcic1 ++;
						break;
						case 2: 
							VIC2[vcic2]= unaPatinadora;
							vcic2 ++;
						break;
						case 3: 
							VIC3[vcic3]= unaPatinadora;
							vcic3 ++;
						break;
						case 4: 
							VIC4[vcic4]= unaPatinadora;
							vcic4 ++;
						break;
						case 5: 
							VIC5[vcic5]= unaPatinadora;
							vcic5 ++;
						break;
						case 6: 
							VIC6[vcic6]= unaPatinadora;
							vcic6 ++;
						break;
						case 7: 
							VIC7[vcic7]= unaPatinadora;
							vcic7 ++;
						break;
						case 8: 
							VIC8[vcic8]= unaPatinadora;
							vcic8 ++;
						break;
						}
						
						break;
					case 13: case 14: 
						unaPatinadora.setCategoria("Juvenil A");
						
						switch(nivel){
						case 0: 
							VJA0[vcja0]= unaPatinadora;
							vcja0 ++;
						break;
						case 1: 
							VJA1[vcja1]= unaPatinadora;
							vcja1 ++;
						break;
						case 2: 
							VJA2[vcja2]= unaPatinadora;
							vcja2 ++;
						break;
						case 3: 
							VJA3[vcja3]= unaPatinadora;
							vcja3 ++;
						break;
						case 4: 
							VJA4[vcja4]= unaPatinadora;
							vcja4 ++;
						break;
						case 5: 
							VJA5[vcja5]= unaPatinadora;
							vcja5 ++;
						break;
						case 6: 
							VJA6[vcja6]= unaPatinadora;
							vcja6 ++;
						break;
						case 7: 
							VJA7[vcja7]= unaPatinadora;
							vcja7 ++;
						break;
						case 8: 
							VJA8[vcja8]= unaPatinadora;
							vcja8 ++;
						break;
						}
						
						break;
					case 15: case 16: 
						unaPatinadora.setCategoria("Juvenil B");
						
						switch(nivel){
						case 0: 
							VJB0[vcjb0]= unaPatinadora;
							vcjb0 ++;
						break;
						case 1: 
							VJB1[vcjb1]= unaPatinadora;
							vcjb1 ++;
						break;
						case 2: 
							VJB2[vcjb2]= unaPatinadora;
							vcjb2 ++;
						break;
						case 3: 
							VJB3[vcjb3]= unaPatinadora;
							vcjb3 ++;
						break;
						case 4: 
							VJB4[vcjb4]= unaPatinadora;
							vcjb4 ++;
						break;
						case 5: 
							VJB5[vcjb5]= unaPatinadora;
							vcjb5 ++;
						break;
						case 6: 
							VJB6[vcjb6]= unaPatinadora;
							vcjb6 ++;
						break;
						case 7: 
							VJB7[vcjb7]= unaPatinadora;
							vcjb7 ++;
						break;
						case 8: 
							VJB8[vcjb8]= unaPatinadora;
							vcjb8 ++;
						break;
						}
						
						
						break;
					case 17: case 18: 
						unaPatinadora.setCategoria("Juvenil C");
						

						switch(nivel){
						case 0: 
							VJC0[vcjc0]= unaPatinadora;
							vcjc0 ++;
						break;
						case 1: 
							VJC1[vcjc1]= unaPatinadora;
							vcjc1 ++;
						break;
						case 2: 
							VJC2[vcjc2]= unaPatinadora;
							vcjc2 ++;
						break;
						case 3: 
							VJC3[vcjc3]= unaPatinadora;
							vcjc3 ++;
						break;
						case 4: 
							VJC4[vcjc4]= unaPatinadora;
							vcjc4 ++;
						break;
						case 5: 
							VJC5[vcjc5]= unaPatinadora;
							vcjc5 ++;
						break;
						case 6: 
							VJC6[vcjc6]= unaPatinadora;
							vcjc6 ++;
						break;
						case 7: 
							VJC7[vcjc7]= unaPatinadora;
							vcjc7 ++;
						break;
						case 8: 
							VJC8[vcjc8]= unaPatinadora;
							vcjc8 ++;
						break;
						}
						
						break;
					}
				}
					else{
						unaPatinadora.setCategoria("Mayor");
						

						switch(nivel){
						case 0: 
							VM0[vcm0]= unaPatinadora;
							vcm0 ++;
						break;
						case 1: 
							VM1[vcm1]= unaPatinadora;
							vcm1 ++;
						break;
						case 2: 
							VM2[vcm2]= unaPatinadora;
							vcm2 ++;
						break;
						case 3: 
							VM3[vcm3]= unaPatinadora;
							vcm3 ++;
						break;
						case 4: 
							VM4[vcm4]= unaPatinadora;
							vcm4 ++;
						break;
						case 5: 
							VM5[vcm5]= unaPatinadora;
							vcm5 ++;
						break;
						case 6: 
							VM6[vcm6]= unaPatinadora;
							vcm6 ++;
						break;
						case 7: 
							VM7[vcm7]= unaPatinadora;
							vcm7 ++;
						break;
						case 8: 
							VM8[vcm8]= unaPatinadora;
							vcm8 ++;
						break;
						}
					}
				
			
		}
		
		
	
		
			
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
