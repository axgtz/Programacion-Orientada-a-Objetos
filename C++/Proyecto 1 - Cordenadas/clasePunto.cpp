//Roberto Alejandro Gutiérrez Guillen   A01019608
#include <iostream>

using namespace std;

class Punto {
private:
    float CoordenadaX, CoordenadaY; // coordenada x y coordenada y del punto
public:
    Punto(float, float){ //inicializa las coordenadas del punto (x,y)

    }

	float ObtenerCoordenadaX() { // regresa la coordenada x del punto

	}
    float ObtenerCoordenadaY(); // regresa la coordenada y del punto
    void ModificaX(float); // cambia el valor de la coordenada x del punto
    void ModificaY(float); // cambia el valor de la coordenada y del punto
    void ImprimeCoordenadas(); // imprime las coordenadas del punto
};
