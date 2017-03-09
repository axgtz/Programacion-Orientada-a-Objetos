/*Proyecto Final
 * @Roberto Alejandro Gutierrez Guillén 
 * Muscia Vista Principal
 */
import java.awt.*;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.Border;

public class MusicaVista extends JFrame{
	private static final long serialVersionUID = 1L;
	
	protected JLabel musicaLabel, buscArtLabel, buscCanLabel,label1Btn1,label2Btn1 ;
	protected JTextArea musicaInfoArea,artResBuscArea,canResBuscArea;
	protected JTextField buscArtField, buscCanField;
	protected JButton btn, refreshBtn;
	protected JScrollPane scroll;

	public MusicaVista(String titulo) {
		super(titulo); //Aqui va el titulo, el cual es también parametro

		
		this.setVisible(true);	
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setBounds(100, 100, 800, 600);
	}
	public static void main(String[] args){
		MusicaVista MV = new MusicaVista("sdf"); 
	}
}
