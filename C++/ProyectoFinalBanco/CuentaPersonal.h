/*Proyecto Final Banco
Roberto Alejandro Gutierrez Guill�n
A01019608
*/
#include "Cuenta.h"

class CuentaPersonal : public Cuenta {
private:

	string nTitular;
	int tCuenta;//Cl�sica, oro, platino titanio)
public:
	CuentaPersonal();
	CuentaPersonal(string nomTitular,int nCta ,int tipCuenta, double saldo);
	
	string getNR();

	void reporteCuenta();
	void imprimir();
};
