
package StefanoPrunaAssessment1;


public class NetSavingAccount extends ATM implements Interest
{
    //Monthly interest is higher than the daily ones
    //There is a pre-set limit to withdraw
    //Time is 1/12
    //Inherited the data types/variable and method from ATM and from the Interface Interest
    
    public NetSavingAccount()
    {
        
    }

    public NetSavingAccount(Integer howMuchWithdraw, Integer withdrawLimit, Float principal, Integer deposit) {
        super(howMuchWithdraw, withdrawLimit, principal, deposit);
    }   

    public Integer getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(Integer withdrawLimit) {
        this.withdrawLimit = 1000;
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
            principal -= howMuchWithdraw;
        else
        {
            System.out.println("you have inserted the wrong value");
            return principal;
        }
        
        //add the deposit to the principal
        principal += deposit;
        
        //and return the balance
        return principal;  
    }

    @Override
    public Float calculateInterest() 
    {
        rate = 0.02f;
        time = 1/12f;
        interest = principal * rate * time;
        balance = principal + interest;
        
        //and return the final balance with the withdraw, deposit and interest
        return principal * rate * time;
    }

    @Override
    public String toString() {
        return "ATM{" + "You have withdrew: $" + howMuchWithdraw + "\nYou have deposited: $" + deposit + "\nThe current balance is: " + checkAmountWithdraw() +
                "\nYour interest is $" + calculateInterest() + "\nAnd your final balance is: $" + balance + '}';
    }
       
}
