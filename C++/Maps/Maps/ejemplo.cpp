#include <map>
#include <iostream>
#include <string>

using namespace std;

void main() {
	//Mapa 
	map<int, string> numcuenta;
		//Iterador
	map<int, string>::iterator it2;

	numcuenta[13] = "Guacamaya";
	numcuenta[20] = "Gato";
	numcuenta[33] = "Perro";
	numcuenta[12] = "Caballo";

	cout << "\nSize: " << numcuenta.size() << endl;

	for (it2 = numcuenta.begin(); it2 != numcuenta.end(); it2++)
		cout << "\tIndice " << it2->first << " contenido " << it2->second << endl;

	//Mapa con dos strings
	map<string, string> agenda; //El primero es el tipo de dato para el indice y el segundo el que va a contener

		//Iterador
	map<string, string>::iterator it;

	agenda["Omar"] = "omarcito@hotmail.com";
	agenda["Isaac"] = "isaacito95@yahoo.com";
	agenda["Tortas"] = "tortas@gmail.com";

	cout <<"\nSize: " << agenda.size() << endl;

	cout <<"\nElemento en posicion omar: "<< agenda.at("Omar")<< endl;

	for (it = agenda.begin(); it != agenda.end(); it++) {
		cout << "\tIndice: " << it->first << " contenido: " << it->second << endl;
	}


	int isaac;
	cin >> isaac;
}