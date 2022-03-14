
package StefanoPrunaAssessment1;


public class Main {

    public static void main(String[] args)
    {
        //Tests for the savings account
        SavingsAccount newSavings = new SavingsAccount(50f, 500, 5000f, 100);
        System.out.println(newSavings.toString());
        //Check if we withdraw a different value then 20, 50 or 100
        SavingsAccount newSavings2 = new SavingsAccount(30f, 500, 5000f, 100);
        System.out.println(newSavings2.toString());
     
        System.out.println("######### BREAK BETWEEN TESTS");
        
        //Tests for the net savings account
        NetSavingAccount newNetAccount = new NetSavingAccount(50f, 1000, 1000f, 50);
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
        
        //Tests for the Fixed Account; it doesn't have a limit to withdraw, but if withdraw, it shouldn't count the interest
        FixedAccount newFixed = new FixedAccount(50f, 0, 500f, 30);
        System.out.println(newFixed.toString());
        FixedAccount newFixed2 = new FixedAccount(0f, 0, 1000f, 100);
        System.out.println(newFixed2.toString());
    }    
}
