package day8;

public class task3 {
    // Write a Java program that multiplies four integers and  print result

    //part 2: use scanner to provide numbers

    public static void main(String[] args) {
        // 1. way
        System.out.println("1. way: " + (2 * 3 * 4 * 5));

        // 2. way
        int a = 2, b = 3, c = 4, d = 5;
        System.out.println("2. way: " + (a * b * c * d));

        // 3. way
        int result = 2; // 2
        result = result * 3; // 2 * 3 = 6
        result = result * 4; // 6 * 4 = 24
        result = result * 5; // 24 * 5 = 120
        System.out.println("3. way: " + result);
        int x = 2;
        System.out.println(++x);
        System.out.println(x++);
        System.out.println(x);

        /*
        ++
        ++x; x++;
        Pre Increment; Post Increment
        int x = 1;
        print(++x); -> 2   |  print(x++); -> 1
        --
        --y; y--;
        Pre decrement; Post decrement
        int x = 1;
        print(--x); -> 0  |  print(x++); -> 1
        */
        // post increment
        System.out.println();
        System.out.println(b);
        System.out.println( "pre increment b: " + (++b) );
        System.out.println( "post increment b: " + (b++) );
        System.out.println( "second usage of b: " + b );
        //pre increment
        System.out.println();
        System.out.println(c);
        System.out.println( "pre decrement c: " + (--c) );
        System.out.println( "post decrement: " + c-- );
        System.out.println( "second usage of c: " + c );
    }
}
