
package StefanoTut2;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Tutorial2Task3 
{
    public void taskThree()
    {
        String citizenship = JOptionPane.showInputDialog(new JFrame(),"Are you an Australian citizen? Yes/No");        
        
        if (citizenship.equals("Yes") || citizenship.equals("yes") || citizenship.equals("YES"))
        {
            String yourAge = JOptionPane.showInputDialog(new JFrame(),"How old are you?");
            if (Integer.valueOf(yourAge) >= 16)
                JOptionPane.showMessageDialog(new JFrame(),"You can apply for a driving license");
            else if (Integer.valueOf(yourAge) < 16)
                JOptionPane.showMessageDialog(new JFrame(),"You cannot apply for a driving license");
        } 
        else
            JOptionPane.showMessageDialog(new JFrame(),"You cannot apply for a driving license");
    }    
}
