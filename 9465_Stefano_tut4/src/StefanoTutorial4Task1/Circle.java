
package StefanoTutorial4Task1;

import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class Circle extends Poly
{
    private String radius;
    private Double pi = 3.14;
    private Double area;
    
    @Override
    public void caluclateArea() 
    {
        radius = JOptionPane.showInputDialog(new JFrame(),"Enter the radius of the cycle: ");
        area = 3.14 * (Integer.valueOf(radius) * Integer.valueOf(radius));
        
        JOptionPane.showMessageDialog(new JFrame(),"the area of the Circle is: " + area);
    }    
}
