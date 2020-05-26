package day42.Inheritens.ExtendKeyWord.Ex3;

public class SDET extends Employee {
    private double bonus;

    public SDET(String name, double salary, double coef, double bonus) {
        super(name, salary, coef);
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return salary * coef + bonus;
    }


}
