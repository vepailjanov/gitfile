package day4;

public class JavaTypeCasting {

    public static void main(String[] args) {
        // Widening Casting (automatically

//
        int  number = 50;
        long longnumber = number;
        System.out.println(number);
        System.out.println(longnumber);

        double tax = 6.345;
        int totaltax = (int)tax;
        System.out.println(tax);
        System.out.println(totaltax);

        double height = 4.567;
        short totalHeight = (short)height;
        System.out.println(height);
        System.out.println(totalHeight);
        long length = 2147483648l;
        int roundlength = (int)length;
        System.out.println(length);
        System.out.println(roundlength);
        short num = 11;
        double decimal = num;
        System.out.println(num);
        System.out.println(decimal);
    }
}


