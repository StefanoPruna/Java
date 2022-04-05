
package businessLogic;

public class ChequeAccount extends ATM
{

    public ChequeAccount(Float howMuchWithdraw, Float principal, Integer amountDeposit, Integer withdrawLimit) {
        super(howMuchWithdraw, principal, amountDeposit, withdrawLimit);
    }
    
    public ChequeAccount() {
    }
    
//    public Float getBalance() {
//        return balance;
//    }
//
//    public void setBalance(Float balance) {
//        this.balance = balance;
//    }

    @Override
    public void deposit() 
    {
        this.principal += amountDeposit;        
    }
    
    @Override
    public Float withdraw() 
    {
        //Check if the test allows to use only the 20, 50 and 100 notes
        if (howMuchWithdraw == 20 || howMuchWithdraw == 50 || howMuchWithdraw == 100)
        {
            this.principal -= howMuchWithdraw;
            //Check if there is enough balance to withdraw
            if(this.principal < 0)
            {
                System.out.println("You don't have enough money in your balace: $" + this.principal);
                this.principal += howMuchWithdraw;
                return 0f;
            }
        }
        else
        {
            System.out.println("you have inserted the wrong value");
            //add the deposit to the principal
            deposit();
            //return 0, because it didn't withdraw anything
            return 0f;
        }
                
        //and return how much withdraw between 20, 50 and 100
        return howMuchWithdraw;        
    }

    @Override
    public String toString()
    {
        return "ATM{" + "You have withdrawn: $" + withdraw() + "\nYou have deposited: $" + amountDeposit
                + "\nThe current balance is: " + this.principal + '}';
    }
    
}
