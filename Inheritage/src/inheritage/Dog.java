
package inheritage;


public class Dog extends Animal
{

    protected String type;
    
    public Dog() {
    }

    public Dog(String name, Integer age, String type) {
        super(name, age);        
    }    

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

//    @Override
//    public String toString() {
//        return super.toString(); //To change body of generated methods, choose Tools | Templates.
//    } 
}
