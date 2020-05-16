package day14;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        // Determine and print the number of times
        // the character ‘a’ appears in the input entered by the user.

        // input: Test output
        //        a: 0

        // input: Ola amigo
        //        a:2

        //hint: .charAt(), .length(), for, index, counter,
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int result = 0;
        for (int i = 0; i < str.length(); i++){
            char letter = str.charAt(i);
            if (letter  == 'a'){
                System.out.print(letter);
                result++;
            }
        }
        System.out.print(result);
    }
}
