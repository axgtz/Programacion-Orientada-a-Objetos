#include <string>
#include <vector>
#include <iostream>
#include "Persona.h"

void main(){
	//al declarar apuntadores todavia no se crea el obj

	vector <Persona *> per;

	per.push_back(new Persona());
	per[0]->setNombre("Pepe");

	//Hace lo mismo que las dos lineas de arriba
	Persona *x = new Persona();
	x->setNombre("Lucas");
	per.push_back(x);

	per.push_back(new Persona());
	per[2]->setNombre("Juan");

	for (int i = 0;; i++)
		cout << i << ":" << per[i] << " , " << per[i]->getNombre() << endl;

	int a;
	cin >> a;
};