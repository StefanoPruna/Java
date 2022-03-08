
package SteanoPrunaAssessment1;

public abstract class ATM 
{
    //Data types and method that will be extended to the other classes
    protected Boolean withdraw;
    protected Integer howMuchWithdrawing;
    protected String withdrawCheck;
    //protected Float deposit;
    protected Float principal;
    //Limit is set by the user
    protected Integer withdrawLimit;
    public Float rate;
    protected Float interest;
    protected Float time;
    
    
    public abstract void calculateInterest();    
}
