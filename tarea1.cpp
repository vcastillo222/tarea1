#include <iostream>

using namespace std; 
using std::cerr;
using std::endl;
#include <fstream>
using std::ofstream;
#include <cstdlib>     

class pregunta 
{

int cantpre, cantalt, numpre, nivtax;
std::string respuesta;
std::string alternativa; 
std::string pregunta;
      
public:
      pregunta(std::string respuesta, std::string alternativa, std::string pregunta, int edad, int cantalt, int numpre, int nivtax);



std::ofstream Preguntas("Preguntas.txt");  

cout << "cuántas preguntas desea?" << endl;
cin >> cantpre; 

while(/* cantidad de preguntas */)
{
    cout << "qué tipo de pregunta quiere? v/f o alternativas variadas?" 
        cin >> cantalt;
    for( /* cantidad de preguntas */ 
} 

}  ;


class prueba (preguntas) { //(std asignatura, preguntas.txt){ public:  
string asignatura;
string pregunta;
    
public:

std::ofstream Prueba("Prueba.txt")
//escribir preguntas creadas 

}  



int main() 
{ 
    
    prueba prueba1;
    int menu; 
    menu=0; 
    cout << "menu" << endl; 
    cout << archivo -> asignaturas.txt 
    cout << " 1 crear item " 
    cout << " 2 actualizar" << endl; 
    cout << "3 borrar item " << endl; 
    cout << "4 buscar por taxonomia" << endl; 
    cout << "5 salir " << endl; 
    cout << "escriba el nu´mero que se muestra antes de opcio´n deseada \n (ej: si desea crear un item, escriba 1" << endl; 
    cin >> menu; 
    
    if (menu=1) 
    { 
        alter
        
    } 
    else if (menu=2) {  
preguntas 
} else if (menu=3) {  
    preguntas 
} else if (menu=4) {  
cout << "ingrese taxonomia" 
cin >> tax;
while (tax==P[1])

} else if (menu=5) {  
 break;
 default: 
 cout << "No es una opcio'n va'lida. \n";
 cin >> menu;
 break;
 
cin >> choice;

}  

return 0; 

} 
