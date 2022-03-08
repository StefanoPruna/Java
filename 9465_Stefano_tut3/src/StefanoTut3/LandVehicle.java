
package StefanoTut3;

//This class inherits, or extends to Vehicle class
public class LandVehicle extends Vehicle
{
    protected Integer numberWheels;  
    
    public LandVehicle() 
    {
    }

    public LandVehicle(Integer numberWheels) {
        this.numberWheels = numberWheels;
    }

    public LandVehicle(Integer numberWheels, String colour, Integer actualSpeed, Integer actualGear) {
        super(colour, actualSpeed, actualGear);
        this.numberWheels = numberWheels;
    }
    
}
