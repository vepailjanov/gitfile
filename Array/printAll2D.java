package Array;

public class printAll2D {
    public static void main(String[] args) {
        int[][] nums = {{1,5,3,},{5,6,},{5,}};
        int total=0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                total+=nums[i][j];
                System.out.print(nums[i][j]);
            }
            System.out.println();
        }
        System.out.println(total);
    }
}
