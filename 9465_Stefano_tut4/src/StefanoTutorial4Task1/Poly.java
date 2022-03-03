
package StefanoTutorial4Task1;

public abstract class Poly 
{
    protected String name, colour;
    
    public abstract void caluclateArea();

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
}
