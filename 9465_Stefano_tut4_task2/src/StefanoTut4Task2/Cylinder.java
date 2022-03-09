
package StefanoTut4Task2;

import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class Cylinder extends Circle implements Shape3D
{
    //calculate the area= ((2*3.14) * (radius * radius)) + height((2*3.14)*radius))
    //radius = circumference/(2*)
    //volume = area * height
    private Float height;

    public Cylinder(Float height) {
        this.height = height;
    }

    public Cylinder() {
    }

    public Float getHeight() {
        return height;
    }

    public void setHeight(Float height) {
        this.height = height;
    }

   
    @Override
    public Float calculateVolume() 
    {    
        return ((pi * radius) * radius) * height;     
    }

    @Override
    public String toString() {
        return "Cylinder{" + "height=" + height + " The volume of the Cylinder is: " + calculateVolume() + '}';
    }    
}
