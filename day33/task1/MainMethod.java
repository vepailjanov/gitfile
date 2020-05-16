package day33.task1;

public class MainMethod {
    public static void main(String[] args) {
        Song song1 = new Song("Lover",Category.COUNTRY,Singer.TAYLOR);
        song1.print();
        System.out.println();
        Song song2 = new Song("Baby",Category.JAZZ,Singer.JB);
        song2.print();
        System.out.println();
        Song song3 = new Song("Toolside",Category.RAP,Singer.DRAKE);
        song3.print();
    }
}
