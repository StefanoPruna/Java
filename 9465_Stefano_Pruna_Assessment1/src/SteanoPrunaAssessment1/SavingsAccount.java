
package SteanoPrunaAssessment1;

import java.util.*;

public class SavingsAccount extends ATM
{
    //Daily time is rate / 365
    //Interest = principal * rate * time   
    //Inherited the data types/variable and method from ATM 
    
    //this boolean is needed for the loop in the setlimit method
    //private Boolean check = true;
    
    public SavingsAccount()
    {
    }  

    public Boolean getWithdraw() {
        return withdraw;
    }

    public void setWithdraw(Boolean withdraw) {
        this.withdraw = withdraw;
    }

    public Integer getHowMuchWithdrawing() {
        return howMuchWithdrawing;
    }

    public void setHowMuchWithdrawing(Integer howMuchWithdrawing) {
        this.howMuchWithdrawing = howMuchWithdrawing;
    }

    public String getWithdrawCheck() {
        return withdrawCheck;
    }

    public void setWithdrawCheck(String withdrawCheck) {
        this.withdrawCheck = withdrawCheck;
    }

    public Float getPrincipal() {
        return principal;
    }

    public void setPrincipal(Float principal) {
        this.principal = principal;
    }

    public Integer getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(Integer withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
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

    public void setLimit()
    {
       //Check if user doesn't insert a number
       //while (check)
      // {
           Scanner sc = new Scanner(System.in);
           //Scanner userInput = new Scanner(System.in);
           System.out.println("Insert the daily limit to withdraw: ");
           //withdrawLimit = userInput.nextInt();
           withdrawLimit = sc.nextInt();
           System.out.println("Your new daily limit is " + withdrawLimit);
           
//           if (withdrawLimit != sc.nextInt())
//               System.out.println("You have not inserted a valid value"); 
//           else
//           {
//               System.out.println("Your new daily limit is " + withdrawLimit);
//               check = false;
//           }               
       //}       
    }
    
    @Override
    public void calculateInterest() 
    {
        //assign values to start the daily calculation
        withdraw = true;
        principal = 2000f;
        rate = 0.015f;
        interest = 0f;
        
        time = rate / 365;
                
        //Loops until the user wants to withdraw money
        while (withdraw)
        {   
            Scanner userInput = new Scanner(System.in);
            System.out.println("Would you like to withdraw money? Yes/No");
            withdrawCheck = userInput.next();
            //Checks if user wants to keep withdrawing money
            if (withdrawCheck.equalsIgnoreCase("yes") && principal > 0 && withdrawLimit > 0)
            {   
                //Checks if user withdraw 20, 50 or 100 and reduce it from the principal
                System.out.println("How much money do you want to withdraw, $20, $50, $100?");
                howMuchWithdrawing = userInput.nextInt();
                if (howMuchWithdrawing.equals(20))
                {
                    principal -= 20;
                    withdrawLimit -=20;
                    // Checks if either the principal or the limit is higher than 0, otherwise it finishes the loop
                    if (principal <= 0)  
                    {
                        System.out.println("Your balance is " + principal + " and you cannot withdraw anymore");                    
                        break;
                    }
                    else if (withdrawLimit <= 0)
                    {
                        System.out.println("You have reached the daily limit to withdraw");   
                        break;
                    }
                }                    
                else if (howMuchWithdrawing.equals(50))
                {
                    principal -= 50;
                    withdrawLimit -=50;
                    if (principal <= 0) 
                    {
                        System.out.println("Your balance is " + principal + " and you cannot withdraw anymore");  
                        break;
                    }
                    else if (withdrawLimit <= 0)
                    {
                        System.out.println("You have reached the daily limit to withdraw");   
                        break;
                    }
                }
                else if (howMuchWithdrawing.equals(100))
                {
                    principal -=100;
                    withdrawLimit -=100;
                    if (principal <= 0) 
                    {
                        System.out.println("Your balance is $" + principal + " and you cannot withdraw anymore"); 
                        break;
                    }
                    else if (withdrawLimit <= 0)
                    {
                        System.out.println("You have reached the daily limit to withdraw");   
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
        //And checks if principal is higher than 0 and calculate the interest, otherwise it won't 
        if (principal > 0)
        {
            interest = principal * rate * time;
            System.out.println("The daily Interest is: $" + interest);
        }
        else
            System.out.println("Your balance is $" + principal + " and you haven't earned any interest");
        
        System.out.println("Your balance at the end of the day is $: " + (principal + interest));
    }  
}
