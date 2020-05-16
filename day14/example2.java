package day14;

import java.util.Scanner;

public class example2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        for (int i = 0; i < text.length(); i++){
            char letter = text.charAt(i);
            System.out.println(letter);
        }
    }
}
