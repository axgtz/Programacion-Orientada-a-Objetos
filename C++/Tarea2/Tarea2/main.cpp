/*@Roberto Alejandro Gutierrez Guillen
* A01019608
*/

#include "Juego.h"

int main() {
	Monstruo *m = new Monstruo(1,1,1);
	Hoyo *h = new Hoyo(2, 1, 1);
	Jugador *j = new Jugador(0, 1, 2);

	Juego *jo = new Juego();

	jo->setHoyo(h);
	jo->setJugador(j);
	jo->setMonstruo(m);

	cout << "----------------------------------- " << endl;

	cout << "\nVida del jugador: " << jo->getJugador()->getVida()<< endl;

	cout << "\nDiametro del Hoyo: " << jo->getHoyo()->getDiametro() << endl;

	int tipo = jo->getMonstruo()->getTipo();
	cout << "\nTipo del Monstruo: " << tipo << endl;
	cout << "Dano del Monstruo: " << jo->getMonstruo()->calculaDano(tipo)<< endl;

	cout << "\nVida del Jugador: " << jo->getJugador()->getVida() << endl;
	cout << "Posicion X del Jugador: " << jo->getJugador()->getPosX() << endl;
	jo->getJugador()->setPosX(8);
	cout << "Nueva posicion X del Jugador: " << jo->getJugador()->getPosX() << endl;

	int re;
	cin >> re;
}