package day8;

public class task4 {

    public static void main(String[] args) {
        int x;
        int y;

        // Increment operators
        // Pre-increment - x is incremented by 1, then y is assigned the value of x
        x = 2;
        y = ++x;    // x is now 2, y is also 2
         System.out.println("\nPre-increment: x=" + x + " y=" + y );

        // Post-increment - y is assigned the value of x, then x is incremented by 1
        x = 1;
        y = x++;    // x is now 2, y is 1
        System.out.println("\nPost-increment: x=" + x + " y=" + y);


        //-------------------------------------------------------------------------
        // Decrement operators
        // Pre-decrement - x is decremented by 1, then y is assigned the value of x
        x = 1;
        y = --x;    // x is now 0, y is also 0
        System.out.println("\n\nPre-decrement: x=" + x + " y=" + y);


        // Post-decrement - y is assigned the value of x, then x is decremented by 1
        x = 1;
        y = x--;    // x is now 0, y is 1
        System.out.println("\nPost-decrement: x=" + x + " y=" + y);
    }
}
