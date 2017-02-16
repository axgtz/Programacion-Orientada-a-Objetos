//
//  Hoyo.hpp
//  JuegoPuzzle
//
//  Created by Jose Carlos Garcia Mendizabal on 2/2/16.
//  Copyright © 2016 Jose Carlos Garcia Mendizabal a01023616. All rights reserved.
//

#ifndef Hoyo_hpp
#define Hoyo_hpp

#include <stdio.h>
#include <iostream>
#include "Enemigo.hpp"

class Hoyo : public Enemigo {
private:
    int diametro;
    
public:
    Hoyo();
    Hoyo(int x, int y, int d);
    
    int getDiametro();
    void setDiametro(int d);
    
    int calculaDanio(int t);
};

#endif /* Hoyo_hpp */

