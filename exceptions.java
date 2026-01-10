package BasicJava;

import org.w3c.dom.ls.LSOutput;

//An exception is an unexpected event that occurs during program execution and disrupts the normal flow of the program.
//Why Exception Handling is Needed?
//Prevent program crash
//Handle runtime errors gracefully
//Maintain normal program flow
//Provide meaningful error messages
public class exceptions {
    void div(){
        int x=10/0;
        System.out.println(x);
        int [] arr={1,2,3,4,5};
        System.out.println(arr[5]);
        String s=null;
        System.out.println(s.length());
    }


    public static void main(String[] args) {
        exceptions e=new exceptions();
        e.div();


    }
}
