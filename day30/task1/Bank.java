package day30.task1;

public class Bank {
    String name;
    int AccountNumber;
    int balance;

    public Bank (){
        name = "Chase";
        AccountNumber = 1233232;
        balance = 32000;
    }
    public Bank (String name, int AccountNumber){
        this.name = name;
        this.AccountNumber = AccountNumber;
    }
    public Bank (String name, int AccountNumber, int balance){
        this(name,AccountNumber);
//        this.name = name;
//        this.AccountNumber = AccountNumber;
        this.balance = balance;
    }

    public String toString (){
        return "------------"+
                "\n Bank Name : " + name +
                "\n Account Number  : " + AccountNumber +
                "\n Balance : " + balance;
    }

}
