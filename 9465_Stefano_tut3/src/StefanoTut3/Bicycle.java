
package StefanoTut3;

//This class inherits, or extends to Vehicle class
public class Bicycle extends LandVehicle
{
    //These vars/datatypes are specifically for Bicycle class only
    private String frameMaterial;
    private Integer numberCogsFront;
    private Integer numberCogsBack;

    public Bicycle() {
    }

    /*super is referring to the superclass Vehicle
      With the Constructor, I can add the values in one line in the Main class
    */

    public Bicycle(String frameMaterial, Integer numberCogsFront, Integer numberCogsBack, Integer numberWheels, String colour, Integer actualSpeed, Integer actualGear) {
        super(numberWheels, colour, actualSpeed, actualGear);
        this.frameMaterial = frameMaterial;
        this.numberCogsFront = numberCogsFront;
        this.numberCogsBack = numberCogsBack;
    }
    
    public String getFrameMaterial() {
        return frameMaterial;
    }

    public void setFrameMaterial(String frameMaterial) {
        this.frameMaterial = frameMaterial;
    }

    public Integer getNumberCogsFront() {
        return numberCogsFront;
    }

    public void setNumberCogsFront(Integer numberCogsFront) {
        this.numberCogsFront = numberCogsFront;
    }

    public Integer getNumberCogsBack() {
        return numberCogsBack;
    }

    public void setNumberCogsBack(Integer numberCogsBack) {
        this.numberCogsBack = numberCogsBack;
    }

    //In this way, I can also print these values only for the Bicycle class
    //I have to use getColour and getActualSpeed, because they are set as private in Vehicle,
    //While the others are set as protected
    @Override
    public String toString() {
        return "Bicycle{" + "colour=" + getColour() + ", actualSpeed=" + getActualSpeed() + ", actualGear=" + actualGear + ", numberWheels=" + numberWheels + 
                ", frameMaterial=" + frameMaterial + ", numberCogsFront=" + numberCogsFront + ", numberCogsBack=" + numberCogsBack + '}';
    }    
}
