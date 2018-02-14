/*Proyecto Final Banco
Roberto Alejandro Gutierrez Guillén
A01019608
*/
#include "Cuenta.h"

class CuentaPersonal : public Cuenta {
private:

	string nTitular;
	int tCuenta;//Clásica, oro, platino titanio)
public:
	CuentaPersonal();
	CuentaPersonal(string nomTitular,int nCta ,int tipCuenta, double saldo);
	
	string getNR();

	void reporteCuenta();
	void imprimir();
};
