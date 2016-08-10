
package calc;
import java.awt.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
 
public class Calc {
    final static boolean shouldFill = true;
    final static boolean shouldWeightX = true;
    final static boolean RIGHT_TO_LEFT = false;
 
    public static void addComponents(Container pane) {
        
        if (RIGHT_TO_LEFT) {
            pane.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        }
        
        JTextField textField;
        JButton button;
        
        
    pane.setLayout(new GridBagLayout());
    GridBagConstraints c = new GridBagConstraints();
            if (shouldFill) {
            //natural height, maximum width
         c.fill = GridBagConstraints.BOTH;
            }
 
    button = new JButton("1");
        //if (shouldWeightX) {
        //c.weightx = 1;
        //}
            c.weightx = 1;
            c.weighty = 1;
            c.ipady = 10;
            c.ipadx = 10;
            c.gridx = 0;
            c.gridy = 1;
            pane.add(button, c);
 
    button = new JButton("2");
             c.weightx = 1;
             c.weighty = 1;
             c.ipady = 10;
             c.ipadx = 10;
             c.gridx = 1;
             c.gridy = 1;
             pane.add(button, c);
 
    button = new JButton("3");
             c.weightx = 1;
             c.weighty = 1;
             c.ipady = 10;
             c.ipadx = 10;
             c.gridx = 2;
             c.gridy = 1;
             pane.add(button, c);
    
    button = new JButton("4");
            c.weightx = 1;
            c.weighty = 1;
            c.ipady = 10;
            c.ipadx = 10;
            c.gridheight = 1;
            c.gridx = 0;
            c.gridy = 2;
            pane.add(button, c);
            
   button = new JButton("5");
            c.weightx = 1;
            c.weighty = 1;
            c.ipady = 10;
            c.ipadx = 10;
            c.gridx = 1;
            c.gridy = 2;
            pane.add(button, c);
            
     button = new JButton("6");
            c.weightx = 1;
            c.weighty = 1;
            c.ipady = 10;
            c.ipadx = 10;
            c.gridx = 2;
            c.gridy = 2;
            pane.add(button, c);
            
       button = new JButton("7");
            c.weightx = 1;
            c.weighty = 1;
            c.ipady = 10;
            c.ipadx = 10;
            c.gridx = 0;
            c.gridy = 3;
            pane.add(button, c);
            
      button = new JButton("8");
            c.weightx = 1;
            c.weighty = 1;
            c.ipady = 10;
            c.ipadx = 10;
            c.gridx = 1;
            c.gridy = 3;
            pane.add(button, c); 
            
    button = new JButton("9");
            c.weightx = 1;
            c.weighty = 1;
            c.ipady = 10;
            c.ipadx = 10;
            c.gridx = 2;
            c.gridy = 3;
            pane.add(button, c);
            
    button = new JButton("+");
            c.weightx = 1;
            c.weighty = 1;
            c.ipady = 10;
            c.ipadx = 10;
            c.gridx = 3;
            c.gridy = 1;
            pane.add(button, c); 
            
    button = new JButton("-");
            c.ipady = 10;      //make this component tall
            c.ipadx = 10;
            c.weightx = 1;
            c.weighty = 1;
            c.gridx = 4;
            c.gridy = 1;
            pane.add(button, c); 
            
     button = new JButton("X");
            c.weightx = 1;
            c.weighty = 1;
            c.ipady = 10;
            c.ipadx = 10;
            c.gridx = 3;
            c.gridy = 2;
            pane.add(button, c); 
            
    button = new JButton("/");
            c.ipady = 10;      //make this component tall
            c.ipadx = 10;
            c.weightx = 1;
            c.weighty = 1;
            c.gridx = 4;
            c.gridy = 2;
            pane.add(button, c); 
            
    button = new JButton("C");
            c.ipady = 10;      //make this component tall
            c.ipadx = 10;
            c.weightx = 1;
            c.weighty = 1;
            c.gridx = 4;
            c.gridy = 0;
            pane.add(button, c);
            
    button = new JButton("=");

            c.gridwidth = GridBagConstraints.REMAINDER; //remainder fills if last element
            c.ipady = 10;      //make this component tall
            c.ipadx = 10;
            c.weightx = 1;
            c.weighty = 1;
            c.gridx = 3;
            c.gridy = 3;
            pane.add(button, c);
            
           //text box 
    textField = new JTextField(20);
            //give the textfield an area to exist
            c.gridx = 0;
            c.gridy = 0;
            c.gridwidth = GridBagConstraints.RELATIVE;
            pane.add(textField, c);
            c.fill = GridBagConstraints.BOTH;
            c.weightx = 1.0;
            c.weighty = 1.0; 
    }
 
    private static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("My First Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        addComponents(frame.getContentPane());
        frame.pack();
        frame.setVisible(true);
    }
 
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}