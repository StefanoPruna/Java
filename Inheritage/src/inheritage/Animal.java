
package inheritage;

public class Animal 
{
    //Setting as protected, all the extend of Animal, can use the String name
    //To use the private Integer age, they have to use getAge()
    protected String name;
    private Integer age;

    //empty constructor
    public Animal() {
    }

    //Constructor
    public Animal(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }  

    public void sleep()
    {
        System.out.println(name + " is sleeping");
    }
    
    @Override
    public String toString() {
        return "Animal{" + "name=" + name + ", age=" + age + '}';
    }
}
