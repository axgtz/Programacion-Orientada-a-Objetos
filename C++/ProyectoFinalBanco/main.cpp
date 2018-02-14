#include "Banco.h"
#include "CuentaPersonal.h"
#include "CuentaEmpresarial.h"
void main() {
	/*
	Banco b("BancoMex", "Blvd. Adolfo #21 C.P. 12020");
	b.inicio();
*/
	
	fstream txt_lec;
	int i = 0;
	txt_lec.open("Cuentas.txt", std::fstream::in | std::fstream::out);

	if (txt_lec.fail()) {
		cout << "No se encontro archivo previo, creando uno nuevo" << endl;

		//Si no encuentra el txt de cuentas crea uno nuevo
		ofstream archivo_salida;
		archivo_salida.open("Cuentas.txt");
		archivo_salida.close();
	}
	else {
		char linea[128];
		while (!txt_lec.eof()) {
			txt_lec.getline(linea, sizeof(linea));
			cout << i << endl;
			i++;

			string str(linea);

			istringstream iss(str); 

			string sub, numCuenta, nombre, Rfc;
			int tipo;
			double saldoCuenta;
			int EOP = 0;

			iss >> sub;
			cout << sub << endl;

			if (sub == "Cuenta:") {
				iss >> sub;
				cout << sub << endl;
				numCuenta = sub;
			}

			if (sub == "Saldo:") {
				iss >> sub;
				cout << sub << endl;
				saldoCuenta = stod (sub);
			}

			if (sub == "Nombre:") {
				iss >> sub;
				cout << sub << endl;
				nombre = sub;
				EOP = 1;
			}

			if (sub == "RFC:") {
				iss >> sub;
				cout << sub << endl;
				Rfc = sub;
				EOP = 2;
			}

			if (sub == "Tipo:") {
				iss >> sub;
				cout << sub << endl;
				tipo = stod(sub);
			}


			/*
			do {
				string sub;
				iss >> sub;
				cout << "Pedazo " << sub << endl;
			} while (iss);   
			*/
			//cout << numCuenta << saldoCuenta << endl;
		}
		txt_lec.close();
	}

	int yolo;
	cin >> yolo;
}