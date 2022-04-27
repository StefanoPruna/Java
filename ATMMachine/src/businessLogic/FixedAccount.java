
package businessLogic;


public class FixedAccount extends ATM implements Interest
{
    //local data type to check if there is a withdraw for the interest
    private Boolean earlyWithdraw = false;        

    public FixedAccount(Float howMuchWithdraw, Float principal, Integer amountDeposit, Integer withdrawLimit) {
        super(howMuchWithdraw, principal, amountDeposit, withdrawLimit);
    }

    public FixedAccount() {
    }

    public Boolean getEarlyWithdraw() {
        return earlyWithdraw;
    }

    public void setEarlyWithdraw(Boolean earlyWithdraw) {
        this.earlyWithdraw = earlyWithdraw;
    }

    //I need to override these, because they are private
    @Override
    public void setRate(Float rate) {
        super.setRate(rate); 
    }

    @Override
    public void setTime(Float time) {
        super.setTime(time); 
    }

    @Override
    public void setInterest(Float interest) {
        super.setInterest(interest); 
    }

    public Integer getAmountDeposit() {
        return amountDeposit;
    }

    public void setAmountDeposit(Integer amountDeposit) {
        this.amountDeposit = amountDeposit;
    }

    @Override
    public void deposit() 
    {
        this.principal += amountDeposit;        
    }

    @Override
    public Float withdraw() throws InsufficientFundsException
    {
        //Check if the test allows to use only the 20, 50 and 100 notes
        if (howMuchWithdraw == 20 || howMuchWithdraw == 50 || howMuchWithdraw == 100)
        {
            earlyWithdraw = true;
            this.principal -= howMuchWithdraw;
            //deposit();
            //Check if there is enough balance to withdraw
            if(this.principal < 0)
            {
                throw new InsufficientFundsException("You don't have enough money in your balace: $" + this.principal);
            }
            //this.principal -= howMuchWithdraw;//add the deposit and reduce the cash withdraw to the principal
        }
        else if (howMuchWithdraw == 0)
            System.out.println("You didn't withraw, thus you will have the interest in your final balance");
        else
        {
            System.out.println("you have inserted the wrong value");
            //add the deposit to the principal
            deposit();
            //return 0, because it didn't withdraw anything
            return 0f;
        }
          
        //for this class, we add the deposit now, otherwise it won't calculate it if there is an interest
        deposit();
        //and return how much withdraw between 20, 50 and 100
        return howMuchWithdraw;   
    }

    @Override
    public Float calculateInterest() 
    {
        if (earlyWithdraw)
        {
            //because they try to withdraw, there wont' be an interest
            System.out.println("You have withdrawn before the contract period, therefore you won't have the interest for this period");            
            return 0f;
        }
        
        //if there is no withdrawn, add the interest calculate as 3 months contract period
//        rate = 0.035f;
//        time = 1/4f;
//        interest = principal * rate * time;
        setRate(0.035f);
        setTime(1/4f);
        setInterest(this.principal * getRate() * getTime());
        balance = this.principal + getInterest();
        //I cannot use balance here, but principal, otherwise it won't add the interest
        this.principal = this.principal + getInterest();             
        
        return getInterest();
    }

    @Override
    public String toString() 
    {
        try
        {
            return "ATM{" + "You have withdrawn: $" + withdraw() + "\nYou have deposited: $" + amountDeposit + "\nThe current balance is: " + this.principal +
                "\nYour interest is $" + calculateInterest() + "\nAnd your final balance is: $" + this.principal + '}';
        }
        catch (InsufficientFundsException ex) 
        {
            System.out.println(ex);
        }
        return "Account{" + "Your balance is: $" + (principal + howMuchWithdraw) + " you cannot withdraw $" + howMuchWithdraw + '}';              
    }      
}
