package practice;

import java.util.Scanner;

public class task22 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int speed = s.nextInt();
        int fine;
        if (speed>=40&&speed<=50) {
            fine = 35;
//        fine = speed>=40 && speed<=50 ? 35 : 0;
            System.out.println("your fine is " + fine);
        }else if (speed>=50&&speed<=70){
            fine = 55;
            System.out.println("your fine is " + fine);
        }else if (speed>=70&&speed<=90){
            fine = 75;
            System.out.println("your fine is " + fine);
        }else if (speed >=90){
            fine = 100;
            System.out.println("your fine is " + fine);
        }
//        System.out.println("your fine is " + fine);

    }
}
