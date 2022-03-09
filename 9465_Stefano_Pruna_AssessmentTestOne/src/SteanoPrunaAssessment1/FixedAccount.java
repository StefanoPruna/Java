
package SteanoPrunaAssessment1;

import java.util.*;


public class FixedAccount extends ATM
{
    //The fixed interest is the highest, based on 3 months period
    //Therefore time is 1/4
    //There is no a daily limit to withdraw
    
    //local data types and we start with the assumption that the user hasn't withdraw yet
    private Boolean earlyWithdraw = false;
    
    //Inherited the data types/variable and method from ATM 
    public FixedAccount() {
    }

    
    @Override
    public void calculateInterest() 
    {
         //assign values to start the daily calculation        
        withdraw = true;
        principal = 2500f;   
        rate  = 0.035f;
        time = 1/4f;
        interest = 0f;
        
        //Loops until the user wants to withdraw money
        while (withdraw)
        {   
            Scanner userInput = new Scanner(System.in);
            System.out.println("Would you like to withdraw money? Yes/No");
            withdrawCheck = userInput.next();
            //Checks if user wants to keep withdrawing money
            if (withdrawCheck.equalsIgnoreCase("yes") && principal > 0)
            {   
                //If user withdraws, then there won't be any interest
                earlyWithdraw = true;
                //Checks if user withdraw 20, 50 or 100 and reduce it from the principal
                System.out.println("How much money do you want to withdraw, $20, $50, $100?");
                howMuchWithdrawing = userInput.nextInt();
                if (howMuchWithdrawing.equals(20))
                {
                    principal -= 20;
                    // Checks if either the principal or the limit is higher than 0, otherwise it finishes the loop
                    if (principal <= 0)   
                    {
                        System.out.println("Your balance is " + principal + " and you cannot withdraw anymore"); 
                        break;
                    }
                }                    
                else if (howMuchWithdrawing.equals(50))
                {
                    principal -= 50;
                    if (principal <= 0)  
                    {
                        System.out.println("Your balance is " + principal + " and you cannot withdraw anymore");   
                        break;
                    }                        
                }
                else if (howMuchWithdrawing.equals(100))
                {
                    principal -=100;
                    if (principal <= 0) 
                    {
                        System.out.println("Your balance is $" + principal + " and you cannot withdraw anymore");     
                        break;
                    }
                }
                else//if inserted a wrong quantity, it'll show the error message and start from the top of the loop
                    System.out.println("You inserted the wrong amount to withdraw");
            }
            //If user insert No, the loops will finish
            else if (withdrawCheck.equalsIgnoreCase("no"))
                withdraw = false;
            //If user doesn't insert neither yes, nor no
            else
                System.out.println("You have not inserted a valid option, try again");
        }
        //If user choose No to withdraw, the loops will finish
        //And checks if principal is higher than 0 and calculate the interest, otherwise there isn't an interest to add
        if (principal > 0 && earlyWithdraw == false)
        {
            interest = principal * rate * time;
            System.out.println("The total interest of this period is: $" + interest);
        }
        else
            System.out.println("Your balance is $" + principal + " and you haven't earned any interest");
        
        System.out.println("Your balance at the end of the contract period is $: " + (principal + interest));
    }   
}
