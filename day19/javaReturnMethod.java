package day19;
public class javaReturnMethod {
    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 8};
        int sumOfNumbers = sum(numbers);
        double average = average(numbers);
        System.out.println(sumOfNumbers);
        System.out.println(average);

    }
    //method which calculate sum, and returns it
    public static int sum(int[] numbers) {
        int sum = 0;

        for(int number : numbers) {
            sum += number;
        }
        return sum;

    }

    //method which calculate average of array
    public static double average(int[] array) {
        int sum = sum(array);
        int count = array.length;

        double average = (double) sum / count;
        return average;
    }
}
