//
//  Jugador.hpp
//  JuegoPuzzle
//
//  Created by Jose Carlos Garcia Mendizabal on 2/21/16.
//  Copyright © 2016 Jose Carlos Garcia Mendizabal a01023616. All rights reserved.
//

#ifndef Jugador_hpp
#define Jugador_hpp

#include <stdio.h>
#include <iostream>

using namespace std;

class Jugador {
private:
    string nombre;
    int posX;
    int posY;
    int vida;
    
public:
    Jugador();
    Jugador(string n, int x, int y, int v);
    
    string getNombre();
    void setNombre(string n);
    
    int getPosX();
    void setPosX(int x);
    
    int getPosY();
    void setPosY(int y);
    
    int getVida();
    void setvida(int v);
};

#endif /* Jugador_hpp */
