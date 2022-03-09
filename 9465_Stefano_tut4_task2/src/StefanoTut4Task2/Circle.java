
package StefanoTut4Task2;

import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class Circle implements Shape2D
{
    protected Float radius = 7.21f;
    protected Float pi = 3.14f; 
    
    public Circle() {
    }

    public Float getRadius() {
        return radius;
    }

    public void setRadius(Float radius) {
        this.radius = radius;
    }

    public Float getPi() {
        return pi;
    }

    public void setPi(Float pi) {
        this.pi = pi;
    }

    @Override
    public Float calculateDiameter() 
    {
        return 2 * radius;
        
    }

    @Override
    public Float calculateCircumference() 
    {
        return (2 * pi) * radius;
    }

    @Override
    public Float calculateArea() 
    {
        return (pi * radius) * radius;
    }

    @Override
    public Float showCharacteristcs() 
    {
        return calculateArea();
    }  

    @Override
    public String toString() {
        return "Circle{" + "The Diameter of the Circle is: " + calculateDiameter() + "\nThe circumference is: " + calculateCircumference() + 
                "\nThe area of the Circle is " + showCharacteristcs() + '}';
    }
}
