/*Proyecto Final Banco
Roberto Alejandro Gutierrez Guillén
A01019608

	string nTitular;
	int tCuenta;//Clásica, oro, platino titanio)
	*/
#include "CuentaPersonal.h"

CuentaPersonal::CuentaPersonal(){
	numCta = 0;
	saldoT = 0;
}

CuentaPersonal::CuentaPersonal(string nomTitular,int nCta, int tipCuenta, double saldo) {
	nTitular = nomTitular;
	tCuenta = tipCuenta;
	saldoT = saldo;
	numCta = nCta;
}

string CuentaPersonal::getNR(){
	return nTitular;
}

void CuentaPersonal::reporteCuenta() {
	//Crear archivo único de cuenta
	Cuenta::reporteCuenta();
	ofstream archivo_salida;
	string nombre = to_string(numCta) + ".txt";
	archivo_salida.open(nombre, ios_base::app);

	archivo_salida << "Nombre: " << nTitular << endl;
	archivo_salida << "Tipo: " << tCuenta << endl;

	archivo_salida.close();

	//Agregar Cuenta a archivo de cuentas
	archivo_salida.open("Cuentas.txt", ios_base::app);

	archivo_salida << "Cuenta: " << numCta << endl;
	archivo_salida << "Saldo: " << saldoT << endl;
	archivo_salida << "Nombre: " << nTitular << endl;
	archivo_salida << "Tipo: " << tCuenta << endl;
	archivo_salida << endl;

	archivo_salida.close();
}

void CuentaPersonal::imprimir() {
	Cuenta::imprimirDat();
	cout << "Nombre: " << nTitular << endl;
	cout << "Tipo: " << tCuenta << endl;
}