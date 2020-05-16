package day20;

public class task4 {
    public static void main(String[] args) {
      avg("ali", 23,56,77,45);
    }
    public static void avg (String name, int... result){
        int sum = 0;
        for (int results: result) {
            sum+=results;
        }
        double avarege = (double)sum/result.length;
        System.out.println(name+": "+avarege);
    }
}
