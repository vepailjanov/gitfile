package day10;

import java.util.Scanner;

public class examples {
    public static void main(String[] args) {
        /*
        Create scanner object

        Create one int

        if the budget is more then 7500
            print you can travel anywhere in the world

        else if budget is less then 7500 and more then 5000
            print you can travel anywhere except Australia

        else if budget is less then 5000 and more then 3000
            print you can travel US and europe

        else if budget is less then 3000
            print Stay ay home


         */
        Scanner myscan = new Scanner(System.in);
        int price = myscan.nextInt();
        if (price>7500){
            System.out.println("first");
        }else if (price < 7500 && price > 5000){
            System.out.println("second");

        }else if (price < 5000 && price > 3000){
            System.out.println("third");

        }else if (price < 3000){
            System.out.println("fourth");
        }
    }
}
