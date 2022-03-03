
package StefanoTut4Task2;

public class Main {

    public static void main(String[] args)
    {
        Sphere newSphere = new Sphere();
        newSphere.calculateVolume();
        
        Cylinder newCylinder = new Cylinder();
        newCylinder.calculateVolume();  
        
        Circle newCircle = new Circle();
        newCircle.showCharacteristcs();
        
        Square newSquare = new Square();
        newSquare.showCharacteristcs();
        
        Rectangle newRectangle = new Rectangle();
        newRectangle.showCharacteristcs();      
    }    
}
