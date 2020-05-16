package Day9;

public class StrintToPrimitive {
    public static void main(String[] args) {
        String MyStr1 = "2.99";
        String MyStr2 = "3.99";
        double price1 = Double.parseDouble(MyStr1);
        double price2 = Double.parseDouble(MyStr2);
        System.out.println((price1 + price2));
        double decimal1 = Double.parseDouble(("6.98"));
        double decimal2 = Double.valueOf("6.98");
        System.out.println((decimal1 == decimal2));
        // string to double
        double d1 = Double.parseDouble( "10.22" );
        double d2 = Double.valueOf( "10.22" );
        System.out.println( "doubles: " + (d1 == d2) );

        // string to integer
        int i1 = Integer.parseInt( "65" );
        int i2 = Integer.valueOf( "65" );
        System.out.println( "integers: " + (i1 == i2) );

        // string to boolean
        boolean b1 = Boolean.parseBoolean( "true" ); // true
        boolean b2 = Boolean.valueOf( "TrUe" );  // true
        System.out.println( "booleans: " + (b1 == b2) );

        // everything to string
        String strD1 = String.valueOf( d1 ); // double to string
        String strI1 = String.valueOf( i1 ); // int to string
        String strB1 = String.valueOf( b1 ); // boolean to string
    }


}
