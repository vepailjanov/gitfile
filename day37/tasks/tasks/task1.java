package day37.tasks.tasks;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int i22 = converting(str);
        System.out.println(i22);
    }
    public static int converting(String str) {
        try {
            return Integer.parseInt(str);
        } catch (Exception e){
            System.out.println("code went wrong");
            System.out.println(e.getMessage());
        }
        return 0;
    }
}