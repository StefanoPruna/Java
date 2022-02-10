/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stefano_tut1;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

//I could not put the student id at the front, it doesn't allow
public class Stefano_9465_tut1_task2 
{
    public void taskTwo()
    {
        String firstName = JOptionPane.showInputDialog(new JFrame(),"What's your name?");
        String lastName = JOptionPane.showInputDialog(new JFrame(),"And What's your last name?");
        
        JOptionPane.showMessageDialog(new JFrame(),"Thank you, your name is: \n" + firstName + " " + lastName);
        
        //System.exit(0);
    }
}
