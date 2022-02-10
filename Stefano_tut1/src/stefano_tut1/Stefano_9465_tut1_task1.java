/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stefano_tut1;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

//I could not put the student id at the front, it doesn't allow
public class Stefano_9465_tut1_task1 
{
    public void taskOne()
    {
        //int firstNumber, secondNumber; 
        String firstNumber = JOptionPane.showInputDialog(new JFrame(),"Insert the first number: ");
        String secondNumber = JOptionPane.showInputDialog(new JFrame(),"Insert the second number: ");
        
        int total = Integer.valueOf(firstNumber) + Integer.valueOf(secondNumber);
        
        JOptionPane.showMessageDialog(new JFrame(),"the sum of the two numbers is: \n" + total);
        
        //System.exit(0);
    }
}
