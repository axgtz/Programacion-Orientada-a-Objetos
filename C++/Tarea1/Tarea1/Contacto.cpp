/*
@Roberto Alejandro Gutierrez Guillen
A01019608
Tarea 1
21/01/2016
*/

#include "Contacto.h"

//Constructor
	Contacto::Contacto(){
		cout << "Se construyo el contacto vacio" << endl;
	}

	Contacto::Contacto(string nom, string tel, string em, string direc){
		nombre = nom;
		telefono = tel;
		email = em;
		direccion = direc;
		cout << "Se construyo el contacto con parametros" << endl;
	}
	//Metodos extra
	string Contacto::verContacto(){
		return " Nombre: " + Contacto::getNombre() + " Telefono: " + Contacto::getTelefono() + " Telefono: " + Contacto::getEmail() + " Direccion: " + Contacto::getDireccion();
	}

	//Metodos get y set para modificar atributos

	//Nombre
	string Contacto::getNombre(){
		return nombre;
	}

	void Contacto::setNombre(string nom){
		nombre = nom;
	}

	//Telefono
	string Contacto::getTelefono(){
		return telefono;
	}

	void Contacto::setTelefono(string tel){
		telefono = tel;
	}

	//Email
	string Contacto::getEmail(){
		return email;
	}

	void Contacto::setEmail(string em){
		email = em;
	}


	//Direccion
	string Contacto::getDireccion(){
		return direccion;
	}

	void Contacto::setDireccion(string direc){
		direccion = direc;
	}


