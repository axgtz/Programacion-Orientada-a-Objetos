/*
@Roberto Alejandro Gutierrez Guillen
A01019608
Tarea 1
21/01/2016
*/
 
#include "Contacto.h"

int main(){
	Contacto c[10];
	int i = 0;
	char op = 'h';
	string e;

	while(op != 'd' && op != 'D'){
		cout << " A.Ingresar un contacto nuevo.\n B.Ver un contacto por numero.\n C.Ver la lista de todos los contactos. \n D.Salir." << endl;
			
		cin >> op;
	
		switch(op){
			case'A':case'a':{
				if(i<=9){
					cout << "Eligio nuevo contacto" << endl;

					cout << "\t Escriba el nombre: " << endl;
					cin >> e;
					c[i].setNombre(e);

					cout << "\t Escriba el telefono: " << endl;
					cin >> e;
					c[i].setTelefono(e);

					cout << "\t Escriba el email" << endl;
					cin >> e;
					c[i].setEmail(e);

					cout << "\t Escriba la direccion" << endl;
					cin >> e;
					c[i].setDireccion(e);
					i++;
				}
				else {
					cout << "Se llego al numero maximo de contactos 10" << endl;
				}
			break;
			}

			case'B':case'b': {
				cout << "Eligio buscar contacto por numero en array" << endl;
				cout << "Porfavor escriba el numero del contacto en el array" << endl;
				int opB;
				cin >> opB;
				cout << c[opB-1].verContacto() << endl;
			break;
			}

			case'C':case'c': {
				cout << "Eligio ver lista de los contactos" << endl;
				for (int j = 0; j <= 9; j++){
					cout << "Contacto " << j << c[j].verContacto() << endl;
				}

			break;
			}

			case'D':case'd': {
				exit;
			break;
			}
		}
	}
}