package Array;

import java.util.Arrays;

public class task2 {
    public static void main(String[] args) {
        int sum = 0;
        int[] arr = {1,5,6,8,9,};
        System.out.println(Arrays.toString(arr));
        for (int i =0; i <arr.length; i++){
            sum+=arr[i];
            System.out.println(arr[i]);
        }
        System.out.println(sum);
    }
}
