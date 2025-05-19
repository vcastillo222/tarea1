/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller2p;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author fernanda
 */
public class LoginView extends JPanel implements ActionListener {
    private JLabel userLabel = new JLabel("Usuario");
    private JLabel passLabel = new JLabel("Constraseña");
    private JLabel resultLabel = new JLabel("");
    private JTextField user = new JTextField();
    private JPasswordField pass = new JPasswordField();
    private JButton boton = new JButton("Ingresar");

    public LoginView() {
        setLayout( new GridLayout(3, 2) );
        add(userLabel);
        add(user);
        add(passLabel);
        add(pass);
        add(resultLabel);
        add(boton);
    }
    
    public void showMessage(String s) {
        resultLabel.setText( s );
        JOptionPane.showMessageDialog(this, s);
    }
    
    public String getUser() {
        return user.getText();
    }

    public String getPass() {
        return new String( pass.getPassword() );
    }
    
    public void AddLoginListener(ActionListener l) {
        boton.addActionListener( l );
    }

    public void actionPerformed(ActionEvent ae) {
    }
}
