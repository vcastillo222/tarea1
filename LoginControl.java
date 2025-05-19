/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller2p;

import File.FileControl;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

/**
 *
 * @author fernanda
 */
public class LoginControl {
    private LoginModel model = new LoginModel();
    private LoginView view = new LoginView();
    private JFrame frame = new JFrame("Ingreso");
    private boolean login = false;

    public LoginControl() {
        int width = 300, height = 400;
        
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
        frame.setSize(width, height);
        frame.setLocation(200, 200);
        frame.setContentPane(view);
        
        frame.setVisible(true);
        view.AddLoginListener( new LoginListener() );
    }
    
    class LoginListener implements ActionListener {
        @Override
        public void actionPerformed( ActionEvent e ) {
            String user = view.getUser();
            String pass = view.getPass();
            
            if( model.verificarUsuario(user, pass)) {
                view.showMessage( "Acceso Permitido" );
                frame.setVisible(false);
                MenuControl frame = new MenuControl();
            //   FileControl frame = new FileControl();
            } else {
                view.showMessage( "Fallo de autenticación" );
            }
        }
    }
    
}
