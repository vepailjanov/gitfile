package day15;

public class debug3 {
    public static void main(String[] args) {
        for (int i = 0; i <20; i++){
            System.out.println(i);
            if (i / 15 ==1){
                continue;
            }

            System.out.println(i);
        }
    }
}
