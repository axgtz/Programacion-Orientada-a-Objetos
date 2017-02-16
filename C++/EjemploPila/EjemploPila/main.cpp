#include "Pila.h"
#include <string>

void main(){
   Pila<string> *p = new Pila<string>();
  
   p->push("AA");
   p->push("BB");
   p->push("CC");
   p->push("DD");
   p->print();

   cout << "Sacar un elemento " << p->pop() << endl;
   p->print();

   int aa;
   cin >> aa; 
}
