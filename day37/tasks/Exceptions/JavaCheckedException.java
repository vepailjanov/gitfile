package day37.tasks.Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class JavaCheckedException {

    public static void main(String[] args) throws Exception {
//        File file = new File("example.txt");

        //checked(expected) exception must be used with try-catch
        //we can predict it before we execute/do that
        try {
            FileInputStream fis = new FileInputStream("example.txt");
        } catch(FileNotFoundException ex) {
            throw new Exception("wrong code");
        }

    }
}
