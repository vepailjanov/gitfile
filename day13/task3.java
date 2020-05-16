package day13;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();
        String result = "";
        int i = 1;
        while(i<=text.length()){
//            System.out.println(i);
            result +=i;
            System.out.println(result);
            if (result.length()>5){
                System.out.println("result");
                i++;
            }
        }
        System.out.println(result);
    }
}
