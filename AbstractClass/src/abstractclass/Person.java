
package abstractclass;

//THIS IS AN ABSTRACT CLASS, BECAUSE THERE IS AT LEAST ONE ABTRACT METHOD

public abstract class Person 
{
    public abstract void aPersonSpeakInDifferentWay();
    
    
    public void hello()
    {
        System.out.println("If I smoke, I feel bad");
    }    
    
    public abstract void eat();
    
    public void speak()
    {
        System.out.println("I don't eat if I smoke");
    }
}
