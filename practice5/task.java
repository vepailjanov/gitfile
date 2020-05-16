package practice5;

import java.util.ArrayList;
import java.util.Collections;

public class task {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(3);
        nums.add(2);
        nums.add(4);
        Collections.sort(nums);
        System.out.println(nums);
        int max = Collections.max(nums);
        System.out.println(max);
        int min = Collections.min(nums);
        System.out.println(min);
        Collections.reverse(nums);
        System.out.println(nums);
        Collections.fill(nums, 100);
        System.out.println(nums);
        Collections.replaceAll(nums, 100, 23);
        System.out.println(nums);
    }
}
