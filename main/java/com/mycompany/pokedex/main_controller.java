/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pokedex;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import pokemon.pokemon;
import pokemon.pokemon_view;

/**
 *
 * @author fernanda
 */
public class main_controller {
    main_view frame = new main_view();
    pokemon pkmn = new pokemon();
    Integer pkmn_idx = 1;

    public main_controller() {
        frame.setVisible(true);
        cambiarPokemon( pkmn.getPokemon(1) );
        frame.botonAtras.addActionListener( new botonAtras() );
        frame.botonAdelante.addActionListener( new botonAdelante() );
        frame.listadoPokemon.addActionListener( new listadoSeleccionarPokemon() );

        ArrayList<String> lista = pkmn.getNameList();
        frame.listadoPokemon.addItem( "Seleccione un Pokemon" );
        for (int i = 0;i<lista.size();i++) {
            frame.listadoPokemon.addItem( lista.get(i) );
        }
        frame.listadoPokemon.setSelectedItem( lista.get(0) );
    }

    public void cambiarPokemon(pokemon pkmn) {
        pokemon_view pkmn_view = new pokemon_view( pkmn );
        frame.mostrarPokemon( pkmn );
    }
    
    // Para responder a un clic de botón , una clase debe implementar la interfaz ActionListener. Esta interfaz define un método actionPerformed, el cual se llamará automáticamente cuando un usuario hace clic en un botón asociado a ese ActionListener
    // Un ActionListener actúa como un escuchador de eventos que responde a las acciones del usuario, como hacer clic en el botón para ir hacia atrás
    class botonAtras implements ActionListener {
        // El compilador mostrará un error o una advertencia si no se sobreescribe correctamente
        @Override
        public void actionPerformed(ActionEvent e) {
            pkmn_idx = pkmn_idx - 1;
            if( pkmn_idx <= 1)
                pkmn_idx = 1;

            pkmn = pkmn.getPokemon( pkmn_idx );
            frame.mostrarPokemon( pkmn );
            frame.listadoPokemon.setSelectedIndex( pkmn_idx);
        }
    }

    // Para responder a un clic de botón , una clase debe implementar la interfaz ActionListener. Esta interfaz define un método actionPerformed, el cual se llamará automáticamente cuando un usuario hace clic en un botón asociado a ese ActionListener
    // Un ActionListener actúa como un escuchador de eventos que responde a las acciones del usuario, como hacer clic en el botón para ir hacia atrás
    class botonAdelante implements ActionListener {
        // El compilador mostrará un error o una advertencia si no se sobreescribe correctamente
        @Override
        public void actionPerformed(ActionEvent e) {
            pkmn_idx = pkmn_idx + 1;
            if( pkmn_idx >= 800)
                pkmn_idx = 1;

            pkmn = pkmn.getPokemon( pkmn_idx );
            frame.mostrarPokemon( pkmn );
            frame.listadoPokemon.setSelectedIndex( pkmn_idx);
        }
    }

    // Para responder a un clic de botón , una clase debe implementar la interfaz ActionListener. Esta interfaz define un método actionPerformed, el cual se llamará automáticamente cuando un usuario hace clic en un botón asociado a ese ActionListener
    // Un ActionListener actúa como un escuchador de eventos que responde a las acciones del usuario, como hacer clic en el botón para ir hacia atrás
    class listadoSeleccionarPokemon implements ActionListener {
        // El compilador mostrará un error o una advertencia si no se sobreescribe correctamente
        @Override
        public void actionPerformed(ActionEvent e) {
            pkmn_idx = frame.listadoPokemon.getSelectedIndex();
            pkmn = pkmn.getPokemon( pkmn_idx) ;
            frame.mostrarPokemon( pkmn );
            frame.listadoPokemon.setSelectedIndex( pkmn_idx );
        }
    }
}
