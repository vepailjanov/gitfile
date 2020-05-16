package day5;

import java.util.Scanner;

public class Scanner6 {
    public static void main(String[] args) {
        Scanner MyS = new Scanner(System.in);
        // byte --> nextByte

        System.out.println("How many tickets do you want?");
        byte totalticketcount = MyS.nextByte();
        System.out.println("I want  " + totalticketcount + " tickets");

        // short -->  nextShort

        System.out.println("What's the total count of your tickets?");
        short ticketTotal = MyS.nextShort();
        System.out.println("Total count of my  ticket " + ticketTotal);

        // char  --> we're not able to use char with Scanner

        // float  -->  nextFloat

        System.out.println("What's the insurance amount for each person?");

        float M1 = MyS.nextFloat();
        System.out.println("Insurance amount for each person is " + M1);

        String name = "Vepa";
        String lastname = "Iljanov";
        System.out.println(name + " " + lastname);
//        String username = MyS.nextLine();
//        String lastname = MyS.nextLine();
    /*
    Scanner class
        We are able to type in the console
            We can also print it

     String  --> nextString
     int  --> next.Int
     boolean  -->  next.Boolean
     byte  -->  next.Byte
     short  --> next.Short
     float  --> next.Float



     */

    }
}
