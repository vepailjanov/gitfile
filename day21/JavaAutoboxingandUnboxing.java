package day21;

public class JavaAutoboxingandUnboxing {
    public static void printInt(int number) {
        System.out.println("Primitive int: " + number);
    }

    public static void printDouble(Double decimal) {
        System.out.println("Reference type Double: " + decimal);
    }

    public static void main(String[] args) {
        double four = 4.0d;
        printDouble(four);
        //autoboxing -> converting primitive to wrapper class
        Double decimal = Double.valueOf(1.3);
        printDouble(decimal);


        int five = 5;
        printInt(five);

        Integer ten = Integer.valueOf(10);
        //unboxing -> converting wrapper class to primitive
        printInt(ten);
    }
}
