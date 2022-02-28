
package StefanoTut3;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class StefanoTut3 {

    
    public static void main(String[] args) 
    {
        //TASK 3 
        Tutorial3Task3 calculate = new Tutorial3Task3();
        System.out.println(calculate.toString());
        JOptionPane.showMessageDialog(new JFrame(), "The Circumference is : " + calculate.toString());
                
        //TASK 4
        Tut3Task4Cylinder calculateCylinder = new Tut3Task4Cylinder();
        calculateCylinder.calculateArea();
        
        Tut3Task4Sphere calculateSphere = new Tut3Task4Sphere();
        calculateSphere.calculateArea();
        
        System.exit(0);
    }
    
}
