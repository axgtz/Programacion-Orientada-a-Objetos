import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//JPaul
public class CalculadoraControlador extends CalculadoraVista {

	public CalculadoraControlador(String titulo) {
		super(titulo);
		
		suma.addActionListener(new Escuchador());
		resta.addActionListener(new Escuchador());
		div.addActionListener(new Escuchador());
		mult.addActionListener(new Escuchador());
		
		int num;
	}
	
	private class Escuchador implements ActionListener{
		public void actionPerformed(ActionEvent ae){
			String operandoAStr, operandoBStr, resStr="";
			double cant1, cant2, res=0;
			
			operandoAStr=ent1.getText();
			operandoBStr=ent2.getText();
			cant1=Double.parseDouble(operandoAStr);
			cant2=Double.parseDouble(operandoBStr);
			
			switch(ae.getActionCommand().charAt(0)){
				case '+': res=cant1+cant2;
						break;
				case '-': res=cant1-cant2;
						break;
				case '/': res=cant1/cant2;
						break;
				case '*': res=cant1*cant2;
			}
			resStr=resStr+res;
			resTxt.setText(resStr);
			
		}
	}

	public static void main(String[] args) {
		CalculadoraControlador yo=new  CalculadoraControlador("El bueno");

	}

}
