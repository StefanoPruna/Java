package javaExpression;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

//POJO stands for Plain Old Java Object

public class Pets 
{
    /*data type with lower case are primitive datatypes, 
    otherwise with capital letter are non primitive datatypes
    they are also classes in Java*/
    int legsNumber2;
    long value1;
    Long value2;
    float value3;
    Float value4;
    
    /*When the var or class is private, we have to use the 
    Accessor(getters as they get information and 
    Mutator(setters as they set information)
    to the private class, but
    if we use private, we cannot call it outside of this class,
    unless we create the get and set like below*/
    private String name;
    protected String category;
    protected Integer legsNumber;

    //Empty Constructor that I MUST create with the Constructor below
    public Pets() {
    }    
    
    //This is a Constructor, because it has the same name as the class
    public Pets(String name, String category, Integer legsNumber) {
        this.name = name;
        this.category = category;
        this.legsNumber = legsNumber;
    }
    
    String getName()
    {
        return name;
    }
    
    void setName(String petName)
    {
        //name is private now, so we have to use another String
        name = petName;
        //name += " Wan";
    }
    
    /*
    another way to set and get quicker:
    right click on empty space
    select "Insert code"
    select Getter and Setter...
    Choose the var/class that you want to implement
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    */

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Integer getLegsNumber() {
        return legsNumber;
    }

    public void setLegsNumber(Integer legsNumber) {
        this.legsNumber = legsNumber;
    }
    
    
    void run() {
        //name = "Obi";
        System.out.println(name + " is running");
        
        /*
        value2.equals(this)
        you cannot do it with value1 for example
        */
    }
    
    protected void breathe()
    {
        System.out.println(name + " is breathing");
    }

//    even here, I right click on empty space, insert code
//    and select toString to autogenerate the printout       
    @Override
    public String toString() {
        return "Pets{" + "name=" + name + ", category=" + category + ", legsNumber=" + legsNumber + '}';
    } 
}
