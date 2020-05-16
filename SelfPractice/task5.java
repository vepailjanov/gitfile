package SelfPractice;

public class task5 {
    public static void main(String[] args) {
        outerloop: for (int i = 1; i <= 10 ; i++) {
            innerloop:for (int j = 1; j <= 10 ; j++) {
                if (j==4){
                    break outerloop;

                }
                System.out.print(j);
            }
            System.out.println();
        }
//        System.out.println();
    }
}
