//@Roberto Alejandro Gutierrez Guillen    A01019608
#include "Juego.h"

int main() {
	Juego *jo = new Juego(10,10);

	jo->inicializar();
	jo->jugar();
	jo->~Juego();

	int close;
	cin >> close;
}