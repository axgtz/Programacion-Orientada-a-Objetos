#include <iostream>
#include <string>

using namespace std;

class Gato {

private:

   //Atributos
   string nombre;
   int edad;
   float peso;

public:
   //Constructor
   Gato();
   Gato(string nom, int ed, float pes);

   //Metodos get y set para modificar atributos

   string getNombre();
   void setNombre(string n);

   int getEdad();
   void setEdad(int e);

   float getPeso();
   void setPeso(float p);

  //Otros metodos
  void come(string comida);

};
