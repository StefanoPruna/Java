
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
        Vehicle carOne = new Vehicle("black", 200, 5);
        LandVehicle jeep = new LandVehicle(4, "green", 150, 6);
        Bicycle bike = new Bicycle("Aluminium", 3, 7, 2, "Black and White", 50, 21);
                
        System.out.println(carOne.toString());
        System.out.println(jeep.toString());
        System.out.println(bike.toString());      
        
        //Test for Task2
        //I only want to print the specific datatypes for this class
        StefanoTut3Task2 motorBike = new StefanoTut3Task2("Schooter", "Automatic");
        System.out.println(motorBike.toString());
    }    
}
