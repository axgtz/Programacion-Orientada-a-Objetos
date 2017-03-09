/*Proyecto Final
 * @Roberto Alejandro
 * MusicaControlador Principal
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MusicaControlador extends MusicaVista {
	private static final long serialVersionUID = 1L;

	private Musica m;
	public MusicaControlador(String titulo, Musica m) {
		super(titulo);
		this.m=m;
		lecInicial();
		buscArtField.addActionListener(new EscuchadorBuscArt());
		buscCanField.addActionListener(new EscuchadorBuscCan());
		btn.addActionListener(new EscuchadorBtn());
		refreshBtn.addActionListener(new EscuchadorRefreshBtn());
	}
	
	public class EscuchadorBuscArt implements ActionListener{
		public void actionPerformed(ActionEvent ae){
			String lineaArt;
		 	
			lineaArt = buscArtField.getText();
			
			if(!lineaArt.equals("")){
					artResBuscArea.setText(m.getArtista(lineaArt));
			}else{
				artResBuscArea.setText("Escriba el nombre del artista que desea buscar");
			}
		}
	}
	
	public class EscuchadorBuscCan implements ActionListener{
		public void actionPerformed(ActionEvent ae){
			String lineaArt, lineaCan;
		 	Artista a;
			lineaArt = buscArtField.getText();
			
			if(!lineaArt.equals("")){
				a = m.getArtistaClase(lineaArt);
				lineaCan = buscCanField.getText();
				if(!lineaCan.equals("")){
					canResBuscArea.setText(a.getCancionToString(lineaCan));
				}else{
					canResBuscArea.setText("Escriba el nombre de la cancion que desea buscar");
				}
			}else{
				artResBuscArea.setText("Escriba el nombre del artista que desea buscar");
			}
		}
	}
	
	
	public class EscuchadorBtn implements ActionListener{
		public void actionPerformed(ActionEvent ae){
			ControladorVistaSecundaria c = new ControladorVistaSecundaria("iTunas Agregar y Borrar", m);	
		}
	}
	
	public class EscuchadorRefreshBtn implements ActionListener{
		public void actionPerformed(ActionEvent ae){
			musicaInfoArea.setText(m.toString());		
		}
	}
	
	public void lecInicial(){
		File arch = new File("Musica.txt");
		Scanner lec;
		int n,duracion, bitRate;
		String nombreA, nombreC, album, genero;
		try{
			lec = new Scanner(arch);
			n = lec.nextInt();
			for(int i = 0;i<n;i++){
				nombreA = lec.next();
				m.agregaArtista(nombreA);
				nombreC = lec.next();
				album = lec.next();
				duracion = lec.nextInt();
				genero = lec.next();
				bitRate = lec.nextInt();
				m.agregaCancion(nombreA, nombreC, album, duracion, genero, bitRate);
				}		
			musicaInfoArea.setText(m.toString());	
			lec.close();
			}catch(FileNotFoundException fnfe){
			fnfe.printStackTrace();
			System.out.println("ERROR:"+ fnfe);
		}
	}
	
	public static void main(String[] args){
		Musica m = new Musica("Alejandro");
		MusicaControlador mC = new MusicaControlador("iTunas", m);
	}
}
