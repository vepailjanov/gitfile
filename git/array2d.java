package git;

import java.util.ArrayList;
import java.util.List;

public class array2d {
    public static void main(String[] args) {
        int [][] arr2d = {{1,2,3},{4,5,6},{7,8,9}};
        List allin1 = new ArrayList();
        allin1.add(arr2d[0][0]);
        allin1.add(arr2d[0][1]);
        allin1.add(arr2d[0][2]);
        allin1.add(arr2d[1][0]);
        allin1.add(arr2d[1][1]);
        allin1.add(arr2d[1][2]);
        allin1.add(arr2d[2][0]);
        allin1.add(arr2d[2][1]);
        allin1.add(arr2d[2][2]);
        System.out.println(allin1);
        }
    }

