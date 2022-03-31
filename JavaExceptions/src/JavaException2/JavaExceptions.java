
package JavaException2;

public class JavaExceptions {

    public static void main(String[] args) 
    {
//        try
//        {
//            int a = 2;
//            int b = 0;
//            System.out.println("Result: " + a/b);
//            System.out.println("It should not print it");
//        }
//        //I can choose arithmetic exception or just exception
//        catch(ArithmeticException a)
//        {
//            System.out.println("This is an arithmetic exception");
//            System.err.println(a);
//            //fix the problem here
//        }
//        //Exception has to be at the end, because the other won't be executed
//        catch(Exception e)
//        {
//            System.out.println("You cannot divide by zero");
//            System.out.println(e);
//        }
//        finally
//        {
//            System.out.println("This will ALWAYS be PRINTed, even when there are not exception");
//        }
        Student student1 = new Student(1000, "Stef", "Loske");
        Student student2 = new Student(1001, "Obi", "Wan");
        Student student3 = new Student(1002, "Ahsoka", "Tano");
        Student student4 = new Student(1003, "Obi", "Kenobi");
        
        AITClass myClass = new AITClass("Java", "J001", 2);
        
        /*Without the try and catch, use these
        myClass.getStudents().add(student1);
        myClass.getStudents().add(student2);
        myClass.getStudents().add(student3);   
        System.out.println(myClass.toString());
        */        
        try
        {
            myClass.addStudent(student1);
            myClass.addStudent(student2);
            myClass.addStudent(student3);
        }
        catch(TooManyStudentsException e)
        {
            System.out.println(e);
        }  
        
    }
    
}
