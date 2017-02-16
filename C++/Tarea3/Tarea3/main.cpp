//Roberto Alejandro Gutierrez Guillen  A01019608
#include <iostream>
#include <string>

using namespace std;

void triangulo(int n) {
	if (n > 1) {
		std::cout <<std::string(n,'*') << std::endl;
		triangulo(n - 1);
	}else {
		if(n==1)
			cout << "*" << endl;
	}
}

float potencia(float x, int n) { //x es el numero y n es la potencia x^n
	if (n==1) 
		return x;
	else
		return  x * potencia(x, n - 1);
}

int maxCD(int a, int b){
	if (b == 0)
		return a;
	else
		return maxCD(b, a % b);
	
}

int minCM(int a, int b) {
	return (a*b)/(maxCD(a, b));
}

int main() {
	cout << "\nTriangulo" << endl;
	triangulo(10);

	cout << "\nPotencia" << endl;
	cout << potencia(4, 1) <<endl;

	cout << "\nMinimo Comun Multiplo"<< endl;
	cout << minCM(60, 36) << endl;

	int x;
	cin >> x;
}
