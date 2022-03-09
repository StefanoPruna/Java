
package StefanoTutorial4Task1;

import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class Square extends Poly
{
    //squareSize = size * size;
    
    private Float size;
    //private Integer squareSize;

    public Square() {
    }

    public Square(Float size) {
        this.size = size;
    }

    public Square(Float size, String name, String colour) {
        super(name, colour);
        this.size = size;
    }

    public Float getSize() {
        return size;
    }

    public void setSize(Float size) {
        this.size = size;
    }


    @Override
    public Float calculateArea() 
    {
        return size * size;
    }

    @Override
    public String toString() 
    {
        return "Poly{" + "name=" + name + ", colour=" + colour + ", size=" + size + ". The area of the square is " + calculateArea() + '}';
    }
    
    
}
