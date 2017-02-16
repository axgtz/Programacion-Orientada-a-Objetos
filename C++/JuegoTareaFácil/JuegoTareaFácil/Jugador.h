/*@Roberto Alejandro Gutierrez Guillen
* A01019608
*/

#include <iostream>

using namespace std;

class Jugador {
private:
	string nombre;
	int posY;
	int posX;
	int vida;

public:
	Jugador();

	Jugador(int x, int y, int v, string nom);

	int getPosX();
	void setPosX(int x);

	int getPosY();
	void setPosY(int y);

	int getVida();
	void setVida(int v);

	string getNombre();
	void setNombre(string nom);
};