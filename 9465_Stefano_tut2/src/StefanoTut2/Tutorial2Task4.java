
package StefanoTut2;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Tutorial2Task4 {
    public void taskFour()
    {
        String temperature = JOptionPane.showInputDialog(new JFrame(),"What temperature do you want to convert from? F for Fahrenheit or C for Celsius: ");
        if (temperature.equals("F") || temperature.equals("f"))
        {
            String fahrenheit = JOptionPane.showInputDialog(new JFrame(),"Enter the temperature in Fahrenheit: ");
            double celsius = (((Integer.valueOf(fahrenheit)-32) *5) / 9);
            JOptionPane.showMessageDialog(new JFrame(),"the Fahrenheit temperature in Celcius is: " + celsius);
        }
        else
        {
            String celsius = JOptionPane.showInputDialog(new JFrame(),"Enter the temperature in Celsius: ");
            int fahrenheit = (((Integer.valueOf(celsius) * 9) / 5) + 32);
            JOptionPane.showMessageDialog(new JFrame(),"the Celsius temperature in Fahrenheit is: " + fahrenheit);
        }                
    }    
}
