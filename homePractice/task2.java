package homePractice;

import java.util.Arrays;
import java.util.HashSet;

public class task2 {
    public static void main(String[] args) {
        HashSet<String> name1 = new HashSet<>(Arrays.asList("vepa","mukam","jeren","nure"));
        System.out.println(name1);
        HashSet<String> name2 = new HashSet<>(Arrays.asList("maral","vepa","sirin","vepa","jeren"));
        System.out.println(name2);
        totalmember(name1,name2);
    }
    public static int totalmember(HashSet<String> name1, HashSet<String> name2){
        HashSet<String> total = new HashSet<>(name1);
        total.addAll(name2);
        System.out.println(total.size());
        return total.size();
    }
}
