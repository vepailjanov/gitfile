package day16;
import java.util.Arrays;
public class JavaArrayExamples {
    public static void main(String[] args) {
        //String array
        //When you don`t know what will be values of array
//        String[] array = new String[3];

        String[] names = {"Bob", "Alice", "Trudy"};

        int[] ages = {20, 25, 38};


        //class Arrays
        System.out.println( "Prints string array: " + Arrays.toString( names ) );
        System.out.println( "Prints int array: " + Arrays.toString( ages ) );

    }

}
