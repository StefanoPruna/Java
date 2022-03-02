
package abstractclass;

//AN ABSTRACT CLASS HAS AT LEAST ONE METHOD THAT IS ABSTRACT
//ABSTRACT METHOD IS A METHOD THAT DOES NOT HAVE IMPLEMENTATION
//PERSON IS AN ABSTRACT CLASS
//WE USE ABSTRACT CLASSES WHEN WE WANT TO FORCE TO USE METHOD/S OTHER CLASSES
//BUT THEY DON'T HAVE SOMETHING IN COMMON

public class AbstractClass {

    public static void main(String[] args) 
    {
        Smoker smoker = new Smoker();
        //smoker.hello();
        
        Healthy healthy = new Healthy();
        //healthy.speak();
        healthy.aPersonSpeakInDifferentWay();
        
//        Person person = new Person();
//        person.hello();
//        person.speak();
        
        //Polymorphism
        //I'm treating newPerson from Person class as a smoker
        //smoker is a Person now because Smoker is an EXTENTION of Person
        //and I'm calling the hello method from Smoker and not from Person, because it's in both 
        //while the sickness method is not in Person class
        Person newPerson = smoker; //or Person newPerson = new Smoker();
        //newPerson.hello();
        //newPerson.speak();   
        newPerson.aPersonSpeakInDifferentWay();
    }    
}
