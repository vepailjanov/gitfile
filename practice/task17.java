package practice;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class task17 {
    //Task 3
    //Password Strength checker
    //The password must contain any of these characters "* \ . , $"
    // Tell the user to set the length to 8 characters if it's fewer
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Your password?");
        String password = s.nextLine();
        if (password.contains("*") || password.contains("\"") || password.contains(".") || password.contains(",") || password.contains("$") && password.length()>8){
            System.out.println("passed");
        }else{
            System.out.println("failed");
        }
    }
}
