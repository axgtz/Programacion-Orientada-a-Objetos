#include "Persona.h"


Persona::Persona() {
	nombre = "";
}

void Persona::setNombre(string n) {
	nombre = n;
}

string Persona::getNombre() {
	return nombre;
}