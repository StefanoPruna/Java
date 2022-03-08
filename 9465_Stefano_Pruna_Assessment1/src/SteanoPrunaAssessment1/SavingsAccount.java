
package SteanoPrunaAssessment1;

import java.util.*;

public class SavingsAccount extends ATM
{
    //Daily time is rate / 365
    //Interest = principal * rate * time   
    
    
    public SavingsAccount()
    {
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
    public void calculateInterest() {
        principal = 2000f;
        rate = 0.015f;
        
        time = rate / 365;
        interest = principal * rate * time;
        
        System.out.println("The daily Interest is: " + interest);
        System.out.println("And your balance at the end of the day is: " + (principal + interest));
    }  
    
    public void setLimit()
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("Insert the daily limit to withdraw: ");
       withdrawLimit = sc.nextInt();
       System.out.println("Your new daily limit is " + withdrawLimit);
    }
}
