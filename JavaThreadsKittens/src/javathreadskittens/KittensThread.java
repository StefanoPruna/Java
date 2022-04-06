
package javathreadskittens;

import java.util.Random;

public class KittensThread extends Thread
{

    public KittensThread(String name) {
        super(name);
    }

    @Override
    public void run() 
    {
        boolean catIsAwake = true;
        while(catIsAwake)
        {
            try
            {
                int sleepTime = generateRandomSleepTime();
                if (sleepTime < 2000) {
                    System.out.println(Thread.currentThread().getName() + " is playing with a ball");
                    Thread.sleep(sleepTime);
                } else if (sleepTime < 4000) {
                    System.out.println(Thread.currentThread().getName() + " is eating");
                    Thread.sleep(sleepTime);
                } else if (sleepTime < 7000) {
                    System.out.println(Thread.currentThread().getName() + " is shitting, very important!");
                    Thread.sleep(sleepTime);
                } else {
                    System.out.println(Thread.currentThread().getName() + " is napping");
                    catIsAwake = false;
                }
            }catch (InterruptedException e)
            {
                System.out.println(e);
            }
            
        }
    }
    
    private int generateRandomSleepTime()
    {
        Random ran = new Random();
        int value = ran.nextInt(7);
        value++;
        return value * 1000;
    }
}
