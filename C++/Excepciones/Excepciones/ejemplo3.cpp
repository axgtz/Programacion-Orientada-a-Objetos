/*
#include <iostream>
#include <cmath>

using namespace std;

float divide(int a, int b)
{
   float result = -1.0f;

     if(b == 0)
       throw -8;         //te saca de la función 
     else
       result = (float)a/b;

   return result; 
}

int main(){
   float w,z;
   int x, y;

   x = 10;
   y = 0;
   
   try {
     z = divide(x,y);
     w = 13.14f;
     w = pow(w,z);
     cout<<"Resultado "<< w <<endl;
   }
   catch(int e){                                      //El entero sirve para diferenciar errores, por si pones un switch en el catch.
      cout<<"Error al tratar de dividir entre cero "<< e <<endl; 
   }


   int jk;
   cin >> jk;
}
*/