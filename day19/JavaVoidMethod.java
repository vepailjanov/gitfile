package day19;

public class JavaVoidMethod {
    public static void main(String[] args) {
        // running/executing printHello method
        printHello();

        // running/executing printName method with one parameter
        printName("John");
        printName("Vepa");


    }

    //1. method without parameter and without return
    public static void printHello() {
        System.out.println("Hello!!!");
    }
    //2. method with parameter and without return
    public static void printName(String name) {
        System.out.println("Your name is: " + name);
    }
}
