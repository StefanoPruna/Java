
package StefanoTut4Task2;

import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class Cylinder extends Circle implements Shape3D
{
    //calculate the area= ((2*3.14) * (radius * radius)) + height((2*3.14)*radius))
    //radius = circumference/(2*)
    //volume = area * height
    private String height;

    public Cylinder() {
    }

    public Cylinder(String height) {
        this.height = height;
    }

    @Override
    public void calculateVolume() 
    {
        height = JOptionPane.showInputDialog(new JFrame(),"Enter the height of the cylinder: ");
        
        volume = (3.14 * Integer.valueOf(radius)) * (Integer.valueOf(radius)) * Integer.valueOf(height); 
        
        JOptionPane.showMessageDialog(new JFrame(), "The Volume of the Cylinder is : " + volume);        
    }
    
}
