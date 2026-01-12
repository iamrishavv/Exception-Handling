package BasicJava;
// The method stack (also called the call stack) is a memory area where:
//Method calls are stored
//Local variables are stored
//Method execution order is managed
//👉 It works in LIFO (Last In, First Out) order.
public class methodStack {
    void add(int a, int b){
        int c=a/b;
        System.out.println(c);
    }
    public static void main(String[] args) throws Exception {
        try {
            methodStack m = new methodStack();
            m.add(19, 0);
        }catch (Exception e){
            //System.err is a predefined output stream in Java used to display error messages
            System.err.println("error"+ e);
        }

    }
}
