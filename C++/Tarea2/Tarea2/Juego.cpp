/*@Roberto Alejandro Gutierrez Guillen
* A01019608
*/

#include "Juego.h"

Juego::Juego() {
	dimX = dimY = 0;
	jugador = NULL;
	monstruo = NULL;
	hoyo = NULL;
	cout << "Constructor Juego vacio" << endl;
}

Juego::Juego(int dx, int dy, Jugador *j, Monstruo *m, Hoyo *h) {
	dimX = dx;
	dimY = dy;
	jugador = j;
	monstruo= m;
	hoyo = h;
	cout << "Constructor Juego parametros" << endl;
}

int Juego::getDimX() {
	return dimX;
}

void Juego::setDimX(int dx) {
	dimX = dx;
}

int Juego::getDimY() {
	return dimY;
}

void Juego::setDimY(int dy) {
	dimY = dy;
}

Jugador* Juego::getJugador() {
	return jugador;
}

void Juego::setJugador(Jugador *j) {
	jugador = j;
}

Monstruo* Juego::getMonstruo() {
	return monstruo;
}

void Juego::setMonstruo(Monstruo *m) {
	monstruo = m;
}

Hoyo* Juego::getHoyo() {
	return hoyo;
}

void Juego::setHoyo(Hoyo *h) {
	hoyo = h;
}
