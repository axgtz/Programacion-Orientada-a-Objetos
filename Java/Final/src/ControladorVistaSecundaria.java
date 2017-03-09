/*Proyecto Final
 * @Roberto Alejandro
 * ControladorVistaSecundaria
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorVistaSecundaria extends VistaSecundariaAgregarYBorrar {
	private static final long serialVersionUID = 1L;
	Musica m;
	public ControladorVistaSecundaria(String titulo, Musica m) {
		super(titulo);
		this.m=m;
		agregarCBtn.addActionListener(new EscuchadorAggCan());
		borrarCBtn.addActionListener(new EscuchadorBorrCan());
		agregarABtn.addActionListener(new EscuchadorAggArt());
		borrarABtn.addActionListener(new EscuchadorBorrArt());
	}
	
	public class EscuchadorAggCan implements ActionListener{
		public void actionPerformed(ActionEvent ae){
			String 	nombreA,nombre,  album, genero, duracionS, bitRateS;
			int duracion, bitRate; 
			boolean res = false;
			
			nombreA = nombreAParaCTxt.getText();
			nombre = nombreCTxt.getText();
			album = albumTxt.getText(); 
			genero = generoTxt.getText();
			duracionS = duracionTxt.getText();
			bitRateS = bitRateTxt.getText();
			
			if(!nombreA.equals("") && !nombre.equals("") && !album.equals("") && !genero.equals("") && !duracionS.equals("") && !bitRateS.equals("")){
				bitRate = Integer.valueOf(bitRateS);
				duracion = Integer.valueOf(duracionS);
				res = m.agregaCancion(nombreA, nombre, album, duracion, genero, bitRate);
				if(res){
					infoArea.setText("Alta Exitosa");
				}else{
					infoArea.setText("Alta No Exitosa");
				}
			}
		}
	}
	
	public class EscuchadorBorrCan implements ActionListener{
		public void actionPerformed(ActionEvent ae){
			String 	nombreA,nombreC, info;
			
			nombreA = nombreAParaCTxt.getText();
			nombreC = nombreCTxt.getText();
			info = m.borrarCancion(nombreC, nombreA);
			
			if(info.equals(null)){
				infoArea.setText("Se borro la cancion " + info);
			}else{
				infoArea.setText("Borrado No Exitoso");
			}
		}
	}
	
	public class EscuchadorAggArt implements ActionListener{
		public void actionPerformed(ActionEvent ae){
			String 	nombreA;
			boolean res;
			
			nombreA = nombreATxt.getText();
			
			res = m.agregaArtista(nombreA);
			if(res){
				infoArea.setText("Alta Exitosa");
			}else{
				infoArea.setText("Alta No Exitosa");
			}
		}
	}
	
	public class EscuchadorBorrArt implements ActionListener{
		public void actionPerformed(ActionEvent ae){
			String 	nombreA, info;
			
			nombreA = nombreATxt.getText();
		
			info = m.borrarArtista(nombreA);
			if(info.equals("Artista no registrado"))
				info = null;
			if(info!=null){
				if(info =="Artista no registrado"){
					infoArea.setText("Artista no registrado");
				}else{
					infoArea.setText("Se borro el artista " + info);
				}
			}else{
				infoArea.setText("Borrado No Exitoso");
			}
		}
	}
}
