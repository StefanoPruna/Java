
package StefanoTut4Task2;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Rectangle extends Square implements Shape2D
{   
    private Float secondSide;
    private Float circumference;
    
    public Rectangle() {
    }

    public Rectangle(Float secondSide) {
        this.secondSide = secondSide;
    }

    public Rectangle(Float secondSide, Float side) {
        super(side);
        this.secondSide = secondSide;
    }

    public Float getSecondSide() {
        return secondSide;
    }

    public void setSecondSide(Float secondSide) {
        this.secondSide = secondSide;
    }

    public Float getCircumference() {
        return circumference;
    }

    public void setCircumference(Float circumference) {
        this.circumference = circumference;
    }


    @Override
    public Float calculateCircumference() 
    {
        circumference = 2 * (side + secondSide);
        return circumference;
    }
    
    @Override
    public Float calculateDiameter() 
    {
        return circumference / 3.14f;
    }
    
    @Override
    public Float calculateArea() 
    {
        return side * secondSide;
    }
         
    @Override
    public Float showCharacteristcs() 
    {
        return calculateArea();
    }  

    @Override
    public String toString() {
        return "Rectangle{" + "side=" + side + ", secondSide=" + secondSide + "\nThe circumference is: " + calculateCircumference()+ "\nThe Diameter of the Rectangle is" +
                calculateDiameter() + "\nAnd the Area of the Rectangle is: " + showCharacteristcs() + '}';
    }
}
