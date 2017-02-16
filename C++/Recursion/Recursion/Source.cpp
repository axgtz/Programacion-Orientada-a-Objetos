#include <iostream>

using namespace std;

int factorial(int n) {
	int resultado;

	cout << "Entrando a factorial con n = " <<n<< endl;
	if (n == 0) {
		return 1;
		cout << "Regresando 1 " << endl;
	} else {
		resultado = n*factorial(n - 1);
		cout << "Regresando " << resultado << endl;
		return resultado;
	}
}

void main() {
	int x;

	x = factorial(3);
	cout << "Resultado "<< x << endl;

	int u;
	cin >> u;
}