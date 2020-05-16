package day5;

import java.util.Scanner;

public class Scanner3 {
    public static void main(String[] args) {
        Scanner MyS = new Scanner(System.in);
        // Scanner lets us in the console
        String email = MyS.nextLine();
        System.out.println("Your email is " + email);
        int family = MyS.nextInt();
        System.out.println("Your family has " + family + " members");
        MyS.nextLine();
        String name = MyS.nextLine();
        System.out.println("Your sisters name is " + name);
        //MyS.nextInt();
        System.out.println("Enter your sisters age");
        int age = MyS.nextInt();
        System.out.println("Your sister is " + age);
        System.out.println("Enter your monthly spend in decimal ");
        double monthlySpend = MyS.nextDouble();
        System.out.println("Your monthly spend is " + monthlySpend);
        System.out.println("Enter your salary");
        double salary = MyS.nextDouble();
        System.out.println("Your salary is " + salary);



    }
}
