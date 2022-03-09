
package StefanoPrunaAssessment1;


public abstract class ATM 
{
    //Data types and method that will be extended to the other classes
    public Integer howMuchWithdraw;    
    protected Integer withdrawLimit;
    protected Float rate;
    protected Float interest;
    protected Float time; 
    protected Float principal;
    protected Integer deposit;
    protected Float balance;

    public ATM(Integer howMuchWithdraw, Integer withdrawLimit, Float principal, Integer deposit) {
        this.howMuchWithdraw = howMuchWithdraw;
        this.withdrawLimit = withdrawLimit;
        this.principal = principal;
        this.deposit = deposit;
    }

    public ATM() {
    }

    public Integer getHowMuchWithdraw() {
        return howMuchWithdraw;
    }

    public void setHowMuchWithdraw(Integer howMuchWithdraw) {
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
