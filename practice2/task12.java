package practice2;

import java.util.Scanner;

public class task12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String hacker = scan.nextLine();
        int i = 0;
        if(hacker.length()==10 && hacker.contains("A") && hacker.contains("1")){
            System.out.println("you're in");
            i++;


        }else {
            System.out.println("try again");
        }
    }
}
