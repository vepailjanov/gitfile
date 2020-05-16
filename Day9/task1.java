package Day9;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
// version 1
    int s = 110;
        if (s > 100) {
            System.out.println(s);
        }
        // version 2
    Scanner MyScan = new Scanner(System.in);
    int result = MyScan.nextInt();
        System.out.println(result > 100);
        if (result > 100){
            System.out.println(result);
        }

    }
}
