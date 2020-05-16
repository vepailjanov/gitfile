package practice;

import java.util.Scanner;

public class task23 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int cost = s.nextInt();
        int selling = s.nextInt();
//        int cost = 1000;
//        int selling = 1500;
        int total = selling - cost;
        if (total>0){
            System.out.println("profit " + total + "$");
        }else if (total<0){
            System.out.println("loss " + Math.abs(total)+ "$");
        }
//        System.out.println(total>0 ? "profit" : "loss");
    }
}
