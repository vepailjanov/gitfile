package day36.task1;

public class task2 {
    public static void main(String[] args) {
        String [] arr = {"hello", "hi",null};
        try {
            System.out.println(arr[0].indexOf(arr[0].length() - 1) + arr[1].indexOf(arr[1].length() - 1) + arr[2].indexOf(arr[2].length() - 1));
        }catch (Exception ex){
            System.out.println("last argument is empty");
        }
        System.out.println("hello");
    }
}
