//Roberto Alejandro Gutierrez Guillen  A01019608
#include "Libro.h"

class LibroTexto : public Libro {
	private:
		string materia;

	public:
		LibroTexto();
		LibroTexto(string a, string t, string e, string m);

		void imprime();
};