#include "Cosa.h"

void unaFuncion()
{
	Cosa *c = new Cosa();
	c->setNombre("Lucas");
	cout << "El nombre es " << c->getNombre() << endl;
	c->~Cosa();
}

void main(){
	cout << "Antes de entrar a la funcion" << endl;
	unaFuncion();
	cout << "Despues de entrar a la funcion" << endl;

	int x;
	cin >> x;
}