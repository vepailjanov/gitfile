package practice;
public class task6 {
    public static void main(String[] args) {
        String s1 = "1.23";
        double i1 = Double.parseDouble(s1);
        double i2 = Double.valueOf(s1);
        System.out.println(s1);
        System.out.println(i1);
        System.out.println(i2);
        double d1 = 123.4;
        String d2 = String.valueOf(d1);
        String d3 = Double.toString(d1);
        System.out.println(d1);
        System.out.println(d2);


    }

}
