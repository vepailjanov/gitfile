package mentoring;

public class task5 {
    public static void main(String[] args) {
        InterRate(1000,0.5,3);
    }
    //Task 2
    //Write a method which will calculate the interest rate of your money
    // The formula is: the money * interest rate * months
    //money * (percentage / 100) * month
    public static void InterRate(int money, double percentage, int month ){
        double result = money/percentage * month;
        System.out.println(result);
    }
}
