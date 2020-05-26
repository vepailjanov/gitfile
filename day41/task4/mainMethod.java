package day41.task4;

import java.util.ArrayList;
import java.util.List;

public class mainMethod {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(4);
        list.add(6);
        MyNumber number = new MyNumber(list);
        System.out.println(number);

        List<Integer> EvenNUmber = number.getEvenNUmber();
        System.out.println(EvenNUmber);
        EvenNUmber.add(1000);
        System.out.println(EvenNUmber);
    }

}
