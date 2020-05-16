package practice3;

import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
//        System.out.println(str);
        int result = 0;
        for (int i=0; i<str.length(); i++){
            char letter =str.charAt(i);
            if (letter == 'a') {
                System.out.print(letter);
                result++;
            }
        }
        System.out.print(result);
    }
}
