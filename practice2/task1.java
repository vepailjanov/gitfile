package practice2;

import java.util.Random;

public class task1 {
    public static void main(String[] args) {
        Random r = new Random();
        int i = r.nextInt(10);
        switch (i){
            case 1:
                System.out.println( i + " hi");
                break;
            case 2:
                System.out.println(i + " bye");
                break;
            case 3:
                System.out.println(i + " yeap");
                break;
            case 4:
                System.out.println(i + " nope");
                break;
            case 5:
                System.out.println(i + " maybe");
                break;
            default:
                System.out.println("all wrong");
        }
    }
}
