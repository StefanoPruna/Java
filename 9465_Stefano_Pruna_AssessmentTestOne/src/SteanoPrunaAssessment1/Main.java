
package SteanoPrunaAssessment1;

public class Main {

    public static void main(String[] args)
    {      
        //Initialize saving for SavingsAccount class
//        SavingsAccount saving = new SavingsAccount();
//        //And call the methods in the SavingsAccount Class
//        saving.setLimit();
//        saving.calculateInterest();
//        
//        NetSavingAccount netSaving = new NetSavingAccount();        
//        netSaving.calculateInterest();    
        
        FixedAccountTest newFixAcc = new FixedAccountTest();
        newFixAcc.calculateInterest();
        
        ChequeAccountTest newCheque = new ChequeAccountTest();
        newCheque.calculateInterest();
    }    
}
