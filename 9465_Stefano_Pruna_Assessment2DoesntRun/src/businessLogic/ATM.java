
package businessLogic;


public abstract class ATM 
{
    //Data types and method that will be extended to the other classes
    //protected data types that all classes are using them:
    protected Float howMuchWithdraw;    
    protected Float principal;
    protected Float balance;
    protected Integer amountDeposit;
    
    //private data types that not all classes are using these
    private Integer withdrawLimit;
    private Float rate;
    private Float interest;
    private Float time; 

    public ATM(Float howMuchWithdraw, Float principal, Integer amountDeposit, Integer withdrawLimit) {
        this.howMuchWithdraw = howMuchWithdraw;
        this.principal = principal;
        this.amountDeposit = amountDeposit;
        this.withdrawLimit = withdrawLimit;
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

    public Integer getAmountDeposit() {
        return amountDeposit;
    }

    public void setAmountDeposit(Integer amountDeposit) {
        this.amountDeposit = amountDeposit;
    }
    
    public abstract void deposit();

    public abstract Float withdraw() throws InsufficientFundsException;

    @Override
    public String toString() 
    {
//        try
//        {
//            return "ATM{" + "howMuchWithdraw=" + howMuchWithdraw + ", amountDeposit=" + amountDeposit + ", withdrawLimit=" + withdrawLimit + ", principal=" + principal + '}';
//        }
//        catch (InsufficientFundsException ex) 
//        {
//            System.out.println(ex);
//        }
//        return "Account{" + "Your balance is: $" + (principal + howMuchWithdraw) + " you cannot withdraw $" + howMuchWithdraw + '}';
        return "ATM{" + "howMuchWithdraw=" + howMuchWithdraw + ", amountDeposit=" + amountDeposit + ", withdrawLimit=" + withdrawLimit + ", principal=" + principal + '}';
    }    
}
