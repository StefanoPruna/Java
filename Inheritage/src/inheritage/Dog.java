
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
    public String toString() {
        return "Dog{" + "name=" + name + ", age=" + getAge() + ", type=" + type + '}';
    }
}
