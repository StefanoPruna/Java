package StefanoTut2;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Tutorial2Task1 
{
    public void taskOne()
    {
        String fahrenheit = JOptionPane.showInputDialog(new JFrame(),"Enter the temperature in Fahrenheit: ");
        
        int celsius = (((Integer.valueOf(fahrenheit)-32) *5) / 9);
        
        JOptionPane.showMessageDialog(new JFrame(),"the Fahrenheit temperature in Celcius is: " + celsius);
    }

}
