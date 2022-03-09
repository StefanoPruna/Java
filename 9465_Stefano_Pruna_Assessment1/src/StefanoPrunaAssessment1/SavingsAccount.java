
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
    public SavingsAccount(Integer howMuchWithdraw, Integer withdrawLimit, Float principal, Integer deposit) {
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
        if (howMuchWithdraw == 20 || howMuchWithdraw == 50 || howMuchWithdraw == 100)
            principal -= howMuchWithdraw;
        else
            System.out.println("you have inserted the wrong value");
        
        principal += deposit;
        return principal;         
    }

    @Override
    public Float calculateInterest() 
    {
        rate = 0.0155f;
        time = rate / 365;
        interest = principal * rate * time;
        balance = principal + interest;
        return balance;
    }

    //I added the withdraw limit as the user can choose it in this account
    @Override
    public String toString() {
        return "ATM{" + "howMuchWithdraw=" + howMuchWithdraw + ", WithdrawLimit=" + withdrawLimit + ", principal=" + principal + ", deposit=" + deposit + " " +
                + checkAmountWithdraw() + " Your interest is $" + calculateInterest() + " and your balance is: $" + balance + '}';
    }    
}
