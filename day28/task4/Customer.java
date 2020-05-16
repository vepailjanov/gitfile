package day28.task4;

public class Customer {
    String name;
    ElectricityAccount electricityAccount = new ElectricityAccount();
    void consumeElectricity(double wph){
        electricityAccount.totalWph+=wph;
    }
    public String toString(){
        return "------------------"+
                "\nName : "+ name+
                "\nBill : "+ electricityAccount.bill+
                "\n------------------";

    }
}

