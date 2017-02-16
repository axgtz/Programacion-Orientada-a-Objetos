#include "Paciente.h" 

Paciente::Paciente(){
	cout <<"Estoy en el constructor del paciente" << endl; //Es como un sys out print
	int a = 5;
	cout << "A " << a << endl;
}

float Paciente::getEstatura(){
	return estatura;
}

void Paciente::setEstatura(float e){ //el "::" sirve para usar lo que esta en el paciente. 
	estatura = e;
}

float Paciente::getNombre(){
	return nombre;
}

void Paciente::setNombre(string n){  
	nombre = n;
}


void Paciente::imprimirDatos(){
	cout <<"Ahora solo se la estatura" << estatura <<endl;
}



int main() {

}