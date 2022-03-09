
package StefanoTut4Task2;

import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class Sphere extends Circle implements Shape3D
{
    //find radius
    //volume = ((radius * radius * radius) * 4 * 3.14) /3
    //private double volume;
    
    public Sphere() {
    }    

    @Override
    public Float calculateVolume() 
    {        
        return ((radius * radius * radius) * 4 * pi) / 3;
    }

    @Override
    public String toString() 
    {
        return "Circle{" + "The volume of the Sphere is " + calculateVolume() + '}';
    }
        
}
