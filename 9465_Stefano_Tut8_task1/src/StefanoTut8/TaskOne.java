
package StefanoTut8;

public class TaskOne {

    public static void main(String[] args) 
    {
        int a[] = new int[2];
        try
        {
            System.out.println("test");
        }
        finally
        {
            System.out.println("This will ALWAYS be PRINTed, even when there are not exception");
        }
    }
    
    /*This code is legal, however without any catch for exception, there is no
    point, it needs at least one catch exception to be added in order to throw/show
    a message when there is an error
    */
}
