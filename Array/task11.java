package Array;

import java.util.Arrays;

public class task11 {
    public static void main(String[] args) {
     int[] num ={3,5,7,87,91};
     MaxNUm(num);
    }
    public static void MaxNUm(int[] num){
        Arrays.sort(num);
        int sum =0;
        double avg = 0;
        for (int i = num.length-1; i >=0 ; i--) {
            sum+=num[i];
            avg = sum/5.0;
            System.out.println(num[i]);
        }
        System.out.println("Sum of nums is : " + sum);
        System.out.println("Average of nums is : " + avg);
    }
}
