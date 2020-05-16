package day11;

public class JavaMath {
    /* Math.abs() It will return the Absolute value of the given value.
            Math.max() It returns the Largest of two values.
            Math.min() It is used to return the Smallest of two values.
            Math.round() It is used to round of the decimal numbers to the nearest value.
            Math.sqrt() It is used to return the square root of a number.
            Math.pow() It returns the value of first argument raised to the power to second argument.
            Math.ceil() It is used to find the smallest integer value that is greater than or equal to the argument
    or mathematical integer.
            Math.floor() It is used to find the largest integer value which is less than
    or equal to the argument and is equal to the mathematical integer of a double value.
            Math.random() It returns a double value with a positive sign,
    greater than or equal to 0.0 and less than 1.0.

     */
    public static void main(String[] args) {
        // Math.abs
        System.out.println(Math.abs(-10));
        // Math.max
        System.out.println(Math.max(10,2));
        // Math.min
        System.out.println(Math.min(12,8));
        //Math.round
        System.out.println(Math.round(3.1));
        System.out.println(Math.round(3.5));
        // Math.ceil
        System.out.println(Math.ceil(3.1));
        // Math.floor
        System.out.println(Math.floor(3.1));
        // Math.sqrt
        System.out.println(Math.sqrt(100));
        // Math.power
        System.out.println(Math.pow(5,3));
        // Math.random
        System.out.println(Math.random());
    }
}
