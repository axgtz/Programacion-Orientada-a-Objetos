//
//  Juego.cpp
//  JuegoPuzzle
//
//  Created by Jose Carlos Garcia Mendizabal on 2/21/16.
//  Copyright © 2016 Jose Carlos Garcia Mendizabal a01023616. All rights reserved.
//

#include "Juego.hpp"

Juego::Juego() {
    dimX = 0;
    dimY = 0;
    h = NULL;
    m = NULL;
    j = NULL;
}

Juego::Juego(int x, int y) {
    dimX = x;
    dimY = y;
    h = NULL;
    m = NULL;
    j = NULL;
    celda = new int*[dimX];
    celdaUsuario = new int*[dimX];
    
    for (int i = 0; i < dimX; i++) {
        celda[i] = new int[dimY];
    }
    
    for (int i = 0; i < dimX; i++) {
        celdaUsuario[i] = new int[dimY];
    }
}

Juego::Juego(Hoyo *h, Mounstruo *m, Jugador *j, int x, int y) {
    this->h = h;
    this->m = m;
    this->j = j;
    dimX = x;
    dimY = y;
}

Hoyo* Juego::getHoyo() {
    return h;
}

void Juego::setHoyo(Hoyo *h) {
    h = h;
}

Mounstruo* Juego::getMounstruo() {
    return m;
}

void Juego::setMounstruo(Mounstruo *m) {
    m = m;
}

Jugador* Juego::getJugador() {
    return j;
}

void Juego::setJugador(Jugador *j) {
    j = j;
}

int Juego::getDimX() {
    return dimX;
}

void Juego::setDimX(int x) {
    dimX = x;
}

int Juego::getDimY() {
    return dimY;
}

void Juego::setDimY(int y) {
    dimY = y;
}

void Juego::inicializar() {
    for (int i = 0; i < dimX; i++) {
        for (int j = 0; j < dimY; j++) {
            celda[i][j] = 0;
        }
    }
    
    for (int i = 0; i < dimX; i++) {
        for (int j = 0; j < dimY; j++) {
            celdaUsuario[i][j] = 0;
        }
    }
    
    vector <Hoyo *> h;
    srand(time(NULL));
    Hoyo *h1;
    Hoyo *h2;
    Hoyo *h3;
    Hoyo *h4;
    Hoyo *h5;
    
    for (int i = 0; i < 6; i++) {
        int d;
        d = (rand() % 2) + 1;
        
        switch (i) {
            case 0:
                h1 = new Hoyo(1, 0, d);
                h.push_back(h1);
                celda[1][1] = 3;
                celda[1][2] = 2;
                celda[1][3] = 2;
                break;
            case 1:
                h2 = new Hoyo(2, 0, d);
                h.push_back(h2);
                celda[2][2] = 3;
                celda[2][3] = 2;
                celda[2][4] = 2;
                break;
            case 2:
                h3 = new Hoyo(3, 0, d);
                h.push_back(h3);
                celda[3][3] = 3;
                celda[3][4] = 2;
                celda[3][5] = 2;
                break;
            case 3:
                h4 = new Hoyo(4, 0, d);
                h.push_back(h4);
                celda[4][4] = 3;
                celda[4][5] = 2;
                celda[4][6] = 2;
                break;
            case 4:
                h5 = new Hoyo(5, 0, d);
                h.push_back(h5);
                celda[5][5] = 3;
                celda[5][6] = 2;
                celda[5][7] = 2;
                break;
        }
    }
    
    vector <Mounstruo *> m;
    srand(time(NULL));
    Mounstruo *m1;
    Mounstruo *m2;
    Mounstruo *m3;
    Mounstruo *m4;
    Mounstruo *m5;
    Mounstruo *m6;
    
    for (int i = 0; i < 6; i++) {
        int t;
        t = (rand() % 3) + 1;
        
        switch (i) {
            case 0:
                m1 = new Mounstruo(0, 0, t);
                m.push_back(m1);
                celda[1][0] = 6;
                celda[0][1] = 5;
                celda[1][2] = 5;
                break;
            case 1:
                m2 = new Mounstruo(0, 1, t);
                m.push_back(m2);
                celda[1][1] = 6;
                celda[0][2] = 5;
                celda[2][0] = 5;
                break;
            case 2:
                m3 = new Mounstruo(0, 2, t);
                m.push_back(m3);
                celda[2][2] = 6;
                celda[0][3] = 5;
                celda[3][0] = 5;
                break;
            case 3:
                m4 = new Mounstruo(0, 3, t);
                m.push_back(m4);
                celda[3][3] = 6;
                celda[0][4] = 5;
                celda[4][0] = 5;
                break;
            case 4:
                m5 = new Mounstruo(0, 4, t);
                m.push_back(m5);
                celda[4][4] = 6;
                celda[0][5] = 5;
                celda[5][0] = 5;
                break;
            case 5:
                m6 = new Mounstruo(0, 5, t);
                m.push_back(m6);
                celda[5][5] = 6;
                celda[0][6] = 5;
                celda[6][0] = 5;
                break;
        }
    }
}

void Juego::jugar() {
    int v, x, y;
    int dificultad;
    int monedas;
    int pierna;
    dificultad = 0;
    monedas = 0;
    pierna = 0;
    string n;
    string mover;
    n = "";
    mover = "";
    
    cout<<"***********************************************"<<endl;
    cout<<"******Juego de los Mountros y las Monedas******"<<endl;
    cout<<"***********************************************"<<endl;
    cout<<"\nCrear jugador:"<<endl;
    cout<<"\tNombre: "<<flush;
    cin >> n;
    cout<<endl;
    cout<<"Su jugador inicialmente tiene 400 puntos de vida."<<endl;
    v = 400;
    cout<<"Su jugador inicialmente se encuentra en la coordenada (0,9).\n"<<endl;
    x = 0;
    y = 9;
    
    Jugador *j = new Jugador(n, x, y, v);
    setJugador(j);
    
    celdaUsuario[x][y] = 1;
    
    cout<<"Dficultad:"<<endl;
    cout<<"\t1)Novato"<<endl;
    cout<<"\t2)Heroico"<<endl;
    cout<<"\t3)Legendario"<<endl;
    cout<<"\tElegir: "<<flush;
    cin >> dificultad;
    
    celda[10][10] = 100; //En esta coordenada estan las monedas.
    celda[9][9] = 100; //En esta coordenada estan las monedas.
    
    
//    - Debe mostrar opciones (arriba, abajo, derecha, izquierda).
//    
//    - Leer la opción dada por el jugador.
//    
//    - Actualizar posX y posY del jugador.
//    
//    - Mostrar si esa celda tiene olor, viento, hoyo u mounstruo y si ha disminuido la vida del jugador.
    
    cout<<"\nControles:"<<endl;
    cout<<"\t-arriba"<<endl;
    cout<<"\t-abajo"<<endl;
    cout<<"\t-derecha"<<endl;
    cout<<"\t-izquierda"<<endl;
    
    while (j->getVida() > 0 || monedas == dificultad) {
        
    }
    
    
    
    if (j->getVida() <= 0){
        cout <<"\n\n******PERDISTE******\n\n"<<endl;
    } else {
        cout <<"\n\n******GANASTE******\n\n"<<endl;
    }
    
    
}

Juego::~Juego() {
    delete[] celda;
};