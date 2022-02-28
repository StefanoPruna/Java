
package StefanoTut3;

//this is an extension/subclass of LandVehicle class
public class StefanoTut3Task2 extends LandVehicle
{
    private String name;
    private String gearType;

    public StefanoTut3Task2() {
    }

    public StefanoTut3Task2(String name, String gearType) {
        this.name = name;
        this.gearType = gearType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGearType() {
        return gearType;
    }

    public void setGearType(String gearType) {
        this.gearType = gearType;
    }

    //I want to print these specific datatypes when calling this class
    @Override
    public String toString() {
        return "MotorBike{" + "name=" + name + ", gearType=" + gearType + '}';
    }      
}
