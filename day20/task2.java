package day20;

public class task2 {
    public static void main(String[] args) {
        int i1 = 3;
        int i2 = 3;
        int i3 = 3;
        perimeter(i1,i2,i3);
    }
    public static int perimeter(int i1, int i2, int i3 ){
        return i1+i2+i3;

    }
    public static int perimeter(int i1, int i2, int i3, int i4){
        return perimeter(i1,i2,i3)+i4;
    }

}
