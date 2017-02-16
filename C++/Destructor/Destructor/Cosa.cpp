#include "Cosa.h"

Cosa::Cosa()
{
	nombre = "";
	cout << "Constructor vacio" << endl;
}

Cosa::Cosa(string n)
{
	nombre = n;
	cout << "Constructor parametros " << endl;
}

Cosa::~Cosa()                     //Destructor
{
	cout << "Destructor" << endl;
}

string Cosa::getNombre()
{
	return this->nombre;
}

void Cosa::setNombre(string nombre)
{
	this->nombre = nombre; // equivalente a java this.nombre = nombre 
}