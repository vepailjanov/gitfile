package Array;

import java.util.Arrays;
import java.util.Random;

public class task6 {
    public static void main(String[] args) {
        Random rndm = new Random();
        int[] nums =new int[10];
        for (int i =0; i<nums.length; i++){
            nums[i]=rndm.nextInt(11);
        }
        System.out.println(Arrays.toString(nums));
        for (int numbers : nums) {
            if (numbers==0) {
                System.out.print(numbers + " it has zero \n");
            }
        }
    }
}
