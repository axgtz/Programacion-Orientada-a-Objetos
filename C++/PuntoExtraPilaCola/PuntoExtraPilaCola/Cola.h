#include <iostream>
#include <vector>

using namespace std;

template <class Type>

class Cola {
private:
	vector <Type> c;

public:
	Cola();

	void enqueue(Type x);
	Type dequeue();
	Type front();
	bool isEmpty();

	void print();
};

template <class Type>     //Se tiene que poner antes de cada metodo
Cola<Type>::Cola() {
}

template <class Type>
void Cola<Type>::enqueue(Type x) {
	c.push_back(x);
}

template <class Type>
Type Cola<Type>::dequeue() {
	Type x = c[0];
	c.erase(c.begin(), c.begin()+1);
	return x;
}

template <class Type>
Type Cola<Type>::front() {
	return c[c.size() - 1];
}

template <class Type>
bool Cola<Type>::isEmpty() {
	if (c.size() == 0)
		return true;
	return false;
}

template <class Type>
void Cola<Type>::print() {
	if (!isEmpty()) {
		cout << c[0] << "<- tope" << endl;
		for (int i = 1; i < c.size(); i++) {
			cout << c[i] << endl;
		}
	}
}
