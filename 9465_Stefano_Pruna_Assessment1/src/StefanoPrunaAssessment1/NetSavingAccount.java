
package StefanoPrunaAssessment1;


public class NetSavingAccount extends ATM implements Interest
{
    //Monthly interest is higher than the daily ones
    //There is a pre-set limit to withdraw
    //Time is 1/12
    //Inherited the data types/variable and method from ATM and from the Interface Interest
    
    public NetSavingAccount()
    {        
    }

    public NetSavingAccount(Float howMuchWithdraw, Integer withdrawLimit, Float principal, Integer deposit) {
        super(howMuchWithdraw, withdrawLimit, principal, deposit);
    }   

    //Because they are all private, I override to change the value manually
    @Override
    public void setWithdrawLimit(Integer withdrawLimit) 
    {
        super.setWithdrawLimit(1000);
    }

    @Override
    public void setRate(Float rate) {
        super.setRate(rate); 
    }

    @Override
    public void setTime(Float time) {
        super.setTime(time); 
    }

    @Override
    public void setInterest(Float interest) {
        super.setInterest(interest); 
    }
    
    public Float getBalance() {
        return balance;
    }

    public void setBalance(Float balance) {
        this.balance = balance;
    }

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
//        rate = 0.02f;
//        time = 1/12f;
//        interest = principal * rate * time;
        setRate(0.02f);
        setTime(1/12f);
        setInterest(principal * getRate() * getTime());
        balance = principal + getInterest();
        
        return getInterest();
    }

    @Override
    public String toString() {
        return "ATM{" + "You have withdrawn: $" + checkAmountWithdraw() + "\nYou have deposited: $" + deposit + "\nThe current balance is: " + principal +
                "\nYour interest is $" + calculateInterest() + "\nAnd your final balance is: $" + balance + '}';
    }
       
}
