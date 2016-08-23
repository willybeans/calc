package textprac;

import java.awt.*;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
 
public class TextPrac {
    final static boolean shouldFill = true;
    final static boolean shouldWeightX = true;
    final static boolean RIGHT_TO_LEFT = false;
    private static JTextField textField = new JTextField();

    
    
    public static void addComponents(Container pane) {
        
        if (RIGHT_TO_LEFT) {
            pane.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        }
        
        JButton button1;
        
        
    class ButtonListener implements ActionListener {
        String storage = "";
    public void actionPerformed(ActionEvent e) {
    String inputs = ((JButton)e.getSource()).getText();
    storage = storage + inputs;
    textField.setText(storage);
} 
    }
        
    pane.setLayout(new GridBagLayout());
    GridBagConstraints c = new GridBagConstraints();
            if (shouldFill) {
            //max height/width
         c.fill = GridBagConstraints.BOTH;
            }
            
    ButtonListener bl = new ButtonListener();
    button1 = new JButton("1");
        //if (shouldWeightX) {
        //c.weightx = 1;
        //}
            c.weightx = 1;
            c.weighty = 1;
            c.ipady = 10;
            c.ipadx = 10;
            c.gridx = 0;
            c.gridy = 1;
            pane.add(button1, c);
            button1.addActionListener(bl);
            
           //text box 
            //give the textfield an area to exist
            c.weightx = 1.0;
            c.weighty = 1.0;
            c.gridx = 0;
            c.gridy = 0;
            c.gridwidth = GridBagConstraints.RELATIVE;
            pane.add(textField, c);
 
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