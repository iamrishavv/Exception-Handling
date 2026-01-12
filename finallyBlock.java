package BasicJava;

import java.io.FileReader;
import java.io.IOException;
import java.nio.file.FileVisitResult;

//The finally block is used to execute cleanup code that must run whether an exception occurs or not.
// It is always associated with a try block.
public class finallyBlock {
    public static void main(String[] args) throws IOException {
        FileReader fr=null;
        try {
            fr=new FileReader("finalizeMethod.java");
            int read = fr.read();//Reading the file
            int res=read/0;// operation
            //fr.close();--> it will not work because of the wrong logic so the file will not be closed..
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            fr.close();
            System.out.println("File closed sucessfully");
        }
    }
}
