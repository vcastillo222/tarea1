/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package File;

import javax.swing.JFrame;

/**
 *
 * @author Alumno
 */
public class FileControl extends JFrame {
    private  FileView view = new FileView();
    private  JFrame frame = new JFrame("Holaa");
    
    public FileControl() {
        int width = 300, height = 400;
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(width, height);
        setLocation(200, 200);
        
        setContentPane(view);
        setVisible(true);
    }
}
