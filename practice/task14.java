package practice;

import java.util.Scanner;

public class task14 {
    public static void main(String[] args) {
        /*
        Using Scanner take a string and check if the length is
        greater or equal to 4 and contains "java"
        get boolean
         */
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        if (str.length()<=4 && str.contains("java")){
            System.out.println(true);
        }else{
            System.out.println("false");
        }
    }
}
