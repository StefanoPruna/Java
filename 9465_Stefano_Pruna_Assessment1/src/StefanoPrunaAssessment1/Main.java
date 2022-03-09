
package StefanoPrunaAssessment1;


public class Main {

    public static void main(String[] args)
    {
        SavingsAccount newSavings = new SavingsAccount(50, 500, 5000f, 100);
        SavingsAccount newSavings2 = new SavingsAccount(30, 500, 5000f, 100);
        
        System.out.println(newSavings.toString());
        
        NetSavingAccount newNetAccount = new NetSavingAccount(50, 1000, 1000f, 50);
        System.out.println(newNetAccount.toString());
        System.out.println("The withdraw limit for the Net Saving account is: $" + newNetAccount.getWithdrawLimit());
    }    
}
