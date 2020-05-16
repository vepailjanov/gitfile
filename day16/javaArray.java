package day16;

public class javaArray {
    public static void main(String[] args) {
        //int array
        int intArray2[]; // don't write like this
        // 1st way to create
        int[] arr = new int[10];
        // 2nd way to create
        int[] intArray;
        intArray = new int[5];

        intArray[0] = 10;
        intArray[1] = 20;
        intArray[2] = 30;
//        intArray[3] = 40; out of bound, dont have such index

        //to get length of your array
        System.out.println( "Length: " + intArray.length );

        // adding more elements
        intArray[3] = 40;
        intArray[4] = 50;

        // 0 1 2 3 4
        //best way
        for(int i = 0; i < intArray.length; i++) {
            System.out.println( intArray[i] );
        }

    }
}
