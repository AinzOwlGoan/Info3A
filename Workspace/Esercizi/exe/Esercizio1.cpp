/*
 * Esercizio1.cpp
 *
 *  Created on: 3 dic 2019
 *      Author: d.ravasio9
 */
#include<iostream>
using namespace std;

class Studente
{
	string  Matricola;
public:
	virtual void getCorsoStudi(){

		cout << "Superclasse Studente "<< endl;
	}
};
class StudenteLS : public Studente
{
	public:
	 virtual void getCorsoStudi(){
		cout << "Classe StudenteLS" << endl;
	}

};
class StudenteIL: public Studente
{
	public:
	 void getCorsoStudi(){
		cout << "Classe StudenteIL "<<endl;
	}
};

int main(int argc, char **argv) {

	StudenteLS ls;
	StudenteIL il;
	Studente st;

	st.getCorsoStudi();
	ls.getCorsoStudi();
	il.getCorsoStudi();

	Studente s2 =  StudenteLS();

	s2.getCorsoStudi();
	// chiama il metodo studente
	// non si attiva il polimorfismo senza il puntatore

	Studente* s3 = new StudenteIL();

		s3->getCorsoStudi();
}



