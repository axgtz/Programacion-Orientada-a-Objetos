/*Proyecto Final Banco
Roberto Alejandro Gutierrez Guillén
A01019608
*/
#include "Banco.h"
#include "CuentaPersonal.h"
#include "CuentaEmpresarial.h"

Banco::Banco(string nom, string direc) {
	direccion = direc;
	vector<Cuenta*> c;
	nombre = nom;
	numC = 0;
}

void Banco::inicio() {
	//-----Recuperacion y lectura de archivos usando concatenación
	
	//Cuentas
	fstream txt_lec;

	txt_lec.open("Cuentas.txt", std::fstream::in | std::fstream::out);

	if (txt_lec.fail()) {
		cout << "No se encontro archivo previo, creando uno nuevo" << endl;

		//Si no encuentra el txt de cuentas crea uno nuevo
		ofstream archivo_salida;
		archivo_salida.open("Cuentas.txt");
		archivo_salida.close();
	}else {
		char linea[128];
		while (!txt_lec.eof()) {
			txt_lec.getline(linea, sizeof(linea));
		}
		txt_lec.close();
	}
	//Retiros


	//Depostios


	//Transferencias
	

	//------Inicio del programa despues de lectura de archivos, y recuperacion de cuentas
	int opM = 1;
	cout << "\n---- Bienvenido al sistema del banco " << nombre << " ----" << endl;
	while (opM != 4) {
		cout << "\n<------------------------------------------>" << endl;
		cout << "\nPorfavor selecciona una opcion" << endl;
		cout << "\t1) Crear cuenta nueva" << endl;
		cout << "\t2) Realizar una transaccion." << endl;
		cout << "\t3) Ver reportes" << endl;
		cout << "\t4) Salir" << endl;
		cin >> opM;

		int op;
		switch (opM) {
		case 1:
			cout << "\n\tCreacion de Cuenta" << endl;
			cout << "\tFavor de seleccionar tipo de cuenta" << endl;
			cout << "\t1) Cuenta Personal" << endl;
			cout << "\t2) Cuenta Empresarial" << endl;
			cout << "\t3) Atras" << endl;
			cin >> op;
			if (op == 1) {
				cout << "\t1) Cuenta Personal" << endl;
				string nomTitular;
				int tipCuenta, saldo, numCta;
				cout << "Porfavor escriba el nombre del titular" << endl;
				cin.ignore();
				getline(cin, nomTitular);
				cout << "Porfavor escriba el tipo de cuenta(1- Clasica  2- Oro  3- Platino  4-Titanio)" << endl;
				cin >> tipCuenta;
				cout << "Porfavor escriba el saldo de la cuenta " << endl;
				cin >> saldo;

				//Crear numero de cuenta aleatorio y checar que no haya repetidos
				srand(time(NULL));
				numCta = rand() % 1000 + 1;

				bool check = false;
				do {
					int i = 0;
					for (; i < c.size(); i++) {
						if (numCta == c.at(i)->getNumCuenta()) {
							break;
						}
					}

					if (i == c.size()) {
						check = true;
					}
					else {
						numCta = rand() % 1000 + 1;
					}
				} while (!check);

				CuentaPersonal* cp = new CuentaPersonal(nomTitular, numCta,tipCuenta, saldo);
				c.push_back(cp);
				numC++;
				
				cout << "\nCreacion exitosa" << endl;
				cp->imprimir();
				cp->reporteCuenta();

			}else if (op == 2) {
				cout << "\t1) Cuenta Empresarial" << endl;
				string rfc, a;
				int tipCuenta, saldo, numCta;
				cout << "Porfavor escriba el RFC de la empresa" << endl;
				cin.ignore();
				getline(cin, rfc);
				cout << "Porfavor escriba el tipo de cuenta(1- PyME 2-Empresa Mediana 3-Empresa Grande)" << endl;
				cin >> tipCuenta;
				cout << "Porfavor escriba el saldo de la cuenta " << endl;
				cin >> saldo;

				//Crear numero de cuenta aleatorio y checar que no haya repetidos
				srand(time(NULL));
				numCta = rand() % 1000 + 1;

				bool check = false;
				do {
					int i = 0;
					for (; i < c.size(); i++) {
						if (numCta == c.at(i)->getNumCuenta()) {
							break;
						}
					}

					if (i == c.size()) {
						check = true;
					}
					else {
						numCta = rand() % 1000 + 1;
					}
				} while (!check);


				CuentaEmpresarial* ce = new CuentaEmpresarial(rfc, tipCuenta, numCta, saldo);
				c.push_back(ce);
				numC++;

				cout << "\nCreacion exitosa" << endl;
				ce->imprimir();
				ce->reporteCuenta();
			}else {
				if (op==3) {
					break;
				}
				cout << "Favor de seleccionar una opcion valida" << endl;
			}
		break;

		case 2:
			cout << "\nTransacciones" << endl;
			cout << "\t1) Depositar a cuenta" << endl;
			cout << "\t2) Retirar de una cuenta" << endl;
			cout << "\t3) Transferir de una cuenta a otra" << endl;
			cout << "\t4) Atras" << endl;
			cin >> op;

			if (op == 1) {
				cout << "\t1) Depositar a cuenta" << endl;
				int nC, cantDep;
				cout << "\n\t Escribir el numero de la cuenta " << endl;
				cin >> nC;
				cout << "\n\t Escribir la cantidad a depositar" << endl;
				cin >> cantDep;

				/////////////////---Falta cambiar el archivo

				//Buscar la cuenta en el vector
				int i = 0;
				for (; i<c.size(); i++) {
					if (c.at(i)->getNumCuenta() == nC) {
						int retD = c.at(i)->depDinero(cantDep);
						cout << "\n\tNuevo Saldo: " << retD << endl;
						cout << "\tCantidad Depositada: " << cantDep << endl;
						//Escribir archivo 
						ofstream archivo_salida;
						archivo_salida.open("Depositos.txt", ios::app);

						archivo_salida << "\nCuenta: " << nC << endl;
						archivo_salida << "Cantidad: " << cantDep << endl;
						archivo_salida << "Nombre o RFC: " << c.at(i)->getNR() << endl;

						archivo_salida.close();

						break;
					}
				}
				if (i > c.size()) {
					cout << "\n No se encontro la cuenta " << nC << endl;
				}

			}else if (op == 2) {
				cout << "\t2) Retirar de una cuenta" << endl;
				int nC, cantRet;
				cout << "\n\t Escribir el numero de la cuenta " << endl;
				cin >> nC;
				cout << "\n\t Escribir la cantidad a retirar" << endl;
				cin >> cantRet;
				////////////////---Falta cambiar el archivo

				//Buscar la cuenta en el vector
				int i = 0;
				for (;i<c.size();i++) {
					if (c.at(i)->getNumCuenta() == nC) {
						int retD = c.at(i)->retDinero(cantRet);
						if (retD==-1) {
							cout << "\n\t----->>Fondos Insuficientes<<------" << endl;
						}else {
							cout << "\n\tSaldo Actual: " << retD << endl;
							cout << "\tCantidad Retirada: "<< cantRet << endl;

							//Escribir archivo 
							ofstream archivo_salida;
							archivo_salida.open("Retiros.txt", ios::app);

							archivo_salida << "\nCuenta: " << nC << endl;
							archivo_salida << "Cantidad: " << cantRet << endl;
							archivo_salida << "\nNombre o RFC: " << c.at(i)->getNR() << endl;

							archivo_salida.close();
						}

						break;
					}
				}
				if (i > c.size()) {
					cout << "\n No se encontro la cuenta " << nC << endl;
				}
			}
			else if (op==3) {
				cout << "\t3) Transferir de una cuenta a otra" << endl;
				int nCRet, nCDep, cantTrans;
				cout << "\n\t Escribir el numero de la cuenta a retirar para la transferencia" << endl;
				cin >> nCRet;
				cout << "\n\t Escribir la cantidad a tranferir" << endl;
				cin >> cantTrans;
				cout << "\n\t Escribir el numero de la cuenta a depositar para la transferencia" << endl;
				cin >> nCDep;

				 ///////////////////////////////////////


			}else {
				if (op == 4) {
					break;
				}
				cout << "Favor de seleccionar una opcion valida" << endl;
			}

		break;

		case 3: {
			cout << "\nReportes" << endl;
			cout << "\t1) Lista de una cuenta" << endl;
			cout << "\t2) Lista de Retiros" << endl;
			cout << "\t3) Lista de Depositos" << endl;
			cout << "\t4) Lista de Cuentas" << endl;
			cout << "\t5) Lista de Transacciones entre Cuentas" << endl;
			cout << "\t6) Atras" << endl;
			cin >> op;

			ifstream lec;
			char linea[128];

			switch (op) {
			case 1: {
				string numeroC;
				cout << "\t1) Lista de una cuenta" << endl;
				cout << "\tEscriba el numero de la cuenta" << endl;
				cin >> numeroC;
				numeroC += ".txt";

				lec.open(numeroC);

				if (lec.fail()) {
					cout << "No existe la cuenta" << endl;
				}
				else {
					while (!lec.eof()) {
						lec.getline(linea, sizeof(linea));
						cout << linea << endl;

					}
					lec.close();
				}
			}
			break;

			case 2:
				cout << "\t2) Lista de Retiros" << endl;

				lec.open("Retiros.txt");

				if (lec.fail()) {
					cout << "Error al abrir el archivo \n" << endl;
				}
				else {
					while (!lec.eof()) {
						lec.getline(linea, sizeof(linea));
						cout << linea << endl;
					}
					lec.close();
				}
			break;

			case 3:
				cout << "\t3) Lista de Depositos" << endl;

				lec.open("Depositos.txt");

				if (lec.fail()) {
					cout << "Error al abrir el archivo \n" << endl;
				}
				else {
					while (!lec.eof()) {
						lec.getline(linea, sizeof(linea));
						cout << linea << endl;
					}
					lec.close();
				}
			break;

			case 4:{
				cout << "\t4) Lista de Cuentas"<< "\n" << endl;

				lec.open("Cuentas.txt");

				if (lec.fail()) {
					cout << "Error al abrir el archivo \n" << endl;
				}
				else {
					while (!lec.eof()) {
						lec.getline(linea, sizeof(linea));
						cout << linea << endl;
					}
					lec.close();
				}
			}
			break;

			case 5: {
				cout << "\t5) Lista de Transacciones entre Cuentas" << endl;

			}

			break;

			case 6:

			break;

			default:
				cout << "\nFavor de seleccionar una opcion valida" << endl;
			}

		}
		break;

		case 4:
			exit(4);
		break;

		default:
			cout << "\nFavor de seleccionar una opcion valida" << endl;
		}
	}
}

void Banco::reportDep(){

}
void Banco::reportRet(){

}
void Banco::reportCuentas(){

}
