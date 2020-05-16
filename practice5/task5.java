package practice5;

import java.util.ArrayList;

public class task5 {
    public static void main(String[] args) {
        ArrayList<Integer> listrow1 = new ArrayList<>();
        listrow1.add(3);
        listrow1.add(5);
        listrow1.add(7);
        ArrayList<Integer> listrow2 = new ArrayList<>();
        listrow2.add(43);
        listrow2.add(71);
        listrow2.add(54);
        ArrayList<ArrayList<Integer> > list = new ArrayList<>();
        list.add(listrow1);
        list.add(listrow2);
        System.out.println(list);
    }
}
