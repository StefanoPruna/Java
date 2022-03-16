
package StefanoPrunaAssessment1;

public class SavingsAccount extends ATM implements Interest
{
    //Daily time is rate / 365
    //Interest = principal * rate * time   
    //Inherited the data types/variable and method from ATM and the interface Interest
   
    //Constructor
    public SavingsAccount(Float howMuchWithdraw, Integer withdrawLimit, Float principal, Integer deposit) {
        super(howMuchWithdraw, withdrawLimit, principal, deposit);
    }

    //all the get and set

    //I need to override these, because they are private
    @Override
    public void setRate(Float rate) {
        super.setRate(rate); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setTime(Float time) {
        super.setTime(time); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setInterest(Float interest) {
        super.setInterest(interest); //To change body of generated methods, choose Tools | Templates.
    }

//    public Float getBalance() {
//        return balance;
//    }
//
//    public void setBalance(Float balance) {
//        this.balance = balance;
//    }

    @Override
    public Float checkAmountWithdraw() 
    {
        //Check if the test allows to use only the 20, 50 and 100 notes
        if (howMuchWithdraw == 20 || howMuchWithdraw == 50 || howMuchWithdraw == 100)
        {
            principal -= howMuchWithdraw;
            //Check if there is enough balance to withdraw
            if(principal < 0)
            {
                System.out.println("You don't have enough money in your balace: $" + principal);
                principal += howMuchWithdraw + deposit;
                return 0f;
            }
            else if(howMuchWithdraw > getWithdrawLimit())
            {
                System.out.println("You have reached your daily limit and you cannot withdraw anymore");
                principal += howMuchWithdraw + deposit;
                return 0f;
            }

            principal -= howMuchWithdraw - deposit;//add the deposit and reduce the cash withdraw to the principal
        }
        else
        {
            System.out.println("you have inserted the wrong value");
            //add the deposit to the principal
            principal += deposit;
            //return 0, because it didn't withdraw anything
            return 0f;
        }
                  
        //and return how much withdraw
        return howMuchWithdraw;         
    }

    @Override
    public Float calculateInterest() 
    {
        //Interest calculation
        //rate = 0.0155f;
        //time = rate / 365;
        //interest = principal * rate * time;
        setRate(0.0155f);
        setTime(getRate() / 365);
        setInterest(principal * getRate() * getTime());
        balance = principal + getInterest();
        
        return getInterest();
    }

    //I added the withdraw limit as the user can choose it in this account
    //withdrawlimit is private, thus I have to call it with the get
    @Override
    public String toString() {
        return "ATM{" + "You have withdrawn: $" + checkAmountWithdraw() + "\nThe withdraw limit is: $" + getWithdrawLimit() + "\nYou have deposited: $" + deposit
                + "\nThe current balance is: " + principal + "\nYour interest is $" + calculateInterest() + "\nAnd your balance is: $" + balance + '}';
    }    
}
