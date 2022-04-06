package javathreadskittens;

public class JavaThreadsKittens {

    public static void main(String[] args) 
    {
        KittensThread cat1 = new KittensThread("Ahsoka");
        KittensThread cat2 = new KittensThread("Kitty");
        KittensThread cat3 = new KittensThread("Yoda");
        KittensThread cat4 = new KittensThread("Kenobi");
        
        cat1.start();
        cat2.start();
        cat3.start();
        cat4.start();
    }
    
}
