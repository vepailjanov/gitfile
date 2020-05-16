package day15;

public class task6 {
    public static void main(String[] args) {
        int first = 0;
        for (int i = 1; i <10; i++) {
            first+=1;
            System.out.println();
            for (int j = 1; j <=10 ; j++) {
                int result = first * j;
                System.out.println(first + " x " + j + " = "+result);
            }
        }

    }
}
