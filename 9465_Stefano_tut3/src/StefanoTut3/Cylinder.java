
package StefanoTut3;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Cylinder extends Circle
{
    //private Integer height;

    @Override
    public void calculateArea() 
    {
        String height = JOptionPane.showInputDialog(new JFrame(),"Enter the height of the cylider: ");
        int cylinder = (int) (3.14 * (Integer.valueOf(radius) * Integer.valueOf(radius))) + Integer.valueOf(height);
        JOptionPane.showMessageDialog(new JFrame(), "The Cylinder is : " + cylinder); 
    }    
}
