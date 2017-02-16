#include "Gato.h"

int main()
{
	cout << "Ejemplo con una clase" << endl;


	//garfiedl es el nombre de la variable del tipo Gato
	Gato garfield;

	garfield.setNombre("Garfield");
	garfield.setEdad(5);
	garfield.setPeso(10);

	int x = garfield.getPeso();

	cout << "El gato pesa " << x << endl;

	garfield.come("croquetas");

	Gato silvestre("Silvestre", 10, 5);

	silvestre.come("pescado");
	/////////////////////////////////////////////////////////////////////////////////////
	Gato g[5];

	g[0].setNombre("Uno");
	g[1].setNombre("Dos");
	g[2].setNombre("Tres");
	g[3].setNombre("Cuatro");
	g[4].setNombre("Cinco");

	for (int i = 0; i < 5; i++)
		cout << "El gato " << i << " se llama " << g[i].getNombre() << endl;

   int z;
   cin >> z;
}
