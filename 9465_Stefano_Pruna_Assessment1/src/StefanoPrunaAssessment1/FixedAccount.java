
package StefanoPrunaAssessment1;


public class FixedAccount extends ATM implements Interest
{
    //local data type to check if there is a withdraw for the interest
    private Boolean earlyWithdraw = false;        

    public FixedAccount(Float howMuchWithdraw, Integer withdrawLimit, Float principal, Integer deposit) {
        super(howMuchWithdraw, withdrawLimit, principal, deposit);
    }

    public FixedAccount() {
    }

    public Boolean getEarlyWithdraw() {
        return earlyWithdraw;
    }

    public void setEarlyWithdraw(Boolean earlyWithdraw) {
        this.earlyWithdraw = earlyWithdraw;
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

    public Float getBalance() {
        return balance;
    }

    public void setBalance(Float balance) {
        this.balance = balance;
    }

    @Override
    public Float checkAmountWithdraw() 
    {
        //Check if the test allows to use only the 20, 50 and 100 notes
        if (howMuchWithdraw == 20 || howMuchWithdraw == 50 || howMuchWithdraw == 100)
        {
            
            principal -= howMuchWithdraw - deposit;//add the deposit and reduce the cash withdraw to the principal
        }
        else if (howMuchWithdraw == 0)
            System.out.println("You didn't withraw, thus you will have the interest in your final balance");
        else
        {
            System.out.println("you have inserted the wrong value");
            //add the deposit to the principal
            principal += deposit;
            //return 0, because it didn't withdraw anything
            return 0f;
        }
                
        //and return how much withdraw between 20, 50 and 100
        return howMuchWithdraw;   
    }

    @Override
    public Float calculateInterest() 
    {
        if (howMuchWithdraw > 0)
        {
            //because they try to withdraw, there wont' be an interest
            earlyWithdraw = true;
            System.out.println("You have withdrawn before the contract period, therefore you won't have the interest for this period");            
            return 0f;
        }
        
        //if there is no withdrawn, add the interest calculate as 3 months contract period
        rate = 0.035f;
        time = 1/4f;
        interest = principal * rate * time;
        //I cannot use balance here, but principal, otherwise it won't add the interest
        principal = principal + interest;             
        
        return interest;
    }

    @Override
    public String toString() 
    {
        return "ATM{" + "You have withdrawn: $" + checkAmountWithdraw() + "\nYou have deposited: $" + deposit + "\nThe current balance is: " + principal +
                "\nYour interest is $" + calculateInterest() + "\nAnd your final balance is: $" + principal + '}';
    }  
    
}
