/*Proyecto Final Banco 
Roberto Alejandro Gutierrez Guillén
A01019608
*/
#include "Cuenta.h"


class Banco {
	private:
		vector<Cuenta*> c;
		string nombre;
		string direccion;
		int numC;

		//Al final ver si solo el constructor e inicio son públicos 
	public:
		Banco(string nom, string direc);
		void inicio();

		//void altaCuenta(int tipo);
		void reportDep();
		void reportRet();
		void reportCuentas();

};