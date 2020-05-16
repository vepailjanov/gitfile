package day5;

import java.util.Scanner;

public class Scanner2 {
    public static void main(String[] args) {

        Scanner Myscanner = new Scanner (System.in);
        String address = Myscanner.nextLine();
        System.out.println("Your address is " + address);
        String city = Myscanner.nextLine();
        System.out.println("Your current city is " + city);
        String country = Myscanner.nextLine();
        System.out.println("Your country is " + country);
        int zipcode = Myscanner.nextInt();
        System.out.println("Your zip code is " + zipcode);
        int age =  Myscanner.nextInt();
        System.out.println("Your age is " + age);
        Myscanner.nextLine();
        String region = Myscanner.nextLine();
        System.out.println("Your region is " + region);




    }

}
