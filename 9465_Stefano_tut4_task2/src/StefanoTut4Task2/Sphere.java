
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

    public Sphere(double volume) {
        this.volume = volume;        
    }

    public Sphere(double volume, Double area, int diameter, double circumference) {
        super(area, diameter, circumference);
        this.volume = volume;
    }

    @Override
    public void calculateVolume() 
    {
        //radius = JOptionPane.showInputDialog(new JFrame(),"Enter the radius of the Sphere: ");
        volume = ((Integer.valueOf(radius) * Integer.valueOf(radius) * Integer.valueOf(radius)) * 4 * 3.14) / 3;
        
        JOptionPane.showMessageDialog(new JFrame(), "The Volume of the Sphere is : " + volume);
    }
        
}
