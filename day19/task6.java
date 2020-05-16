package day19;

public class task6 {
    public static void main(String[] args) {
        int [] numbers = {21,3,4,65,32,43};
        summer(numbers);
        avrg(numbers);
        avrgPlussum(numbers);
    }
    public static int summer(int [] numbers){
        int sum = 0;
        for (int total : numbers) {
            sum+=total;
        }
        System.out.println(sum);
        return sum;
    }
    public static int avrg(int[] numbers){
        int avg = summer(numbers)/6;
        System.out.println(avg);
        return avg;
    }
    public static int avrgPlussum(int [] numbers){
        int total =avrg(numbers)+summer(numbers);
        System.out.println(total);
        return total;
    }
}
