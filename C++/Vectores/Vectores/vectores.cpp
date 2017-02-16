#include <string>
#include <vector>
#include <iostream>

using namespace std;


void imprimir() {
for (int i = 0; i < v.size(); i++)
	cout << i << ": " << v[i] << endl;
}

void main() {

	vector <string> v;

	v.push_back("manzana");
	v.push_back("uvas");
	v.push_back("mango");
	v.push_back("kiwi");

	cout << "Size " << v.size() << endl;

	imprimir();


	cout << "\n-----------------" << endl;
	v.pop_back();								//elimina el último elemento del vector
	imprimir();


	cout << "\n-----------------" << endl;
	v.insert(v.begin()+1,"mango");				//Para insertar objetos en posiciones especificas, en este caso el 
	imprimir();									//string "mango " en la 1 (no en la 0)
		

	cout << "\n-----------------" << endl;
	v.push_back("cereza");
	v.push_back("durazno");
	imprimir();

	cout << "\n-----------------" << endl;		//v.erase() = Sirve para borrar partes del vector, la primera cordenada 
	v.erase(v.begin() + 3, v.begin() + 4);		//es en donde se empieza y la última es una después de donde acaba
	imprimir();									//En este caso solo borra el tres. Como en mate poner [), borra la primera
												//cordenada hasta una antes de la última pero la ultima no.
	imprimir();											//También, recorre todas las cosas para que no haya espacios vacios.

	int a;
	cin >> a;
}