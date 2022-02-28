
package StefanoTut3;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Tutorial3Task3
{
    //private Double pi = 3.14;
    String radius = JOptionPane.showInputDialog(new JFrame(),"Enter the radius of the cycle: ");
    private int diameter;
    private int circumference;
    protected int area;
    
    public void calculateDiameter()
    {
        diameter = 2 * (Integer.valueOf(radius));
        //JOptionPane.showMessageDialog(new JFrame(), "The Diameter is : " + diameter);        
    }
    
    public void calculateCircumference()
    {
        circumference = (int) ((2 * 3.14) * Integer.valueOf(radius));
        //JOptionPane.showMessageDialog(new JFrame(), "The Circumference is : " + circumference);
    }
    
    public void calculateArea()
    {
        area = (int) (3.14 * (Integer.valueOf(radius) * Integer.valueOf(radius)));
        //JOptionPane.showMessageDialog(new JFrame(), "The Area is : " + area); 
    }   

    @Override
    public String toString() 
    {
        calculateDiameter();
        calculateCircumference();
        calculateArea();
        return "Circle{" + "radius=" + radius + ", diameter=" + diameter + ", circumference=" + circumference + ", area=" + area + '}';
    }          
}
