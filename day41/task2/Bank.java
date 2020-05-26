package day41.task2;

public class Bank {
    public static void main(String[] args) {
        Account account = new Account(Currency.EU);
        account.setNumber("54534");
        account.setBalance(546333);
        account.withdraw(500);
        account.deposit(4000);
        account.print();
    }

}
