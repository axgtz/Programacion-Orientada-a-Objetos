//JPaul

import java.awt.GridLayout;
import javax.swing.*;
import javax.swing.border.Border;

public class CalculadoraVista extends JFrame {
	protected JTextField ent1, ent2, resTxt;
	protected JButton suma,resta,div,mult;
	protected JLabel operandoA, operandoB, resultado;

	
	public CalculadoraVista(String titulo){
		//invoco al constructor de JFrame
		super(titulo);
		
		//instancio atributos que son componentes Guis
		resta=new JButton("-");
		suma=new JButton("+");
		div=new JButton("/");
		mult=new JButton("*");
		ent1= new JTextField(10);
		ent2=new JTextField(10);
		resTxt= new JTextField(10);
		operandoA=new JLabel("Operando");
		operandoB=new JLabel("Operando");
		resultado=new JLabel("Respuesta");
		
		//agrego elementos al JPannel
		JPanel p= new JPanel();
		p.setLayout(new GridLayout(5,2));
		Border gap=BorderFactory.createEmptyBorder(5,5,5,5);
		p.setBorder(gap);
		
		p.add(operandoA);
		p.add(ent1);
		p.add(operandoB);
		p.add(ent2);
		p.add(suma);
		p.add(resta);
		p.add(mult);
		p.add(div);
		p.add(resTxt);
		p.add(resultado);

		this.add(p);
		
		//Visualización
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setBounds(100, 100, 200, 120);
	}
	
	public static void main(String[] args) {
		CalculadoraVista yo=new CalculadoraVista("PRUEBA");
		
	}
}
