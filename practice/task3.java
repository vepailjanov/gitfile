package practice;

public class task3 {
    public static void main(String[] args) {
        // Write a Java program that calculate average of the following numbers
        // 23.4, 24.0, 12, 450.3, 23000

        int i1 = 12;
        int i2 = 23000;
        double i3 = 23.4;
        double i4 = 24.0;
        double i5 = 450.3;
        double result = (i1+i2+i3+i4+i5) / 5;
        System.out.println(result);
        // Part2 try to use assigning operators
        int a1 = 12;
        a1 += 23000;
        double a2 = 23.4;
        a2 += 24.0;
        a2 += 450.3;
        double avg = (a1 + a2) /5;
        System.out.println(avg);





    }
}
