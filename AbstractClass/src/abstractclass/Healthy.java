
package abstractclass;

public class Healthy extends Person
{
    //this method is the same for Smoker class, 
    //therefore, I have implement a new class that use the same method
//    public void hello()
//    {
//        System.out.println("Smoking is bad");
//    }    
    
    public void speak()
    {
        System.out.println("I want to be healthy");
    }
    
    //BECAUSE PERSON CLASS HAS AN ABSTRACT METHOD, I MUST HAVE HERE TOO
    //BECAUSE IT'S  EXTENDED TO PERSON
    public void aPersonSpeakInDifferentWay()
    {
        System.out.println("See ya");
    }
    
    @Override
    public void eat() 
    {
        System.out.println("Organic only");
    }   
}
