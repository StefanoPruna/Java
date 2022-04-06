
package javamodulethreads;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MyThread extends Thread
{
    private int sleepTime = 0;
    
    public MyThread() 
    {
        sleepTime = generateRandomSleepTime();
    }
    
    public MyThread(String name)
    {
        super(name);
        sleepTime = generateRandomSleepTime();
    }
    
    @Override
    public void run() //Run by start method
    {
        System.out.println(Thread.currentThread().getName() + " : starts an important job in  MyThread");
        System.out.println(Thread.currentThread().getName() + " : will go to sleep for: " + sleepTime + " milli seconds");
        
        try {
            Thread.sleep(5000L);//5 secs
            System.out.println(Thread.currentThread().getName() + " : Wake up");
        } catch (InterruptedException ex) 
        {
            System.out.println(ex);
        }
        System.out.println(Thread.currentThread().getName() + " : Finished");
    }     
    private int generateRandomSleepTime()
    {
        Random run = new Random();
        int value = run.nextInt(7);
        value++;
        return value * 1000;
    }
}
