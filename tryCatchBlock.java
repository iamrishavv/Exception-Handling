package BasicJava;
// try and catch refer to a fundamental mechanism in programming used for exception handling.
//This mechanism allows a program to manage runtime errors gracefully, preventing the entire application from crashing.
public class tryCatchBlock {
    public static void main(String[] args) {
        System.out.println("Main method started");
        try {
            System.out.println("Try block started");
            int x=10/0;
            System.out.println("Try block ended");
        }catch (Exception e){
            System.out.println("Catch block started");
            e.printStackTrace();
           // System.out.println("It throws Arithmetic Exception");
        }
        System.out.println("Main Method Ended");
    }
}
