/*@Roberto Alejandro Gutierrez Guillen
* A01019608
*/

#include "Juego.h"

Juego::Juego() {
	dimX = dimY = 0;
	jugador = NULL;
	monstruo = NULL;
	hoyo = NULL;
	//cout << "Constructor Juego vacio" << endl;
}

Juego::Juego(int dx, int dy) {
	dimX = dx;
	dimY = dy;
	jugador = NULL;
	monstruo = NULL;
	hoyo = NULL;
	//Crear arreglo que contiene todo
	cell = new int*[dimX];
	for (int i = 0; i < dimX; i++)
		cell[i] = new int[dimY];

	//Crear arreglo que se muestra al usuario
	celdasU = new int*[dimX];
	for (int i = 0; i < dimX; i++)
		celdasU[i] = new int[dimY];

	//cout << "Constructor Juego parametros solo cordenadas" << endl;
}

Juego::Juego(int dx, int dy, Jugador *j, Monstruo *m, Hoyo *h) {
	dimX = dx;
	dimY = dy;
	jugador = j;
	monstruo= m;
	hoyo = h;
	//cout << "Constructor Juego parametros y enemigos" << endl;
}

void Juego::inicializar() {
	//Iniciar matrix con todo, llenar de ceros
	for (int i = 0; i < dimX; i++)
		for (int j = 0; j < dimY; j++)
			cell[i][j] = 0;

	//Iniciar matrix de usuario, llenar de ceros
	for (int i = 0; i < dimX; i++)
		for (int j = 0; j < dimY; j++)
			celdasU[i][j] = 0;


	//Llenar vectores con los enemigos vacios
	vector <Monstruo *> m;
	//$ Aqui puedo poner un for para construir varios monstruos dependiendo la dificultad y tamaño
	srand(time(NULL));
	Monstruo *m1;
	Monstruo *m2;
	Monstruo *m3;
	Monstruo *m4;
	Monstruo *m5;
	Monstruo *m6;

	for (int i = 0; i < 6; i++) {
		int t = rand() % 3 + 1;
		//cout << t << endl;
		switch (i) {
		case 0:
			m1 = new Monstruo(0, 0, t);
			m.push_back(m1);
			cell[0][0] = 6;
			cell[0][1] = 5;
			cell[1][0] = 5;
			break;
		case 1:
			m2 = new Monstruo(4, 1, t);
			m.push_back(m2);
			cell[4][1] = 6;
			cell[4][0] = 5;
			cell[3][1] = 5;
			cell[4][2] = 5;
			cell[5][1] = 5;
			break;
		case 2:
			m3 = new Monstruo(1, 4, t);
			m.push_back(m3);
			cell[1][4] = 6;
			cell[1][3] = 5;
			cell[0][4] = 5;
			cell[1][5] = 5;
			cell[2][4] = 5;
			break;
		case 3:
			m4 = new Monstruo(0, 9, t);
			cell[9][0] = 6;
			cell[8][0] = 5;
			cell[9][1] = 5;
			m.push_back(m4);
			break;
		case 4:
			m5 = new Monstruo(9, 3, t);
			cell[3][9] = 6;
			cell[2][9] = 5;
			cell[3][8] = 5;
			cell[4][9] = 5;
			m.push_back(m5);
			break;
		case 5:
			m6 = new Monstruo(9, 9, t);
			m.push_back(m6);
			cell[9][9] = 6;
			cell[8][9] = 5;
			cell[9][8] = 5;
			break;
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
		int d = rand() % 2 + 1;
		//cout << d << endl;
		switch (i) {
		case 0:
			h1 = new Hoyo(9, 0, d*5);
			h.push_back(h1);
			cell[0][9] = 3;
			cell[0][8] = 2;
			cell[1][9] = 2;
			break;
		case 1:
			h2 = new Hoyo(5, 3, d*5);
			h.push_back(h2);
			cell[3][5] = 3;
			cell[4][5] = 2;
			cell[2][5] = 2;
			cell[3][4] = 2;
			cell[3][6] = 2;
			break;
		case 2:
			h3 = new Hoyo(7, 5, d*5);
			h.push_back(h3);
			cell[5][7] = 3;
			cell[4][7] = 2;
			cell[6][7] = 2;
			cell[5][8] = 2;
			cell[5][6] = 2;
			break;
		case 3:
			h4 = new Hoyo(2, 6, d*5);
			cell[6][2] = 3;
			cell[7][2] = 2;
			cell[5][2] = 2;
			cell[6][3] = 2;
			cell[6][1] = 2;
			h.push_back(h4);
			break;
		case 4:
			h5 = new Hoyo(5, 8, d*5);
			cell[8][5] = 3;
			cell[9][5] = 2;
			cell[7][5] = 2;
			cell[8][4] = 2;
			cell[8][6] = 2;
			h.push_back(h5);
			break;
		}
	}
}

void Juego::jugar() {
	//Crear al jugador 
	int v, jx, jy;
	string nom;
	//$agregar nombre de jugador
	cout << "Cual es su nombre?" << endl;
	getline(cin, nom);
	cout << "Porfavor, escriba la vida del jugador " << endl;
	cin >> v;
	cout << "Porfavor, escriba la coordenada X del jugador" << endl;
	cin >> jx;
	cout << "Porfavor, escriba la coordenada Y del jugador " << endl;
	cin >> jy;
	Jugador *j = new Jugador(jx, jy, v, nom);
	setJugador(j);

	celdasU[jy][jx] = 1;
	//Dificultad
	int dif = 0;
	cout << "Porfavor, escriba la dificultad (3-Facil, 2-Medio, 1-Dificil)" << endl;
	cin >> dif;

	//El contador de monedas del jugador
	int moneda = 0;

	cell[0][7] = 10;
	cell[8][3] = 10;
	cell[6][9] = 10;

	//[jy][jx] - 0 = [0][0] - 1 = [0][dimX-1] - 2 = [dimY-1][0] - 3 = [dimY-1][dimX-1], pierna rota. no arriba
	int pR = 0;

	int pos = 9;
	string sigM = "u";
	cout << "Para moverse usar las letras d = abajo, u = arriba, r = derecha, l = izquierda " << endl;
	while (j->getVida() > 0 || moneda == dif) {
		imprimirArr(1,jx,jy);
		//Esquinas, lados, pierna o nada.
		if (jy == 0) {
			if (jx == 0) {
				pos = 1;
			}
			else {
				if (jx == dimX - 1)
					pos = 2;

			}
			pos = 5;
		}
		if (jx == 0) {
			if (jy == dimY - 1) {
				pos = 3;
			}
			else {
				pos = 7;
			}
		}
		if (jx == dimX - 1) {
			pos = 6;
			if (jy == dimY - 1)
				pos = 4;
		}
		if (jy == dimY - 1) {
			pos = 8;
			if (jx == dimX - 1)
				pos = 4;
		}
		switch (pos) {
			//$array con las palabras de arriba
		case 1:
			cout << "\n¿Desea moverse a la derecha o abajo? " << endl;
			getline(cin, sigM);
			if (sigM == "r") {
				jx += 1;
			}
			if (sigM == "d") {
				jy += 1;
			}
			break;
		case 2:
			cout << "\n¿Desea moverse a la izquierda o abajo? " << endl;
			getline(cin, sigM);
			if (sigM == "d") {
				jy += 1;
			}
			if (sigM == "l") {
				jx -= 1;
			}

			break;
		case 3:
			if (pR == 1) {
				cout << "\n¿Desea moverse a la derecha ? " << endl;
				getline(cin, sigM);
				if (sigM == "r") {
					jx += 1;
				}
			}
			else {
				cout << "\n¿Desea moverse a la derecha o arrriba? " << endl;
				getline(cin, sigM);
				if (sigM == "u") {
					jy -= 1;
				}
				if (sigM == "r") {
					jx += 1;
				}
			}
			break;
		case 4:
			if (pR == 1) {
				cout << "\n¿Desea moverse a la izquierda? " << endl;
				getline(cin, sigM);
				if (sigM == "l") {
					jx -= 1;
				}
			}
			else {
				cout << "\n¿Desea moverse a la izquierda o arriba? " << endl;
				getline(cin, sigM);
				if (sigM == "u") {
					jy -= 1;
				}
				if (sigM == "l") {
					jx -= 1;
				}
			}
			break;
		case 5:
			cout << "\n¿Desea moverse a la derecha, izquierda o abajo? " << endl;
			getline(cin, sigM);
			if (sigM == "d") {
				jy += 1;
			}
			if (sigM == "r") {
				jx += 1;
			}
			if (sigM == "l") {
				jx -= 1;
			}
			break;
		case 6:
			if (pR == 1) {
				cout << "\n¿Desea moverse a la izquierda o abajo? " << endl;
				getline(cin, sigM);
				if (sigM == "d"){
					jy += 1;
				}
				if (sigM == "l") {
					jx -= 1;
				}
			}
			else {
				cout << "\n¿Desea moverse a la arriba, izquierda o abajo? " << endl;
				getline(cin, sigM);
				if (sigM == "d") {
					jy += 1;
				}
				if (sigM == "u") {
					jy -= 1;
				}
				if (sigM == "l") {
					jx -= 1;
				}
			}
			break;
		case 7:
			if (pR == 1) {
				cout << "\n¿Desea moverse a la derecha o abajo? " << endl;
				getline(cin, sigM);
				if (sigM == "d") {
					jy += 1;
				}
				if (sigM == "r") {
					jx += 1;
				}
			}
			else {
				cout << "\n¿Desea moverse a la derecha, arriba o abajo? " << endl;
				getline(cin, sigM);
				if (sigM == "d") {
					jy += 1;
				}
				if (sigM == "r") {
					jx += 1;
				}
				if (sigM == "u") {
					jy -= 1;
				}
			}
			break;
		case 8:
			if (pR == 1) {
				cout << "\n¿Desea moverse a la derecha o izquierda ? " << endl;
				getline(cin, sigM);
				if (sigM == "r") {
					jx += 1;
				}
				if (sigM == "l") {
					jx -= 1;
				}
			}
			else {
				cout << "\n¿Desea moverse a la derecha, izquierda o arriba? " << endl;
				getline(cin, sigM);
				if (sigM == "u") {
					jy -= 1;
				}
				if (sigM == "r") {
					jx += 1;
				}
				if (sigM == "l") {
					jx -= 1;
				}
			}
			break;
		case 9:
			if (pR == 1) {
				cout << "\n¿Desea moverse a la derecha, izquierda o abajo? " << endl;
				getline(cin, sigM);
				if (sigM == "d") {
					jy += 1;
				}
				if (sigM == "r") {
					jx += 1;
				}
				if (sigM == "l") {
					jx -= 1;
				}
			}
			else {
				cout << "\n¿Desea moverse a la derecha, izquierda, arriba o abajo? " << endl;
				getline(cin, sigM);
				if (sigM == "d") {
					jy += 1;
				}
				if (sigM == "u") {
					jy -= 1;
				}
				if (sigM == "r") {
					jx += 1;
				}
				if (sigM == "l") {
					jx -= 1;
				}
			}
			break;
		}
		int contiene2 = cell[jy][jx];
		int t;
		int d;
		switch (contiene2) {
		case 0:
			cout << "\nNo hay nada donde te encuentras" << endl;
			break;
		case 2:
			cout << "\nHay viento donde te encuentras" << endl;
			break;
		case 3:
			cout << "\nDiablos! caiste en un hoyo" << endl;
			srand(time(NULL));
			d = (rand() % 2 + 1) * 5;
			if (d == 5) {
				j->setVida(j->getVida() - 5);
			}
			else {
				if (d == 10)
					cout << "\nOh No! caiste en un hoyo y te rompiste la pierna, ya no puedes subir" << endl;
					pR = 1;
			}
			break;
		case 5:
			cout << "\nHuele feo donde te encuentras" << endl;
			break;
		case 6:
			cout << "\nOh no! Hay un monstruo donde te encuentras" << endl;
			srand(time(NULL));
			t = rand() % 3 + 1;
			switch (t) {
			case 1: j->setVida(j->getVida() - 30);
				break;
			case 2: j->setVida(j->getVida() - 60);
				break;
			case 3: j->setVida(j->getVida() - 80);
				break;
			}
			break;
		case 7:cout << "\nHuele feo y hay viento donde te encuentras" << endl;
			break;
		case 10:cout << "Felicidades hay una moneda donde te encuentras" << endl;
			moneda += 1;
			break;
		}
	}
	if (j->getVida() <= 0){
		cout << "\nLo siento has perdido, intenta de nuevo" << endl;
		imprimirArr(1, jx, jy);
	}else {
		cout << "\nFelicidades Ganaste!!" << endl;
	}
	//$ Grabar y escribir archivos con puntaje
}

void Juego::imprimirArr(int tipo, int jx, int jy) { //el tipo 1 es el arreglo del usuario, el tipo 2 es el que contiene todo
	if (tipo == 1) {
		for (int i = 0; i < dimX; i++) {
			for (int j = 0; j < dimY; j++)
				if (jx == j && jy == i) {
					cout << 1 << "  ";
				}
				else {
					cout << 0 << "  ";
				}
				cout << endl;
		}
	}
	else {
		if (tipo == 2) {
			for (int i = 0; i < dimX; i++) {
				for (int j = 0; j < dimY; j++)
					cout << "  " << cell[i][j];
				cout << endl;
			}
		}
	}
}


int Juego::getDimX() {
	return dimX;
}

void Juego::setDimX(int dx) {
	dimX = dx;
}

int Juego::getDimY() {
	return dimY;
}

void Juego::setDimY(int dy) {
	dimY = dy;
}

Jugador* Juego::getJugador() {
	return jugador;
}

void Juego::setJugador(Jugador *j) {
	jugador = j;
}

Monstruo* Juego::getMonstruo() {
	return monstruo;
}

void Juego::setMonstruo(Monstruo *m) {
	monstruo = m;
}

Hoyo* Juego::getHoyo() {
	return hoyo;
}

void Juego::setHoyo(Hoyo *h) {
	hoyo = h;
}

Juego::~Juego() {//destructor
	delete[] cell;
};