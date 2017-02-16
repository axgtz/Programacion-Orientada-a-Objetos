//
//  Mounstruo.hpp
//  JuegoPuzzle
//
//  Created by Jose Carlos Garcia Mendizabal on 2/2/16.
//  Copyright © 2016 Jose Carlos Garcia Mendizabal a01023616. All rights reserved.
//

#ifndef Mounstruo_hpp
#define Mounstruo_hpp

#include <stdio.h>
#include <iostream>
#include "Enemigo.hpp"

class Mounstruo : public Enemigo {
private:
    char tipo;
    
public:
    Mounstruo();
    Mounstruo(int x, int y, int t);
    
    int getTipo();
    void setTipo(int t);
    
    int calculaDanio(int t);
};

#endif /* Mounstruo_hpp */
