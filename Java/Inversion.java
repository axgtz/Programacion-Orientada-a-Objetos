
public class Inversion {
	private String nomFondo;
	private double monto;
	private int meses;
	private double rendimiento;
	
	public Inversion(){
	}
	public Inversion(String nomFondo, double monto, int meses, double rendimiento){
		this.nomFondo=nomFondo;
		this.monto=monto;
		this.meses=meses;
		this.rendimiento=rendimiento;
	}
	public String getNomFondo() {
		return nomFondo;
	}
	public double getMonto() {
		return monto;
	}
	public void setMonto(double monto) {
		this.monto = monto;
	}
	public int getMeses() {
		return meses;
	}
	public void setMeses(int meses) {
		this.meses = meses;
	}
	public double getRendimiento() {
		return rendimiento;
	}
	public void setRendimiento(double rendimiento) {
		this.rendimiento = rendimiento;
	}
	public void setNomFondo(String nomFondo) {
		this.nomFondo = nomFondo;
	}	

}
