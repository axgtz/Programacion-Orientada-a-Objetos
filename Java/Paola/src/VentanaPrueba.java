import java.awt.GridLayout;
import java.awt.HeadlessException;

import javax.swing.*;
import javax.swing.border.Border;

 /*
  * Primera ventana de pruba
  */

public class VentanaPrueba extends JFrame {
	
	protected JPanel miPanel;
	protected Border miBorde;
	protected JButton bAlta;
	protected JLabel etNombre, etApellido, etAñoNacimiento, etGenero, etAsociacion, etNivel;
	protected JTextField ctNombre, ctApellido, ctAñoNacimiento, ctGenero, ctAsociacion, ctNivel;
	
	
	public VentanaPrueba(){
		super("Competencia");
		
		miPanel= new JPanel(new GridLayout(10,5));
		miBorde= BorderFactory.createEmptyBorder(10, 10, 10, 10);
		
		
		
	}
	
	
	
	
	
	
	
	

}

