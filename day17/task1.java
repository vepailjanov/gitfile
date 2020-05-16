package day17;

import java.util.Random;

public class task1 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random rndm = new Random();
        for (int i = 0; i <arr.length; i++){
            int random = rndm.nextInt(10);
            arr[i]= random;
            System.out.print(random + " ");
        }
        System.out.println("\n"+"--------");
        for ( int n : arr ) {
            if (n==0){
                System.out.println("it has zero");
                }

            }

        }
    }

