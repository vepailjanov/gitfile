package homework;

import java.util.ArrayList;

public class task4 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("yellow");
        arrayList.add("red");
        arrayList.add("blue");
        arrayList.add("red");
        arrayList.add("blue");
        try {
            System.out.println(arrayList.get(6));

        }catch (Exception exception){
            System.out.println("something is wrong check your code again");
            System.err.println("something is wrong check your code again");
            exception.printStackTrace();
        }finally {
            System.out.println("you'd rather be a singer");
        }
    }
}
