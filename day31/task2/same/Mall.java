package day31.task2.same;

public class Mall {
    public String name;
   public  int amount;
   public int income;

    public Mall(String name, int amount, int income) {
        this.name = name;
        this.amount = amount;
        this.income = income;
    }
    public void totalIncome(){
          int total = amount * income;
            System.out.println(total);
    }

    @Override
    public String toString() {
        return "Mall{" +
                "name='" + name + '\'' +
                ", amount=" + amount +
                ", income=" + income +
                '}';
    }
}

