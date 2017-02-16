//Roberto Alejandro Gutierrez Guillen  A01019608
#include <iostream>
#include <string>

using namespace std;

class Libro {
	protected:
		string autor;
		string titulo;
		string editorial;

	public:
		Libro();
		Libro(string a, string t, string e);
	
		string getAutor();
		void setAutor(string a);

		void imprime();
};