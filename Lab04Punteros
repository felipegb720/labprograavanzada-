// Simple Hello World
 
#include <iostream>

// PROTOTIPOS PARA COLOCAR METODOS DONDE QUIERA

int sumar (int, int);
int restar (int, int);
int multiplicar (int, int);
int dividir (int, int);


//METODOS DE PASO POR VALOR  
int sumar (int a, int b){
    return a+b;
}

int restar (int a, int b){
    return a-b;
}

int multiplicar (int a, int b){
    return a*b;
}

int dividir (int a, int b){
    return a/b;
}

//METODOS RECIBEN INTS Y UN PUNTERO
void sumadepunteros(int a, int b, int* resultado){
    *resultado = a+b; 
}

void restadepunteros(int a, int b, int* resultado){
    *resultado = a-b; 
}

void multiplicaciondepunteros(int a, int b, int* resultado){
    *resultado = a*b; 
}

void divisiondepunteros(int a, int b, int* resultado){
    *resultado = a/b; 
}

// METODO MAIN 
int main()
{  
  std::cout << "HOLA MUNDO 2.0" << std::endl;
  int res = sumar(5, 5);
  int res2 = restar(5, 5);
  int res3 = multiplicar(5, 5);
  int res4 = dividir(5, 5);
  
  std::cout<<""<< std::endl;
  std::cout<<res << std::endl;
  std::cout<<""<< std::endl;
  std::cout<<res2 << std::endl;
  std::cout<<""<< std::endl;
  std::cout<<res3 << std::endl;
  std::cout<<""<< std::endl;
  std::cout<<res4 << std::endl;
  
  int resultado1; 
  int resultado2; 
  int resultado3; 
  int resultado4;
  
  //METODOS PUNTERO QUE HACEN REFERENCIA AL PUNTERO EN METODOS
  sumadepunteros(10, 5, &resultado1);
  restadepunteros(10, 5, &resultado2);
  multiplicaciondepunteros(10, 5, &resultado3);
  divisiondepunteros(10, 5, &resultado4);
  
  
    std::cout<<"resultado es:" << resultado1 << std::endl;
        std::cout<<"resta es:" << resultado2 << std::endl;
            std::cout<<"multiplicacion es:" << resultado3 << std::endl;
                std::cout<<"division es:" << resultado4 << std::endl;
  return 0;
}

