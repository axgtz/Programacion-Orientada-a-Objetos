/*@Roberto Alejandro Gutierrez Guillen
* A01019608
*/


#ifndef ENEMIGO_H
#define ENEMIGO_H

#include <iostream>

using namespace std;

class Enemigo {
	protected:
		int coordX;
		int coordY;

	public:
		Enemigo();

		Enemigo(int x, int y);

		int getCoordX();
		void setCoordX(int y);

		int getCoordY();
		void setCoordY(int y);

		int calculaDano(int t);
};
#endif