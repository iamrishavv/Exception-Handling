package BasicJava;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//throws is used in a method declaration to declare exceptions that a method may pass to the caller.
//It can declare multiple exceptions and used to ignore 'checked' type exceptions.
//throw is used to explicitly create and throw an exception from a method or block.
public class throwVsThrows {
    public String getName(int id) throws Exception{
        if(id==100){
            return "Rishav";
        }else if(id==101){
            return "sonu";
        }else{
            throw new Exception("Invalid id");
        }
    }
    //Q-wap which gives error.
    // it will give stackoverflow error.
//    void show(){
//        show();
//    }
    public static void main(String[] args) throws FileNotFoundException , IOException, ClassNotFoundException ,Exception {
//        FileReader fr=new FileReader("T1.txt");
//        Class.forName("");
        throwVsThrows t=new throwVsThrows();
        String name1 = t.getName(100);
        System.out.println(name1);
        String name = t.getName(1011);
        System.out.println(name);
    }
}
