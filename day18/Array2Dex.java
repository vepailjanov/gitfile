package day18;

import java.util.Arrays;

public class Array2Dex {
    public static void main(String[] args) {
        String[][] names = {
                {"Vepa", "Suray", "Chemen"},
                {"Orazov", "Nuryyeva", "Kulyyev"},
        };
        for (int i = 0; i <3; i++) {
            for (int j = 0; j <2; j++) {
                System.out.print(names[j][i] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println(names[0][0]+" "+names[1][0]);
        System.out.println(names[0][1]+" "+names[1][1]);
        System.out.println(names[0][2]+" "+names[1][2]);
    }
}
