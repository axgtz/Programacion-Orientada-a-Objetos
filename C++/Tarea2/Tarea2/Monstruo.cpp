/*@Roberto Alejandro Gutierrez Guillen
* A01019608
*/


#include "Monstruo.h"

Monstruo::Monstruo() {
	tipo = 0;
	cout << "Constructor vacio monstruo" << endl;
}

Monstruo::Monstruo(int x, int y, int t) {
	tipo = t;
	coordX = x;
	coordY = y;
	cout << "Constructor con parametros monstruo" << endl;
}

 int Monstruo::getTipo() {
	return tipo;
}

void Monstruo::setTipo(int t) {
	tipo = t;
}

int Monstruo::calculaDano(int t) {
	int dano = 0;
	switch(t){
	case 1: dano = 30;
		break;
	case 2: dano = 60;
		break;
	case 3: dano = 80;
		break;
	}
	return dano;
}
