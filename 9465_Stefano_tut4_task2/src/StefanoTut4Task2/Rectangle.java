
package StefanoTut4Task2;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Rectangle extends Square implements Shape2D
{    
    private String secondSide;
    public Rectangle() {
    }

    public Rectangle(String side, Integer size, Double diameter, Integer circumference) {
        super(side, size, diameter, circumference);
    }

    @Override
    public void calculateCircumference() 
    {
        side = JOptionPane.showInputDialog(new JFrame(),"Enter the side of the rectangular: ");
        secondSide = JOptionPane.showInputDialog(new JFrame(),"Enter the second side of the rectangular: ");
        circumference = 2 * (Integer.valueOf(side) + Integer.valueOf(secondSide));
    }
    
    @Override
    public void calculateDiameter() 
    {
        diameter = Integer.valueOf(circumference) / 3.14;
        JOptionPane.showMessageDialog(new JFrame(),"the diameter of the rectangular is: " + diameter);
    }
    
    @Override
    public void calculateArea() 
    {
        size = Integer.valueOf(side) * Integer.valueOf(secondSide);
                
        JOptionPane.showMessageDialog(new JFrame(),"the size of the rectangular is: " + size);
    }
         
    @Override
    public void showCharacteristcs() 
    {
        calculateCircumference();     
        calculateDiameter();
        calculateArea();
    }    
}
