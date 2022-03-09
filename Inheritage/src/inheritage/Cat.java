
package inheritage;

//This class inherits, or extends to Animal class
public class Cat extends Animal
{
    private Integer lives;
    private String yo = "old";
    
        //this means I don't have to create anything, because
        //it's already been initiliaze in Animal class, 
        //I can keep this class empty
    
        //we can create the constructors to use it though
    public Cat()
    {
    }
    
    public Cat(String name, Integer age, Integer lives) {
        super(name, age);//super is referring to the superclass Animal
        this.lives = lives;
    }   

    public Integer getLives() {
        return lives;
    }

    public void setLives(Integer lives) {
        this.lives = lives;
    }

    @Override
    public String toString() {//name now is protected, while age is still private in Animal
        return "Cat{" + "name=" + ("mr") + ", age=" + getAge() + ", lives=" + (lives+3)  + '}';
    }
}
