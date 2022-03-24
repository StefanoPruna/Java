
package StefanoPrunaAssessment1;

import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args)
    {
        //for assignment 2:
        //1.Create a string list
//        List<String> digitNumbers = new ArrayList();

        //2. When I create the button event, add:
        //resultLabel.setText(resultLabel.getText().concat("0"));
        //digitNumbers.add(resultLabel.getText());
        
        //3. then in another var, save the last value
        //int test = Integer.valueOf(digitNumbers.get(digitNumbers.size() - 1));
        
        //4. then use the var test to check the data
        
        //Tests for the savings account
        //Check if user withdraw more than the limit
        SavingsAccount newSavings = new SavingsAccount(100f, 50, 5000f, 100);
        System.out.println(newSavings.toString());
        //Check if we withdraw a different value then 20, 50 or 100
        SavingsAccount newSavings2 = new SavingsAccount(30f, 500, 5000f, 100);
        System.out.println(newSavings2.toString());
        //Check if there is enough balance to withdraw
        SavingsAccount newSavings3 = new SavingsAccount(100f, 50, 50f, 20);
        System.out.println(newSavings3.toString());
     
        System.out.println("######### BREAK BETWEEN TESTS");
        
        //Tests for the net savings account
        NetSavingAccount newNetAccount = new NetSavingAccount(50f, 1000, 1000f, 30);
        System.out.println(newNetAccount.toString());
        //Check if we withdraw a different value then 20, 50 or 100
        NetSavingAccount newNetAccount2 = new NetSavingAccount(25f, 1000, 3000f, 40);
        System.out.println(newNetAccount2.toString());        
        System.out.println("The withdraw limit for the Net Saving account is: $" + newNetAccount.getWithdrawLimit());
        
        System.out.println("######### BREAK BETWEEN TESTS");
        
        //Tests for the cheque account, it doesn't have neither limit, nor interest
        ChequeAccount newCheque = new ChequeAccount(50f, 0, 2000f, 0);
        System.out.println(newCheque.toString());
        ChequeAccount newCheque2 = new ChequeAccount(13f, 90, 500f, 1000);
        System.out.println(newCheque2.toString());
        
        System.out.println("######### BREAK BETWEEN TESTS");
        
        //Tests for the Fixed Account; it doesn't have a limit to withdraw, but if withdraw, it shouldn't count the interest
        FixedAccount newFixed = new FixedAccount(50f, 0, 500f, 30);
        System.out.println(newFixed.toString());
        FixedAccount newFixed2 = new FixedAccount(0f, 0, 1000f, 100);
        System.out.println(newFixed2.toString());
        //Test for the amount to withdraw, but because it won't withdraw, we add the interest
        FixedAccount newFixed3 = new FixedAccount(30f, 0, 500f, 20);
        System.out.println(newFixed3.toString());
    }    
}
