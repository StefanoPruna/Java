
package StefanoTutorial4Task1;

public abstract class Poly 
{
    protected String name, colour;

    public Poly() {
    }

    public Poly(String name, String colour) {
        this.name = name;
        this.colour = colour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
    
     public abstract Float calculateArea();

    @Override
    public String toString() {
        return "Poly{" + "name=" + name + ", colour=" + colour + '}';
    }
}
