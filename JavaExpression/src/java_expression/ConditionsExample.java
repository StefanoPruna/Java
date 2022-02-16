package java_expression;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ConditionsExample
{
    public void conditions()
    {
        int studentsGrade = 70;
        
        if(studentsGrade <= 60)
            System.out.println("You passed");
        else if(studentsGrade >= 61 && studentsGrade <=100)
            System.out.println("You got  a distinction");
    }
}
