
package StefanoTut4Task2;

public class Main {

    public static void main(String[] args)
    {
        Sphere newSphere = new Sphere();
        System.out.println(newSphere.toString());

        Cylinder newCylinder = new Cylinder(50f);
        System.out.println(newCylinder.toString());

        Circle newCircle = new Circle();
        System.out.println(newCircle.toString());

        Square newSquare = new Square(60f);
        System.out.println(newSquare.toString());

        Rectangle newRectangle = new Rectangle(50f, 30f);
        System.out.println(newRectangle.toString());  
    }    
}
