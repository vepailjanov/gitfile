package day19;

import Array.Array;

import java.util.Arrays;

public class task2 {
    public static void main(String[] args) {
        decNums(new int[]{2,6,8,5,9,});
    }

    public static void decNums (int[] array){
        int sum=0; // sum
        int avg = 0; // average
        Arrays.sort(array);
       for (int i = array.length - 1; i >= 0; i--){
           sum+=array[i];
           avg=sum/5;
           System.out.println(array[i]);
       }
        System.out.println(sum);
        System.out.println(avg);
    }
}
