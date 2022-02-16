package javaExpression;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

//POJO stands for Plain Old Java Object

public class Pets 
{
    String name;
    String category;
    Integer legsNumber;
    
    void run()
    {
        //name = "Obi";
        System.out.println(name + " is running");
    }
    
    void breathe()
    {
        System.out.println(name + " is breathing");
    }
}
