
package StefanoTutorial4Task1;

public class Main {

    public static void main(String[] args) 
    {               
        Square square = new Square(50f, "Square", "Green");
        System.out.println(square.toString());
        
        
        Circle circle = new Circle("Circle", "Red");
        System.out.println(circle.toString());
    }    
}
