
package StefanoTut3;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Tutorial3Task3
{
    //private Double pi = 3.14;
    //String radius = JOptionPane.showInputDialog(new JFrame(),"Enter the radius of the cycle: ");
    //Radius is a property and we don't calculate it, but give it a value
    protected Float radius = 7.21f;
    
    //I don't need to create the variable, but the method will be enough
//    private double circumference;
//    protected double area;
    
    public float calculateDiameter()
    {
        //diameter = 2 * radius; is wrong, I don't need to store the data in here
        return 2 * radius;
        //JOptionPane.showMessageDialog(new JFrame(), "The Diameter is : " + diameter);        
    }
    
    public double calculateCircumference()
    {
        return radius * (2 * 3.14);
        //JOptionPane.showMessageDialog(new JFrame(), "The Circumference is : " + circumference);
    }
    
    public double calculateArea()
    {
        return 3.14 * radius * radius;
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
