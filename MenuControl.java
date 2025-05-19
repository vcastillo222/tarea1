/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller2p;

import javax.swing.JFrame;

/**
 *
 * @author tvman
 */
public class MenuControl extends JFrame{
    
      {
    private  MenuControl view = new MenuControl();
    private  JFrame frame = new JFrame("Holaa");
    
    public MenuControl() {
        int width = 350, height = 550;
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(width, height);
        setLocation(200, 200);
        
        setContentPane(view);
        setVisible(true);
    }
}
    
}
