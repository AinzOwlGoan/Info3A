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
	private:
	string  Matricola;
};
class StudenteLS
{
	public:
	string Identificativo;

	virtual void getCorsoStudi(){
		cout << "Classe StudenteLS" << endl;
	}

};
class StudenteIL
{
	public:
	string ID;
	void getCorsoStudi(){
		cout << "Classe StudenteIL distruttore"<<endl;
	}
	virtual void ~getCorsoStudi(){
		cout << "Classe StudenteIL" << endl;
	}
};

int main(int argc, char **argv) {

	StudenteLS ls;

	ls.getCorsoStudi();

}



