
package StefanoPrunaAssessment1;

public class ChequeAccount extends ATM
{

    public ChequeAccount(Float howMuchWithdraw, Integer withdrawLimit, Float principal, Integer deposit) {
        super(howMuchWithdraw, withdrawLimit, principal, deposit);
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
            principal -= howMuchWithdraw - deposit;//add the deposit and reduce the cash withdraw to the principal
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
    public String toString()
    {
        return "ATM{" + "You have withdrawn: $" + checkAmountWithdraw() + "\nYou have deposited: $" + deposit
                + "\nThe current balance is: " + principal + '}';
    }
    
}
