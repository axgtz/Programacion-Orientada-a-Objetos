/*@Roberto Alejandro Gutierrez Guillen
* A01019608
*/

#include "Jugador.h"

Jugador::Jugador() {
	posY = 0;
	posX = 0;
	vida = 0;
	cout << "Constructor Jugador vacio" << endl;
}

Jugador::Jugador(int x, int y, int v) {
	posX = x;
	posY = y;
	vida = v;
	cout << "Constructor Jugador parametros" << endl;
}

int Jugador::getPosX() {
	return posX;
}

void Jugador::setPosX(int x) {
	posX = x;
}

int Jugador::getPosY() {
	return posY;
}

void Jugador::setPosY(int y) {
	posY = y;
}

int Jugador::getVida() {
	return vida;
}

void Jugador::setVida(int v) {
	vida = v;
}

