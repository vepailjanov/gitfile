package enumPractice.task2;

public class MainMethod {
    public static void main(String[] args) {
        Song song1 = new Song("Baby",2500,5, Category.POP,Country.USA,Singer.ARIANA);
        song1.getTotal();
        song1.print();
        System.out.println("-------------------");

        Song song2 = new Song("Toolside",4600,7, Category.RAP,Country.UK,Singer.DRAKE);
        song2.getTotal();
        song2.print();
        System.out.println("-------------------");

        Song song3 = new Song("Hello",2300,4, Category.COUNTRY,Country.KOREA,Singer.BOB);
        song3.getTotal();
        song3.print();
        System.out.println("-------------------");

        Song song4 = new Song("Good Bye",1300,3, Category.JAZZ,Country.CANADA,Singer.DAVID);
        song4.getTotal();
        song4.print();
        System.out.println("-------------------");
    }
}
