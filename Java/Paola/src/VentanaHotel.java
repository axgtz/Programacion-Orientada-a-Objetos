import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Scrollbar;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;


public class VentanaHotel extends JFrame{
	protected JPanel miPanel;
	protected Border miBorde;
	protected JLabel etNombre, etTipo, etDias;
	protected JTextField ctNombre, ctTipo, ctDias;
	protected JButton bAlta, bBaja, bInfo, bMasDias, bCxT;
	protected JTextArea taInfo;
	protected JScrollPane barra;
	protected JFrame f;
	
	public VentanaHotel() {
		super();
		miPanel= new JPanel(new GridLayout(10,2));
		miBorde= BorderFactory.createEmptyBorder(10,10,10,10);
		miPanel.setBorder(miBorde);
		
		etNombre= new JLabel("Nombre Huesped");
		miPanel.add(etNombre);
		ctNombre= new JTextField(20);
		miPanel.add(ctNombre);
		
		etTipo= new JLabel("Tipo de Huesped");
		miPanel.add(etTipo);
		ctTipo= new JTextField(20);
		miPanel.add(ctTipo);
		
		etDias= new JLabel("Dias de estancia");
		miPanel.add(etDias);
	
		ctDias= new JTextField(20);
		miPanel.add(ctDias);
		
		bAlta= new JButton("Check-in");
		miPanel.add(bAlta);
		bBaja= new JButton("Check-out");
		miPanel.add(bBaja);
		bInfo= new JButton("Info");
		miPanel.add(bInfo);
		bMasDias= new JButton("Agregar Dias");
		miPanel.add(bMasDias);
		bCxT= new JButton("CxT");
		miPanel.add(bCxT);
		
		taInfo= new JTextArea();
		barra= new JScrollPane(taInfo);
		barra.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		
		miPanel.add(taInfo);
		miPanel.add(barra);
		
		super.setContentPane(miPanel);
		super.setDefaultCloseOperation(EXIT_ON_CLOSE);	
	}	
}
