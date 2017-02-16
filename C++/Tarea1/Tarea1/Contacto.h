/*
@Roberto Alejandro Gutierrez Guillen
A01019608
Tarea 1
21/01/2016
*/

#include <iostream>
#include <string>

using namespace std;

class Contacto{
private:

	//Atributos
	string nombre;
	string telefono;
	string email;
	string direccion;

public:
	//Constructores
	Contacto();
	Contacto(string nom,string tel,string em,string direc);

	//Metodos get y set
	string getNombre();
	void setNombre(string nom);

	string getTelefono();
	void setTelefono(string tel);

	string getEmail();
	void setEmail(string em);

	string getDireccion();
	void setDireccion(string direc);

	//Metodos y funciones extra
	string verContacto();

};