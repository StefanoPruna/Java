package javaExpression;

import javax.swing.JOptionPane;
import javax.swing.JFrame;

public class Java_Expression 
{
    public static void main(String[] args) 
    {
        prefixAndPostFix();
        ConditionsExample taskOne = new ConditionsExample();        
        taskOne.conditions();
        loops();
        
        //Initialize a new Object dog with the class Pets
        Pets dog = new Pets();
        dog.name = "Obi";
        dog.run();
    }
    
    private static void prefixAndPostFix()
    {
        int j = 3;
        int i = j++; 
        //the above means i gets the value of j and then add 1 to j, so i is 3 and j is 4
        //int i = ++j;
        //in this case means first add 1 to j and then assign it to i, j is 4 and i is 4
        JOptionPane.showMessageDialog(null, "value of i is: " + i + "and the value of j is: " + j);
    }
    
    private static void loops()
    {
        String command = "q";
        while ("q".equals(command))//or (command.equals("q")) we cannot use == for String in Java
        {
            //I don't need to use String at front, I have assigned the var command before as string
            command = JOptionPane.showInputDialog("Input a command");
            if(command != null || command.isEmpty())//Empty as empty value, if i press ok button without inserting anything
                JOptionPane.showMessageDialog(null, "The computer is executing: " + command);         
            else
                //I handle the null value here
                command = "q";                   
        }
    }
}
