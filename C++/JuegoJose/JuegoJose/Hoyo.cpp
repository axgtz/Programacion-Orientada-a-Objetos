//
//  Hoyo.cpp
//  JuegoPuzzle
//
//  Created by Jose Carlos Garcia Mendizabal on 2/2/16.
//  Copyright © 2016 Jose Carlos Garcia Mendizabal a01023616. All rights reserved.
//

#include "Hoyo.hpp"

Hoyo::Hoyo() {
    diametro = 0;
}

Hoyo::Hoyo(int x, int y, int d) {
    coordX = x;
    coordY = y;
    diametro = d;
}

int Hoyo::getDiametro() {
    return diametro;
}

void Hoyo::setDiametro(int d) {
    diametro = d;
}

int Hoyo::calculaDanio(int d) {
    int danio;
    danio = 0;
    if (d == 5) {
        danio = 5;
    } else if (d == 10){
        danio = -1;
    }
    return danio;
}


