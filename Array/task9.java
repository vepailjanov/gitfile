package Array;

public class task9 {
    public static void main(String[] args) {
        String[][] friuits = {{"Apple", "Orange", "Peach"},
                                {"red", "yellow","green"}};
        System.out.println(friuits[0][0]+" "+friuits[1][0]); // 1st way
        System.out.println(friuits[0][1]+" "+friuits[1][1]);
        System.out.println(friuits[0][2]+" "+friuits[1][2]);
        System.out.println("\t");
        for (int i = 0; i <=friuits.length; i++) {
            System.out.println(friuits[0][i]+" "+friuits[1][i]); // 2nd way
        }
        System.out.println("\t");
        for (int i = 0; i <3; i++) { // 3rd way
            for (int j = 0; j <2; j++) {
                System.out.print(friuits[j][i]+" ");
            }
            System.out.println();
        }
    }
}
