/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assessment1test;

/**
 *
 * @author makem
 */
public class Net extends ATM
{

    public Net() {
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
        System.out.println(principal);
        rate = 0.02f;
        time = 1/12f;
        
        interest = principal * rate * time; 
     
        System.out.println("The monthly Interest is: " + interest);
        System.out.println("And your balance at the end of the month is: " + (principal + interest));
    }
    
}
