
package businessLogic;

public class SavingsAccount extends ATM implements Interest
{
    //Daily time is rate / 365
    //Interest = principal * rate * time   
    //Inherited the data types/variable and method from ATM and the interface Interest
    
    //Constructor
    public SavingsAccount(Float howMuchWithdraw, Float principal, Integer amountDeposit, Integer withdrawLimit) {
        super(howMuchWithdraw, principal, amountDeposit, withdrawLimit);
    }

    public SavingsAccount() {
    }

    //all the get and set
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
    
    public Float getBalance() {
        return balance;
    }

    public void setBalance(Float balance) {
        this.balance = balance;
    }

    public Integer getAmountDeposit() {
        return amountDeposit;
    }

    public void setAmountDeposit(Integer amountDeposit) {
        this.amountDeposit = amountDeposit;
    }

    public void deposit()
    {
        this.principal += amountDeposit;
    }
    
    @Override
    public Float withdraw()throws InsufficientFundsException
    {
        //Check if the test allows to use only the 20, 50 and 100 notes
        if (howMuchWithdraw == 20 || howMuchWithdraw == 50 || howMuchWithdraw == 100)
        {
            this.principal -= howMuchWithdraw;
            deposit();
            //Check if there is enough balance to withdraw
            if(this.principal < 0)
            {
                throw new InsufficientFundsException("You don't have enough money in your balace: $" + this.principal);
            }
            else if(howMuchWithdraw > getWithdrawLimit())
            {
                System.out.println("You have reached your daily limit and you cannot withdraw anymore");
                this.principal += howMuchWithdraw;
                return 0f;
            }

            this.principal -= howMuchWithdraw;//add the deposit and reduce the cash withdraw to the principal
        }
        else
        {
            System.out.println("you have inserted the wrong value");
            //add the deposit to the principal
            deposit();
            //return 0, because it didn't withdraw anything
            return 0f;
        }
                  
        //and return how much withdraw
        return howMuchWithdraw; 
    }
    
    @Override
    public Float calculateInterest() 
    {
        //Interest calculation
        //rate = 0.0155f;
        //time = rate / 365;
        //interest = principal * rate * time;
        setRate(0.0155f);
        setTime(getRate() / 365);
        setInterest(this.principal * getRate() * getTime());
        balance = this.principal + getInterest();
        
        //return getInterest();
        return balance;
    }

    //I added the withdraw limit as the user can choose it in this account
    //withdrawlimit is private, thus I have to call it with the get
    @Override
    public String toString() 
    {
        try
        {
            return "ATM{" + "You have withdrawn: $" + withdraw() + "\nThe withdraw limit is: $" + getWithdrawLimit() + "\nYou have deposited: $" + amountDeposit
                + "\nThe current balance is: " + principal + "\nYour interest is $" + calculateInterest() + "\nAnd your balance is: $" + balance + '}';
        }
        catch (InsufficientFundsException ex) 
        {
            System.out.println(ex);
        }
        return "Account{" + "Your balance is: $" + (principal + howMuchWithdraw) + " you cannot withdraw $" + howMuchWithdraw + '}';
    }    
}
