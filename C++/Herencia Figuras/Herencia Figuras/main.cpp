#include "Circulo.h"
#include "Rectangulo.h"

int main()
{
   Circulo c(2,3,4);


   cout<<"El area del circulo es "<<c.area()<<endl;
   cout << "El area del circulo es " << c.area(8) << endl;

   cout<<"Centro: "<<c.getCentroX()<<", "<<c.getCentroY()<<endl;
   cout<<"Radio: "<<c.getRadio()<<endl;

   c.imprimir();

   cout<<"------------"<<endl<<endl;

   Rectangulo *r;
   r = new Rectangulo(0, 0, 12, 13);
   r->setAncho(13);
   r->setAlto(1);
   cout<<"El are del rec "<<r->area()<<endl;
   cout << endl;
   r->imprimir;
   cout << endl;

   cout<<"------------"<<endl<<endl;

   int a;
   cin >> a;

   Circulo *cir = new Circulo(0, 0, 13);

   Figura *f[2];
   f[0] = cir;
   f[1] = r;

   for (int i = 0; i < 2; i++) {
	   cout <<"A: " <<f[i]->area() << endl;
   }
}
