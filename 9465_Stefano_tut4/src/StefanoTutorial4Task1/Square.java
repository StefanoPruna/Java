
package StefanoTutorial4Task1;

import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class Square extends Poly
{
    private String size;
    private Integer squareSize;
    
    @Override
    public void caluclateArea() 
    {
        size = JOptionPane.showInputDialog(new JFrame(),"Enter the side of the square: ");
        
        squareSize = Integer.valueOf(size) * Integer.valueOf(size);
                
        JOptionPane.showMessageDialog(new JFrame(),"the size of the Square is: " + squareSize);
    }
}
