//
//  Enemigo.cpp
//  JuegoPuzzle
//
//  Created by Jose Carlos Garcia Mendizabal on 2/2/16.
//  Copyright © 2016 Jose Carlos Garcia Mendizabal a01023616. All rights reserved.
//

#include "Enemigo.hpp"

Enemigo::Enemigo() {
    coordX = 0;
    coordY = 0;
}

Enemigo::Enemigo(int x, int y) {
    coordX = x;
    coordY = y;
}

int Enemigo::getCoordX() {
    return coordX;
}

void Enemigo::setCoordX(int x) {
    coordX = x;
}

int Enemigo::getCoordY() {
    return coordY;
}

void Enemigo::setCoordY(int y) {
    coordY = y;
}

int Enemigo::calculaDanio(int t) {
    return 0;
}



