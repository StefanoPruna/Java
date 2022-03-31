
package StefanoTut8;

import javax.security.auth.login.AccountNotFoundException;

public class TaskTwo {

    public static void main(String[] args)
    {
        Account newAccount = new Account(50, 100);
        Account newAccount2 = new Account(500, 100);  
        System.out.println(newAccount.toString());
        System.out.println(newAccount2.toString());   
    }
}
