// Tarea_04_Array.cpp : Defines the entry point for the console application.
//

#include "stdafx.h"
#include "iostream"   // LIBRERIAS A USAR
#include "stdio.h"
#include "conio.h"
#include "sstream"
#include "ArrayClass.h"  // LIBRERIA QUE HACE QUE PUEDA USAR MI CLASSE CREADA CON EL HEADER




 int main()
{

	int Input;
	int Size;

	ArrayClass ClassMethod;

	std::cout << "		TAREA 04  " << endl;
	std::cout << "";
	std::cout << "		CUANTOS VALORES INGRESARA?:  " ;
	std::cin >> Size;

	ClassMethod.SetArraySize(Size);

	for (int i =1; i < Size+1; i++)
	{
		std::cout << "		INGRESA TU VALOR NUMERO "<<i<<": " ;
		std::cin >> Input;
		ClassMethod.AddToArray(Input);
	}

	std::cout << "		SUMATORIA DEL ARREGLO ES:  " << ClassMethod.ArraySummation() << endl;
	std::cout << "";
	std::cout << "		LA LONGITUD DEL ARREGLO ES: "<< ClassMethod.GetArraySize() << endl;
	std::cout << "";
	std::cout << "		LA SUMATORIA DE POSICIONES PARES ES: "<< ClassMethod.SummationPairPositions() << endl;
	std::cout << "";
	std::cout << "		LA SUMATORIA DE POSICIONES INPARES ES: " << ClassMethod.SummationunPairPositions() << endl;

	

	std::cout << "ARREGLO ENTERO ES: "<< ClassMethod.PrintElArray()<<endl;


		


	
}






