package day28.task3;
class ElectricitAccount{
    int totalWPH;
    int rate;
    int bill;
}
class Customer{
    String name;
    int electricityAccount;
}

public class ElectricityAccount{
    public static void main(String[] args) {
        ElectricitAccount account1 = new ElectricitAccount();
        account1.totalWPH = 23000;
        account1.rate = 25;
        account1.bill = account1.totalWPH * account1.rate;
        Customer customer1 = new Customer();
        customer1.name = "Vepa";
        customer1.electricityAccount = 234325425;


    }
}
