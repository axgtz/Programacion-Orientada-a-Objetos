import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;



public class ControladorHotel extends VentanaHotel {
	private Hotel miHotel;
	
	public class EscuchaAlta implements ActionListener{
		public void actionPerformed(ActionEvent arg0) {
			String nombre, sTipo, sDias;
			int tipo, dias;
			boolean resp;
			
			nombre=ctNombre.getText();
			
			sTipo=ctTipo.getText();
			tipo=Integer.valueOf(sTipo);
			
			sDias=ctDias.getText();
			dias=Integer.valueOf(sDias);
			
			
			resp=miHotel.alta(nombre, tipo, dias);
			if(resp==true)
				taInfo.setText("Feliz Estancia");
			else
				taInfo.setText("Alta no Exitosa");				
		}
	}
	
	public class EscuchaBaja implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			String nombre, info;
			
			nombre=ctNombre.getText();
			
			info=miHotel.baja(nombre);
			taInfo.setText("El huesped  "+info+ "ha dejado el hotel");			
		}
	}
	
	public class EscuchaInfo implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			String info;
			info=miHotel.toString();
			taInfo.setText(info);
		}
	}
	
	public class EscuchaCxTipo implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			String sTipo, sCuantos;
			int  tipo, cuantos;
			
			sTipo=ctTipo.getText();
			tipo=Integer.valueOf(sTipo);
			
			cuantos=miHotel.indicaCuantosPorTipo(tipo);
			sCuantos= new Integer(cuantos).toString();
			taInfo.setText(sCuantos);
		}
	}
	
	public class EscuchaMasDias implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			String nombre, sDias;
			int  dias;
			boolean resp;
			
			nombre=ctNombre.getText();
			
			sDias=ctDias.getText();
			dias=Integer.valueOf(sDias);
			
			resp=miHotel.prolongarEstancia(nombre, dias);
			taInfo.setText("Prolongacion exitosa   " +resp);
		}
	}
	
	
	public void lecturaInicial(){
		File unArchivo;
		Scanner lectura;
		String nombre;
		int tipo, dias;
		boolean resp;
		
		
		unArchivo= new File("Datos.txt");
		
		try {
			lectura= new Scanner(unArchivo);
			int n = lectura.nextInt();
			for(int i=1; i<=n;i++){
				nombre=lectura.next();
				tipo=lectura.nextInt();
				dias=lectura.nextInt();
				resp=miHotel.alta(nombre, tipo, dias);
			}
			
			System.out.println(miHotel.toString());
			
			lectura.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
		
	

	public ControladorHotel() {
		super();
		
		miHotel= new Hotel("Camino Real", "Pedregal");
		lecturaInicial();
		
		bAlta.addActionListener(new EscuchaAlta());
		bBaja.addActionListener(new EscuchaBaja());
		bInfo.addActionListener(new EscuchaInfo());
		bCxT.addActionListener(new EscuchaCxTipo());
		bMasDias.addActionListener(new EscuchaMasDias());
		
	}

}

