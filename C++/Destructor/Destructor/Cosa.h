#include <iostream>
#include <string>

using namespace std;

class Cosa {
private:
	string nombre;
public:
	Cosa();
	Cosa(string nombre);
	~Cosa(); //Destructor

	string getNombre();
	void setNombre(string nombre);
};