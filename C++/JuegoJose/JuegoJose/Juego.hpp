//
//  Juego.hpp
//  JuegoPuzzle
//
//  Created by Jose Carlos Garcia Mendizabal on 2/21/16.
//  Copyright © 2016 Jose Carlos Garcia Mendizabal a01023616. All rights reserved.
//

#ifndef Juego_hpp
#define Juego_hpp

#include <iostream>
#include <vector>
#include <time.h>
#include <stdlib.h>
#include <string>
#include "Hoyo.hpp"
#include "Mounstruo.hpp"
#include "Jugador.hpp"

using namespace std;

class Juego {
private:
    Hoyo *h;
    Mounstruo *m;
    Jugador *j;
    int dimX;
    int dimY;
    int **celda;
    int **celdaUsuario;
    
public:
    Juego();
    Juego(int x, int y);
    Juego(Hoyo *h, Mounstruo *m, Jugador *j, int x, int y);
    ~Juego();
    
    Hoyo* getHoyo();
    void setHoyo(Hoyo *h);
    
    Mounstruo* getMounstruo();
    void setMounstruo(Mounstruo *m);
    
    Jugador* getJugador();
    void setJugador(Jugador *j);
    
    int getDimX();
    void setDimX(int x);
    
    int getDimY();
    void setDimY(int y);
    
    void inicializar();
    
    void jugar();
    
    void tablero(int t, int x, int y);
};

#endif /* Juego_hpp */
    

    

    