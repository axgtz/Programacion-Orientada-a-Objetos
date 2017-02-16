//
//  Enemigo.hpp
//  JuegoPuzzle
//
//  Created by Jose Carlos Garcia Mendizabal on 2/2/16.
//  Copyright © 2016 Jose Carlos Garcia Mendizabal a01023616. All rights reserved.
//

#ifndef Enemigo_hpp
#define Enemigo_hpp

#include <stdio.h>
#include <iostream>

using namespace std;

class Enemigo {
protected:
    int coordX;
    int coordY;
    
public:
    Enemigo();
    Enemigo(int x, int y);
    
    int getCoordX();
    void setCoordX(int x);
    
    int getCoordY();
    void setCoordY(int y);
    
    int calculaDanio(int t);
};

#endif /* Enemigo_hpp */



