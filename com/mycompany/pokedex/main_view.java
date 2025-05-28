/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pokedex;

import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import pokemon.pokemon;
import pokemon.pokemon_view;

/**
 *
 * @author fernanda
 */
public class main_view extends JFrame {
    JComboBox listadoPokemon = new JComboBox();
    JButton botonAtras = new JButton( "<" );
    JButton botonAdelante = new JButton(">");
    JPanel JPokedex = new JPanel();
    JPanel botones = new JPanel();
    JPanel listadoPkmn = new JPanel();
    JPanel panelIzq = new JPanel();

    public main_view() {
        super("Pokedex");
        this.setSize(600, 300);
        this.getContentPane().setLayout( new GridLayout(1, 2) );
        setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE ) ;

        // Se crea un panel para los botones y se agregan los botones
        botones.setLayout( new GridLayout(1, 2) );
        botones.add( botonAtras );
        botones.add( botonAdelante );

        listadoPkmn.setLayout( new GridLayout(1, 1) );
        listadoPkmn.add( listadoPokemon );

        listadoPkmn.setLayout( new GridLayout(2, 1) );
        panelIzq.add( botones );
        panelIzq.add( listadoPkmn );

        this.add( panelIzq );
        this.add( JPokedex );
    }
    
    public void mostrarPokemon(pokemon pkmn) {
        JPokedex.removeAll();
        JPokedex.add( new pokemon_view( pkmn ) );
        JPokedex.revalidate();
        JPokedex.repaint();
    }
}
