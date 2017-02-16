/*#include <iostream>
#include <cmath>

using namespace std;

class myexception: public exception{       //myexcepcion es hija de exception
  virtual const char* what() const throw() //const *char es lo que va a regresar, what() el nombre de la funcion 
  {											//y const throw es que la funcion es un throw
    return "Estas dividiendo por cero";
  }
} myex;                                     //Aqui se esta declarando a una clase con el nombre "myex"

float divide(int a, int b){
   float result = -1.0f;

     if(b == 0)
       throw myex;					
     else
       result = (float)a/b;      //Aqui se esta haciendo un cast

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
   }catch(exception& e){			//Se esta usando la clase excpetion y el metodo what es de la clase excpetion
      cout<<e.what()<<endl;
   }


   int fe;
   cin >> fe;
}
*/