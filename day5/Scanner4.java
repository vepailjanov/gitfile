package day5;

import java.util.Scanner;

public class Scanner4 {
    public static void main(String[] args) {
        Scanner Num1 = new Scanner(System.in );
        String name = Num1.nextLine();
        System.out.println("Your name is " + name);
        System.out.println("Do you want an insurance ");

        boolean insurance = Num1.nextBoolean();
        System.out.println("Answer fpr do you want an insurance " + insurance);
        System.out.println("Do you want a two way tickets? ");
        boolean twoway = Num1.nextBoolean();
        System.out.println("Ansver for the twoway ticket answer " + twoway);

    }
}
