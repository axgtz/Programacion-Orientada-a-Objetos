/*Proyecto Final Banco
Roberto Alejandro Gutierrez Guillén
A01019608
*/
#include "Cuenta.h"

class CuentaEmpresarial : public Cuenta {
private:
	string rfc;
	int tipCuenta;//pyme o empresa
public:
	CuentaEmpresarial();
	CuentaEmpresarial(string rfc, int tCuenta, int nCta, double saldo);

	string getNR();

	void reporteCuenta();
	void imprimir();
};
