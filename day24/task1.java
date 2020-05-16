package day24;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class task1 {
    public static String[] names() {
        String[] names1 = {"murat", "maral","juma", "murat"};
        System.out.println(names1.toString());
        return names1;
    }

    public static ArrayList<String> converting(String[] names) {
        ArrayList<String> newstr= new ArrayList<>();
        for (String text : names) {
            newstr.add(text);
        }
        return newstr;
    }
    public static HashSet<String> convertinghash(ArrayList<String> newstr) {
//        ArrayList<String> list = converting(names);
        HashSet<String> newstr1= new HashSet<>();
        for (String text : newstr) {
            newstr1.add(text);
        }
        return newstr1;
    }

    public static void main(String[] args) {
        names();
        converting(names());

    }



}