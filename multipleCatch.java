package BasicJava;
//we can write multiple catch block with try block but the order of catch block should be child to parent.
public class multipleCatch {
    public static void main(String[] args) {
        try {
            int i=10/0;
            int [] arr={1,2,3,45};
            System.out.println(arr[5]);
        }catch (ArithmeticException e){
            e.printStackTrace();

        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
