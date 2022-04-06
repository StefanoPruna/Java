
package javamodulethreads;

public class JavaModuleThreads {

    public static void main(String[] args) 
    {
        MyThread myThread1 = new MyThread("Download");
        myThread1.start();//Start method will execute the run method in MyThread class        
        
        MyThread myThread2 = new MyThread("Upload");
        myThread2.start();
    }    
}
