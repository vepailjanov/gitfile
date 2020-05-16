package day14;

import java.util.Scanner;

public class task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        int count = 0;
        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            if (ch=='a'){
                System.out.print(ch);
                count++;
            }
        }
        System.out.print(count);
    }
}
