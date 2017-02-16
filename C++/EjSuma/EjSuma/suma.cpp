#include <iostream>

using namespace std;

void main(){
	int x, y, z;

	cout << "Escribe un entero: ";
	cin >> x;

	cout << "Escribe otro entero: ";
	cin >> y;

	z = x + y;

	cout << "Resultado: " << z << endl;

	cin >> y; // ESta parte es para q no se cierre
}