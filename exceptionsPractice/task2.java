package exceptionsPractice;

import java.util.Random;

public class task2 {
    public static void main(String[] args) throws Exception {
        try {
            checkBalance();
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }
    public static void checkBalance() throws Exception {
        Random random = new Random();
        int balance = random.nextInt(100);
        if (balance<50){
            throw new Exception("balance is too low");
        }
        System.out.println("you've enough money!");
    }
}
