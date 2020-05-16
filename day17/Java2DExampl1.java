package day17;

import java.util.Arrays;

public class Java2DExampl1 {
    //item prices

    //        Costco  Walmart  Aldii
    // water   $0.25   $0.27    $0.30
    // bread   $0.70   $0.40    $1.05
    // meat    $7.35   $9.99    $7.30

    public static void main(String[] args) {
        double[][] itemPrices = {
                {0.25, 0.27, 0.35},
                {0.79, 0.47, 1.05},
                {7.35, 9.99, 7.37}
        };
        String[] markets = {"Walmart", "Aldi", "Keyfood"};
        for (String market : markets) {
            System.out.print("   " + market);
        }
        System.out.println();
        String[] items = {"Bread", "Butter", "Water"};

        for (int i = 0; i <itemPrices.length; i++){
            double sum =0;
            System.out.print(items[i]+"\t ");
            for (int j = 0; j < 3; j++) {
                sum+=itemPrices[i][j];
                System.out.print("$"+ itemPrices[i][j] +"\t");

            }
            System.out.println(sum/3);
        }
    }
}
