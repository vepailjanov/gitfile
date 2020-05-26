package homework;

import java.util.HashSet;

public class task6 {
    public static void main(String[] args) {

    }

    public static int totalCount( HashSet<Integer> numbers){
        numbers.add(4);
        numbers.add(2);
        numbers.add(3);
        numbers.add(1);
        numbers.add(7);

       return numbers.size();
    }
}
