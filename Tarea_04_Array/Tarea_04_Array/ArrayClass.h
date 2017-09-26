#include "stdafx.h"
#include "iostream"   //LIBRERIAS QUE VOY A USAR
#include "stdio.h"

using namespace std;   // NO SE QUE HACE ESTO PERO SI NO LO PONGO NO SIRVE MI CLASE

class ArrayClass {

public:

	//VARIABLES
	
	int Size;
	
	void SetArraySize(int Size) {		
		
		this->Size = Size;
	
	}
	
	int *Pointer = new int[Size];		// DECLARACION DE ARRAY APUNTANDO AL HEAP
	
	int GetArraySize() {	// DEVUELVE EL TAMAÒO DE MY ARRAY
		return sizeof(Pointer);
	}

	void AddToArray(int Input) {  //LLENA EL ARRAY DONDE HALLA EL PRIMER ESPACIO VACIO
		
		int input = Input;

		for (int i = 0; i < sizeof(Pointer); i++)
		{
			if (Pointer[i]==(NULL || 0))
			{
				Pointer[i] = input;
			}
		}
	}

	int ArraySummation(){  // ESTE METODO ME DA LA SUMA DEL ARRAY COMPLETO

		int Summation = 0;

		for (int i = 0; i < sizeof(Pointer); i++)
		{
			Summation  = + Pointer[i];
		}
		return Summation;
	}

	int SummationPairPositions(){  //	 METODO QUE DEVUELVE LA SUMA DE POSICIONES PARES EN EL VECTOR 
		
		int Summation_2=0;

		for (int i = 0; i < sizeof(Pointer); i++)
		{
			if ( (Pointer[i]%2) == 0 )
			{
				Summation_2 = +Pointer[i];
			}
		}
		return Summation_2;
	}
	

	int SummationunPairPositions() {  //	 METODO QUE DEVUELVE LA SUMA DE POSICIONES NO PARES EN EL VECTOR !!

		int Summation_3 = 0;

		for (int i = 0; i < sizeof(Pointer); i++)
		{
			if ((Pointer[i] % 2) != 0)
			{
				Summation_3 = +Pointer[i];
			}
		}
		return Summation_3;
	}


	string  PrintElArray() {
		
		string cadena;
		for (int i = 0; i < sizeof(Pointer); i++)
		{
			cadena= Pointer[i];
		}

		return cadena;
	}
};