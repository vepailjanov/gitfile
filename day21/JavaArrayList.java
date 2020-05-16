package day21;

import java.util.ArrayList;

public class JavaArrayList {

    public static void main(String[] args) {
        // dynamic size array
        ArrayList<String> list = new ArrayList<>();

        // append elements to arrayList
        list.add("Fetih");
        list.add("Yusuf");
        list.add("Sema");
        list.add("Baha");
        System.out.println(list);
        // insert element at specific position
        list.add(0, "Ali");
        // gives IndexOutOfBoundsException, because there is no 99 index
//        list.add(6, "Mustafa");
        System.out.println(list);
        // to get/retrieve/access to element in specific position
        String name = list.get(0);
        System.out.println(name);
        // to update/change/set element at specific position
        list.set(0, "Abduhamid");
        System.out.println(list);
        // to get size/length of arrayList
        int arrayListSize = list.size();
        System.out.println(arrayListSize);
        // to remove/delete element at specific position
        list.remove(0);//remove element at index 0
        System.out.println(list);
        // to remove/delete element (only first occurrence)
        list.remove("Yusuf");
        System.out.println(list);
        // to get index of specific element  (only first occurrence)
        int indexOfAli = list.indexOf("Ali");
        System.out.println(indexOfAli);
        //print without any extra method
        System.out.println("List1: "+list);
        // to remove everything from arrayList
        list.clear();
        System.out.println("List2: "+list);
    }
}
