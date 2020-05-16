package Array;

import java.util.Random;

public class task3 {
    public static void main(String[] args) {
        int sum = 0;
        int[] arr = new int [5];
        Random random = new Random();
        for (int i =0; i<arr.length; i++ ){
            arr[i] = random.nextInt(100);
            sum+=arr[i];
            System.out.println(arr[i]);
        }
        System.out.println(sum);
        System.out.println("average is " + sum/10.0);
    }
}
