
package StefanoTut4Task2;

import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class Circle implements Shape2D
{
    private Double pi = 3.14;
    protected Double area;
    private int diameter;
    private Double circumference;
    protected Double volume;
    
    protected String radius = JOptionPane.showInputDialog(new JFrame(),"Enter the radius of the cycle: ");

    public Circle() {
    }

    public Circle(Double area, int diameter, Double circumference) {
        this.area = area;
        this.diameter = diameter;
        this.circumference = circumference;
    }

    @Override
    public void calculateDiameter() 
    {
        diameter = 2 * (Integer.valueOf(radius));
        JOptionPane.showMessageDialog(new JFrame(), "The Diameter is : " + diameter);
    }

    /**
     *
     */
    @Override
    public void calculateCircumference() 
    {
        circumference = (2 * 3.14) * Integer.valueOf(radius);
        JOptionPane.showMessageDialog(new JFrame(), "The Circumference is : " + circumference);
    }

    @Override
    public void calculateArea() 
    {
        area = (3.14 * (Integer.valueOf(radius) * Integer.valueOf(radius)));
        JOptionPane.showMessageDialog(new JFrame(), "The Area is : " + area); 
    }

    @Override
    public void showCharacteristcs() 
    {
        calculateDiameter();
        calculateCircumference();
        calculateArea();
    }     
    
}
