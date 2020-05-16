package day15;

public class task5 {
    public static void main(String[] args) {
        for (int i = 0; i <5; i++) {
            for (int i1 = 0; i1 < 5; i1++) {
                if (i1<=i){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
