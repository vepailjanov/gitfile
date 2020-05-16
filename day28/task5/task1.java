package day28.task5;

public class task1 {
    public static void main(String[] args) {
        costumer costumer1 = new costumer();
        costumer1.name = "Vepa";
        costumer1.bankAccount.month = 8;
        costumer1.bankAccount.salary = 5000;
        costumer1.bankAccount.setBalance();
        System.out.println(costumer1);

        costumer costumer2 = new costumer();
        costumer2.name = "Mukam";
        costumer2.bankAccount.month = 21;
        costumer2.bankAccount.salary = 2300;
        costumer2.bankAccount.setBalance();
        System.out.println(costumer2);
    }
}
