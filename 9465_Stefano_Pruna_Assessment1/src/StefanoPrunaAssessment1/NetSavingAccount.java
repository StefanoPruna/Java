
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
    public Float checkAmountWithdraw() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Float calculateInterest() 
    {
        rate = 0.02f;
        time = 1/12f;
        return principal * rate * time;
    }

    @Override
    public String toString() {
        return "ATM{" + "howMuchWithdraw=" + howMuchWithdraw + ", principal=" + principal + ", deposit=" + deposit + 
                "Your interest is $" + calculateInterest() + '}';
    }
       
}
