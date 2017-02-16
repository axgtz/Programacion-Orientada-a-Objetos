
/*
#include <fstream>
#include <iostream>

using namespace std;

int main(){
   ifstream archivo_entrada;
   char linea[128];
   int i=0;
   

   archivo_entrada.open("bitacora.txt");

   if(archivo_entrada.fail()){
      cout<<"Error al abrir el archivo"<<endl;
      return 0;
   }

   while(!archivo_entrada.eof()){
     archivo_entrada.getline(linea,sizeof(linea));
     cout<<i<<": "<<linea<<endl;
	 i++;

     string str(linea);
     
     istringstream iss(str); // se crea un objeto istringstream y el nombre es iss, la variable es str de tipo string.
	 
     do{
        string sub;
        iss >> sub;
        cout<<"Pedazo "<< sub<<endl;
     }while (iss);                   //iss es un flujo de strings
   }

   archivo_entrada.close();

   ofstream archivo_salida;
   archivo_salida.open("datos.txt");

   archivo_salida << "Linea numero 1" << endl;
   archivo_salida << "Linea numero 2" << endl;
   archivo_salida << "a:b:c:d" << endl;

   archivo_salida.close();
	  

   system("pause");
}
*/