
package StefanoTut2;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Tutorial2Task2 
{
    public void taskTwo()
    {
        String examMarks = JOptionPane.showInputDialog(new JFrame(),"Enter your exam marks: ");
        
        if (Integer.valueOf(examMarks) < 50)
            JOptionPane.showMessageDialog(new JFrame(),"Your grade is FAIL");            
        else if (Integer.valueOf(examMarks) >= 50 && Integer.valueOf(examMarks) < 65)
            JOptionPane.showMessageDialog(new JFrame(),"Your grade is PASS"); 
        else if (Integer.valueOf(examMarks) >= 65 && Integer.valueOf(examMarks) < 75)
            JOptionPane.showMessageDialog(new JFrame(),"Your grade is CREDIT"); 
        else if (Integer.valueOf(examMarks) >= 75 && Integer.valueOf(examMarks) < 85)
            JOptionPane.showMessageDialog(new JFrame(),"Your grade is DISTINCTION"); 
        else
            JOptionPane.showMessageDialog(new JFrame(),"Your grade is HIGH DISTINCTION");        
    }    
}
