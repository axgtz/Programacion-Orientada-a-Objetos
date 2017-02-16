//Roberto Alejandro Gutierrez Guillen  A01019608
#include "LibroTexto.h"

LibroTexto::LibroTexto(){

}

LibroTexto::LibroTexto(string a, string t, string e, string m)
{
	materia = m;
	autor = a;
	titulo = t;
	editorial = e;
	
}

void LibroTexto::imprime(){
	Libro::imprime();
	cout << "\nMateria: " << materia << endl;
}