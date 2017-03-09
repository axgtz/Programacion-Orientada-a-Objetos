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
	private JScrollPane scroll;

	public MusicaVista(String titulo) {
		super(titulo); //Aqui va el titulo, el cual es también parametro

		//Panel secundario 1
		musicaInfoArea = new JTextArea();
		scroll= new JScrollPane(musicaInfoArea);
			scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
			scroll.setBackground(new Color(27,163,156));
			scroll.setForeground(new Color(27,163,156));
			
		musicaInfoArea.setEditable(false);
			//Panel Terciario 1
			musicaLabel = new JLabel("Mi Musica",SwingConstants.CENTER);
			musicaLabel.setForeground(new Color(30, 130, 80));
			refreshBtn = new JButton("Refresh");
		
			//Panel secundario 2
			//Boton de dos lineas
			btn = new JButton();
				btn.setLayout(new BorderLayout());
				label1Btn1 = new JLabel("Agregar o Borrar",SwingConstants.CENTER);
				label2Btn1 = new JLabel("Cancion o Artista",SwingConstants.CENTER);
				btn.add(BorderLayout.NORTH,label1Btn1);
			btn.add(BorderLayout.SOUTH,label2Btn1);
		
		//Panel secundario 3
		buscArtLabel = new JLabel("Buscar Artista: ");
		buscCanLabel = new JLabel("Buscar Cancion: ");
		buscArtField = new JTextField(20);
		buscCanField = new JTextField(20);
		artResBuscArea = new JTextArea();
		canResBuscArea = new JTextArea();
		
		JPanel p = new JPanel(); //Panel principal
		p.setLayout(new BorderLayout(3,1));
		Border gap = BorderFactory.createEmptyBorder(5, 5, 5, 5);
		p.setBorder(gap); //Marco para cada cosa adentro del panel
		
		//Panel de arriba
		JPanel p1 = new JPanel();
		
		//Panel terciario
		p1.setLayout(new BorderLayout(3,1));
			JPanel p12 = new JPanel();
			p12.setLayout(new GridLayout(2,1));
			p12.add(musicaLabel);
			p12.add(refreshBtn);
			
		p1.add(BorderLayout.NORTH, p12);
		p1.add(BorderLayout.CENTER, musicaInfoArea);
		p1.add(BorderLayout.EAST, scroll);
		
		//Panel medio
		JPanel p2 = new JPanel();
		p2.setLayout(new BorderLayout(1,1));
		p2.add(BorderLayout.CENTER, btn);
		
		//Panel de abajo
		JPanel p3 = new JPanel();
		p3.setLayout(new GridLayout(2,3,5,5));
		p3.add(buscArtLabel);
		p3.add(buscArtField);
		p3.add(artResBuscArea);
		p3.add(buscCanLabel);
		p3.add(buscCanField);
		p3.add(canResBuscArea);
		
		//Agregar los paneles secundarios dentro del principal
		p.add(BorderLayout.CENTER,p1);
		p.add(BorderLayout.NORTH,p2);
		p.add(BorderLayout.SOUTH,p3);
		
		//Agregar el panel principal al panel y cambiar color del fondo
		this.add(p);
		p.setForeground(new Color(34,226,213));
		p1.setForeground(new Color(34,226,213));
		p.setBackground(new Color(27,163,156));
		p1.setBackground(new Color(46,204,113));
		p2.setBackground(new Color(46,204,113));
		p3.setBackground(new Color(46,204,113));
		
		//Poner el icono
		try {
			Image i = ImageIO.read(getClass().getResource("itunas.png"));
			setIconImage(i);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		this.setVisible(true);	
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setBounds(100, 100, 800, 600);
	}
}
