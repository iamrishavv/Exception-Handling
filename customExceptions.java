package BasicJava;
//A custom exception is an exception created by the programmer to handle application-specific error conditions.
//👉 It is created by extending:
//Exception → Checked exception
//RuntimeException → Unchecked exception

public class customExceptions {
    static void withdraw(int balance, int amount) {
        if (amount > balance) {
            throw new InsufficientBalanceException("Not enough balance");
        }
        System.out.println("Withdrawal successful");
    }
    public static void main(String[] args)  {
        withdraw(2000,3000);
    }
}
class  InsufficientBalanceException extends RuntimeException{
    //constructor
    InsufficientBalanceException(String message){
        super(message);
    }
}
