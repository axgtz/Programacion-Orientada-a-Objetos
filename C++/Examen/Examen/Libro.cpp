//Roberto Alejandro Gutierrez Guillen  A01019608
#include "Libro.h"

Libro::Libro() {

}

Libro::Libro(string a, string t, string e){
	autor = a;
	titulo = t;
	editorial = e;
}


string Libro::getAutor() {
	return autor;
}
void Libro::setAutor(string a){
	autor = a;
}


void Libro::imprime() {
	cout << "\nAutor: "<< autor <<endl;
	cout << "\nTitulo: " << titulo << endl;
	cout << "\nEditorial: " << editorial << endl;
}