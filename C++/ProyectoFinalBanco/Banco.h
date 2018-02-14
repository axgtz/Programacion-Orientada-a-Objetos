/*Proyecto Final Banco 
Roberto Alejandro Gutierrez Guill�n
A01019608
*/
#include "Cuenta.h"


class Banco {
	private:
		vector<Cuenta*> c;
		string nombre;
		string direccion;
		int numC;

		//Al final ver si solo el constructor e inicio son p�blicos 
	public:
		Banco(string nom, string direc);
		void inicio();

		//void altaCuenta(int tipo);
		void reportDep();
		void reportRet();
		void reportCuentas();

};