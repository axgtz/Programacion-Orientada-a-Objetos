/*@Roberto Alejandro Gutierrez Guillen
* A01019608
*/

#include <iostream>
#include "Jugador.h"
#include "Hoyo.h"
#include "Monstruo.h"
#include <vector>
#include <time.h>
#include <stdlib.h>  
#include <string>  

using namespace std;

class Juego {
private:
	int dimX;
	int dimY;
	Jugador *jugador;
	Monstruo *monstruo;
	Hoyo *hoyo;
	int **cell;
	int **celdasU;

public:
	Juego();

	Juego(int dx, int dy);

	Juego(int dx, int dy, Jugador *j, Monstruo *m, Hoyo *h);

	~Juego();

	void inicializar();
	void jugar();
	void imprimirArr(int tip, int jx, int jy);

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