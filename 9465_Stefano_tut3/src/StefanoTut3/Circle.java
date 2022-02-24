
package StefanoTut3;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Circle 
{
    
    //private Double pi = 3.14;
    String radius = JOptionPane.showInputDialog(new JFrame(),"Enter the radius of the cycle: ");
    
    public void calculateDiameter()
    {
        int diameter = 2 * (Integer.valueOf(radius));
        JOptionPane.showMessageDialog(new JFrame(), "The Diameter is : " + diameter);
    }
    
    public void calculateCircumference()
    {
        int circumference = (int) ((2 * 3.14) * Integer.valueOf(radius));
        JOptionPane.showMessageDialog(new JFrame(), "The Circumference is : " + circumference);
    }
    
    public void calculateArea()
    {
        int area = (int) (3.14 * (Integer.valueOf(radius) * Integer.valueOf(radius)));
        JOptionPane.showMessageDialog(new JFrame(), "The Area is : " + area); 
    }      
}
