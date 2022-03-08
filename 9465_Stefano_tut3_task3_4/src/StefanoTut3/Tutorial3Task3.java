
package StefanoTut3;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Tutorial3Task3
{
    //private Double pi = 3.14;
    //String radius = JOptionPane.showInputDialog(new JFrame(),"Enter the radius of the cycle: ");
    //Radius is a property and we don't calculate it, but give it a value
    protected Float radius = 7.21f;
    private Float diameter;
    private double circumference;
    protected double area;
    
    public void calculateDiameter()
    {
        diameter = 2 * radius;
        //JOptionPane.showMessageDialog(new JFrame(), "The Diameter is : " + diameter);        
    }
    
    public void calculateCircumference()
    {
        circumference = (2 * 3.14) * radius;
        //JOptionPane.showMessageDialog(new JFrame(), "The Circumference is : " + circumference);
    }
    
    public void calculateArea()
    {
        area = 3.14 * (radius * radius);
        //JOptionPane.showMessageDialog(new JFrame(), "The Area is : " + area); 
    }   

    public void showCharacterists()
    {
        calculateDiameter();
        calculateCircumference();
        calculateArea();
    }
    //toString is only use to print the attributes of the class and not running methods
    //thus we created another method to run those methods above
    
    @Override
    public String toString() 
    {
        return "Circle{" + "radius=" + radius + ", diameter=" + diameter + ", circumference=" + circumference + ", area=" + area + '}';
    }          
}
