//A01019608 Roberto Alejandro Gutierrez Guillen
#include <fstream>
#include <iostream>
#include <sstream>
#include <vector>

using namespace std;

int main(){
	ifstream archivo_entrada;
	char linea[128];
	int i = 0;
	vector <string> usuario; 

	archivo_entrada.open("bitacora.txt");

	if (archivo_entrada.fail()){
		cout << "Error al abrir el archivo" << endl;
		return 0;
	}

	while (!archivo_entrada.eof()){
		archivo_entrada.getline(linea, sizeof(linea));

		string str(linea);

		istringstream iss(str); 

		string sub;
		iss >> sub;
		usuario.push_back(sub);
		                                                              
	}
	archivo_entrada.close();

	ofstream archivo_salida;
	archivo_salida.open("datos.txt");

	string nombre;
	int cont;

	for (int j = 0; j < usuario.size()-1; j++) {
		nombre = usuario[j];
		cont = 0;
		for (int i = 0; i < usuario.size(); i++) {
			if (usuario[i] == nombre) {
				cont++;
				if (cont > 1){
					usuario.erase(usuario.begin() + i);
					i--;
				}
			}
		}
		archivo_salida <<  j+1 << " El usuario: [" << usuario[j] << "] se conecto " << cont << " veces" <<endl;
	}
	
	archivo_salida.close();
	system("pause");
}
