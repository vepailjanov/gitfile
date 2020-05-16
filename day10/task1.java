package day10;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
    /*
        Create two Strings

        if total of the two String length is more then 15
        print your Strings are too long

        if  total of the two String length is less then 15
        print your Strings are okay


     */
        Scanner myscan = new Scanner( System.in);
        String s1 = myscan.nextLine();
        String s2 = myscan.nextLine();
       int total = s1.length() + s2.length();
       if (total > 10){
           System.out.println("right");

       }
       if (total < 10){
           System.out.println("wrong");
       }else{
           System.out.println("non of them");
       }

}
}
