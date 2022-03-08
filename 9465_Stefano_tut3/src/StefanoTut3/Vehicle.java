
package StefanoTut3;


public class Vehicle 
{
    //Setting as protected, all the extends of Vehicle, can use the protected datatypes 
    //To use the private datatypes, I have to use get..()
    //When printing, or set values
    private String colour;
    private Integer actualSpeed;
    protected Integer actualGear;

    public Vehicle() {
    }

    public Vehicle(String colour, Integer actualSpeed, Integer actualGear) {
        this.colour = colour;
        this.actualSpeed = actualSpeed;
        this.actualGear = actualGear;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public Integer getActualSpeed() {
        return actualSpeed;
    }

    public void setActualSpeed(Integer actualSpeed) {
        this.actualSpeed = actualSpeed;
    }

    public Integer getActualGear() {
        return actualGear;
    }

    public void setActualGear(Integer actualGear) {
        this.actualGear = actualGear;
    }

    @Override
    public String toString() {
        return "Vehicle{" + "colour=" + colour + ", actualSpeed=" + actualSpeed + ", actualGear=" + actualGear + '}';
    }
    
}
