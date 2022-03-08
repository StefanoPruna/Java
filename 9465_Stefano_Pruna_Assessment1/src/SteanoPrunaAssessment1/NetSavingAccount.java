
package SteanoPrunaAssessment1;

public class NetSavingAccount extends ATM
{

    //Monthly interest is higher than the daily ones
    //There is a set limit to withdraw
    //Time is 1/12
    
    public NetSavingAccount() {
    }

    public Float getPrincipal() {
        return principal;
    }

    public void setPrincipal(Float principal) {
        this.principal = principal;
    }

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
    public void calculateInterest() 
    {
        principal = 3000f;
        //Withdraw pre-set
        withdrawLimit = 1000;
        rate  = 0.02f;
        time = 1/12f;
        
        interest = principal * rate * time;
        
        System.out.println("The monthly Interest is: " + interest);
        System.out.println("And your balance at the end of this month is: " + (principal + interest));
    }
     
}
