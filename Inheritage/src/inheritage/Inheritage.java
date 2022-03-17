package inheritage;

import java.util.ArrayList;
import java.util.List;

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
        
        List<String> names = new ArrayList();
        names.add("Obi");
        names.add("Ahsoka");
        //names.remove(1); //remove the element in position 3, or index 2
        
        for (int i = 0; i < names.size(); i++)
            System.out.println(names.get(i));
        List<Cat> cats = new ArrayList<>();
        List<Animal> animals = new ArrayList<>();
       
        Cat catOne = new Cat();
        catOne.setName("Kitty");
        Cat catTwo = new Cat();
        catTwo.setName("Yoda");
        Cat catThree = new Cat();
        catThree.setName("Ahsoka");
     
        Tiger newTiger = new Tiger();
        newTiger.setName("test");
        Dog newDog = new Dog();
        newDog.setName("Obi");
     
        animals.add(catTwo);
        animals.add(catThree);
        animals.add(catOne);
        animals.add(newTiger);
//        //it gives error, because Dog class doesn't extend or interface from Cat class as the Tiger does
        //cats.add(newDog);       
//        //But Dogs and Cats extend from Animal, so I will change the list name from cats to animals
        animals.add(newDog);//now it's working
        
        for (int i = 0; i < animals.size(); i++)
        {
            Animal animal = animals.get(i);
            System.out.println(animal.getName());
            animal.sleep();
            catOne.sleep();
            
            
            if(animal instanceof Dog)
            {
                Dog newDogTwo = (Dog) animal;
                newDogTwo.sleep();
            }
        }
//            
//        List<Integer> age = new ArrayList<>();
//        age.add(10);
//        age.add(20); 
    }
}
