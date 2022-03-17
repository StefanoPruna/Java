
package inheritage;


public class Dog extends Animal
{

    private String type;
    
    public Dog() {
    }

    public Dog(String name, Integer age, String type) {
        super(name, age);     
        this.type = type;
    }    

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void sleep() {
        System.out.println("The dog named " + name + " is not sleeping");
    }
    
    

    @Override
    public String toString() {//age is private, so that's why I have to use getAge
        return "Dog{" + "name=" + name + ", age=" + getAge() + ", type=" + type + '}';
    }
}
