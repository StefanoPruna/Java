/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//THIS IS A  CLASS RELATED TO TestOne.java file
package testone;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Test 
{
        /*creating a method/function
        void because we don't return anything
       */
    public void questionOne()
    {        
        int firstNumber, secondNumber;        
        JOptionPane.showMessageDialog(new JFrame(), "Show a message ");
        String age = JOptionPane.showInputDialog(new JFrame(),"Insert the first number: ");
        JOptionPane.showMessageDialog(new JFrame(),"the number you have inserted is " + age);
        System.out.println(age);
        /*
        to sum two integer variables:
        int total = Integer.valueOf(valueOne) + Integer.valueOf(value2);
        */
        //System.exit(0);
    }
    
    public void questionThree()
    {
        System.exit(0);
    }
    
}
