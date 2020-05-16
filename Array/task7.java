package Array;

import java.util.Arrays;

public class task7 {
    public static void main(String[] args) {
        String[] names = {"Bob", "Eren", "Armin"}; // Arrays.toString method
        System.out.println(Arrays.toString(names));
        Arrays.sort(names); // Arrays.sort method
        System.out.println(Arrays.toString(names));
        int[] nums1 = {1,2,3,}; // Arrays.equal method
        int[] nums2 = {1,2,3,};
        int[] nums3 = {2,1,3,};
        Arrays.sort(nums3);
        System.out.println(Arrays.equals(nums1,nums2));
        System.out.println(Arrays.equals(nums2,nums3));
        int[] numbers = new int[5]; // Arrays.fill method
        System.out.println(Arrays.toString(numbers));
        Arrays.fill(numbers,5);
        System.out.println(Arrays.toString(numbers));
        int[] num = {1,3,4,6,7,8};
        System.out.println(Arrays.binarySearch(num,7));


    }
}
