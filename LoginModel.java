/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller2p;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author fernanda
 */
public class LoginModel {
    public boolean verificarUsuario(String Usuario, String Pswd) {
        File file = new File("data.txt");
        String data, user, pass;
        
        try {
            Scanner sc = new Scanner(file);
            while( sc.hasNextLine() ) {
                data = sc.nextLine();
                user = data.split(",", 0)[0];
                pass = data.split(",", 0)[1];
                
                if( user.equals(Usuario) && pass.equals(Pswd) ) {
                    return true;
                }
            }           
        } catch (FileNotFoundException e) {
            System.out.println("Ha ocurrido un error");
        }
        
        return false;
    }
}
