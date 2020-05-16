package enumPractice.task1;

public class mainMethod {
    public static void main(String[] args) {
        Sugar sugar1 = new Sugar(34,Sort.BROWN,Location.NEWYORK);
        sugar1.print();
        System.out.println();
        Sugar sugar2 = new Sugar(45,Sort.WHITE,Location.CALIFORNIA);
        sugar2.print();
        System.out.println();
        Sugar sugar3 = new Sugar(76,Sort.BROWN,Location.NEWJERSEY);
        sugar3.print();
    }
}
