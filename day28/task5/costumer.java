package day28.task5;

public class costumer {
    String name;
    BankAccount bankAccount = new BankAccount();
    public String toString(){
        return "----------------"+
                "\nCustomer Nmae : "+ name +
                "\nCustomer Account Balance : $"+ bankAccount.balance +
                "\n-----------------";
    }

}
