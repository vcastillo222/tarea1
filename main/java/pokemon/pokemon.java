/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pokemon;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author fernanda
 */
public class pokemon {
    public String id, hp, ataque, defensa, ataqueS, defensaS, velocidad, total;
    public String nombre ;
    public String tipo1 , tipo2 ;
    public String generacion ;
    public String legendario ;
    public String img ;
    

    public pokemon getPokemon(int n) {
        File file = new File( "pokedex.csv" );
        String data[];

        try {
            Scanner sc = sc = new Scanner( file );
            while( sc.hasNextLine() ) {
                data = sc.nextLine().split( "," );
                if( data[0].equals(String.valueOf(n)) ) {
                    id = data[0];
                    nombre = data[ 1 ] ;
                    tipo1 = data[ 2 ] ;
                    tipo2 = data[ 3 ] ;
                    total = data[ 4 ] ;
                    hp = data[ 5 ] ;
                    ataque = data[ 6 ] ;
                    defensa = data[ 7 ] ;
                    ataqueS = data[ 8 ] ;
                    defensaS = data[ 9 ] ;
                    velocidad = data[ 10 ] ;
                    generacion = data[ 11 ] ;
                    legendario = data[ 12 ] ;
                    img = data[ 13 ] ;
                    return this;
                }
            }
        } catch ( FileNotFoundException e ) {
            System.out.println( "An error occurred" );
        }    
        id = "";
        nombre = "" ;
        tipo1 = "" ;
        tipo2 = "" ;
        total = "" ;
        hp = "" ;
        ataque = "" ;
        defensa = "" ;
        ataqueS = "" ;
        defensaS = "" ;
        velocidad = "" ;
        generacion = "" ;
        legendario = "" ;
        return this;
    }

    public ArrayList<String> getNameList() {
        File file = new File( "pokedex.csv" );
        ArrayList<String> nombres = new ArrayList<>();
        String data[];

        try {
            Scanner sc = sc = new Scanner( file );
            sc.nextLine();
            while( sc.hasNextLine() ) {
                data = sc.nextLine().split( "," );
                nombres.add(data[1]);
            }
            return nombres;
        } catch ( FileNotFoundException e ) {
            System.out.println( "An error occurred" );
        }    
        return null;
    }

}
