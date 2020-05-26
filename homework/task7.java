package homework;

import java.util.HashSet;

public class task7 {
    /*Create a method name is changeSet()
    parameter is String hashset  and two Strings
    return is hashset
    if hasSet contains string 1 change it to string 2
    for example:
    hashset should be "banana" , "strawberry" , "kiwi" , "pineapple"
    String 1 = banana
    String 2 = peach
    result should be "peach" , "strawberry" , "kiwi" , "pineapple"
     */

    public static void main(String[] args) {

    }
    public static HashSet<String> changeSet(HashSet<String> hashstr, String str1, String str2 ){
        hashstr.add("banana");
        hashstr.add("strawberry");
        hashstr.add("kiwi");
        hashstr.add("pineapple");

        str1 = "banana";
        str2 = "peach";
        if (hashstr.contains(str1)){
            hashstr.remove("banana");
            hashstr.add(str2);
        }
        return hashstr;
    }
}
