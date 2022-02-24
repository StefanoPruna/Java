
package StefanoTut3;

//This class inherits, or extends to Vehicle class
public class LandVehicle extends Vehicle
{
    public LandVehicle() {
    }

    //super is referring to the superclass Vehicle
    public LandVehicle(String colour, Integer actualSpeed, Integer actualGear, Integer numberWheels) {
        super(colour, actualSpeed, actualGear, numberWheels);
    }
    
}
