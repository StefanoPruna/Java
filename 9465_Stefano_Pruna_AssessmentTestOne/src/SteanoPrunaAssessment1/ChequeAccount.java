
package SteanoPrunaAssessment1;

import java.util.*;

public class ChequeAccount extends ATM
{

    //There is not limit to withdraw and interest
    //It will only ask how much to withdraw
    
    public ChequeAccount() {
    }

    @Override
    public void calculateInterest() 
    {
        withdraw = true;
        principal = 5000f;
        
        //This loop check if user wants to withdraw or see the balance
        while (withdraw)
        {   
            Scanner userInput = new Scanner(System.in);
            System.out.println("Would you like to withdraw money? Yes/No");
            withdrawCheck = userInput.next();
            //Checks if user wants to keep withdrawing money
            if (withdrawCheck.equalsIgnoreCase("yes") && principal > 0)
            {   
                //Checks if user withdraw 20, 50 or 100 and reduce it from the principal
                System.out.println("How much money do you want to withdraw, $20, $50, $100?");
                howMuchWithdrawing = userInput.nextInt();
                
                if (howMuchWithdrawing.equals(20))
                {        
                    principal -= 20;
                //Checks if the balance is equal or less than 0
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
                        System.out.println("Your balance is " + principal + " and you cannot withdraw anymore");  
                        break;
                    }
                }
                else//if inserted a wrong quantity, it'll show the error message and start from the top of the loop
                    System.out.println("You inserted the wrong amount to withdraw");
//                else if (howMuchWithdrawing == NaN) //if inserted a wrong quantity, it'll show the error message and start from the top of the loop
//                    System.out.println("You inserted the wrong amount to withdraw");
            }
            //If user insert No, the loops will finish
            else if (withdrawCheck.equalsIgnoreCase("no"))
                withdraw = false;
            //If user doesn't insert neither yes, nor no
            else
                System.out.println("You have not inserted a valid option, try again");
        }
        //If user choose No to withdraw, the loops will finish
        System.out.println("Your current balance is $: " + principal);
    }    
}
