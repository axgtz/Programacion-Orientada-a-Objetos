/*@Roberto Alejandro Gutierrez Guillen
* A01019608
*/

#include <iostream>
#include "Jugador.h"
#include "Hoyo.h"
#include "Monstruo.h"

using namespace std;

class Juego {
private:
	int dimX;
	int dimY;
	Jugador *jugador;
	Monstruo *monstruo;
	Hoyo *hoyo;

public:
	Juego();

	Juego(int dx, int dy, Jugador *j, Monstruo *m, Hoyo *h);

	int getDimX();
	void setDimX(int dx);

	int getDimY();
	void setDimY(int dy);

	Jugador* getJugador();
	void setJugador(Jugador *j);

	Monstruo* getMonstruo();
	void setMonstruo(Monstruo *m);

	Hoyo* getHoyo();
	void setHoyo(Hoyo *h);
};