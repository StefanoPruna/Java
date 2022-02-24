
package inheritage;

//Tiger is a subclass of Cat
public class Tiger extends Cat
{
    //Because it's private, Cat class cannot call these datatypes
    //But Tiger class can call any methods from Cat and Animal classes
    private String gender;
    private Integer countGender = 0;

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getCountGender() {
        return countGender;
    }

    public void setCountGender(Integer countGender) {
        this.countGender = countGender;
    }

    public void whatGender()
    {
        countGender++;
    }    
    //In here we choose insert code-override method from Animal method
    @Override
    public void sleep() {
        //super.sleep(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("The tiger is sleeping");
    }
    
}
