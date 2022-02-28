
package StefanoTut3;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Tut3Task4Sphere extends Tutorial3Task3
{
    @Override
    public void calculateArea() 
    {
        String curve = JOptionPane.showInputDialog(new JFrame(),"Enter the curve of the Sphere: ");
        int sphere = (int) (3.14 * (Integer.valueOf(radius) * Integer.valueOf(radius))) + Integer.valueOf(curve);
        JOptionPane.showMessageDialog(new JFrame(), "The Sphere is : " + sphere); 
    }    
}
