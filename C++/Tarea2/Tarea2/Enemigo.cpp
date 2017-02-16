/*@Roberto Alejandro Gutierrez Guillen
* A01019608
*/

#include "Enemigo.h"

Enemigo::Enemigo() {
	coordX = 0;
	coordY = 0;
	cout << "Constructor Enemigo vacio" << endl;
}

Enemigo::Enemigo(int x, int y) {
	coordX = x;
	coordY = y;
	cout << "Constructor Enemigo parametros" << endl;
}

int Enemigo::getCoordX() {
	return coordX;
}

void Enemigo::setCoordX(int x) {
	coordX = x;
}

int Enemigo::getCoordY() {
	return coordY;
}

void Enemigo::setCoordY(int y) {
	coordY = y;
}


int Enemigo::calculaDano(int t) {
	return 0;
}
