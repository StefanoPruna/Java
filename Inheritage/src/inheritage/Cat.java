
package inheritage;

//This class inherits, or extends to Animal class
public class Cat extends Animal
{
        //this means I don't have to create anything, because
        //it's already been initiliaze in Animal class, 
        //I can keep this class empty
    
        //we can create the constructors to use it though
    public Cat()
    {
    }
    
    public Cat(String name, Integer age) {
        super(name, age);//super is referring to the superclass Animal
    }   
}
