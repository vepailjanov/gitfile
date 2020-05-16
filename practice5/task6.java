package practice5;

import java.util.ArrayList;

public class task6 {
    public static void main(String[] args) {
        ArrayList<String> room1 = new ArrayList<>();
        room1.add("murat");
        room1.add("aman");
        room1.add("jahan");
        ArrayList<String> room2 = new ArrayList<>();
        room2.add("tawus");
        room2.add("maya");
        room2.add("nury");
        ArrayList<String> room3 = new ArrayList<>();
        room3.add("selbi");
        room3.add("enesh");
        room3.add("maysa");
        ArrayList<ArrayList<String>> students = new ArrayList<>();
        students.add(room1);
        students.add(room2);
        students.add(room3);
        System.out.println(students);
    }
}
