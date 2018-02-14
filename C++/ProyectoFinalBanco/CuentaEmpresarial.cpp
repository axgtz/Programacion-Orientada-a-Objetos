/*Proyecto Final Banco
Roberto Alejandro Gutierrez Guillén
A01019608
*/
#include "CuentaEmpresarial.h"

CuentaEmpresarial::CuentaEmpresarial() {
	numCta = 0;
	saldoT = 0;
}

CuentaEmpresarial::CuentaEmpresarial(string RFC, int tCuenta, int nCta, double saldo) {
	rfc = RFC;
	tipCuenta = tCuenta;
	saldoT = saldo;
	numCta = nCta;
}

string CuentaEmpresarial::getNR() {
	return rfc;
}
	
void CuentaEmpresarial::reporteCuenta() {
	//Crear archivo único de cuenta
	Cuenta::reporteCuenta();

	ofstream archivo_salida;
	string nombre = to_string(numCta) + ".txt";
	archivo_salida.open(nombre, ios_base::app);

	archivo_salida << "RFC: " << rfc << endl;
	archivo_salida << "Tipo: " << tipCuenta << endl;

	archivo_salida.close();


	//Agregar Cuenta a archivo de cuentas
	archivo_salida.open("Cuentas.txt", ios_base::app);

	archivo_salida << "Cuenta: " << numCta << endl;
	archivo_salida << "Saldo: " << saldoT << endl;
	archivo_salida << "RFC: " << rfc << endl;
	archivo_salida << "Tipo: " << tipCuenta << endl;
	archivo_salida << endl;

	archivo_salida.close();
}


void CuentaEmpresarial::imprimir() {
	Cuenta::imprimirDat();
	cout << "RFC: " << rfc << endl;
	cout << "Tipo: " << tipCuenta << endl;
}

