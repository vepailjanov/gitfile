package day5;


import java.util.Scanner;

public class scanner {
//    String -> text
//    byte -> whole number
//    short -> whole number
//    int -> whole number
//    boolean -> true false
//    double -> decimal numbers
//    float -> decimal number
//    Long -> decimal number
//    char  -> character

  /*  Scanner is class for getting the input of the primitive types like int,
  boolean, String... It's the easiest way to read the input in the Java
  program
   */


//   String username = "Vepa";

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();
        System.out.println("your first name " + username);
        String lastname = scanner.nextLine();
        System.out.println("your last name is " + lastname);

    }
}
