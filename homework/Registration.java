package homework;

import java.util.Scanner;

public class Registration {
    /*Create class Registration,
  a. Create method signUp, where user will provide a password(Scanner)
  b. Create method checkPassword, where we will check password for validity

Password rules:
* must not be null
* must not be empty
* must not contain only spaces
* must contain at least 3 digits
* must contain at least 3 letters
* must have a  at least  lenght of 6

ps: try to throw different exceptions
(NullPointerException, IllegalArgumentException, RunTimeException)
     */
    public static void main(String[] args) {

    }
    public static void signUp() throws Exception {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();
        System.out.println("success");
    }
    void checkPassword(String password) throws Exception {
            if (password.isEmpty()) {
                throw new NullPointerException();
            } else if (password == null) {
                throw new NullPointerException();
            } else if (password.equals(" ")) {
                throw new Exception();
            } else if (password.length() < 3) {
                throw new IndexOutOfBoundsException();
            } else if (password.length() < 6) {
                throw new Exception();
            }
        }
    }

