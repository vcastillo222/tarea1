/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller2p;

import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author tvman
 */
public class MenuView extends JPanel implements ActionListener {
 
    
    private JLabel cantPre = new JLabel("Cantidad de preguntas");
    private JLabel tipopreg = new JLabel("Tipo de pregunta");
    private JLabel taxpreg = new JLabel("nivel de taxonomia");
    private JLabel resultLabel = new JLabel("");
    private JTextField pregcant = new JTextField();
    private JTextField pregtipo = new JTextField();
    private JTextField pregtax = new JTextField(); 
    private JButton boton = new JButton("Ingresar");

} 
    
    //se define el menu 
    // menu -> alternativas 
    // ingrese nombre de prueba 
    // ingrese cantidad de preguntas 
    // ingrese cantidad de alternativas 
    // 
     
/*    import java.io.File;  // Import the File class
import java.io.IOException;  // Import the IOException class to handle errors

public class CreateFile {
  public static void main(String[] args) {} */
   // try {
        
        /*
    }
      File myObj = new File("filename.txt");
      if (myObj.createNewFile()) {
        System.out.println("File created: " + myObj.getName());
      } else {
        System.out.println("File already exists.");
      }
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
}
 
to write 
        
        import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;  // Import the IOException class to handle errors

public class WriteToFile {
  public static void main(String[] args) {
    try {
      FileWriter myWriter = new FileWriter("filename.txt");
      myWriter.write("Files in Java might be tricky, but it is fun enough!");
      myWriter.close();
      System.out.println("Successfully wrote to the file.");
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    } */ 
    
//}
