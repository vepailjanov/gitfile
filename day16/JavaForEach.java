package day16;
import java.util.Arrays;
public class JavaForEach {


        public static void main(String[] args) {
//        String[] names = new String[5];
//        System.out.println( "names: " + Arrays.toString( names ) );
//
            int[] numbers = new int[5];
            numbers[0]=19;
            numbers[1]=14;
            numbers[2]=1;
            numbers[3]=5;
            numbers[4]=8;
            for(int n : numbers) {
                System.out.println( n );
            }

        }

    }
