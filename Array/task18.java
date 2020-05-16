package Array;

import java.util.Random;

public class task18 {
    public static void main(String[] args) {
        int[] arr = new int [9];
        int sum = 0;
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
            sum+=arr[i];
            System.out.println(arr[i]);
        }
        System.out.println("Sum of numbers is : " + sum);
        System.out.println("Average is : " + sum/10.0);
    }
}
