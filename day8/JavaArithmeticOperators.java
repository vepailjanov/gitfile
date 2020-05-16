package day8;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class JavaArithmeticOperators {
    public static void main(String[] args) {
        // +
        int a = 20;
        int b = 10;
        System.out.println(a + b);
        System.out.println(10 + 20);
        // -
        System.out.println(a - b);
        System.out.println(20 - 10);
        // - : negation
        // System.out.println( a );
        a = -a;
        b = -b;
        System.out.println(a - b);
        System.out.println((a % b));
    }
}
