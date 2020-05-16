package day11;

public class javaTurneryOperator {
    public static void main(String[] args) {

        int speed = 20;
        int fine;
        //        if(speed > 25) {
//            fine = 5;
//        } else {
//            fine = 0;
//        }

        fine = speed > 25 ? 5 : 0;
        //syntax
        // variable = (condition) ? true output : false output

        System.out.println("Fine is: " + fine);
        System.out.println("hello".length() != 4 ? "true" : "false");

    }
}