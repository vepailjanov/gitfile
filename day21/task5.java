package day21;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class task5 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("aman", "myrat", "nure", "sapar","serdar");
        System.out.println(list.set(2,"hello"));
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println(list.lastIndexOf("serdar"));
    }
}
