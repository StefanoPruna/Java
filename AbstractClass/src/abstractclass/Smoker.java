
package abstractclass;

public class Smoker extends Person
{
    //this method is the same for Healthy class, 
    //therefore, I have implement a new class that use the same method
    public void hello()
    {
        System.out.println("Smoking is bad");
    }
    
    public void sickness()
    {
        System.out.println("I'm sick after smoking");
    }
    
    //BECAUSE PERSON CLASS HAS AN ABSTRACT METHOD, I MUST HAVE HERE TOO
    //BECAUSE IT'S  EXTENDED TO PERSON
    public void aPersonSpeakInDifferentWay()
    {
        System.out.println("Ciao");
    } 

    @Override
    public void eat() 
    {
        System.out.println("A lot");
    }    
}
