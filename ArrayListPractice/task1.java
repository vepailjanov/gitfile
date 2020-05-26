package ArrayListPractice;

import java.util.ArrayList;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        names.add(scanner.nextLine());
        System.out.println(names);
    }
}
