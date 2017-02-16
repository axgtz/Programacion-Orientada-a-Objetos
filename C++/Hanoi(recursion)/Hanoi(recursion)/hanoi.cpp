#include <iostream>

using namespace std;

void hanoi(int n, char a, char b, char c) //n = el numero de discos, y a b c son los postes
{
   if (n == 1)
   {
      cout<<"Mover de "<<a<<" a "<<c<<endl;
   }
   else
   {
     hanoi(n-1,a,c,b);
     cout<<"Mover de "<<a<<" a "<<c<<endl;
     hanoi(n-1,b,a,c);
   }
}

int main()
{
  hanoi(12,'A','B','C');
  
  int x;
  cin >> x;
}
