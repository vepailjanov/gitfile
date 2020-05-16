package practice4;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        switch (str){
            case "DEU":
                System.out.println("I live in Deutchland");
                break;
            case "TKM":
                System.out.println("I live in Turkmenistan");
                break;
            case "UZ":
                System.out.println("I live in Uzbekistan");
                break;
            default:
                System.out.println("Wrong country");
        }
    }
}
