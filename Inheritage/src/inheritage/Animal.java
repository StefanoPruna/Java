
package inheritage;

public class Animal 
{
    private String name;
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

    @Override
    public String toString() {
        return "Animal{" + "name=" + name + ", age=" + age + '}';
    }
}
