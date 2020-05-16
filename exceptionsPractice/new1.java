package exceptionsPractice;

import java.util.Random;

public class new1 {
    public static void checkmoney() throws Exception {
        Random random = new Random();
        int money = random.nextInt(100);
        if (money<50){
            throw new Exception("you've $"+money+" which is not enough for shopping stay home!");
        }
        System.out.println("you've $"+money+" enjoy your shopping!");
    }
    public static void main(String[] args) throws Exception {
        try {
            checkmoney();
        }catch (Exception ex){
            System.out.println("you're broke mf");
            ex.getMessage();
        }
    }
}
