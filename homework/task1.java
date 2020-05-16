package homework;

import java.util.ArrayList;

public class task1 {
    public static void main(String[] args) {
        ArrayList<String> str = new ArrayList<>();
        str.add("apple");
        str.add("orange");
        str.add("grape");
        str.add("apple");
        getCount(str);
    }

    /*Create one method name is getCount()
    Parameter is one String ArrayList , one String
    return type is int.
    Count how many times your parameter String occurs in the arraylist and return the count
    For Example:
    ArrayList is Orange , Kiwi , Peach , Banana , Orange
    String is Orange
    count should be 2
     */
    public static int getCount(ArrayList<String> fruits ){
        int count = 0;
        for (int i = 0; i < fruits.size(); i++) {
            if (fruits.contains(fruits)){
                count+=1;
            }
        }
        System.out.println(count);
        return count;
    }
}