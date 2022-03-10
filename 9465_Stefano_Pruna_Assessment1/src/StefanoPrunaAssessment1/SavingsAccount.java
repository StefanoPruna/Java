
package StefanoPrunaAssessment1;

public class SavingsAccount extends ATM implements Interest
{
    //Daily time is rate / 365
    //Interest = principal * rate * time   
    //Inherited the data types/variable and method from ATM and the interface Interest

    public SavingsAccount(Integer withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }
    
    //Constructor
    public SavingsAccount(Float howMuchWithdraw, Integer withdrawLimit, Float principal, Integer deposit) {
        super(howMuchWithdraw, withdrawLimit, principal, deposit);
    }

    //all the get and set
    public Integer getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(Integer withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }

    public Float getRate() {
        return rate;
    }

    public void setRate(Float rate) {
        this.rate = rate;
    }

    public Float getInterest() {
        return interest;
    }

    public void setInterest(Float interest) {
        this.interest = interest;
    }

    public Float getTime() {
        return time;
    }

    public void setTime(Float time) {
        this.time = time;
    }

    @Override
    public Float checkAmountWithdraw() 
    {
        //Check if the test allows to use only the 20, 50 and 100 notes
        if (howMuchWithdraw == 20 || howMuchWithdraw == 50 || howMuchWithdraw == 100)
            principal -= howMuchWithdraw - deposit;//add the deposit and reduce the cash withdraw to the principal
        else
        {
            System.out.println("you have inserted the wrong value");
            //add the deposit to the principal
            principal += deposit;
            return 0f;
        }
                  
        //and return how much withdraw
        return howMuchWithdraw;         
    }

    @Override
    public Float calculateInterest() 
    {
        //Interest calculation
        rate = 0.0155f;
        time = rate / 365;
        interest = principal * rate * time;
        balance = principal + interest;
        
        //and return the final balance with the withdraw, deposit and interest
        return principal * rate * time;
    }

    //I added the withdraw limit as the user can choose it in this account
    @Override
    public String toString() {
        return "ATM{" + "You have withdrew: $" + checkAmountWithdraw() + "\nThe withdraw limit is: $" + withdrawLimit + "\nYou have deposited: $" + deposit
                + "\nThe current balance is: " + principal + "\nYour interest is $" + calculateInterest() + "\nAnd your balance is: $" + balance + '}';
    }    
}
