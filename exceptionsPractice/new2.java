package exceptionsPractice;

import java.util.Random;

public class new2 {
        public static int wallet() throws Exception {
            Random random = new Random();
            int money = random.nextInt(100);
            if (money<20){
                throw new Exception("you're broke");
            }
            System.out.println(money);
            return money;
        }

    public static void main(String[] args) throws Exception {
            try {
                wallet();
            }catch (Exception ex){
                System.out.println("too poor");
                System.out.println(ex.getMessage());
            }
    }
}
