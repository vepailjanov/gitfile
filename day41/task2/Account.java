package day41.task2;

public class Account {
    /*1. create class Account with public fields: number, balance (do not create anything extra yet)
    create class Hacker and create instances of Account class
    2. Encapsulate Account class
    create class Bank and create instances of Account class
     */
    private Currency currency;
    private String number;
    private int balance;

//    public Account(String number, int balance) {
//        this.number = number;
//        this.balance = balance;
//    }
    public Account(Currency currency) {
        this.currency = currency;
    }

    public void setNumber(String number) {
        this.number =currency +   number;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

        public void withdraw(double money){
        if (balance<money){
            throw new RuntimeException("can't withdrow $ " + money + "balance is "+ balance);
        }
            balance-=money;
        }
        public void deposit(double money){
            if (money>5000){
                throw new RuntimeException("too much");
            }
            balance+=money;
        }
    public String getNumber() {
        return number;
    }

    public int getBalance() {
        return balance;
    }

    public void print(){
        System.out.println(getNumber());
        System.out.println(getBalance());
    }


    public String toString() {
        return "Account{" +
                "number=" + number +
                ", balance=" + balance +
                '}';
    }
}
