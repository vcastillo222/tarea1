#include <iostream>

using namespace std; 
using std::cerr;
using std::endl;
#include <fstream>
using std::ofstream;
#include <cstdlib>



/*
class respuestas 
{ 
    bool tipo;
    string respuesta;
    string alt;
    int numpre;
    
    public: 
    cout << "wist du wollen zwei varianten (ja oder nein)? \n 
schreiben eins (1) oder zwei (1) wenn auch du wollen von habe mehr varianten" << endl;
    if(tipo==true)
    {
    respuesta = res;
    cout << "du kannst schreiben die response?" << endl;
    cin >> res;
    //it recieves the response 
    
    }

}
*/
        

class pregunta //(alter, tax)
{
string taxonomia;
int cantpre;
string respuesta;
string pregunta;

public:
std::ofstream Preguntas("Preguntas.txt");  


//preguntar por cantidad de alternativas
//preguntar por cantidad de preguntas 
//for 
bool esc;
cout << "desea escribir una pregunta? si=1 no=0" << endl;
cin >> esc;
while(esc == true)
{
    Preguntas.open; 
      
    cin >> Preguntas; 
    cout >> "desea elegir otra opcion del menu">endl;|
    cin << menu;
}

}  ;


class prueba (preguntas) { //(std asignatura, preguntas.txt){ public:  
string asignatura;
string pregunta;
//preguntar por cantidad de preguntas 
    
public:

std::ofstream Prueba("Prueba.txt")


//open preguntas.txt, escribir pregunta 

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
