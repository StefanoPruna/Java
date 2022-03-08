
package StefanoTut3;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Tut3Task4Cylinder extends Tutorial3Task3
{
    //private Integer height;

    @Override
    public void calculateArea() 
    {
        String height = JOptionPane.showInputDialog(new JFrame(),"Enter the height of the cylider: ");
        Double cylinder = (3.14 * radius * radius) + Integer.valueOf(height);
        JOptionPane.showMessageDialog(new JFrame(), "The Cylinder is : " + cylinder); 
    }        
}
