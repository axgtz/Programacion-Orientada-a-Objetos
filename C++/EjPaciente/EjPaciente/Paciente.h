#include <string>
#include <iostream>

//El .h es como el archivo de la clase pero solo es para declarar atributos, funciones y metodos.

using namespace std; //es como un import

class Paciente{
private:
	string nombre;
	float estatura;
public:
	//Constructor
	Paciente();

	float getEstatura();
	void setEstatura(float e);

	string getNombre();
	void setNombre(string n);

	void imprimirDatos();
};