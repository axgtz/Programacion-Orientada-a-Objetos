/*Proyecto Final
 * @Roberto Alejandro Gutierrez Guillén
 * Vista Secundaria 
 */
import java.awt.*;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.Border;

public class VistaSecundariaAgregarYBorrar extends JFrame{
	private static final long serialVersionUID = 1L;
	
	private JLabel nombreATituloLabel, cancionTituloLabel, artistaLabel, nombreACanLabel,nombreCLabel, albumLabel, duracionLabel, generoLabel, bitRateLabel;
	private JLabel agCBtnLabel1,agCBtnLabel2,borrCBtnLabel1,borrCBtnLabel2, agABtnLabel1, agABtnLabel2, borrABtnLabel1,borrABtnLabel2;
	protected JTextField nombreATxt, nombreAParaCTxt, nombreCTxt, albumTxt, duracionTxt, generoTxt, bitRateTxt;
	protected JButton agregarCBtn, agregarABtn, borrarCBtn, borrarABtn;
	protected JTextArea infoArea;
	private JScrollPane scroll;

	public VistaSecundariaAgregarYBorrar(String titulo) {
		super(titulo); //Aqui va el titulo, el cual es también parametro
		
		//Panel secundario 1 Label artista
		nombreATituloLabel = new JLabel("^Agregar y Borrar Artista^");
		
		//Panel secundario artista
		artistaLabel = new JLabel("Nombre del Artista: ");
		nombreATxt = new JTextField(20);
		
		agregarABtn = new JButton();
			agregarABtn.setLayout(new BorderLayout());
			agABtnLabel1 = new JLabel("Agregar",SwingConstants.CENTER);
			agABtnLabel2 = new JLabel("Artista",SwingConstants.CENTER);
			agregarABtn.add(BorderLayout.NORTH,agABtnLabel1);
			agregarABtn.add(BorderLayout.SOUTH,agABtnLabel2);
		borrarABtn = new JButton();
			borrarABtn.setLayout(new BorderLayout());
			borrABtnLabel1 = new JLabel("Borrar",SwingConstants.CENTER);
			borrABtnLabel2 = new JLabel("Artista",SwingConstants.CENTER);
			borrarABtn.add(BorderLayout.NORTH,borrABtnLabel1);
			borrarABtn.add(BorderLayout.SOUTH,borrABtnLabel2);
			
		infoArea = new JTextArea();
		scroll= new JScrollPane(infoArea);
		scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		
		//Panel secundario Label cancion
		cancionTituloLabel = new JLabel("^Agregar y Borrar Cancion^",SwingConstants.CENTER);
		
		//Panel secundario Cancion
		nombreACanLabel = new JLabel("Nombre del Artista: ");
		nombreCLabel = new JLabel("Nombre de la Cancion: ");
		albumLabel = new JLabel("Nombre del Album: ");
		duracionLabel= new JLabel("Duracion de la Cancion(int): ");
		generoLabel= new JLabel("Genero de la Cancion: ");
		bitRateLabel= new JLabel("Bitrate de la Cancion(int): ");
		nombreAParaCTxt = new JTextField(20);
		nombreCTxt  = new JTextField(20);
		albumTxt  = new JTextField(20);
		duracionTxt  = new JTextField(4);
		generoTxt = new JTextField(20);
		bitRateTxt  = new JTextField(10);
		
		agregarCBtn  = new JButton();
			agregarCBtn.setLayout(new BorderLayout());
			agCBtnLabel1 = new JLabel("Agregar",SwingConstants.CENTER);
			agCBtnLabel2 = new JLabel("Cancion",SwingConstants.CENTER);
			agregarCBtn.add(BorderLayout.NORTH,agCBtnLabel1);
			agregarCBtn.add(BorderLayout.SOUTH,agCBtnLabel2);
		borrarCBtn = new JButton();
			borrarCBtn.setLayout(new BorderLayout());
			borrCBtnLabel1 = new JLabel("Borrar",SwingConstants.CENTER);
			borrCBtnLabel2 = new JLabel("Cancion",SwingConstants.CENTER);
			borrarCBtn.add(BorderLayout.NORTH,borrCBtnLabel1);
			borrarCBtn.add(BorderLayout.SOUTH,borrCBtnLabel2);
		
		
		//Panel Principal
		JPanel p = new JPanel(); //Panel principal
		p.setLayout(new BorderLayout(3,1));
		Border gap = BorderFactory.createEmptyBorder(5, 5, 5, 5);
		p.setBorder(gap); //Marco para cada cosa adentro del panel
		
		//Panel Artista
		JPanel pArtista = new JPanel();
		pArtista.setLayout(new GridLayout(3,2));
		pArtista.add(artistaLabel);
		pArtista.add(nombreATxt);
		pArtista.add(agregarABtn);
		pArtista.add(borrarABtn);	
		pArtista.add(nombreATituloLabel);
		pArtista.add(scroll);	
		
		//Panel de Cancion		
		JPanel pCancion = new JPanel();
		pCancion.setLayout(new GridLayout(7,2,5,5));
		pCancion.add(nombreACanLabel);
		pCancion.add(nombreAParaCTxt);
		pCancion.add(nombreCLabel);
		pCancion.add(nombreCTxt);
		pCancion.add(albumLabel);
		pCancion.add(albumTxt);
		pCancion.add(duracionLabel);
		pCancion.add(duracionTxt);
		pCancion.add(generoLabel);
		pCancion.add(generoTxt);
		pCancion.add(bitRateLabel);
		pCancion.add(bitRateTxt);
		pCancion.add(agregarCBtn);
		pCancion.add(borrarCBtn);
		
		//Panel Label cancion
		JPanel pCancionLabel = new JPanel();
		pCancionLabel.setLayout(new BorderLayout(1,1));
		pCancionLabel.add(BorderLayout.CENTER,cancionTituloLabel);
		
		//Agregar los paneles secundarios dentro del principal
		p.add(BorderLayout.NORTH,pArtista);
		p.add(BorderLayout.CENTER, pCancion);
		p.add(BorderLayout.SOUTH, pCancionLabel);
		
		this.add(p);
		p.setBackground(new Color(209,224,229));
		pCancion.setBackground(new Color(173,216,230));
		pCancionLabel.setBackground(new Color(173,216,230));
		pArtista.setBackground(new Color(112,138,144));
		
		try {
			Image i = ImageIO.read(getClass().getResource("itunas.png"));
			setIconImage(i);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		this.setVisible(true);	
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setBounds(20, 20, 400, 600);
	}
}
