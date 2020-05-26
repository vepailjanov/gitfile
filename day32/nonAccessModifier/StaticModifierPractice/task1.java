package day32.nonAccessModifier.StaticModifierPractice;

public class task1 {
    public static void main(String[] args) {

        Person person1 = new Person();
        person1.name = "jack";
        person1.jobTitle = "SDET";
        person1.calculate.salary=50000;
        person1.calculate.bonus=3500;
        person1.calculate.total();

    }
}
