//@Roberto Alejandro Gutierrez Guillen
import java.awt.GridLayout;
import javax.swing.*;
import javax.swing.border.Border;

public class ConvertidorVista extends JFrame{
	protected JLabel kmsLabel, millasLabel; //Protected = Privados y heredables
	protected JTextField kmsTxt, millasTxt;
	
	public ConvertidorVista(String titulo){
		//invoco al constructor de JFram cuando uso super();
		super(titulo);
		
		//Instancia atributos: componentes Guis
		kmsLabel = new JLabel("Kilometros : ");
		millasLabel = new JLabel("Millas : ");
		kmsTxt = new JTextField(10); //Tamaño que deja entrar el cuadro de largo
		millasTxt = new JTextField(10);
		
		JPanel p = new JPanel();
		p.setLayout(new GridLayout(2,2)); //agregar una cuadricula al panel = Grid Layout
		Border gap = BorderFactory.createEmptyBorder(5,5,5,5); 
		p.setBorder(gap);
		
		p.add(kmsLabel);
		p.add(kmsTxt);
		p.add(millasLabel);
		p.add(millasTxt);
		this.add(p);
		
		//Visualización
		this.setVisible(true); //el default es false
		this.setDefaultCloseOperation(EXIT_ON_CLOSE); //Cerrar la ejecutción, es como la x roja
		//Para más de una visto no usar exit on close, usar dispose
		this.setBounds(100,100,200,120);
	}
	
	public static void main(String[] args){ //main provisional
		ConvertidorVista test = new ConvertidorVista("Prueba");
	}

}
