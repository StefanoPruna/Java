
package StefanoTut8;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Account
{
    private Integer howMuchWithdraw;
    private Integer principal;

    public Account() {
    }

    public Account(Integer howMuchWithdraw, Integer principal) {
        this.howMuchWithdraw = howMuchWithdraw;
        this.principal = principal;
    }

    public Integer getHowMuchWithdraw() {
        return howMuchWithdraw;
    }

    public void setHowMuchWithdraw(Integer howMuchWithdraw) {
        this.howMuchWithdraw = howMuchWithdraw;
    }

    public Integer getPrincipal() {
        return principal;
    }

    public void setPrincipal(Integer principal) {
        this.principal = principal;
    }
    
    public Integer withdraw() throws InsufficientFundsException
    {
      
            principal -= howMuchWithdraw;
            if(principal > 0)
            {
                System.out.println("Your balance is: " + principal);                
            }
            else
            {
                throw new InsufficientFundsException("Your balance is: $" + (principal + howMuchWithdraw) + " you cannot withdraw $" + howMuchWithdraw);
            }

        return principal + howMuchWithdraw;

    }

    @Override
    public String toString() {
        try {
            return "Account{" + "Your current Balance is $" + principal + "\n" + "How much money do you want to withdraw? $" +
                    withdraw() + "\nYour balance now is: " + principal + '}';
        } catch (InsufficientFundsException ex) 
        {
            System.out.println(ex);
        }
        return "Account{" + "Your balance is: $" + (principal + howMuchWithdraw) + " you cannot withdraw $" + howMuchWithdraw + '}';
    }
}
