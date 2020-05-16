package day20;

public class JavaMethodVarargs {
    public static void main(String[] args) {
        int sum = sum(1, 2, 5, 6, 7,7,5,5,6,3,2);
        String total = sum( "jack", "jane", "john");
        System.out.println(sum);
        System.out.println(total);
    }

    public static int sum(int... numbers) { //int[] numbers
        int sum = 0;
        for(int number : numbers) {
            sum += number;
        }
        return sum;
    }
    public static String sum(String... names){
        String sum="";
        for (String text : names ) {
            sum+=text;
        }
        return sum;
    }

    /*    public static int sum(int[] numbers) {
        int sum = 0;
        for(int number : numbers) {
            sum += number;
        }
        return sum;
    }*/

//    public static int sum(int a, int b) {
//        return a + b;
//    }
//
//    public static int sum(int a, int b, int c) {
//        return a + b + c;
//    }

}
