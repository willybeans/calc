/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calc;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calc extends JPanel {
    protected JTextField textField; 
    protected JButton b1;
    
        public Calc(){
            b1 = new JButton("1");
            add(b1);
            
            textField = new JTextField(20);
            //give the textfield an area to exist
            GridBagConstraints c = new GridBagConstraints();
            c.gridwidth = GridBagConstraints.REMAINDER;
            c.fill = GridBagConstraints.HORIZONTAL;
            add(textField, c);
            add(b1, c);
            c.fill = GridBagConstraints.BOTH;
            c.weightx = 1.0;
            c.weighty = 1.0; 
        }
    private static void createGUI(){
        JFrame frame = new JFrame("hi will");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new Calc());
        frame.pack();
        frame.setVisible(true);
       
    }   
    public static void main(String[] args) {
    createGUI();
    }
    
}
