
package StefanoTut3;


public class Main {

    
    public static void main(String[] args) 
    {
        /*
        Helpful tips in order:
        Use private vars/classes
        Use The constructor with parameters and its empty constructor
        Use the Getters and Setters
        Use the Override toString method
        */
        
        //Tests for Task1; I can add values in one line,
        //because I have added the constructors, getter, setter and the override toString in the Bicycle and LandVehicle classes
        Vehicle carOne = new Vehicle("black", 200, 5, 4);
        LandVehicle jeep = new LandVehicle("Green", 180, 6, 4);
        Bicycle bike = new Bicycle("Aluminium", 3, 7, "Black and White", 40, 21, 2);
        
        System.out.println(carOne.toString());
        System.out.println(jeep.toString());
        System.out.println(bike.toString());      
        
        //Test for Task2
        //I only want to print the specific datatypes for this class
        StefanoTut3Task2 motorBike = new StefanoTut3Task2("Schooter", "Automatic");
        System.out.println(motorBike.toString());
    }    
}
