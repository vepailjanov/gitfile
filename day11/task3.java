package day11;

import java.util.Random;

public class task3 {
    public static void main(String[] args) {
        /*
    Write a Java program to calculate profit or loss
    Input:
        cost price: 1000
        selling price: 1500
    Output:
        Profit: 500
//     */
//        int cost = 1000;
//        int selling = 500;
//        Random r1 = new Random();
//        int r2 = r1.nextInt();
//        int total = selling - cost;
//        System.out.println(total > 0 ? "profit" : "loss");

        Random r1 = new Random();
        int i1 = r1.nextInt();
        int cost = 500;
        int sell = 510;
        int total = (sell - cost) * 200;
        System.out.println(total);
        System.out.println(total>1000 ? "a lot" : "a few");
    }
}
