package day21;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.ArrayList;

public class task1 {
    public static void main(String[] args) {
        // Write a method to create a new array list,
        // add some colors (string) and print out the collection.
//        String[] arr = new String[7];  this is the regular array
        ArrayList<String> colors = new ArrayList<>();
        colors.add("grey");
        colors.add("green");
        colors.add("yellow");
        colors.add("red");
        dfrntLns(colors);
        System.out.println("---------");
        insert(colors);

//        System.out.println(colors);
        // Write a method to iterate through all elements in arrayList
        // and print in separate lines
    }
    public static void insert(ArrayList<String> colors){
        colors.add(0, "blue");
        System.out.println(colors);
    }
    public static void dfrntLns(ArrayList<String> colors){
        for (String lines : colors) {
            System.out.println(lines);
        }
        System.out.println();
        for (int i = 0; i <colors.size(); i++) {
            System.out.println(colors.get(i));
        }
        //write a method to insert an element into the array list at the first position
    }

}
