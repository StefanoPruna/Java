
package StefanoPrunaAssessment1;


public abstract class ATM 
{
    //Data types and method that will be extended to the other classes
    //protected data types that all classes are using them:
    protected Float howMuchWithdraw;    
    protected Float principal;
    protected Integer deposit;
    protected Float balance;
    
    //private data types that not all classes are using these
    private Integer withdrawLimit;
    private Float rate;
    private Float interest;
    private Float time; 

    public ATM(Float howMuchWithdraw, Integer withdrawLimit, Float principal, Integer deposit) {
        this.howMuchWithdraw = howMuchWithdraw;
        this.withdrawLimit = withdrawLimit;
        this.principal = principal;
        this.deposit = deposit;
    }
    
    public ATM() {
    }

    public Float getBalance() {
        return balance;
    }

    public void setBalance(Float balance) {
        this.balance = balance;
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

    public Float getHowMuchWithdraw() {
        return howMuchWithdraw;
    }

    public void setHowMuchWithdraw(Float howMuchWithdraw) {
        this.howMuchWithdraw = howMuchWithdraw;
    }

    public Integer getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(Integer withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }

    public Float getPrincipal() {
        return principal;
    }

    public void setPrincipal(Float principal) {
        this.principal = principal;
    }

    public Integer getDeposit() {
        return deposit;
    }

    public void setDeposit(Integer deposit) {
        this.deposit = deposit;
    }

    public abstract Float checkAmountWithdraw();

    @Override
    public String toString() {
        return "ATM{" + "howMuchWithdraw=" + howMuchWithdraw + ", withdrawLimit=" + withdrawLimit + ", principal=" + principal + ", deposit=" + deposit + '}';
    }    
}
