/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//THIS IS A  CLASS RELATED TO JavaApplication1.JAVA file

package javaapplication4;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class TutorialOne 
{
       /*creating a method/function
        void because we don't return anything
       */
    public void questionOne()
    {        
        int firstNumber, secondNumber;        
        JOptionPane.showMessageDialog(new JFrame(), "Insert the first number: ");
        String age = JOptionPane.showInputDialog(new JFrame(),"Insert the first number: ");
        JOptionPane.showMessageDialog(new JFrame(),age);
        System.out.println(age);
        /*
        to sum two integer variables:
        int total = Integer.valueOf(valueOne) + Integer.valueOf(value2);
        */
        //System.exit(0);
    }
    
    public void questionTwo()
    {
        System.out.println("Test one");
        int myAge = 12; //primitive data type
        //String is a data type and it can be a method too
        String name = "stefano"; 
        name.toUpperCase();
        System.out.print("My age is " + myAge);
        System.out.println("this line is not in the next line");
    }
    
    public void questionThree()
    {
        System.exit(0);
    }
}
