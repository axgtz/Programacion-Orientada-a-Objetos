/*Proyecto Final Banco
Roberto Alejandro Gutierrez Guillén
A01019608
*/
#ifndef FIG
#define FIG

#include <iostream>
#include <string>
#include <vector>
#include <time.h>
#include <fstream>
#include <iostream>
#include <sstream>

using namespace std;

class Cuenta {
	protected:
		int numCta; //los recibe como parametro porq es generado de forma random en la clase banco
		double saldoT;

	public:
		Cuenta();
		Cuenta(int nCuenta, double saldo);

		int getNumCuenta();
		double getSaldoT();
		virtual string getNR();

		void reporteCuenta();
		double depDinero(int cantADep);
		double retDinero(int cantARet); 

		void imprimirDat();
};

#endif 