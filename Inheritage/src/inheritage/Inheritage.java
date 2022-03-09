package inheritage;

public class Inheritage {

    public static void main(String[] args)
    {
        /*
        Helpful tips in order
        Use private vars/classes
        Use The constructor with parameters and its empty constructor
        Use the Getters and Setters
        Use the Override toString method
        */
        
        //If we want to use the Subclass Cat, which is empty at this stage
        Cat pet = new Cat();
        pet.setName("Kitty");
        pet.setAge(5);
        pet.setLives(7);
        //Cat petTwo = new Cat("Kitty", 5); it doesn't work, because Cat class is empty
        
        //or if we use the Superclass Animal, it will work
        //Animal pet = new Animal("Kitty", 5);
        
        System.out.println(pet.toString());
        
        //It'll work now, because I have added the constructors, getter, setter and the override toString in the Cat class
        Cat petTwo = new Cat("Yoda", 3, 7);
        Cat petthree = new Cat("Yoda", 63, 67);
        Dog petOne = new Dog("Obi", 3, "short hair");
        //petOne.type = "short hair";
        
        System.out.println(petTwo.toString());
        System.out.println(petOne.toString());
        System.out.println(petthree.toString());
        //System.out.println(petOne.getName() + petOne.getAge() + petOne.getType());
        
        petOne.sleep();
        Tiger petThree = new Tiger();
        petThree.sleep();
    }
}
