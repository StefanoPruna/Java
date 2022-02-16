/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stefano_tut1;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Tutorial1Task3 
{
     public void taskThree()
    {
        String firstNumber = JOptionPane.showInputDialog(new JFrame(),"Insert the first number: ");
        String secondNumber = JOptionPane.showInputDialog(new JFrame(),"Insert the second number: ");
        String thirdNumber = JOptionPane.showInputDialog(new JFrame(),"Insert the third number: ");
        
        int average = (Integer.valueOf(firstNumber) + Integer.valueOf(secondNumber) + Integer.valueOf(thirdNumber)) / 3;
        
        JOptionPane.showMessageDialog(new JFrame(),"the average of the three numbers is: \n" + average);
    } 
}
