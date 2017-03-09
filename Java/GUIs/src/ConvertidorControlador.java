import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//@Roberto Alejandro Gutierrez Guillen
public class ConvertidorControlador extends ConvertidorVista{
	//El controlador hereda de la vista 
	
	public ConvertidorControlador(String titulo) {
		super(titulo);
		//Escuchar cualquier actividad dentro del cuadro de texto
		kmsTxt.addActionListener(new EscuchadorKms());
		millasTxt.addActionListener(new EscuchadorMillas());
	}
	
	//Declarar las clases "Escuchadorkms" y "EscuchadorMillas", las clases son privadas
	public class EscuchadorKms implements ActionListener{
		public void actionPerformed(ActionEvent ae){ 
			//Leer lo que el usuario escribe
			String kmsString, millasString ;
			double kmsNum, millasNum;
			
			kmsString = kmsTxt.getText();
			if(kmsString.equals(null)){
				kmsNum = Double.parseDouble(kmsString); //Convertir String a num
				millasNum = kmsNum * 1.60934; 
				millasString = "" + millasNum;
				millasTxt.setText(millasString);
			}else{
				millasTxt.setText("ERROR");
			}
		}
	}
	
	public class EscuchadorMillas implements ActionListener{
		public void actionPerformed(ActionEvent ae){
			String kmsString, millasString ;
			double kmsNum, millasNum;
			
			millasString = millasTxt.getText();
			if(millasString.equals(null)){
				millasNum = Double.parseDouble(millasString); 
				kmsNum = millasNum * 0.621371; 
				kmsString = "" + kmsNum;
				kmsTxt.setText(kmsString);
			}else{
				kmsTxt.setText("ERROR");
			}
		}
	}
	
	public static void main(String[] args){
		ConvertidorControlador test = new ConvertidorControlador("El convertidor");
		
	}

}
