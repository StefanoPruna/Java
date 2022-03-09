
package StefanoTutorial4Task1;

import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class Circle extends Poly
{
    //area = 3.14 * (Integer.valueOf(radius) * Integer.valueOf(radius));
    private Float radius = 7.21f;
    private Float pi = 3.14f;
    //private Double area;

    public Circle() {
    }

    public Circle(String name, String colour) {
        super(name, colour);
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
    public Float calculateArea() 
    {
        return pi * (radius * radius);
    }

    @Override
    public String toString() 
    {
        return "Poly{" + "name=" + name + ", colour=" + colour + ". The area of the Circle is " + calculateArea() + '}';
    }

    
    
    
    
}
