
package SteanoPrunaAssessment1;

public abstract class ATMTest 
{
    //Data types and method that will be extended to the other classes
    protected Boolean withdraw;
    protected Integer howMuchWithdrawing;
    protected String withdrawCheck;
    protected Float principal;
    //Limit is set by the user in the Savings Account
    protected Integer withdrawLimit;
    public Float rate;
    protected Float interest;
    protected Float time;
    
    
    public abstract void calculateInterest();    
}
