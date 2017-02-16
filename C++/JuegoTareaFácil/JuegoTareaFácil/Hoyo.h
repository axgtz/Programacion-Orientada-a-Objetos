/*@Roberto Alejandro Gutierrez Guillen
* A01019608
*/ 
#include "Enemigo.h";

class Hoyo : public Enemigo {
private:
	int diametro;

public:
	Hoyo();
	Hoyo(int x, int y, int d);

	int getDiametro();
	void setDiametro(int d);

	int calculaDano(int d);
};

