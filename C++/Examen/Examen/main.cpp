//Roberto Alejandro Gutierrez Guillen  A01019608
#include <iostream>

#include <string>

#include "LibroTexto.h"

using namespace std;

int main(){
	LibroTexto *lt;

	lt = new LibroTexto("Peter Norving", "Artificial Intelligence", "Prentice Hall", "Sistemas Inteligentes");

	cout << "Autor del libro es " << lt->getAutor() << endl;

	lt->imprime();
	int x;
	cin >> x;
}