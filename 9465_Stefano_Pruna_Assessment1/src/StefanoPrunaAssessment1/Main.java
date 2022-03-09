
package StefanoPrunaAssessment1;


public class Main {

    public static void main(String[] args)
    {
        //Tests for the savings account
        SavingsAccount newSavings = new SavingsAccount(50, 500, 5000f, 100);
        System.out.println(newSavings.toString());
        SavingsAccount newSavings2 = new SavingsAccount(30, 500, 5000f, 100);
        System.out.println(newSavings2.toString());
        
        System.out.println("######### BREAK BETWEEN TESTS");
        //Tests for the net savings account
        NetSavingAccount newNetAccount = new NetSavingAccount(50, 1000, 1000f, 50);
        System.out.println(newNetAccount.toString());
        NetSavingAccount newNetAccount2 = new NetSavingAccount(25, 1000, 3000f, 40);
        System.out.println(newNetAccount2.toString());
        
        System.out.println("The withdraw limit for the Net Saving account is: $" + newNetAccount.getWithdrawLimit());
    }    
}
