package day13;

import java.util.Random;

public class newtask {
    public static void main(String[] args) {
        Random random = new Random();
        int i1 = random.nextInt(10);
        int result = 0;
        int i2 = 1;
        System.out.println(i1);
        while(i2<=i1){
            result+=i2;
            System.out.println(i2);
            ++i2;
        }
        System.out.println(result);
    }
}
