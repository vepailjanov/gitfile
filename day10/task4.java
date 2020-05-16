package day10;

import java.sql.PseudoColumnUsage;
import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        /*
            Scanner object

            String which is start level in the website

            example "4 star" , "5 star "

            int mile
                how far from the downtown

            remove the nun numeric characters from String
            then change the String to double

             if star is less then 3 and mile is > 5
                print this hotel is too far from city and it is not good

             else if star is more - equal then 3 and mile is less - equal to five
                print this hotel is perfect

         */
        Scanner myscan = new Scanner(System.in);

        String s1 = myscan.nextLine();
        int s2 = myscan.nextInt();
        s1 = s1.replaceAll("[^\\d.]", "" );

        double doubles1 = Double.valueOf(s1);
        if (doubles1>3 && s2 >5 ){
            System.out.println("first");
        }else if (doubles1>= 3 && s2<= 5){
            System.out.println("second");
        }

    }
}
