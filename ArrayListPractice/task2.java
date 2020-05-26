package ArrayListPractice;

import java.util.Random;

public class task2 {
    public static void main(String[] args) {
        int[] nums = new int [3];
        Random random = new Random();
        int sum =0;
        int avg =0;
        nums[0]=random.nextInt(10);
        nums[1]=random.nextInt(10);
        nums[2]=random.nextInt(10);

        for (int i = 0; i < nums.length; i++) {
            sum+=nums[i];
            avg=sum/nums.length;
            System.out.println(nums[i]);

        }
        System.out.println(sum);
        System.out.println(avg);
    }
}
