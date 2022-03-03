
package StefanoTut4Task2;

import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class Square implements Shape2D
{
    protected String side;
    protected Integer size;
    protected Double diameter;
    protected Integer circumference;

    public Square() {
    }

    public Square(String side, Integer size, Double diameter, Integer circumference) {
        this.side = side;
        this.size = size;
        this.diameter = diameter;
        this.circumference = circumference;
    }

    @Override
    public void calculateCircumference() 
    {
        side = JOptionPane.showInputDialog(new JFrame(),"Enter the side of the square: ");   
        circumference = Integer.valueOf(side) * 4;
    }    
    
    @Override
    public void calculateDiameter() 
    {
        diameter = Integer.valueOf(side) * 1.4;
        JOptionPane.showMessageDialog(new JFrame(),"the diameter of the Square is: " + diameter);
    }

    @Override
    public void calculateArea() 
    {        
        size = Integer.valueOf(side) * Integer.valueOf(side);
                
        JOptionPane.showMessageDialog(new JFrame(),"the size of the Square is: " + size);
    }

    @Override
    public void showCharacteristcs() 
    {        
        calculateCircumference();
        calculateDiameter();
        calculateArea();
    }  
}
