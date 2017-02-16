//
//  Mounstruo.cpp
//  JuegoPuzzle
//
//  Created by Jose Carlos Garcia Mendizabal on 2/2/16.
//  Copyright © 2016 Jose Carlos Garcia Mendizabal a01023616. All rights reserved.
//

#include "Mounstruo.hpp"

Mounstruo::Mounstruo() {
    tipo = 0;
}

Mounstruo::Mounstruo(int x, int y, int t) {
    coordX = x;
    coordY = y;
    tipo = t;
}

int Mounstruo::getTipo() {
    return tipo;
}

void Mounstruo::setTipo(int t) {
    tipo = t;
}

int Mounstruo::calculaDanio(int t) {
    int danio;
    danio = 0;
    switch (t) {
        case 1: danio = 30;
            break;
        case 2: danio = 60;
            break;
        case 3: danio = 80;
            break;
    }
    return danio;
}

