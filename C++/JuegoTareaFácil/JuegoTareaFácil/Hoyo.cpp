/*@Roberto Alejandro Gutierrez Guillen
* A01019608
*/


#include "Hoyo.h"

Hoyo::Hoyo() {
	diametro = 0;
	cout << "Constructor vacio Hoyo" << endl;
}

Hoyo::Hoyo(int x, int y, int d) {
	diametro = d;
	coordX = x;
	coordY = y;
	//cout << "Constructor con parametros Hoyo" << endl;
}

int Hoyo::getDiametro() {
	return diametro;
}

void Hoyo::setDiametro(int d) {
	diametro = d;
}

int Hoyo::calculaDano(int d) {
	int dano = 0;
	if (d==5) {
		dano = 5;
	}else{
		if(d==10)
			dano = -1; //el -1 indica pierna rota osa que el moviemiento se ve reducido
	}
	return dano;
}
