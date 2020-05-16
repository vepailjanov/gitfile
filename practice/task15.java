package practice;

import java.util.Scanner;

public class task15 {
    //Coronavirus
    //Tell the people their risk for Coronavirus by asking their ages
    //10 and younger is "You're safe but don't kill other people"
    //Between 10 and 30 "You won't die but you'll get sick"
    //Between 30 and 60 "You'll get through it but it may be rough"
    //60 or older "Self-Quarantine"
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("your age?");
        int i = s.nextInt();
        if (i<=10){
            System.out.println("You're safe but don't kill other people");
        }else if (i>=10 && i <=30){
            System.out.println("You won't die but you'll get sick");
        }else if (i>30 && i<=60){
            System.out.println("You'll get through it but it may be rough");

        }else if (i>60){
            System.out.println("Self-Quarantine");
        }
    }

}
