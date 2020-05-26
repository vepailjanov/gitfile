package day41.task4;

import java.util.ArrayList;
import java.util.List;

public class MyNumber {
    private List<Integer> EvenNUmber;

    public MyNumber(List<Integer> EvenNUmber){
        this.EvenNUmber = EvenNUmber;
    }

    public List<Integer> getEvenNUmber() {
        List<Integer> aNewCopy = new ArrayList<>(EvenNUmber);
        return aNewCopy;
    }

    @Override
    public String toString() {
        return "MyNumber{" +
                "EvenNUmber=" + EvenNUmber +
                '}';
    }
}
