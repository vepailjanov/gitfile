package practice2;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("write down your day please");
        String str = s.nextLine();
        switch (str){
            case "Monday":
                System.out.println(str + " 1");
                break;
            case "Tuesday":
                System.out.println(str + " 2");
                break;
            case "Wednesday":
                System.out.println(str + " 3");
                break;
            case "Thursday":
                System.out.println(str + " 4");
                break;
            case "Friday":
                System.out.println(str + " 5");
                break;
            case "Saturday":
                System.out.println(str + " 6");
                break;
            case "Sunday":
                System.out.println(str + " 7");
                break;
            default:
                System.out.println("wrong");

        }


    }

}
