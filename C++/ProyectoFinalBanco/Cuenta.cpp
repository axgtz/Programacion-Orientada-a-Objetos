/*Proyecto Final Banco
Roberto Alejandro Gutierrez Guillén
A01019608
*/

#include "Cuenta.h"

Cuenta::Cuenta() {
	numCta = 0;
	saldoT = 0;
}

Cuenta::Cuenta(int nCuenta,  double saldo) {
	numCta = nCuenta;
	saldoT = saldo;
}


int Cuenta::getNumCuenta(){
	return numCta;
}

double Cuenta::getSaldoT(){
	return saldoT;
}

string Cuenta::getNR() {
	return "";
}

double Cuenta::depDinero(int cantADep){//Regresa el dinero total si se pudo, o un -1 si no se pudo
	saldoT += cantADep;
	return saldoT;
}

double Cuenta::retDinero(int cantARet){ //Regresa el dinero retiradp, o el total de dinero si no se pudo
	double transaccion = -1;
	if (cantARet <= saldoT) {
		saldoT -= cantARet;
		transaccion = saldoT;
	}
	return transaccion;
}

void Cuenta::reporteCuenta() {
	ofstream archivo_salida;
	string nombre = to_string(numCta) + ".txt";
	archivo_salida.open(nombre);

	archivo_salida << "Cuenta: " << numCta << endl;
	archivo_salida << "Saldo: " << saldoT << endl;

	archivo_salida.close();
}


void Cuenta::imprimirDat(){
	cout << "Numero de Cuenta: " << numCta <<endl;
	cout << "Saldo: " << saldoT << endl;
}

