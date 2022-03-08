
package SteanoPrunaAssessment1;

public abstract class ATM 
{
    protected Float withdraw;
    protected Float deposit;
    protected Float principal;
    //Limit is set by the user
    protected Integer withdrawLimit;
    public Float rate;
    protected Float interest;
    protected Float time;
    
    public abstract void calculateInterest();    
}
