package day28.task4;

public class task1 {
    public static void main(String[] args) {
        Customer customer1 = new Customer();
        customer1.name = "Vepa";
        customer1.electricityAccount = new ElectricityAccount();
        customer1.consumeElectricity(100);
        customer1.consumeElectricity(200);
        customer1.electricityAccount.calculateBill();
        System.out.println(customer1);

        Customer customer2 = new Customer();
        customer2.name = "Mukam";
        customer2.electricityAccount = new ElectricityAccount();
        customer2.consumeElectricity(45);
        customer2.consumeElectricity(210);
        customer2.electricityAccount.calculateBill();
        System.out.println(customer2);
    }
}
