package Day12;

import java.util.Random;
import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
//        String weekday = "Monday";
        switch (str){
            case "Monday":
                System.out.println(1);
                break;
            case "Tuesday":
                System.out.println(2);
                break;
            case "Wednsday":
                System.out.println(3);
                break;
            case "Thursday":
                System.out.println(4);
                break;
            case "Friday":
                System.out.println(5);
                break;
            case "Saturday":
                System.out.println(6);
                break;
            case "Sunday":
                System.out.println(7);
                break;
            default:
                System.out.println("wrong code");
        }


    }
}
