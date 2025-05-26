/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pokemon;

import java.awt.GridLayout;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author fernanda
 */
public class pokemon_view extends JPanel {
    JLabel id = new JLabel();
    JTextField nombre = new JTextField();

    public pokemon_view(pokemon pkmn) {
        this.setLayout( new GridLayout(2, 2) );
        
        nombre.setEditable(false);
        id.setText( pkmn.id );
        nombre.setText( pkmn.nombre );

        this.add( id );
        this.add( nombre );
    }
    
}
