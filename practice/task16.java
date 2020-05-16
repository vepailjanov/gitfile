package practice;

import java.util.Scanner;

public class task16 {
    //Task 2
    //What time of the day is it?
    //8 to 12 Good Morning
    //12 to 18 Good Afternoon
    //18 to 22 Good Evening
    //After 22 Good Night
    public static void main(String[] args) {
     Scanner s = new Scanner(System.in);
        System.out.println("What time is it?");
     int i = s.nextInt();

     if (i>=8&&i<=12){
         System.out.println("Good Morning");
     }else if (i>=12&&i<=18){
         System.out.println("Good Afternoon");
     }else if (i>=18&&i<=22){
         System.out.println("Good Evening");
     }else if (i>22){
         System.out.println("Good Night");
     }

    }
}
