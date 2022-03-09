
package StefanoTut4Task2;

import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class Square implements Shape2D
{
    protected Float side;

    public Square() {
    }

    public Square(Float side) {
        this.side = side;
    }

    public Float getSide() {
        return side;
    }

    public void setSide(Float side) {
        this.side = side;
    }

    @Override
    public Float calculateCircumference() 
    {          
        return side * 4;
    }    
    
    @Override
    public Float calculateDiameter() 
    {
        return side * 1.4f;
    }

    @Override
    public Float calculateArea() 
    {        
        return side * side;
    }

    @Override
    public Float showCharacteristcs() 
    {     
        return calculateArea();
    }  

    @Override
    public String toString() 
    {
        return "Square{" + "side=" + side + "The Diameter of the Circle is: " + calculateDiameter() + "\nThe circumference is: " + calculateCircumference() +
                "\nAnd the area of the Square is: " + showCharacteristcs() + '}';
    }
}
