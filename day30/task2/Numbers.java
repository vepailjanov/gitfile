package day30.task2;

import java.util.ArrayList;

public class Numbers {
   public  boolean checkNumber(int n){
        return n % 2 == 0;
    }
    public ArrayList<Integer> Numbers() {
        ArrayList<Integer> result = new ArrayList<>();

        for(int i = 0; i <= 20; i++) {
            if(checkNumber(i)) {
                result.add(i);
            }
        }
        return result;
    }
}
