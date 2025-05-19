/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package File;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JFileChooser;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 *
 * @author Alumno
 */
public class FileView extends JPanel implements ActionListener {
    JMenuBar mb = new JMenuBar();
    JMenu file = new JMenu("Archivo");
    JMenu edit = new JMenu("Editar");
    JMenu help = new JMenu("Ayuda");
//    JMenuItem create = new JMenuItem("Crear");
    JMenuItem cut = new JMenuItem("Cortar");
    JMenuItem copy = new JMenuItem("Copiar");
    JMenuItem paste = new JMenuItem("Pegar");
    JMenuItem selectAll = new JMenuItem("Seleccionar todo");
    JMenuItem open = new JMenuItem("Abrir");
  //  JMenuItem save = new JMenuItem("guardar");
    JTextArea textarea = new JTextArea();
    JFileChooser path = new JFileChooser("./");
            
    public FileView() {
        JPanel panel = new JPanel();
        panel.setBorder( BorderFactory.createLineBorder(Color.black) ); 
        
        open.addActionListener(this);
        cut.addActionListener(this);
        copy.addActionListener(this);
        paste.addActionListener(this);
        selectAll.addActionListener(this);
    //    create.addActionListener(this); 
     //   save.addActionListener(this);
        
        file.add(open);
     //   file.add(create);
    //    file.add(save);
        edit.add(cut);
        edit.add(copy);
        edit.add(paste);
        edit.add(selectAll);

        mb.add(file);
        mb.add(edit);
        mb.add(help);
        
        setLayout(new BorderLayout() );
        add(mb, BorderLayout.NORTH);
        add(textarea, BorderLayout.CENTER);
    }

    public void setTextarea(String s) {
        textarea.setText( s );
    }

    public void actionPerformed(ActionEvent e) {
        if( e.getSource() == cut) {
            textarea.cut();
        } else if( e.getSource() == paste) {
            textarea.paste();
        } else if( e.getSource() == copy) {
            textarea.copy();
        } else if(e.getSource() == selectAll) {
            textarea.selectAll();
        } else if(e.getSource() == open ) {
            path.showOpenDialog(null);
            String dirFile = path.getSelectedFile().getAbsolutePath();
            textarea.setText( dirFile );
        } //else if(e.getSource()== create){
            ////create a new file in the desired path 
        } //else if (e.getSource()== save){
            ///save the file in the desired path 
        }
    

