//
//  main.cpp
//  JuegoPuzzle
//
//  Created by Jose Carlos Garcia Mendizabal on 1/25/16.
//  Copyright © 2016 Jose Carlos Garcia Mendizabal a01023616. All rights reserved.
//

#include "Juego.hpp"
#include <iostream>

int main(int argc, const char * argv[]) {
    Juego *juego = new Juego(10,10);
    juego->inicializar();
    juego->jugar();
    juego->~Juego();
}
