package ArrayListPractice;

public class task3 {
    public static void main(String[] args) {

    }
    public static int start1(int[] a, int[] b) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            count++;
        }
        for (int i = 0; i < b.length; i++) {
            count++;
        }
        return count;
    }
    public static int[] biggerTwo(int[] a, int[] b) {
        int sum1=0;
        int sum2=0;
        for (int nums : a) {
            sum1+=nums;
        }
        for (int nums : b) {
            sum2+=nums;
        }
        String temp = Integer.toString(sum1);
        int [] new1 = new int [temp.length()];

        String temp1 = Integer.toString(sum2);
        int [] new2 = new int [temp1.length()];
        return a;
    }


}
